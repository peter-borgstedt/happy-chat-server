.PHONY: build
build:
	@echo '-> BUILDING: processing'
	@rm -rf build
	@gradle build --warning-mode all
	@echo '-> BUILDING: done'

connect:
	@ssh -i "happychat.pem" ec2-user@ec2-13-48-254-128.eu-north-1.compute.amazonaws.com

deploy-local: build
	@echo '-> DEPLOYING (locally): processing'
	@rm -f /usr/local/opt/tomcat/libexec/webapps/happychat.war
	@rm -rf /usr/local/opt/tomcat/libexec/webapps/happychat
	@cp build/libs/happychat.war /usr/local/opt/tomcat/libexec/webapps
	@echo '-> DEPLOYING (locally): done'

start: deploy-local
	@echo '-> Starting Tomcat (Catalina)'
	@catalina run

deploy: build
	@echo '-> DEPLOYING (AWS EC2 Instance)'
	@echo '   * Uploading happychat.war'
	@scp -i "happychat.pem" build/libs/happychat.war ec2-user@ec2-13-48-254-128.eu-north-1.compute.amazonaws.com:~/ &>/dev/null
	@echo '   * Cleanup and initialization'
	@ssh -t -i "happychat.pem" ec2-user@ec2-13-48-254-128.eu-north-1.compute.amazonaws.com "sudo rm -rf /opt/tomcat/9.0.37/webapps/happychat && sudo rm -f /opt/tomcat/9.0.37/webapps/happychat.war && sudo mv happychat.war /opt/tomcat/9.0.37/webapps" &>/dev/null
	@echo '   * Restarting Apache Tomcat'
	@ssh -t -i "happychat.pem" ec2-user@ec2-13-48-254-128.eu-north-1.compute.amazonaws.com "sudo service tomcat restart" &>/dev/null
	@echo '<- DONE!'

.PHONY: edit-variables
edit-variables:
	@code ${CATALINA_HOME}/bin/setenv.sh

.PHONY: edit-log4j-properties
edit-log4j-properties:
	@code ${CATALINA_HOME}/conf/log4j.properties


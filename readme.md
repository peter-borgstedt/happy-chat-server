# Happy Chat Server
A secure chat server using Websocket and REST, written in Java as a web servlet.

## Prerequisites
- Gradle >= 7
- Java >= 11

### Running Local
- **Apache Tomcat 9** *(for 10 some [manual migration](https://dzone.com/articles/from-javax-to-jakarta-a-simple-proof-of-concept) needs to be done - or use the [migration tool](https://github.com/apache/tomcat-jakartaee-migration))*
- **PostgreSQL >= 10**

## Scale
Run alone or scale by preferally using [kubernetes](https://kubernetes.io/). Websocket messages needs to be synced between pods (the running servlets), it should preferraly be done by using [Redis](https://redis.io) (pub/sub).

PostgreSQL (or other) should be vertically scalable (up & down), preferally by using a ready to go solutions which should be found on most cloud providers, i.e. AWS RDS, GCP Cloud SQL, Azure SQL Database etc.

## Features:
* Java 14
* Tomcat 9.0.37
* Servlet 4.0
* JAX-RS (using Jersey 2.30.1)
* Javax WebSocket 1.1

## Test Host
* PostgreSQL (running in EC2)
* AWS EC2 *(as server)*
* AWS CloudFront *(as CDN)*
* AWS S3 *(as file hosting)*


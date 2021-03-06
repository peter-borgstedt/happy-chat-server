package rest.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.ws.rs.NameBinding;

import rest.exceptions.ConstraintViolationMapper;

/**
 * A custom annotation for the "Authorization" header. It shoudl be defined
 * on the REST resource function together with other annotations for method,
 * path an so on. It indicates that the "Authorization" header needs to be
 * included in the request call otherwise it will fail.
 * 
 * Any violation is collected by the {@link ConstraintViolationMapper} and
 * reported back in the response.
 * 
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
@NameBinding
@Target({ ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Authorization {}

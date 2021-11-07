package rest.structures;

/**
 * Request body for signing in with user credential.
 *
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class UserSigninRequest {
  public String email;
  public String password;
}
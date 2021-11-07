package rest.structures;

import org.hibernate.validator.constraints.Length;

/**
 * Request body for updating details of user account.
 *
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class UserUpdateRequest {
  public String forename;
  public String surname;
  public String email;
  @Length(min = 6, message = "Property requires min and max length to be within the set range")
  public String password;
  public String profileImageUrl;
}

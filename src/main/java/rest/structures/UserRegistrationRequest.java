package rest.structures;
// 
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

/**
 * Request body for registering a new user account.
 * 
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class UserRegistrationRequest {
  public String forename;
  public String surname;

  @NotBlank(message = "Property cannot be null or empty")
  public String email;

  @NotBlank(message = "Property cannot be null or empty")
  @Length(min = 6, message = "Property requires min and max length to be within the set range")
  public String password;
}

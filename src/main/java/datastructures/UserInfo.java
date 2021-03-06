package datastructures;

/**
 * Class contains none sensitive data for a user (no password).
 *
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class UserInfo {
  public String id;
  public String forename;
  public String surname;
  public String email;
  public String profileImageUrl;

  /** Empty constructor; for populating public fields from outside */
  public UserInfo() {}

  /**
   * Constructor.
   * @param record User database record
   */
  public UserInfo(UserRecord record) {
    this.id = record.id;
    this.forename = record.forename;
    this.surname = record.surname;
    this.email = record.email;
    this.profileImageUrl = record.profileImageUrl;
  }
}

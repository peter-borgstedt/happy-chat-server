package datastructures;

import java.io.Serializable;

/**
 * Class contains data for a text message.
 *
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class Text implements Serializable {
  private static final long serialVersionUID = 3L;

  public String text;

  /** Empty constructor; for populating public fields from outside */
  public Text() {}

  /**
   * Constructor.
   * @param text Text message
   */
  public Text(String text) {
    this.text = text;
  }
};

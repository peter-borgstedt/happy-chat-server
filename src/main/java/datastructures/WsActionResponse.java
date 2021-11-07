package datastructures;

/**
 * Class contains data for a response to a Websocket Action.
 *
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class WsActionResponse {
  public String type; // Type of action
  public Object data; // Data related to the type of action

  /** Constructor */
  public WsActionResponse() {
    // Will be populated from outside
  }
}

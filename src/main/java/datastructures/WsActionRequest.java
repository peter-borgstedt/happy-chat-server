package datastructures;

import java.util.Map;

/**
 * Class contains data for a Websocket Action request.
 *
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class WsActionRequest {
  public String type; // Type of action
  public Map<String, Object> data; // Data related to the type of action

  /** Constructor */
  public WsActionRequest() {
    // Will be populated from outside
  }
}

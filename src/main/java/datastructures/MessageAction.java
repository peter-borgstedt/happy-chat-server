package datastructures;

import java.util.Map;

/**
 * Class contains a Websocket Message Action, containing information
 * on what kind of message it is, the data for it and what channel
 * it is associated with.
 *
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class MessageAction {
  public String type;
  public String channelId;
  // Type is of java.util.LinkedHashMap
  public Map<String, String> data;

  /** Constructor */
  public MessageAction() {
    // Will be populated from outside
  }
}
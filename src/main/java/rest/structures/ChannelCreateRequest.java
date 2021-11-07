package rest.structures;

import javax.validation.constraints.NotBlank;
/**
 * Request body for creating a channel.
 * 
 * @author <a href="mailto:peter.borgstedt@gmail.com">Peter Borgstedt</a>
 */
public class ChannelCreateRequest {
  @NotBlank(message = "Property cannot be null or empty")
  public String name;
  public String description;
}
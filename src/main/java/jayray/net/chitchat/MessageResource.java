package jayray.net.chitchat;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MessageResource.class);

	@POST
	@Path("1")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createMessage(String message) {
		LOGGER.info("received message 1 " + message);
	}

	@POST
	@Path("2")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createMessage2(Message message) {
		LOGGER.info("received message 2 " + message);
	}

	@GET
	@Path("sample")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getSampleMessage() {
		Message message = new Message("user1", "user2", "mary had a little lamb", new Date());
		return message;
	}
}

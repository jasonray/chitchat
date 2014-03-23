package jayray.net.chitchat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(MessageResource.class);
	private final MessageDao messageDao = new MessageDao();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createMessage(Message message) {
		LOGGER.info("saving message");
		messageDao.save(message);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> fetch(@QueryParam("user") String user) {
		if (user == null)
			return messageDao.fetch();
		else
			return messageDao.fetchForUser(user);
	}

	@GET
	@Path("sample")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getSampleMessage() {
		return messageDao.fetch().get(0);
	}

	private class MessageDao {
		private List<Message> messages = new ArrayList<Message>();

		public MessageDao() {
			messages = new ArrayList<Message>();
			messages.add(new Message("user1", "user2", "mary had a little lamb", new Date()));
			messages.add(new Message("user1", "user2", "message 2", new Date()));
			messages.add(new Message("user2", "user1", "return message", new Date()));
			messages.add(new Message("user1", "user2", "message 3", new Date()));
			messages.add(new Message("user3", "user1", "howdy", new Date()));
			messages.add(new Message("user1", "user3", "yo", new Date()));
			messages.add(new Message("user3", "user2", "who are you?", new Date()));
			messages.add(new Message("user2", "user3", "no, who are YOU?", new Date()));
		}

		public List<Message> fetch() {
			return messages;
		}

		public List<Message> fetchForUser(String user) {
			List<Message> relevantMessages = new ArrayList<Message>();

			for (Message message : messages) {
				if (message.getFrom().contentEquals(user) || message.getTo().contentEquals(user)) {
					relevantMessages.add(message);
				}
			}
			return relevantMessages;
		}

		public void save(Message message) {
			messages.add(message);
		}
	}
}

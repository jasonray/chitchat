package jayray.net.chitchat;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

	@JsonProperty
	private String from=null;
	@JsonProperty
	private String to=null;
	@JsonProperty
	private String message=null;

//	private Date createdDate=null;

	public Message(String from, String to, String message, Date createdDate) {
		this.from = from;
		this.to = to;
		this.message = message;
//		this.createdDate = createdDate;
	}

	public Message() {
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
}

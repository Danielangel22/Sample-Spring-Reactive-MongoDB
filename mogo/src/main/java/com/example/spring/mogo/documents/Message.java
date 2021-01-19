package com.example.spring.mogo.documents;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "message")
public class Message {

	@Id
	private String id;

	private String mailFrom;

	private String mailTo;

	private Date sendedDate = new Date();

	private String subject;

	private String body;

	private String threadId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public Date getSendedDate() {
		return sendedDate;
	}

	public void setSendedDate(Date sendedDate) {
		this.sendedDate = sendedDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getThreadId() {
		return threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}

}

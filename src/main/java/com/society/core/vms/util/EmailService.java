package com.society.core.vms.util;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailService {
	public static String EMAIL_SENDER = "miccperf@gmail.com";
	public static String EMAIL_PASSWORD = "My@pp#123";

	
	//To Test email trigger
	public static void main(String[] args) {
		
		// from,password,to,subject,message
		
		send(EMAIL_SENDER, EMAIL_PASSWORD, "sswithyou@gmail.com", "hello test mail", "app test mail");
		// change from, password and to
	}

	public static void send(String emailAddress, String subject, String message) {
		
		send(EMAIL_SENDER, EMAIL_PASSWORD, emailAddress, subject, message);
	}
	
	public static void send(String from, String password, String to, String sub, String msg) {
		// Get properties object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		// get Session
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});
		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(sub);
			message.setText(msg);
			// send message
			Transport.send(message);
			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

}

package com.regnant.organiser;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail extends Thread {
	String tomail;
	SendMail(String tomail){
		this.tomail= tomail;
	}
	public void run() {
		Mailsend();
	}

	public void Mailsend() {

		final String senderEmail = "thesmartchits@gmail.com";
		final String password = "qwerty@123";

		Properties prop = new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(senderEmail, password);
			}
		});
		Message message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress(senderEmail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(tomail));
			message.setSubject("Greetings from the smart chits pvt ltd");
			String name=getname();
			message.setText(" Mr/Ms."+name+"\n Thanks for choosing us. \n\n\n\n\n Thanks & Regards \n The Smart Chits pvt ltd.");

			Transport.send(message);
			System.out.println("Message sent Succesfully");
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			throw new RuntimeException(e);
			
		}

	}
	public void Mailsend1() {

		final String senderEmail = "thesmartchits@gmail.com";
		final String password = "qwerty@123";

		Properties prop = new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(senderEmail, password);
			}
		});
		Message message = new MimeMessage(session);

		try {
			message.setFrom(new InternetAddress(senderEmail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(tomail));
			message.setSubject("Greetings from the smart chits pvt ltd");
			String name=getname();
			message.setText("Hii Mr/Ms."+name+"\n Your Scheme details updated successfully. \n For your login credentials contact your organiser \n\n\n\n\n Thanks & Regards \n The Smart Chits pvt ltd.");

			Transport.send(message);
			System.out.println("Message sent Succesfully");
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			throw new RuntimeException(e);
			
		}

	}
	String ename;
	public void setname(String name) {
		this.ename=name;
	}
	public String getname() {
		return ename;
	}
}
package com.inventory.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService
{
	public static void sendEmail(String emailid, String emailbody)
	{
      // Recipient's email ID needs to be mentioned.
       String to = emailid;//change accordingly

      // Sender's email ID needs to be mentioned
       String from = "ban.soumayan@gmail.com";//change accordingly
	   final String username = "ban.soumayan";//change accordingly
	   final String password = "soumayan96";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         // Set Subject: header field
         message.setSubject("MAIL FROM INVENTORY SYSTEM");

         // Now set the actual message
         message.setText(emailbody);

         // Send message
         Transport.send(message);

         System.out.println("Sent MAIL successfully....");

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
   }
}
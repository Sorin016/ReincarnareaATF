package SendMainUsingJava;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class SendMail {
    public static void main(String[] args) {
        final String senderEmail = "sorin.cuc2020@gmail.com";
        final String recipientEmail = "sorin.cuc2020@gmail.com";
        final String appPassword = "102811";
        //SMTP Server Properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
// Create session with Authenticator
        Session session = Session.getDefaultInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, appPassword);
            }
        });
        session.setDebug(true);
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Send Mail from the Java");
            message.setText("This is a test message.");
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class javamail {
    public static void sendmail(String recepient,String a) throws Exception{
        System.out.println("Preparing to sent email...");
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "javabank385@gmail.com";
        String password = "javabanklimited";
        
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail,password);  
            } 
        });
        
        Message message = prepareMessage(session,myAccountEmail,recepient,a); 
        //Message message = prepareMessage(session,myAccountEmail,recepient,a,b);
        Transport.send(message);
        System.out.println("Message sent sussessfully!");
    }
    public static Message prepareMessage(Session session,String myAccountEmail,String recepient,String a) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Java Bank Limited");
            message.setText(a);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(javamail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }   
}


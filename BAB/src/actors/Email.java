/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * https://www.google.com/settings/security/lesssecureapps
 */

package actors;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Naveen
 */

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import DataBase.Helper;
import DataBase.JDBC;
import Interfaces.Authentification;
import Interfaces.RDV_PAN;
public class Email {
	static Object res=Authentification.result;
	static String heure=RDV_PAN.Fieldheure.getText();
	static String date=RDV_PAN.FieldDate.getText();
	//static String mail=RDV_PAN.Fieldheure.getText();
	static String id=RDV_PAN.idsend;
	static String password;
	
	public static String patient()
	{
		String log = null;
		String req="select login from  rdv  join patient on rdv.cinP=patient.cinP where idRDV='"+id+"'";
		try {
			java.sql.Connection con=JDBC.getConnection();
		java.sql.Statement stm=(java.sql.Statement) con.createStatement();
		 ResultSet rs=stm.executeQuery(req);
		 while(rs.next())
		 {log=rs.getString(1);}
		
		 
		   }
		catch(SQLException e){ e.printStackTrace();}
		return log;
		
	}
	public static boolean utilisateur(String utilisateur)
	{   
		String req="select login,password from authentification ";
		try {
			java.sql.Connection con=JDBC.getConnection();
		java.sql.Statement stm=(java.sql.Statement) con.createStatement();
		ResultSet rs=stm.executeQuery(req);
		while(rs.next())
		{
			if(rs.getString(1).equals((String)res))
			{   password=rs.getString(2);
				return true;
		    }   
	    }
		   }
		catch(SQLException e){ e.printStackTrace();}
		return false;
	}
		
	

    public static void mpIncorrect(){
    	if(utilisateur((String)res))
    	{
        try{
        	JOptionPane.showMessageDialog(null, "Votre mot de passe vous sera envoyé à votre adresse email que vous nous avez communiqué.");
            String host ="smtp.gmail.com" ;
            String user = "dev.baitb@gmail.com";
            String pass = "bab@12345";
            String to =(String)res;
            String from = "dev.baitb@gmail.com";
            String subject = "noreply";
            String messageText = " Bonjour,\r\n" + 
            		"\r\n" + 
            		"Vous avez demandé l'envoi d'un nouveau mot de passe pour votre compte.\r\n" + 
            		"\r\n" + 
            		"Pour rappel, votre login est toujours le suivant :"+(String)res+"\r\n" + 
            		"\r\n" + 
            		"Votre nouveau mot de passe est désormais le suivant :"+password+" \r\n" + 
            		"\r\n" + 
            		"Veuillez noter que le login et le mot de passe doivent respecter la casse (majuscules/minuscules).\r\n" + 
            		"\r\n" + 
            		"Une fois connecté, vous pourrez modifier ce mot de passe en cliquant sur l'onglet \"Compte\" de votre page d'accueil personnelle.\r\n" + 
            		"\r\n" + 
            		"Bien à vous,\r\n" + 
            		"\r\n" + 
            		"L'équipe BAitB_DEV ";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

           // java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider()); 
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           System.out.println("message send successfully");
        }catch(Exception ex)
        {
            System.out.println(ex);
        }

    }else 
    {JOptionPane.showMessageDialog(null, "Adresse mail non valide");}
    	}
    
    public static void MailRDV(){
    	
        try{
        	
            String host ="smtp.gmail.com" ;
            String user = "dev.baitb@gmail.com";
            String pass = "bab@12345";
            String to =patient();
            String from = "dev.baitb@gmail.com";
            String subject = "noreply";
            String messageText = " Bonjour Vous avez Rendez vous dans notre cabinet LE : "
            					+ date + "à "
            					+ heure +" Précise\n" + " veuillez vous présentez à l'heure";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

           // java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider()); 
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           System.out.println("message send successfully");
        }catch(Exception ex)
        {
            System.out.println(ex);
        }

    }
}

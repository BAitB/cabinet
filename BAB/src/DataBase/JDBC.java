package DataBase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saber
 */
public class JDBC{
	 
    private static Connection con;
     
	  static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("connexion reussie");
        } catch (ClassNotFoundException e) {
            System.out.println("connecxion echoué");
            System.err.println(e);
        }
        String url="jdbc:mysql://localhost:3306/cabinet?useSSL=false";
        try {  
            con =DriverManager.getConnection(url,"root","");
            System.out.println("base de donnée est connectée"); 
        }catch(SQLException e){
            System.out.println("Pas de base de donnée :/ ");
            System.err.println(e);}
	  
	  }
	  public static Connection getConnection()
	  {  
        return con;
      }
          
    
   
}



   

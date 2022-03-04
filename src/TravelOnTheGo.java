import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TravelOnTheGo {
	
	public static void main( String[] args )
    {
    	String jdbcUrl="jdbc:mysql://localhost:3306/TravelOnTheGo?allowPublicKeyRetrieval=true&useSSL=false";
    	    	  String userName="root";
    	    	  String password="prv123PRV#";  	  
      try
      {
    	  System.out.println("Connecting to database");
    	  Connection myConn=DriverManager.getConnection(jdbcUrl,userName,password);
    	 
    	  System.out.println("Connection successfull");
    	  
    	  Statement myStmt=myConn.createStatement();
    	  
    	 ResultSet myRs= myStmt.executeQuery("Select * from Passenger");
    	  
      while (myRs.next())
       {
    	  System.out.println(myRs.getString("Passenger_name") + " ,"+(myRs.getString("Category")));
       }
      
      }
      catch(SQLException exc)
      {
    	  exc.printStackTrace();
      }

}}

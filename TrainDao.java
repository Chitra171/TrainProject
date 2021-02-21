package FinalProjectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TrainDao {

	static final String Driver_name;
	static final String DB_URL="jdbc:mysql://localhost:3306/train?autoReconnect=true&useSSL=false";
    static final String USER_NAME="com.mysql.cj.jdbc.Driver";
    static final String PASSWORD="Sqlroot17$";

	
    Train findtrain(int trainNo)
    {
	
	
	   Train train=null; 
    

	

   try {
		//load the driver
		Class.forName("Driver_NAME");
		
		System.out.println("class found");
		
	   
		//step 2 : get the connection
	   Connection con= DriverManager.getConnection("DB_URL,USER_NAME,PASSWORD");
	    System.out.println("connected");

	     //step 3 :
	    
	    Statement stmt= con.createStatement();
	    stmt.execute("SELECT * from trains ");
	    ResultSet rs= stmt.executeQuery("select*from trains");
	    
	    while(rs.next())
	    {
	    	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "rs.getInt(4) );
	    }
	    
	}



	catch (Exception e) {
		
		e.printStackTrace();
	}
		
		
}	
	
}

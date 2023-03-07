package fileHandling;

import java.sql.*;

public class FeedAppClass {
	private static final String userName ="postgres";
	private static final String password ="pg123";
	private static final String dbName="FeedApplication";
	private static final String port="5432";
	private static final String dbUrl="localhost";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create jdbc object to create connection, perform insert
    	//and close connection
    	FeedAppClass jdbc=new FeedAppClass();
    	Connection conn=jdbc.CreateConnection();
    	jdbc.AddUser(conn, "Ray", "Mist", "raymist", "12345", "ray@mist.com", "Ray@22", true);
    	jdbc.CloseConnection(conn);

	}
	public Connection CreateConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection("jdbc:postgresql://"+ dbUrl + ":" +port + "/"+dbName,userName,password);	
		}
		catch(Exception e) {
			System.out.println(e.getClass().getName() + ":  " +e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		return conn;
	}
	
	//insert a User record into User table in feedApp Database
	public void AddUser(Connection conn,String firstName, String lastName, 
			String username, String phone,String emailId,String password, boolean emailVerified) {
		
		try {
			PreparedStatement stmt=null;
			
		     String sql = "INSERT INTO \"User\" (\"userId\", \"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (default, ?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
		     stmt=conn.prepareStatement(sql);
		     stmt.setString(1, firstName);
		     stmt.setString(2, lastName);
		     stmt.setString(3, username);
		     stmt.setString(4, phone);
		     stmt.setString(5,emailId);
		     stmt.setString(6, password);
		     stmt.setBoolean(7, emailVerified);
		     
		     int resultCount= stmt.executeUpdate();
		     System.out.println(resultCount +" record(s) inserted");
		     stmt.close();
		     
		}
		catch(SQLException e) {
			//handle exception
			System.out.println("Exception "+e.getMessage());
		}
		
	}
	
	//close the connection
	public boolean CloseConnection(Connection conn) {
		boolean flag =true;
		try {
			conn.close();
		}
		catch(SQLException e) {
			flag=false;
			//handle exception
			System.out.println("Exception "+e.getMessage());
		}
		return flag;
	}

}

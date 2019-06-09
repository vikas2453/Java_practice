package com.learning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCex {

	public String dbms;	  
	  public String dbName; 
	  public String userName;
	  public String password;
	  public String servername;
	  public String DBName;
	  public String urlString;
	  private int portNumber;
	  public JDBCex(String dbms, String servername, int portNumber,String username,String password,String DBName){
		  this.dbms=dbms;
		  this.servername = servername;
		  this.portNumber = portNumber;
		  this.userName = username;
		  this.password = password;
		  this.DBName = DBName ;
	  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			//Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("jdbc.drivers"));
		Connection con;	
		JDBCex jd=new JDBCex("mysql","localhost",3306,"root","India@12","hospital");
			try {
				con=jd.getConnection();
				PreparedStatement ps1= con.prepareStatement("use hospital");
				ps1.execute();
				PreparedStatement ps= con.prepareStatement("Select * from logging");
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					System.out.println(rs.getString("userid"));
					System.out.println(rs.getString("password"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
	
	  public Connection getConnection() throws SQLException {
		    Connection conn = null;
		    Properties connectionProps = new Properties();
		    connectionProps.put("user", this.userName);
		    connectionProps.put("password", this.password);
		   

		    if (this.dbms.equals("mysql")) {
		      conn = DriverManager.
		        getConnection("jdbc:" + this.dbms + "://" + this.servername +
		                      ":" + this.portNumber + "/", connectionProps);
		    } else if (this.dbms.equals("derby")) {
		      conn = DriverManager.
		        getConnection("jdbc:" + this.dbms + ":" + this.dbName + ";create=true", connectionProps);
		    }		    
		    System.out.println("Connected to database");
		    return conn;
		  }


}

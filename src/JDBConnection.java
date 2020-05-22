import java.sql.*;
public class JDBConnection {
	private static String base_url = "jdbc:msql://localhost/";
	JDBConnection(){
		 try {
	            String url = "jdbc:msql://localhost/Demo";
	            Connection conn = DriverManager.getConnection(url,"root","root");
	            Statement stmt = conn.createStatement();
	            ResultSet rs;
	 
	            rs = stmt.executeQuery("SELECT Lname FROM Customers WHERE Snum = 2001");
	            while ( rs.next() ) {
	                String lastName = rs.getString("Lname");
	                System.out.println(lastName);
	            }
	            conn.close();
	        } catch (Exception e) {
	            System.err.println("Got an exception! ");
	            System.err.println(e.getMessage());
	        }
	}
	public static Connection connectStudent(){
		try {
			String url = base_url + "Student";
			Connection conn = DriverManager.getConnection(url,"root","root");
			return conn;
		}
		catch (Exception e) {
			System.err.println("Database Exception Occured");
			return null ;
		}
	}
	public static Connection connectEmployee() {
		try {
			String url = base_url + "Employee";
			Connection conn = DriverManager.getConnection(url,"root","root");
			return conn;
		}
		catch (Exception e) {
			System.err.println("Database Exception Occured");
			return null;
		}
	}
}

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student extends Person {
	String roll_number;
	String year;
	String branch;
	Student(String name, int age, char gender){
		super(name, age, gender);
	}

	public void print() {
		super.print();
		System.out.println("rollNo: "+roll_number+"\nyear: "+year+"\nbranch: "+branch);
	}
	
	public int addToDatabase() {
		Connection conn = JDBConnection.connectStudent();
		try {
			Statement stmnt = conn.createStatement();
			String query = "INSERT INTO Students " +
							String.format("Values ('%s','%2d', '%ch', '%s', '%s', '%s'" , name, age, gender,roll_number,year, branch );	
			stmnt.executeUpdate(query);
			return 1;
		}
		catch(Exception e) {
			return 0;
		}
	}
	public static Object[][] searchDatabase(String name, String branch, String year){
		Connection conn = JDBConnection.connectStudent();
		try {
			Statement stmnt = conn.createStatement();
			String query = "SELECT * "+
					"FROM Students WHERE (" +
					"name like '" + name +"%'"+
					" AND year="+year+
					" AND branch="+branch;
			ResultSet rs = stmnt.executeQuery(query);
			System.out.println(rs.getArray("names"));
			 String [] namesArray = (String []) rs.getArray("names").getArray();
			 String [] ageArray = (String []) rs.getArray("age").getArray();
			 String [] genderArray = (String []) rs.getArray("gender").getArray();
			 String [] roll_numberArray = (String []) rs.getArray("roll_number").getArray();
			 String [] yearArray = (String []) rs.getArray("year").getArray();
			 String [] branchArray = (String []) rs.getArray("branch").getArray();
			 
			 Object [][] returnArray = new Object[namesArray.length][6];
			 for(int i=0; i<namesArray.length; i++) {
					 returnArray[i][0] = namesArray[i];
					 returnArray[i][1] = ageArray[i];
					 returnArray[i][2] = genderArray[i];
					 returnArray[i][3] = roll_numberArray[i];
					 returnArray[i][4] = yearArray[i];
					 returnArray[i][5] = branchArray[i];
				 }
			conn.close();
			return returnArray;
			 }
		catch (Exception e) {
			System.err.println("Database Exception Occured");
			Object[][] returnArray = {{"","","","","",""}}; 
			return returnArray;
			}
	}
}

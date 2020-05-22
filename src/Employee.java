import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee extends Person {
	String salary;
	String department;
	String type;
	Employee(String name, int age, char gender){
		super(name, age, gender);
	}
	public void print() {
		super.print();
		System.out.println("salary: "+salary+"\ndepartment: "+department+"\ntype: "+type);
	}

	public int addToDatabase() {
		Connection conn = JDBConnection.connectEmployee();
		try {
			Statement stmnt = conn.createStatement();
			String query = "INSERT INTO Employees " +
							String.format("Values ('%s','%2d', '%ch', '%s', '%s', '%s'" , name, age, gender,department,type, salary );	
			stmnt.executeUpdate(query);
			return 1;
		}
		catch(Exception e) {
			return 0;
		}
	}

	public static Object[][] searchDatabase(String name, String department){
		Connection conn = JDBConnection.connectEmployee();
		try {
			Statement stmnt = conn.createStatement();
			String query = "SELECT * "+
					"FROM Employee WHERE (" +
					"name like '" + name +"%'"+
					" AND department"+department+";";
			ResultSet rs = stmnt.executeQuery(query);
			System.out.println(rs.getArray("names"));
			 String [] namesArray = (String []) rs.getArray("names").getArray();
			 String [] ageArray = (String []) rs.getArray("age").getArray();
			 String [] genderArray = (String []) rs.getArray("gender").getArray();
			 String [] departmentArray = (String []) rs.getArray("department").getArray();
			 String [] typeArray = (String []) rs.getArray("type").getArray();
			 String [] salaryArray = (String []) rs.getArray("salary").getArray();
			 
			 Object [][] returnArray = new Object[namesArray.length][6];
			 for(int i=0; i<namesArray.length; i++) {
					 returnArray[i][0] = namesArray[i];
					 returnArray[i][1] = ageArray[i];
					 returnArray[i][2] = genderArray[i];
					 returnArray[i][3] = departmentArray[i];
					 returnArray[i][4] = typeArray[i];
					 returnArray[i][5] = salaryArray[i];
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

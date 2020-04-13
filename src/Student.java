
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
}

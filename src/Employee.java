
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
}

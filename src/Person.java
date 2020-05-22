
public class Person {
String name;
int age;
char gender;
Person(String name, int age, char gender){
	this.name = name;
	this.age = age;
	this.gender = gender;
}
public void print() {
	System.out.println("name: " + this.name +"\nage: "+ this.age+"\ngender:"+ this.gender);
}
}

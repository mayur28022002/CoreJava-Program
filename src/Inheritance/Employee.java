package Inheritance;

public class Employee extends Person {

	int id;
	String dept;
	double sal;
	
	public Employee(int id,String dept,double sal,String name,String gender) {
		super(name,gender);
		this.id=id;
		this.dept=dept;
		this.sal=sal;
		this.name=name;
		this.gender=gender;
	}
	public void printD() {
		System.out.println("Employee id is "+ id);
		System.out.println("Employee name is "+name);
		System.out.println("Employee dept is "+dept);
		System.out.println("Employee sal is "+sal);
		System.out.println("Employee gender is "+gender);
	}
}

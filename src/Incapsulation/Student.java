package Incapsulation;

public class Student extends Person{
	int id;
	String depart;
	int marks;
	public Student(String name, String gender,int id,String depart,int marks) {
		super(name, gender);
		this.id=id;
		this.depart=depart;
		this.marks=marks;
	}
	public void printD() {
		System.out.println("Student id "+id);
		System.out.println("Student name "+name);
		System.out.println("Student gender "+gender);
		System.out.println("Student department "+depart);
		System.out.println("Student marks "+marks);
		
	}
}

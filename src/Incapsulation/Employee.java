package Incapsulation;

public class Employee extends Person{
	int id;
	double sal;
	String depart;
	public Employee(int id,double sal,String depart,String name,String gender) {
		super(name,gender);
		this.id=id;
		this.sal=sal;
		this.depart=depart;
	}
	public void printD() {
		System.out.println("Employee Id :-"+id);
		System.out.println("Employee Name "+name);
		System.out.println("Employee gender "+gender);
		System.out.println("Employee Salary "+sal);
		System.out.println("Employee Department "+depart);
	}

}

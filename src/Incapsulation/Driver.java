package Incapsulation;

public class Driver {
  public static void main(String[] args) {
	Employee e=new Employee(101,5000.0,"Development","Nikhil","Male");
	e.printD();
	System.out.println("=============");
	Employee e1=new Employee(102,6500.0,"Testing","Kunal","Male");
	e1.printD();
	
}
}

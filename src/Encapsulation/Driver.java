package Encapsulation;

public class Driver {
public static void main(String[] args) {
	Person p=new Person();
	p.setId(101);
	p.setName("Rohit");
	p.setGender("Male");
	p.setDOB("17-05-2014");
	System.out.println(p.toString());
	}
}

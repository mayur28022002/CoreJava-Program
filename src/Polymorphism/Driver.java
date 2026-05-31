package Polymorphism;

public class Driver {
public static void main(String[] args) {
	CTP c=new CTP();
	System.out.println(c.add(10.2, 10.3));
	System.out.println(c.add(10, 20));
	System.out.println(c.add(10, 20, 30));
}
}

package Methodoverriding;

public class Driver {
 public static void main(String[] args) {
	Demo d=new MiniCab();
	d.calculateFare();
	Demo d1=new Sedan();
	d1.calculateFare();
}
}

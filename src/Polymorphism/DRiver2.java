package Polymorphism;

public class DRiver2 {
 public static void main(String[] args) {
	RTP r=new UPI();
	r.pay();
	RTP r2=new CreditCardPayment();
	r2.pay();
}
}

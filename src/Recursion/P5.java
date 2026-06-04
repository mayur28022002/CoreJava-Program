package Recursion;
//sum of digit
public class P5 {
public static void main(String[] args) {
	System.out.println(sum(12456));
}
 public static int sum(int n) {
	 if(n==0)
	 return 0;
	 return n%10+sum(n/10);
 }
}

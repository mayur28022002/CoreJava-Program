package Recursion;
//Print 1 to 5 
public class P1 {
 public static void main(String[] args) {
	print(1);
}
 public static void print(int n) {
	 if(n>5) {
		 return;
	 }
	 System.out.println(n);
	 print(n+1);
 }
}

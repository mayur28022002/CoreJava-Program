package Recursion;
//print 5 to 1
public class P2 {
 public static void main(String[] args) {
	print(5);
}
 public static void print(int n) {
	 if(n==0) {//base case Condition
		 return;
	 }
	 System.out.println(n);
	 print(n-1);//Recursive call stmt
 }
}

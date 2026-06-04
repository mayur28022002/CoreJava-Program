package Recursion;

public class P6 {
public static void main(String[] args) {
	String s="Java is a secure language";
	reverse(s,s.length()-1);
}
 public static void reverse(String s,int n) {
	 if(n<0)
		 return;
	 System.out.println(s.charAt(n));
	 reverse(s,n-1);
 }
}

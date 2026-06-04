package Recursion;
//Check Palindrome
public class P7 {
 public static void main(String[] args) {
	String s="MADAM";
	if(palindrome(s,0,s.length()-1))
		System.out.println("Palindrome");
	else
		System.out.println("Not Palindrome");
}
 public static boolean palindrome(String s,int start,int end) {
	 if(start>=end)
	  return true;
	 if(s.charAt(start)!=s.charAt(end))
		 return false;
	 return palindrome(s,start+1,end-1);
 }
}

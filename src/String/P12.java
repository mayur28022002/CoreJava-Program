package String;
//Reverse the String
public class P12 {
 public static void main(String[] args) {
	String s="Hello";
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println("Reverse of the String is  "+rev);
}
}

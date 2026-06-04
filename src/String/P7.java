package String;
//Check the given String pallidrome or not
public class P7 {
public static void main(String[] args) {
	String s="madam";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
		if(s.equals(rev)) {
			System.out.println("String is Pallidrome");
		}
		else {
			System.out.println("String is not Pallidrome");
		}
	}
}


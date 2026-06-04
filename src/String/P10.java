package String;
//Reverse Each Word
public class P10 {
  public static void main(String[] args) {
	String s="I Love Java";
	String []arr=s.split(" ");
	for(String s1:arr) {
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		
		}
		System.out.println(rev+" ");
	}
}
}

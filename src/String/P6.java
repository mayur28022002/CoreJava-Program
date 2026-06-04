package String;
//Remove the vowels from the string
public class P6 {
  public static void main(String[] args) {
	String s="hello allen";
	String s1="";
	s1=s.replaceAll("[a,e,i,o,u]", "");
	System.out.println(s1);
}
}

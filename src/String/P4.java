package String;
//Java Program to find length of the string without using length function
public class P4 {
  public static void main(String[] args) {
	int length=0;
	String s="Java is Progarmming Language";
	for(char cl:s.toCharArray())
		length++;
	System.out.println("Length of the String is "+length);
  }
}

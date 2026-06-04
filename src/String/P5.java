package String;
//Java program to count the number of vowels in a String
public class P5 {
 public static void main(String[] args) {
	String str="Hello World";
	int count=0;
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(ch=='a'||ch=='i'||ch=='u'||ch=='e'||ch=='o') {
			count++;
		}
	}
	System.out.println("Numbers Of Vowel "+count);
}
}

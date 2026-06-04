package String;
//Java program to check a character is an alphabet or not

public class P2 {
 public static void main(String[] args) {
	char ch='9';
	if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
		System.out.println(ch+" is alphabet");
	}
	else {
		System.out.println(ch+" is not alphabet");
	}
}
}

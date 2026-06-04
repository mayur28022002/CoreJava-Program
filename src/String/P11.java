package String;

import java.util.Arrays;

//Anagram Or Not
public class P11 {
  public static void main(String[] args) {
	String s1="listen";
	String s2="slient";
	char[]a=s1.toCharArray();
	char[]b=s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	if(Arrays.equals(a,b)) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("is not a anagarm");
	}
}
}

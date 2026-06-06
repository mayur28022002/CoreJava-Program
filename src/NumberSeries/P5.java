package NumberSeries;
//Reverse The Number
public class P5 {
public static void main(String[] args) {
	int num=654321;
	int rev=0;
	int rem=0;
	while(num!=0) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
	}
	System.out.println(rev);
}
}

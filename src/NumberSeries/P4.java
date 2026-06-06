package NumberSeries;
//Sum of digit
public class P4 {
public static void main(String[] args) {
	int num=51151;
	int sum=0;
	int rem=0;
	while(num!=0) {
	 rem=num%10;
	 sum=sum+rem;
	 num=num/10;
	}
	System.out.println("The Sum of all digit "+sum);
}
}

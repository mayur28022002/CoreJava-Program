package NumberSeries;
//Armstrong Number
//sum of its own digits raised to the power of the number of digits.
public class P8 {
 public static void main(String[] args) {
	int num=153;
	int res=num;
	int sum=0;
	while(num!=0) {
		int rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
	if(sum==res) {
		System.out.println(res+" is a Amstrong number");
	} else {
		System.out.println(res +"is not a Amstrong Number");
	}
}
}

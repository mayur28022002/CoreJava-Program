package NumberSeries;
//PerfectNumber
public class P11 {
public static void main(String[] args) {
	int n=28;
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		System.out.println("is perfect numberr");
	}
	else {
		System.out.println("Is not a perfect number");
	}
}
}

package NumberSeries;
//Strong Number
public class P12 {
  public static void main(String[] args) {
	int num=145;
	int res=num;
	int sum=0;
	while(res!=0) {
		int rem=res%10;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		res=res/10;
	}
	if(sum==num) {
		System.out.println(num+" is strong number");
	}
	else {
		System.out.println(num+ " is not a strong number");
	}
}
}

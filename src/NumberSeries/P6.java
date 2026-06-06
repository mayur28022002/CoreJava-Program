package NumberSeries;
//Check the pallidrome or not
public class P6 {
public static void main(String[] args) {
	int num=121;
	int res=num;
	int rev=0;
	int rem=0;
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
	
	if(res==rev) {
		System.out.println("is pallidrome");
	}
	else {
		System.out.println("Is not a pallidrome");
	}
}
}

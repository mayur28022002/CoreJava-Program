package NumberSeries;
//count the digit
public class P9 {
 public static void main(String[] args) {
	int num=123456;
	int count=0;
	while(num!=0) {
		count++;
		num=num/10;
	}
	System.out.println(count);
}
}

package Array;
//Missing Number
public class P13 {
  public static void main(String[] args) {
	int[]arr= {1,2,3,4,5,6};
	int n=5;
	int total=n*(n+1)/2;
	int sum=0;
	for(int num:arr) {
		sum=sum+num;
	}
	System.out.println(total-sum);
}
  
}

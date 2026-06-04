package Array;
//calculating the sum of all the elements of an array
public class P5 {
  public static void main(String[] args) {
	int []arr= {10,20,30,50};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	System.out.println(sum);
}
}

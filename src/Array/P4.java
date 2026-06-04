package Array;
//Second Maximum Value of array
public class P4 {
 public static void main(String[] args) {
	int []arr= {10,50,30,70,20};
	int max=Integer.MIN_VALUE;
	int secondMax=Integer.MIN_VALUE;
	for(int num:arr) {
		if(num>max) {
			secondMax=max;
			max=num;
		}
		else if(num>secondMax && num!=max) {
			secondMax=num;
		}
	}
	System.out.println("second maximum Value "+secondMax);
}
}
/*
 public class Demo{
 public static void main(String[]args){
 int []arr={10,20,30};
 Arrays.sort(arr);
 system.out.println(arr[arr.length-2]);
 }
 */

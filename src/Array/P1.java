package Array;
//Find The Largest element of an array
public class P1 {
 public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("Maxiumn Value is "+max);
}
}

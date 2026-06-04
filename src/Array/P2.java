package Array;
//Find the minimum value of an array
public class P2 {
 public static void main(String[] args) {
	int arr[]= {10,22,40,50,80,60};
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.println("Minimum Value "+min);
}
}

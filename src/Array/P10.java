package Array;
//Find Duplicate Elements
public class P10 {
public static void main(String[] args) {
	int []arr= {10,22,5,8,7,6,6};
	for(int i=0;i<arr.length;i++) {
		for(int j= i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
		}
	}
}
}

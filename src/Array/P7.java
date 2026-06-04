package Array;
//Sort The Array
import java.util.Arrays;

public class P7 {
 public static void main(String[] args) {
	int []arr= {10,50,20,40,30};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
     //Second Method
/*
 public class SortArray {
    public static void main(String[] args) {
        int[] arr = {50, 20, 70, 10, 30};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

 */

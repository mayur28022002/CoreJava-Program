package Array;

import java.util.LinkedHashSet;

//Remove duplicate element of an array
public class P11 {
 public static void main(String[] args) {
	 int[]arr= {1,2,1,2,6,5,6,4};
 LinkedHashSet<Integer>set=new LinkedHashSet<>();
 for(int i:arr) {
	 set.add(i);
 }
 System.out.println(set);
}
}

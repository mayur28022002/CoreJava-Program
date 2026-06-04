package Array;

import java.util.HashMap;

//Frequency of an array Element
public class P9 {
public static void main(String[] args) {
	int[] arr={1,2,2,3,3,3};

	HashMap<Integer,Integer> map=new HashMap<>();

	for(int num:arr){
	    map.put(num,map.getOrDefault(num,0)+1);
	}

	System.out.println(map);
}
}

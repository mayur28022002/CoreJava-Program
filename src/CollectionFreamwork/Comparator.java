package CollectionFreamwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
 public static void main(String[] args) {
	List<Integer>li=new ArrayList<>();
	li.add(101);
	li.add(202);
	li.add(404);
	li.add(403);
   Collections.sort(li,(i,j)->i%10>j%10?1:-1);
   for(int i:li) {
		 System.out.println(i);
	 }
	 
}
 
 
}

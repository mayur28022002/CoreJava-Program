package CollectionFreamwork;

import java.util.HashMap;

public class Map{
  public static void main(String[] args) {
	HashMap<Integer,String>mp=new HashMap<>();
    mp.put(101,"Kunal");
    mp.put(102,"Riyan");
    mp.put(103, "Amit");
    System.out.println(mp);
    System.out.println(mp.get(102));
}
}

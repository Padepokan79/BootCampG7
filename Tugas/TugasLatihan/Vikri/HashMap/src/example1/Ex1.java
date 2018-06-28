package example1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ex1 {
	 public static void main(String args[]){  
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(3, "Yayy");  
		  hm.put(2, "Wayy");  
		  hm.put(1, "Rayy");  
		  
		  for(Entry<Integer, String> v: hm.entrySet()) {
			  System.out.println(v.getValue());
		  }
	 }  
}

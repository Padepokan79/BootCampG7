package SimpleHashMap;
/* 
Created by  		: Richa Fitria
Date/hour			: 25 Juni 2018/ 09.59 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.*;


public class SimpleHashMap {

	public static void main(String[] args) {
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(100, "Amit");
		hm.put (101, "Vijay");
		hm.put(102, "Rahul");
		
		//Menampilkan HashMap dengan for each
		System.out.println("Dengan for each");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println("======================");
		//Menampilkan HashMap dengan iterator
		System.out.println("Dengan iterator");
	    Set set = hm.entrySet();
	    Iterator i = set.iterator();
	     
	    while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	    }
		
	}

}

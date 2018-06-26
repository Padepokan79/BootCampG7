package javaPoint;

import java.util.HashMap;
import java.util.Map;

public class Contoh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		hm.put(100,"Amit");  
		hm.put(101,"Vijay");  
		hm.put(102,"Rahul");  
		for(Map.Entry<Integer, String> m:hm.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}
	}

}

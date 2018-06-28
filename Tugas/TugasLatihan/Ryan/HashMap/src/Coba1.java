/**
 *HashMap
 * Coba1.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 09.49.36 25 Jun 2018
 */
import java.util.*;  
public class Coba1{  
	public static void main(String args[]){  
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		hm.put(100,"Amit");  
		hm.put(101,"Vijay");  
		hm.put(102,"Rahul");  
		for(Map.Entry m:hm.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}
}  

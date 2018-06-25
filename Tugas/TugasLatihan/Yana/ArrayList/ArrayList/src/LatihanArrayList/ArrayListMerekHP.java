package LatihanArrayList;

import java.util.*;
public class ArrayListMerekHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> merek = new ArrayList<String>();
//		ArrayList<>
		
		merek.add("Samsung");
		merek.add(0, "Iphone");
		merek.add("Oppo");
		merek.add("Vivo");
		
		Iterator iterator = merek.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(String tampilMerek : merek) {
			System.out.println(tampilMerek);
		}
	}

}

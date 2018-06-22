/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-21
 * 
 * */

package ArrayList;

import java.util.*;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Ravi");
		arr.add("Malik");
		arr.add("Andi");
		arr.add("Ivan");

		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

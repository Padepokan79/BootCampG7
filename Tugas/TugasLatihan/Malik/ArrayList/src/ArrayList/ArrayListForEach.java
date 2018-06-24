
 /*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-21
 * 
 * */
package ArrayList;

import java.util.ArrayList;

public class ArrayListForEach {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Ravi");
		arr.add("Malik");
		arr.add("Andi");
		arr.add(1,"Ivan");
		
		for(String obj:arr) {
			System.out.println(obj);
		}

	}

}

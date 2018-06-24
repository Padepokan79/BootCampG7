import java.util.ArrayList;
import java.util.Iterator;

/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */

public class ArrayListIterator {
	public static void main (String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Nurdhiat");
		list.add("Chaudhary");
		list.add("Malik");
		list.add("Terresact");
		
		System.out.println("Ukuran "+list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

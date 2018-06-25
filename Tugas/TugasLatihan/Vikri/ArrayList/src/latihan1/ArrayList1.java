package latihan1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList();
		
		ar.add("a");
		ar.add("b");
		ar.add("c");
		ar.add("d");
		ar.add("e");
		
		ArrayList<String> ar2 = new ArrayList();
		ar2.add("f");
		ar2.add("g");
		ar2.add("h");
		
		System.out.println();
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}

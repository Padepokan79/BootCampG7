import java.util.ArrayList;

/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */

public class ArrayListForEach {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Ukuran "+list.size());
		for (int obj : list) {
			System.out.println(obj);
		}

	}

}

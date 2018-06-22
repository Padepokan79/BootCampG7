import java.util.ArrayList;
/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */
public class ArrayListNoCollection {

	public static void main(String[] args) {
		  ArrayList al = new ArrayList();
	      System.out.println("Ukuran : " + al.size());
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add(0, "D");
	      al.add("F");
	      al.add(1, "A2");
	      
	      System.out.println("Ukuran : " + al.size());
	      System.out.println("Data   : " + al);

	      al.remove("C");
	      al.remove(0);
	      System.out.println("Ukuran : " + al.size());
	      System.out.println("Data   : " + al);

	}

}

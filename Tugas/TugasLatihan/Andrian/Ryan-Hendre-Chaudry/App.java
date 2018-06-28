package rhc;
import java.util.*;
public class App {

	private static Scanner key;

	public static void main(String[] args) {
		key = new Scanner(System.in);
		String kemampuan;
		Unggas unggas = new Unggas("trakea");
		Burung merpati = new Burung(unggas,"Merpati", "putih", 10,"lari", 100, 5, "kicau");
		
		System.out.println(unggas.toString());
		System.out.println();
		System.out.println("Dan memiliki kemampuan:");
		kemampuan = key.next();
		merpati.setKemampuan(kemampuan);
		
		System.out.println(merpati.printBurung());
	}

}

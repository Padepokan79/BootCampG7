package athlete;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Atlit ath = new Atlit(185, 80, 28, "Ucup", "Laki", "asjdgjhsad");
		Footbal ftb = new Footbal(ath, "Penonton", 3, 3, 3, 3);
		
		System.out.println(ftb.printAtlit());
		System.out.println("Jumlah Masuk " + ftb.jmlhTendang(10));
	}

}

/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	10.34
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex18Drills4{
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int penumpang;

		System.out.println("\nIKAN Travel 6b");
		System.out.print("\nMasukkan jumlah penumpang: ");
		penumpang=keyboard.nextInt();

		System.out.println("Bis yang tersedia: ");
		if(penumpang>=60)
			System.out.println("Bis Dengan Kursi 60");
		if(penumpang>=45)
			System.out.println("Bis Dengan Kursi 45");
		if(penumpang>=32)
			System.out.println("Bis Dengan Kursi 32");
		if(penumpang>=18)
			System.out.println("Bis Dengan Kursi 18");
		if(penumpang>=12)
			System.out.println("Bis Dengan Kursi 12");
		if(penumpang>0)
			System.out.println("Bis Dengan Kursi 6 Executive");
	}
}
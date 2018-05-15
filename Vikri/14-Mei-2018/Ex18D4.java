/*
	Created By Vikri
	14/05/2018
	10:34
*/
import java.util.Scanner;
public class Ex18D4{
	public static void main(String[] args) {
		int penumpang;
		Scanner string = new Scanner(System.in);

		System.out.print("masukan jumlah penumpang? ");
		penumpang=string.nextInt();

		System.out.println("Maka bis yang tersedia :\n");

		if ((penumpang>=6 || penumpang <= 6) && penumpang>=0) {
		 	System.out.println("\t- Bis dengan kursi 6 Executive ");
		}
		if (penumpang>=12 && penumpang>=6) {
		 	System.out.println("\t- Bis dengan kursi 12 ");
		}
		if (penumpang>=18 && penumpang>=12) {
		 	System.out.println("\t- Bis dengan kursi 18 ");
		}
		if (penumpang>=32 && penumpang>=18) {
		 	System.out.println("\t- Bis dengan kursi 32 ");
		}
		if (penumpang>=45 && penumpang>=32) {
		 	System.out.println("\t- Bis dengan kursi 45 ");
		}
		if (penumpang>=60 && penumpang>=45) {
		 	System.out.println("\t- Bis dengan kursi 60 ");
		}
	}
}
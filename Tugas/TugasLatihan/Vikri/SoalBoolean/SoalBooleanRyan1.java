/*
	Created By vikri
	13/05/2018
	11:04
*/
import java.util.Scanner;
public class SoalBooleanRyan1{
	public static void main(String[] args) {
		boolean kriteria;
		int umur, membaca;
		String tk;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.print("Umur Anak: ");
		umur = input.nextInt();

		System.out.print("Pernah TK (ya/tidak): ");
		tk = input.next();

		System.out.print("Lihai Membaca: ");
		membaca = input.nextInt();

		kriteria = (umur >= 7 && tk.equals("ya")) || (tk.equals("tidak") && membaca >= 7 && membaca <= 10);
		System.out.print("Diterima di sd? "+kriteria);
	}
}

/*
	Created By vikri
	13/05/2018
	11:04
*/
import java.util.Scanner;
public class SoalBooleanRyan3{
	public static void main(String[] args) {
		int umur, tinggi, juggling;
		String jKelamin;
		double fisik;
		boolean kriteria;

		Scanner string = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.print("Jenis Kelamin: ");
		jKelamin = string.next();

		System.out.print("Umur: ");
		umur = input.nextInt();

		System.out.print("Skill juggling: ");
		juggling = input.nextInt();

		System.out.print("Fisik: ");
		fisik = input.nextDouble();

		kriteria = (jKelamin.equals("pria") && umur >=17 && umur <=20 && juggling >= 100) || (jKelamin.equals("pria") && umur >= 20 && fisik >= 8.0 && fisik <= 10.0 && juggling >= 250);
		System.out.print("Boleh Gabung? "+kriteria);
	}
}

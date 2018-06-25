/*
	Created Vikri
	13/05/2018
	21:00
*/
import java.util.Scanner;
public class SoalBooleanKhairil2{
	public static void main(String[] args) {
		double roti, selai, kismis, mentega, roti1, mentega1, belanja;
		boolean kriteria, belanja1, belanja2;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Jumlah roti yang dibeli?");
		roti1=input.nextDouble();

		System.out.print("Jumlah selai yang dibeli?");
		selai=input.nextDouble();

		System.out.print("Jumlah kismis yang dibeli?");
		kismis=input.nextDouble();

		System.out.print("Jumlah mentega yang dibeli?");
		mentega1=input.nextDouble();

		roti = roti1*15000;
		selai = selai*8500;
		kismis = kismis*7500;
		mentega = mentega1*3500;

		belanja = roti+selai+kismis+mentega;
		belanja2 = mentega1 == 1 && roti1 == 1;
		kriteria = belanja<=100000&&belanja2;

		System.out.print("Masuk Kriteria belanja?"+kriteria);
	}
}
//Created by : Hendra Kurniawan
//Date : 19 Mei 2018 Time 3:59 AM
//Modified :
import java.util.Scanner;

public class PasanganIbu{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int age;
		boolean izin;
		double penampilan, pendapatan;

		System.out.print( "Masukan usia kamu ? ");
		age = keyboard.nextInt();

		System.out.print( "Masukan penampilan kamu(skalan 1 -10) ? ");
		penampilan = keyboard.nextDouble();

		System.out.print( "Masukan pendapatan kamu ? ");
		pendapatan = keyboard.nextDouble();

		izin = age >= 17 && age <= 30 && penampilan >=8 && penampilan <= 10 && pendapatan >= 5000000;
		System.out.println( "izin ? " + izin);
	}
}
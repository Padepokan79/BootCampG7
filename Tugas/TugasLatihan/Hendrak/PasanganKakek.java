//Created by : Hendra Kurniawan
//Date : 19 Mei 2018 Time: 3:49 PM
//Modified :
import java.util.Scanner;

public class PasanganKakek{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double penampilan, pendapatan;
		boolean izin;

		System.out.print( "Masukan usia kamu ? ");
		age = keyboard.nextInt();

		System.out.print( "Masukan penampilan kamu(skala 1 - 10) ? " );
		penampilan = keyboard.nextDouble();

		System.out.print( "Masukan pendapatan kamu ? ");
		pendapatan = keyboard.nextDouble();

		izin = age >= 30 && pendapatan >= 5000000;
		System.out.println(" izin ? " + izin);
	}

}
	

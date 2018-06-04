//Created by : Hendra Kurniawan
//Date : 19 Mei 2018 Time 3:59 AM
//Modified :
import java.util.Scanner;

public class PasanganAyah{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int age1,age2;
		boolean izin;
		double penampilan, pendapatan;

		System.out.print( "Masukan usia kamu ? ");
		age1 = keyboard.nextInt();

		System.out.print( "Masukan usia perempuan yang kamu lamar ?");
		age2 = keyboard.nextInt();

		System.out.print( "Masukan penampilan kamu(skalan 1 -10) ? ");
		penampilan = keyboard.nextDouble();

		System.out.print( "Masukan pendapatan kamu ? ");
		pendapatan = keyboard.nextDouble();


		izin = (age1-age2) >= 0 && (age1-age2) <= 5  && penampilan >=8 && penampilan <= 10 && pendapatan >= 5000000;
		
		System.out.println( "izin ? " + izin);
	}
}
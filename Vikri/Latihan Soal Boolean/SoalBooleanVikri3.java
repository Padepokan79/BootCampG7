/*
	Created by vikri
	14/05/2018
	0:48
*/
import java.util.Scanner;
public class SoalBooleanVikri3{
	public static void main(String[] args) {
		int keluarga, penghasilan;
		boolean kriteria;

		Scanner input = new Scanner(System.in);

		System.out.print("Penghasilan per Bulan: ");
		penghasilan=input.nextInt();

		System.out.print("Jumlah keluarga: ");
		keluarga=input.nextInt();

		kriteria = penghasilan<=2300000&&keluarga>3;
		System.out.println("Masuk kriteria boleh beli? "+kriteria);
	}
}
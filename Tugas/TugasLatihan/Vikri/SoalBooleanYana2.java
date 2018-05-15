// Created by vikri 
// 13/05/2018
// 08:04
import java.util.Scanner;
public class SoalBooleanYana2{
	public static void main(String[] args) {
		boolean kriteria;
		double umur, ipkS1, ipkS2, ipk; 
		String jKelamin, pendidikan, Akreditasi;

		Scanner input = new Scanner(System.in);
		Scanner string = new Scanner(System.in);

		System.out.print("Jenis Kelamin : ");
		jKelamin = string.next();

		System.out.print("Pendidikan Terakhir : ");
		pendidikan = string.next();

		System.out.print("Nilai s1 : ");
		ipkS1 = input.nextDouble();

		System.out.print("Nilai s2 : ");
		ipkS2 = input.nextDouble();

		System.out.print("Akreditasi kampus : ");
		Akreditasi = string.next();

		ipk = ipkS1 + ipkS2;
		ipk = ipk/2;
		kriteria = jKelamin.equals("Pria") && pendidikan.equals("S2") && ipkS1 >= 3.25 && Akreditasi.equals("B") || Akreditasi.equals("A");
		System.out.println("\n--------------------------"+
						   "\nMasuk kriteria? " +kriteria+
						   "\n--------------------------");
	}
}

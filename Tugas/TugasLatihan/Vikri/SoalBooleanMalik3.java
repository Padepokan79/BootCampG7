// Created by vikri 
// 13/05/2018
// 07:55
import java.util.Scanner;
public class SoalBooleanMalik3{
	public static void main(String[] args) {
		boolean kriteria;
		int usia, kaya, penampilan;
		String nama, jKelamin;

		Scanner string = new Scanner(System.in);
		Scanner string2 = new Scanner(System.in);
		
		System.out.print("Nama : ");
		nama = string2.next();

		System.out.print("Jenis Kelamin : ");
		jKelamin = string2.next();

		System.out.print("Umur : ");
		usia = string.nextInt();

		System.out.print("Kaya : ");
		kaya = string.nextInt();

		System.out.print("Penampilan : ");
		penampilan = string.nextInt();

		kriteria = (jKelamin.equals("pria")&&kaya>=10000000) || (jKelamin.equals("wanita")&&penampilan>=7)&&usia<=30;
		
		System.out.println("\n--------------------------"+
						   "\nMasuk Kriteria? " +kriteria+
						   "\n--------------------------");
	}
}

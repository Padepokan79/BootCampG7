// Created by vikri 
// 13/05/2018
// 08:04
import java.util.Scanner;
public class SoalBooleanYana1{
	public static void main(String[] args) {
		boolean kriteria;
		int umur; 
		String nama, jKelamin,keahlian1, keahlian2, pendidikan, pengalaman;

		Scanner string = new Scanner(System.in);
		Scanner string2 = new Scanner(System.in);
		
		System.out.print("Nama : ");
		nama = string2.next();

		System.out.print("Jenis Kelamin : ");
		jKelamin = string2.next();

		System.out.print("Umur : ");
		umur = string.nextInt();

		System.out.print("Pendidikan : ");
		pendidikan = string2.next();

		System.out.print("Keahlian1 : ");
		keahlian1 = string2.next();

		System.out.print("keahlian2 : ");
		keahlian2 = string2.next();

		System.out.print("Pengalaman (ya/tidak): ");
		pengalaman = string2.next();

		kriteria = pengalaman.equals("ya") && jKelamin.equals("pria") && umur >= 23 && (pendidikan.equals("S1") || pendidikan.equals("S2") || pendidikan.equals("S3")) && keahlian1.equals("java") && keahlian2.equals("AngularJs") || keahlian2.equals("PHP");
		System.out.println("\n--------------------------"+
						   "\nMasuk kriteria? " +kriteria+
						   "\n--------------------------");
	}
}

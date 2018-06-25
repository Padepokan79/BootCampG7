// Created by vikri 
// 13/05/2018
// 07:36
import java.util.Scanner;
public class SoalBooleanMalik1{
	public static void main(String[] args) {
		boolean kriteria;
		int tinggi;
		double tampan; 
		String nama, jKelamin, kulit;

		Scanner string = new Scanner(System.in);
		Scanner string2 = new Scanner(System.in);
		
		System.out.print("Nama : ");
		nama = string2.next();

		System.out.print("Jenis Kelamin : ");
		jKelamin = string2.next();

		System.out.print("Tinggi Badan : ");
		tinggi = string.nextInt();

		System.out.print("Ketampanan, : ");
		tampan = string.nextDouble();

		System.out.print("Warna Kulit : ");
		kulit = string2.next();

		kriteria = jKelamin.equals("pria") && tinggi >= 175 && tampan >= 7;
		System.out.println("==========================\n"+
						   "      CALON MODEL BARU    \n"+
						   "==========================\n"+
						   "\n"+
						   "Tinggi Badan : "+tinggi+
						   "\nSkala Penampilan : "+tampan+
						   "\nWarna Kulit : "+kulit+
						   "\n"+
						   "\n--------------------------"+
						   "\nApakah anda diterima? " +kriteria+
						   "\n--------------------------");
	}
}

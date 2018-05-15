// Created by vikri 
// 13/05/2018
// 07:47
import java.util.Scanner;
public class SoalBooleanMalik2{
	public static void main(String[] args) {
		boolean kriteria;
		int izin, alfa;
		double nilai; 
		String nama;

		Scanner string = new Scanner(System.in);
		Scanner string2 = new Scanner(System.in);
		
		System.out.print("Nama : ");
		nama = string2.next();

		System.out.print("Nilai : ");
		nilai = string.nextDouble();

		System.out.print("Izin : ");
		izin = string.nextInt();

		System.out.print("Alfa, : ");
		alfa = string.nextInt();

		kriteria = (nilai >= 7.0 && izin <= 3) || (nilai >= 7.5 && izin >= 3) && alfa <= 3 ;
		
		System.out.println("==========================\n"+
						   "       Surat Kelulusan    \n"+
						   "==========================\n"+
						   "\n"+
						   "Nilau UN : "+nilai+
						   "\nIzin : "+izin+
						   "\nAlfa : "+alfa+
						   "\n"+
						   "\n--------------------------"+
						   "\nApakah anda lulus? " +kriteria+
						   "\n--------------------------");
	}
}

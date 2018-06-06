/*
	 Program     : Soal 2 - Vikri
     Creator     : Khairil
     Created At  : 17 Mei 2018 19:30 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class VikriIfElse2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nama, sppLunas;
		int nilaiMtk, nilaiAgama, utangUangBangunan;

		System.out.print("Nama : ");
		nama = keyboard.next();
		System.out.println();
		System.out.print("Nilai Matematika : ");
		nilaiMtk = keyboard.nextInt();
		System.out.println();
		System.out.print("Nilai Agama : ");
		nilaiAgama = keyboard.nextInt();
		System.out.println();
		System.out.print("SPP Lunas : ");
		sppLunas = keyboard.next();
		System.out.println();
		System.out.print("Utang Uang Pembangunan : ");
		utangUangBangunan = keyboard.nextInt();
		System.out.println();

		if(!nama.equals("Andi") && nilaiMtk < 72 && nilaiAgama < 75) {
			if(sppLunas.equals("Y") && utangUangBangunan == 0) {
				System.out.println("Naik Kelas");
			}
			else {
				System.out.println("Tidak Naik Kelas");					
			}
		}
		else {
			System.out.println("Tidak Naik Kelas");	
		}

	}
}
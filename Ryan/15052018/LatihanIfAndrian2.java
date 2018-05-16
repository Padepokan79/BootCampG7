/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 15 May 2018 09:01   
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfAndrian2{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String nama, predikat="0", keterangan="0";
		double uas, uts, tugas;

		System.out.println("\n================================");
		System.out.print("Nama\t: ");
		nama = key.next();
		System.out.print("UTS\t: ");
		uts = key.nextDouble();
		System.out.print("UAS\t: ");
		uas = key.nextDouble();
		System.out.print("Tugas\t: ");
		tugas = key.nextDouble();
		System.out.println("\n================================");

		double grade = (uts*30/100)+(uas*30/100)+(tugas*40/100);

		if (grade < 20) {
		 	predikat = "E";
		 	keterangan = "Tidak Lulus";
		}
		else if (grade < 40) {
		 	predikat = "D";
		 	keterangan = "Tidak Lulus";
		}
		else if (grade < 60) {
		 	predikat = "C";
		 	keterangan = "Tidak Lulus";
		}
		else if (grade < 80) {
		 	predikat = "B";
		 	keterangan = "Lulus";
		}
		else if (grade <= 100) {
		 	predikat = "A";
		 	keterangan = "Lulus";
		}

		System.out.println("Selamat "+nama+" predikat yang anda dapatkan "+predikat+" dan anda dinyatakan "+keterangan);
	}
}
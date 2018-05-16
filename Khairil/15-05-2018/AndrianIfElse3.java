/*
	 Program     : Soal 3 - Andrian
     Creator     : Khairil
     Created At  : 15 Mei 2018 10:45 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class AndrianIfElse3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputNama, predikat, keterangan;
		int inputUts, inputUas, inputTugas, uts, uas, tugas, nilai;
	
		System.out.println("============================================");
		System.out.println("Nama		:");
		inputNama = keyboard.next();
		System.out.println("UTS			:");
		inputUts = keyboard.nextInt();
		System.out.println("UAS			:");
		inputUas = keyboard.nextInt();
		System.out.println("Tugas		:");
		inputTugas = keyboard.nextInt();
		System.out.println("============================================");

		tugas = inputTugas * 40/100;
		uts   = inputUts * 30/100;
		uas   = inputUas * 30/100;

		nilai = tugas + uts + uas;

		if(nilai >= 80 && nilai <= 100) {
			predikat = "A";
			keterangan = "Lulus";
			System.out.println("Selamat " + inputNama + " predikat yang anda dapatkan " + predikat + " dan anda dinyatakan " + keterangan);			
		}
		else if(nilai >= 60 && nilai <= 79) {
			predikat = "B";
			keterangan = "Lulus";
			System.out.println("Selamat " + inputNama + " predikat yang anda dapatkan " + predikat + " dan anda dinyatakan " + keterangan);
		}
		else if(nilai >= 40 && nilai <= 59) {
			predikat = "C";
			keterangan = "Tidak Lulus";
			System.out.println("Selamat " + inputNama + " predikat yang anda dapatkan " + predikat + " dan anda dinyatakan " + keterangan);
		}		
		else if(nilai >= 20 && nilai <= 39) {
			predikat = "D";
			keterangan = "Tidak Lulus";
			System.out.println("Selamat " + inputNama + " predikat yang anda dapatkan " + predikat + " dan anda dinyatakan " + keterangan);
		}		
		else if(nilai >= 0 && nilai <= 19) {
			predikat = "E";
			keterangan = "Tidak Lulus";
			System.out.println("Selamat " + inputNama + " predikat yang anda dapatkan " + predikat + " dan anda dinyatakan " + keterangan);
		}		
		else {
			System.out.println("Terjadi error");
		}
	}
}
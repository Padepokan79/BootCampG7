/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfAndrian3 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Scanner key1 = new Scanner(System.in);
			int point;
			double uts, uas, tugas, nilaiAkhir, persenUts, persenUas, persenTugas;
			String nama,keterangan1, keterangan2, predikatA, predikatB, predikatC, predikatD, predikatE;

			persenUts = 0.3;
			persenUas = 0.3;
			persenTugas = 0.4;
			keterangan1 = "lulus";
			keterangan2 = "tidak lulus";
			predikatA = "A";
			predikatB = "B";
			predikatC = "C";
			predikatD = "D";
			predikatE = "E";

			System.out.print("Nama : ");
			nama = key.nextLine();

			System.out.print("UTS : ");
			uts = key1.nextDouble();

			System.out.print("UAS : ");
			uas = key1.nextDouble();

			System.out.print("Tugas : ");
			tugas = key1.nextDouble();

			nilaiAkhir = (uts*persenUts) + (uas*persenUas) +(tugas*persenTugas);

			if ((nilaiAkhir >= 80) && (nilaiAkhir>=100) ) {
				System.out.println("Selamat " + nama + " predikat anda " + predikatA +" dan anda dinyatakan " + keterangan1);
			}
			else if ((nilaiAkhir >= 60) && (nilaiAkhir>=79) ) {
				System.out.println("Selamat " + nama + " predikat anda " + predikatB +" dan anda dinyatakan " + keterangan1);
			}
			else if ((nilaiAkhir >= 40) && (nilaiAkhir>=59) ) {
				System.out.println("Selamat " + nama + " predikat anda " + predikatC +" dan anda dinyatakan " + keterangan2);
			}
			else if ((nilaiAkhir >= 20) && (nilaiAkhir>=39) ) {
				System.out.println("Selamat " + nama + " predikat anda " + predikatD +"A dan anda dinyatakan " + keterangan2);
			}
			else if ((nilaiAkhir >= 0) && (nilaiAkhir>=19) ) {
				System.out.println("Selamat " + nama + " predikat anda " + predikatE +" dan anda dinyatakan " + keterangan2);
			}
			else {
				System.out.println("input tidak valid");
			}
		}
	}
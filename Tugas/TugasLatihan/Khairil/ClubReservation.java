/*
	 Program     : Tugas IF - Club Reservations
     Creator     : Khairil
     Created At  : 14 Mei 2018 13:07 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class ClubReservation {
	public static void main(String[] args) {
		String inputJenisKel, inputHari;
		int inputUsia;
		double inputPenampilan;
		boolean jkL, jkP, hariSenin, hariSelasa, hariRabu, hariKamis, hariJumat, hariSabtu, hariMinggu, melodiesMemory, ladiesNight, jombloNight, brondongNight, reservasiUmum;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hari yang diinginkan\t\t: ");	
		inputHari = keyboard.next();
		
		System.out.print("Usia anda \t\t: ");	
		inputUsia = keyboard.nextInt();
		
		System.out.print("Jenis Kelamin \t\t: ");	
		inputJenisKel = keyboard.next();
		
		System.out.print("Penampilan (skala 0.0 - 10.0)\t\t: ");	
		inputPenampilan = keyboard.nextDouble();

		hariJumat = inputHari.equals("jumat");
		hariKamis = inputHari.equals("kamis");
		hariSabtu = inputHari.equals("sabtu");
		hariSelasa = inputHari.equals("selasa");
		hariSenin = inputHari.equals("senin");
		hariRabu  = inputHari.equals("rabu");
		hariMinggu = inputHari.equals("minggu");

		jkL = inputJenisKel.equals("L");
		jkP = inputJenisKel.equals("P");
		
		melodiesMemory = hariJumat && ( jkL || jkP ) && inputUsia > 40; 
		ladiesNight = hariKamis && jkP && inputUsia >= 21 && inputUsia <= 30;
		jombloNight = hariSabtu && ( jkL || jkP ) && inputUsia >= 21 && inputUsia <= 30 && inputPenampilan >= 8.0;
		brondongNight = hariSelasa && ( jkP && inputPenampilan >= 8.0 && inputUsia >= 30 && inputUsia <= 45 ) || ( jkL && inputPenampilan < 8.0 && inputUsia >= 20 && inputUsia <= 25 );
		reservasiUmum = hariSenin || hariRabu || hariMinggu;


		System.out.println("=========================================================");
		System.out.println("CLUB Reservation");
		System.out.println();
		System.out.println("Hari yang diinginkan: " + inputHari);
		System.out.println("Umur anda: " + inputUsia);
		System.out.println("Jenis Kelamin: " + inputJenisKel);
		System.out.println("Penampilan rate: " + inputPenampilan);
		System.out.println();
		System.out.println("=========================================================");
		if(melodiesMemory == true) {
			System.out.println("Reservasi Melodies Memory Sukses");
		}
		else if(ladiesNight == true) {
			System.out.println("Reservasi Ladies Night Sukses");
		}
		else if(jombloNight == true) {
			System.out.println("Reservasi Jomblo Night Sukses");
		}
		else if(brondongNight == true) {
			System.out.println("Reservasi Brondong Night Sukses");
		}
		else if(reservasiUmum == true) {
			System.out.println("Reservasi Umum Sukses");
		}
		else {
			System.out.println("Reservasi Gagal!!");	
		}
		System.out.println("=========================================================");

	}
}
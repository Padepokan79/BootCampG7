/*
	DATA CREATED 	: 14 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class ClubReservation{
	public static void main(String[] args){
		String hariInput, gender, hari1, hari3, hari7;
		int usia, cute, valueCute, usia1, usia2, usia3, usia4, usia5, usia6;

		valueCute = 8;
		usia1 	  = 30; 
		usia2	  = 45;
		usia3 	  = 20;
		usia4	  = 21;
		usia5  	  = 25;
		usia6	  = 40;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Apa jenis kelamin anda? (cewek / cowok) ");
		gender 	= keyboard.next();

		System.out.print("Berapa usia anda sekarang? ");
		usia 	= keyboard.nextInt();

		System.out.print("Seberapa menarik diri anda? (Skala 0.0 - 10.0) ");
		cute 	= keyboard.nextInt();

		System.out.print("Kapan anda akan mengunjungi kami? (dalam hari) ");
		hariInput 	= keyboard.next();



		hari1 	= "senin";
		hari3 	= "rabu";
		hari7 	= "minggu";

		System.out.println("=====================================================");
		System.out.println("CLUB Reservation");
		System.out.println();
		System.out.println("Hari yang diinginkan\t\t: " + hariInput);
		System.out.println("Umur anda\t\t\t: " + usia);
		System.out.println("Jenis kelamin\t\t\t: " + gender);
		System.out.println("Penampilan rate dari 0 s.d 10\t: " + cute);
		System.out.println("");
		System.out.println("=====================================================");

		if (hariInput.equals("selasa") && ( (gender.equals("cewek") && cute >= valueCute  && usia >= usia1 && usia <= usia2) || (gender.equals("cowok") && cute < valueCute && usia >= usia3 && usia <= usia5) )) {
			System.out.println("Reservasi Brondong Night 5c Sukses!!!");

		}else if (hariInput.equals("kamis") && gender.equals("cewek") && cute >= valueCute && usia >= usia4 && usia <= usia1) {
			System.out.println("Reservasi Ladies Night 5a Sukses!!!");

		}else if (hariInput.equals("jumat") && (gender.equals("cewek") || gender.equals("cowok")) && usia > usia6) {
			System.out.println("Reservasi Melodies Memori Sukses!!!");

		}else if (hariInput.equals("sabtu") && (gender.equals("cewek") || gender.equals("cowok")) && usia >= usia4 && usia <= usia1 && cute >= valueCute) {
			System.out.println("Reservasi Jomblo Night 5b Sukses!!!");
			
		}else if (hariInput.equals(hari1) || hariInput.equals(hari3) || hariInput.equals(hari7)) {
			System.out.println("Reservasi UMUM Sukses!!!");

		}else{
			System.out.println("Reservasi GAGAL!!!");
		}

		System.out.println("=====================================================");

	}
}
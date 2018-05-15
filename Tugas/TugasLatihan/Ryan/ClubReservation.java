/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 May 2018 13:07
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class ClubReservation{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String gender, hari;
		int umur=0, penampilan=0;

		System.out.println("\n======================================");
		System.out.println("Club Reservation");
		System.out.println("======================================");
		System.out.print("\nHari Reservasi (senin/selasa/rabu/kamis/jumat/sabtu/minggu) : ");
		hari = keyboard.next();
		System.out.print("Umur : ");
		umur = keyboard.nextInt();
		System.out.print("Jenis Kelamin (L/P) : ");
		gender = keyboard.next();
		System.out.print("Penampilan Anda dari skala 0.0 sampai 10.0 : ");
		penampilan = keyboard.nextInt();

		if (hari.equals("selasa") && ((gender.equals("P") && umur >= 30 && umur <= 45 && penampilan >= 8 ) || (gender.equals("L") && umur >= 20 && umur <= 25 && penampilan < 8 ))  ) {
			System.out.println("\nReservasi Brondong Night Berhasil");
		}
		else if(hari.equals("sabtu") && (gender.equals("P") || gender.equals("L")) && umur >= 21 && umur <= 30 && penampilan >= 8){
			System.out.println("\nReservasi Jomblo Night berhasil");
		}
		else if(hari.equals("kamis") && gender.equals("P") && umur >= 21 && umur <= 30 && penampilan >= 8){
			System.out.println("\nReservasi Ladies Night Berhasil");
		}
		else if(hari.equals("jumat") && (gender.equals("P") || gender.equals("L")) && umur >= 40 ){
			System.out.println("\nReservasi Melodies Memory Berhasil");
		}
		else if(hari.equals("senin") || hari.equals("rabu") || hari.equals("minggu") ){
			System.out.println("\nReservasi Reguler Night Berhasil");
		}
		else{
			System.out.println("\nReservasi gagal!!");
		}
	}
}
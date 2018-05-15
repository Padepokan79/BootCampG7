import java.util.Scanner;

public class clubReservation {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	double penampilan;
	int umur;
	boolean perempuan, laki, melodiesMemori, ladiesNight, jombloNight, brondongNight;
	String gender, hari, join = "nama club";

	System.out.println ("=========================================================");
	System.out.println ("CLUB Reservation");
	System.out.println ();
	System.out.print ("Hari yang diinginkan: ");
	hari = keyboard.next();
	System.out.print ("Umur anda: ");
	umur = keyboard.nextInt();
	System.out.print ("Jenis Kelamin (L/P):  ");
	gender = keyboard.next();

	perempuan = gender.equals ("P");
	laki = gender.equals ("L");

	System.out.print ("Penampilan rate dari 0 s.d 10: ");
	penampilan = keyboard.nextDouble();

	melodiesMemori = hari.equals ("jumat") && (laki || perempuan) && umur > 40;
	ladiesNight = hari.equals ("kamis") &&  perempuan && (umur >= 21 && umur <= 30);
	jombloNight = hari.equals ("sabtu") && (laki || perempuan) && (umur >= 21 && umur <= 30);
	brondongNight = hari.equals ("selasa") && ((perempuan && penampilan >= 8 && (umur >= 30 && umur <= 45)) || (laki && penampilan <= 8 && (umur >= 20 && umur <= 25)));

	if (melodiesMemori == true) { 
		join = "Melodies Memori Sukses!!!"; 
	}
	else if (ladiesNight == true) {
		join = "Ladies Night Sukses!!!";
	}
	else if (jombloNight == true) {
		join = "jomblo Night Sukses!!!";
	}
	else if (brondongNight == true) {
		join = "Brondong Night Sukses!!!";
	}
	else if (hari.equals("senin") || hari.equals("rabu") || hari.equals("minggu)")) { 
		join = "Umum Sukses!!!";
	}
	else {join = "Gagal!!!";}

	//!melodiesMemori || !ladiesNight || ! jombloNight || !brondongNight) && 

	System.out.println ();
	System.out.println ("=========================================================");
	System.out.println ("Reservasi " + join);
}

}


	/* Club Reservation


Hari Jumat, Melodies Memori

-Cewek atau Cowok yang berusia lebih dari 40 tahun.
-Selain Itu tidak boleh masuk


Hari Kamis, Ladies Night 5a

-Cewek Cantik berusia 21 tahun sampai 30 Tahun
-Selain Itu tidak Boleh Masuk


Hari Sabtu, Jomblo Night 5b

-Cewek atau Cowok yang berusia 21 tahun sampai 30 tahun
 Penampilan Menarik
Selain itu Tidak boleh masuk


Hari Selasa, Brondong Night 5c

-Cewek Cakep usia 30 sampai 45 tahun
-Cowok gk Ganteng usia 20 sampai 25 tahun


Note: Selain Hari diatas, Club di buka untuk umum.


=========================================================
CLUB Reservation

Hari yang diinginkan: Kamis
Umur anda: 25
Jenis Kelamin: Cewek
Penampilan rate dari 0 s.d 10: 8

=========================================================
Reservasi Ladies Night Sukses !!!
=========================================================

 */
/*
Created by	: Yana
Time		: 14 Mei 2018 13.20
*/

import java.util.Scanner;

public class ClubReservation{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String	jenisKelamin;
		int		hari, umur, penampilan;
		boolean jumat, kamis, sabtu, selasa;


		System.out.println("=======================================================");
		System.out.println("CLUB RESERVATION\n");
		System.out.print("Hari yang diinginkan (input 1-7 untuk SeniN - Minggu): ");
		hari = keyboard.nextInt();
		System.out.print("Umur anda: ");
		umur = keyboard.nextInt();
		System.out.print("Jenis Kelamin (L/P): ");
		jenisKelamin = keyboard.next();
		System.out.print("Penampilan rate dari 0 s.d 10: ");
		penampilan = keyboard.nextInt();
		System.out.println("=======================================================");

		jumat	= ( jenisKelamin.equals("L") || jenisKelamin.equals("P") ) && umur > 40;
		kamis	= jenisKelamin.equals("P") && penampilan >= 8 && umur >= 21 && umur <= 30;
		sabtu	= ( jenisKelamin.equals("L") || jenisKelamin.equals("P") ) && umur >= 21 && umur <= 30 && penampilan > 8;
		selasa	= ( jenisKelamin.equals("P") && penampilan >= 8 && umur >= 30 && umur <= 45 ) ||
				  ( jenisKelamin.equals("L") && penampilan < 8 && umur >= 21 && umur <= 30 );

		if ( hari == 5) {
			if ( jumat ) {
				System.out.println("Reservasi Melodies Memori Sukses");
			} else{				
				System.out.println("Reservasi Melodies Memori Gagal");
			}
		}
		else if ( hari == 4 ) {
			if ( kamis ) {				
				System.out.println("Reservasi Ladies Night Sukses");
			}else{
				System.out.println("Reservasi Ladies Night Gagal");
			}
		}
		else if ( hari == 6 ) {
			if ( sabtu ) {
				System.out.println("Reservasi Jomblo Night Sukses");				
			}else{				
				System.out.println("Reservasi Jomblo Night Gagal");
			}
		}
		else if ( hari == 2) {
			if ( selasa ) {
				System.out.println("Reservasi Brondong Night Sukses");				
			}else{				
				System.out.println("Reservasi Brondong Night Gagal");
			}
		}
		else{
			System.out.println("Reservasi Sukses");
		}

		System.out.println("=======================================================");
	}
}

/*
Club Reservation


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
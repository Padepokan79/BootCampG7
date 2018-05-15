/*
created by : Malik Chaudhary
time : 14-05-2018 1:07PM
*/

import java.util.Scanner;
public class ClubReservation{
	public static void main(String[] args){

		Scanner club = new Scanner(System.in);

		String hari, kelamin;
		int usia, maxMelodiesAge, minAge, maxAge, minAgeCewe, maxAgeCewe, minAgeCowo, maxAgeCowo;
		double penampilan, minPenampilan;
		boolean kelaminCewe, kelaminCowo, jumat, sabtu, selasa, kamis;

		System.out.println("==============================");
		System.out.println("Club Reservation");
		System.out.print("\nHari yang diinginkan : ");
		hari = club.next();

		System.out.print("\nUmur anda : ");
		usia = club.nextInt();

		System.out.print("\njenis Kelamin (cewe/cowo) : ");
		kelamin = club.next();

		System.out.print("\npenampilan rate 0 - 10 : ");
		penampilan = club.nextDouble();

		maxMelodiesAge = 40;
		minAge = 21;
		maxAge = 30;
		minAgeCewe = 30;
		maxAgeCewe = 40;
		minAgeCowo = 20;
		maxAgeCowo = 25;
		minPenampilan = 8.0;

		kelaminCewe = kelamin.equals("cewe");
		kelaminCowo = kelamin.equals("cowo") ;

		jumat = ( hari.equals("Jumat") && ( kelaminCewe || kelaminCowo ) && usia > maxMelodiesAge );
		sabtu = ( hari.equals("Sabtu") && ( kelaminCewe || kelaminCowo ) && ( usia >= minAge && usia <= maxAge ) && penampilan >= minPenampilan );
		selasa = ( hari.equals("Selasa") && ( (kelaminCewe && penampilan >= minPenampilan && ( usia >= minAgeCewe && usia <= maxAgeCewe )) || (kelaminCowo && penampilan < minPenampilan && ( usia >= minAgeCowo || usia <= maxAgeCowo )  ) ) );
		kamis = ( hari.equals("Kamis") && kelaminCewe && penampilan >= minPenampilan && ( usia >= minAge && usia <= maxAge ) );


		if ( jumat ) {
			System.out.println("==========================");
			System.out.println("Reservasi Melodies Night sukses");
			System.out.println("==========================");
		}else if ( kamis ) ) {
			System.out.println("==========================");
			System.out.println("Reservasi Ladies Night sukses");
			System.out.println("==========================");
		}else if ( sabtu ) {
			System.out.println("==========================");
			System.out.println("Reservasi Jomblo Night sukses");
			System.out.println("==========================");
		}else if ( selasa ) {
			System.out.println("==========================");
			System.out.println("Reservasi brondong Night sukses");
			System.out.println("==========================");
		}else if( !jumat || !sabtu || !kamis || !selasa ) {
			System.out.println("==========================");
			System.out.println("Reservasi anda reguler berhasil");
			System.out.println("==========================");
		}else{
			System.out.println("==========================");
			System.out.println("Reservasi anda gagal");
			System.out.println("==========================");
		}

		
	}
}
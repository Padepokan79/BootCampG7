/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	13.08
	* Updated by:
	*
*/

import java.util.Scanner;

public class ClubReservation{
	public static void main(String[] args){
		int usia;
		double penampilan;
		String kelamin, hari;
		boolean kamis, jumat, sabtu, selasa;

		Scanner keyboard=new Scanner(System.in);

		System.out.println("===================================================");
		System.out.println("CLUB RESERVATION");
		System.out.println("inputkan dalam huruf kecil");
		System.out.print("\nHari yang diinginkan: ");
		hari=keyboard.next();
		System.out.print("Umur anda: ");
		usia=keyboard.nextInt();
		System.out.print("Jenis kelamin anda (cewe/cowo): ");
		kelamin=keyboard.next();
		System.out.print("Penampilan rate, skala 0.0 sampai 10.0? ");
		penampilan=keyboard.nextDouble();
		
		kamis=(kelamin.equals("cewe") && usia>=21 && usia<=30 && penampilan>=8);
		jumat=( (kelamin.equals("cewe") || kelamin.equals("cowo")) && usia>40 );
		sabtu=( (kelamin.equals("cewe") || kelamin.equals("cowo")) && usia>=21 && usia<=30 && penampilan>=8 );
		selasa=( (kelamin.equals("cewe") && usia>=30 && usia<=45 && penampilan>=8) ||
			   (kelamin.equals("cowo") && usia>=20 && usia<=25 && penampilan<8) );
		
		System.out.println("\n===================================================");
		if( hari.equals("kamis") && kamis )
			System.out.println("Reservasi Ladies Night Sukses !!!");
		else if(hari.equals("jumat") && jumat)
			System.out.println("Reservasi Melodies Memori Sukses !!!");
		else if (hari.equals("sabtu") && sabtu)
			System.out.println("Reservasi Jomblo Night Sukses !!!");
		else if (hari.equals("selasa") && selasa)
			System.out.println("Reservasi Brondong Night Sukses !!!");
		else if (hari.equals("senin") || hari.equals("rabu") || hari.equals("minggu") )
			System.out.println("Reservasi Club Sukses !!!");
		else
			System.out.println("Maaf, Reservasi Ladies Night Gagal !!!");
		System.out.println("===================================================");
	}
}
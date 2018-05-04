/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 7.51 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class KhairilBoolean3 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		String kelas, gender;
		boolean kelasD, kelasF, kelasT, laki, perempuan, lounge;
		int terbang;

		System.out.println ("Cek untuk memasuki lounge!");
		System.out.println ();


		System.out.print ("Jenis kelamin (L/P): ");
		gender = keyboard.next();

		System.out.print ("Jenis subkelas (D/F/T): ");
		kelas = keyboard.next();

		System.out.print ("Berapa kali Anda terbang? ");
		terbang= keyboard.nextInt ();

		kelasD = kelas.equals ("D");
		kelasF = kelas.equals ("F");
		kelasT = kelas.equals ("T");

		laki = gender.equals ("L");
		perempuan = gender.equals ("P");


		lounge = (laki && !kelasT && terbang >= 20) || (perempuan &&  !kelasT  && terbang >= 15) || (kelasT && terbang >= 30);

		System.out.println ("Apakah saya diperbolehkan masuk lounge? " + lounge);

	}
}

//tidak ada pilihan kelas bisnis atau bukan
//boleh pilih : kelas bisnis (Y/T) atau pilihan kelas (ekonomi/bisnis)
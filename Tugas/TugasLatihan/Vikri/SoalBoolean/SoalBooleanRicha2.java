/* 
	Created By Vikri
	13/05/2018
	19:03
*/
import java.util.Scanner;

public class SoalBooleanRicha2{
	public static void main  (String[] args) {
		String nama, senyum;
		boolean hasil1, hasil2, hasil3;
		int teman, pelanggaran;

		Scanner input = new Scanner (System.in);
		System.out.println("\nHai kamu ingin tahu kan bagaimana orang menilaimu?"+
						   "\nIsi penilaian di bawah ini ya :)"+
						   "\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

		System.out.print("Nama : ");
		nama = input.next();

		System.out.print ("Berapa teman baik yang kamu punya, "+nama+"? ");
		teman = input.nextInt();

		System.out.print ("Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? kalo iya, berapa kali? ");
		pelanggaran = input.nextInt ();

		System.out.println ("Menurutmu kamu murah senyum atau tidak? (Ya/Tidak)\n");
		senyum = input.next ();

		hasil1 = senyum.equals("Ya");
		hasil2 = (teman > 13 || pelanggaran < 7);
		hasil3 = (hasil1 && hasil2);

		System.out.println("Baiklah, \n"+
						   "Apakah " + nama + " adalah orang yang baik? " + hasil2 +
						   "\nTerimakasih! teruslah menjadi orang yang baik yaa");
	}
}

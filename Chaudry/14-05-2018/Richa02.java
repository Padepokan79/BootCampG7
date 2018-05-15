/*
	DATA CREATED 	: 13 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Richa02{
	public static void main(String[] args){
		
		String senyum, nama;
		int jmlTeman, jmlPelanggaran;
		boolean hasil;
		Scanner key = new Scanner(System.in);
		Scanner key2 = new Scanner(System.in);

		
		System.out.println("Hai kamu ingin tahu kan bagaimana orang menilaimu?");
		System.out.println("Isi penilaian di bawah ini ya :)");
		System.out.println("");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("");

		System.out.print("Nama : ");
		nama 	= key2.nextLine();

		System.out.print("Berapa teman baik yang kamu punya, " + nama + "? ");
		jmlTeman 	= key.nextInt();

		System.out.print("Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? ");
		jmlPelanggaran 	= key.nextInt();

		System.out.print("Menurutmu kamu murah senyum atau tidak? (ya/tidak) ");
		senyum 	= key.next();

		hasil 	= ( jmlTeman > 13 && (jmlPelanggaran < 7  || senyum.equals("ya")) );

		System.out.println("");
		System.out.println("Baiklah,\nApakah Richa adalah orang yang baik? " + hasil + "\nTerimakasih! teruslah menjadi orang yang baik yaa");

		 
	}
}
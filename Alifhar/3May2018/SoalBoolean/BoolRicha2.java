/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	14.50
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolRicha2{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int teman, pelanggaran;
		String nama, senyum;
		boolean baik;

		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.print("Nama : ");
		nama=keyboard.next();
		System.out.print("Berapa teman baik yang kamu punya, "+nama+"? ");
		teman=keyboard.nextInt();
		System.out.print("Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? kalo iya, berapa kali? ");
		pelanggaran=keyboard.nextInt();
		System.out.println("Menurutmu kamu murah senyum atau tidak? (Ya/Tidak)");
		senyum=keyboard.next();
		
		baik=((teman>13 && pelanggaran<=7) || (teman>13 && senyum.equals("Ya")) || (pelanggaran<=7 && senyum.equals("Ya")) );

		System.out.println("\nBaiklah");
		System.out.println("Apakah "+nama+" adalah orang baik? "+baik);
		System.out.println("Terimakasih! teruslah menjadi orang yang baik yaa");
	}
}
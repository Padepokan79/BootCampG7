/*
Created by	: Yana
Time		: 16 Mei 2018 10.01
*/

import java.util.Scanner;

public class MalikIf3{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int skalaJujur, skalaBohong, skalaSombong, skalaAngkuh, jumlahSkala, rataanSkala;
		boolean kondisi1, kondisi2, kondisi3, kondisi4, kondisi5;


		System.out.println("=============================");
		System.out.println("    DETECTED UR ATTITUDE");
		System.out.println("=============================");
		System.out.println();
		System.out.print("Skala Jujur: ");
		skalaJujur = keyboard.nextInt();
		System.out.print("Skala Sombong: ");
		skalaSombong = keyboard.nextInt();
		System.out.print("Skala Bohong: ");
		skalaBohong = keyboard.nextInt();
		System.out.print("Skala Angkuh: ");
		skalaAngkuh = keyboard.nextInt();
		System.out.println();

		jumlahSkala	= skalaJujur + skalaBohong + skalaSombong + skalaAngkuh;
		rataanSkala	= jumlahSkala / 4;
		kondisi1	= skalaJujur >= 8 && skalaBohong < 5 && skalaSombong <= 6 && skalaAngkuh < 7;
		kondisi2	= skalaJujur >= 9 && skalaSombong <= 2 && ( ( skalaAngkuh <= 5 && skalaBohong <= 5 ) || ( skalaAngkuh > 5 && skalaBohong > 5) );
		kondisi3	= jumlahSkala < 5;
		kondisi4	= jumlahSkala > 35;
		kondisi5	= jumlahSkala < 15;

		if ( rataanSkala < 0 || rataanSkala > 10 ) {
			System.out.println("Inputan skala yang diinput harus 0-10");
		}
		else{
			if (kondisi2) {
				System.out.println("Anda Baik, tetapi suka berbohong dan angkuh");
			}
			else if (kondisi1) {
				System.out.println("Anda Baik");
			}
			else if (kondisi3) {
				System.out.println("Anda kurang Baik");
			}
			else if (kondisi4) {
				System.out.println("Anda sangat Baik");
			}
			else if (kondisi5) {
				System.out.println("Anda buruk");
			}
		}

	}
}

/*
3. Budi ingin mengetahui seberapa baik dirinya melalui, mesin pendeteksi
   kebaikan yang berada di CiMallik, Mall termegah di Wakanda. 

   bila skala jujur seseorang mencapai 8, bohong dibawah 5, sombong tidak lebih dari 6, serta angkuh dibawah 7
   maka seseorang tsb dianggap baik.
   bila jujur seseorang mencapai 9, dan sombong tidak lebih dari 2, maka mereka dianggap baik walaupun bohong serta angkuh di atas rata rata 
   bila jumlah skala 5 kebawah maka mereka dianggap kurang baik
   bila jumlah seluruh skala diatas 35 mereka sangat baik
   bila jumlah seluruh skala di bawah 15 mereka buruk

   output
   ===================================
         DETECTED UR ATTITUDE
   ===================================
   skala jujur anda : 9
   skala bohong anda : 9
   skala sombong anda : 9
   skala angkuh anda : 9
   ------------------------------------
   SELAMAT! anda sangat baik !     
*/
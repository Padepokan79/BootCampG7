import java.util.Scanner;

public class MalikIF3 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	int jujur, sombong, bohong, angkuh, jmlSkala;

	System.out.println("===================================");
	System.out.println("        DETECTED UR ATTITUDE       ");
	System.out.println("===================================");
	System.out.println("skala jujur anda : ");
	jujur = keyboard.nextInt ();
	System.out.println("skala bohong anda : ");
	bohong = keyboard.nextInt ();
	System.out.println("skala sombong anda : ");
	sombong = keyboard.nextInt ();
	System.out.println("skala angkuh anda : ");
	angkuh = keyboard.nextInt ();

	jmlSkala = jujur + bohong + sombong +angkuh;

	System.out.println("-----------------------------------");
	System.out.print ("SELAMAT! anda ");

	if (jujur >= 8 && bohong < 5&& sombong <= 6 && angkuh < 7) {
		System.out.print("baik");
	}
	else if (jujur >= 9 && sombong <= 2) {
		System.out.print("baik");
	}
	else if (jujur < 5 && bohong <5 && sombong <5 && angkuh <5)  {
		System.out.print("kurang baik");
	}
	else if (jmlSkala < 15) {
		System.out.print("buruk");
	}
	else if (jmlSkala > 35) {
		System.out.print("sangat baik");
	}

	System.out.println(" !");
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
   SELAMAT! anda sangat baik !  */
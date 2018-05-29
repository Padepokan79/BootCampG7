/*
	 Program     : Soal 2 - Rizaldi
     Creator     : Khairil
     Created At  : 17 Mei 2018 04:29 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class RizaldiIfElse2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String centerBackS, wingerS, strikerS, pelatihS, cadanganMatiS, wasitS, posisi;
		int satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, sepuluh;
		double skillDrible, speed, bodyBalance, jump, shootingPow, accuracy, stamina;
		boolean centerBack, winger, striker, pelatih, cadanganMati, wasit;

		satu = 1; dua = 2; tiga = 3; empat = 4; lima = 5; enam = 6; tujuh = 7;
		delapan = 8; sembilan = 9; sepuluh = 10;

		centerBackS = "Center Back";
		wingerS = "Winger";
		strikerS = "Striker";
		pelatihS = "Pelatih";
		cadanganMatiS = "Cadangan Mati";
		wasitS = "Wasit";

		System.out.println("====================================================");
		System.out.print("skill drible    :\t");
		skillDrible = keyboard.nextDouble();
		System.out.print("speed           :\t");
		speed = keyboard.nextDouble();
		System.out.print("body balance    :\t");
		bodyBalance = keyboard.nextDouble();
		System.out.print("jump            :\t");
		jump = keyboard.nextDouble();
		System.out.print("shooting power  :\t");
		shootingPow = keyboard.nextDouble();
		System.out.print("accuracy        :\t");
		accuracy = keyboard.nextDouble();
		System.out.print("stamina         :\t");
		stamina = keyboard.nextDouble();

		centerBack = (bodyBalance > sembilan && jump >= tujuh && speed >= tujuh) || stamina == sepuluh;

		winger = skillDrible > sembilan && speed > sembilan;
		
		striker = ( accuracy == sepuluh && shootingPow > delapan ) || ( jump >= sembilan && speed >= sembilan && bodyBalance >= sembilan );
		
		pelatih = skillDrible == sepuluh && speed == sepuluh && bodyBalance == sepuluh && jump == sepuluh && shootingPow == sepuluh && accuracy == sepuluh && stamina < empat;
		
		cadanganMati = (skillDrible > sembilan || speed > sembilan || bodyBalance > sembilan || jump > sembilan || shootingPow > sembilan || accuracy > sembilan) && stamina < delapan;
		
		wasit = skillDrible < dua  || bodyBalance < dua || jump < dua || shootingPow < dua || accuracy < dua && ( stamina >= dua && speed >= dua );

		System.out.println("===================================================");
		if(centerBack) {
			posisi = centerBackS;
			System.out.println("posisi yang cocok adalah : " + posisi);
		}
		else if(winger) {
			posisi = wingerS;
			System.out.println("posisi yang cocok adalah : " + posisi);
		}
		else if(striker) {
			posisi = strikerS;
			System.out.println("posisi yang cocok adalah : " + posisi);
		}
		else if(pelatih) {
			posisi = pelatihS;
			System.out.println("posisi yang cocok adalah : " + posisi);
		}
		else if(cadanganMati) {
			posisi = cadanganMatiS;
			System.out.println("posisi yang cocok adalah : " + posisi);
		}
		else if(wasit) {
			posisi = wasitS;
			System.out.println("posisi yang cocok adalah : " + posisi);
		}
		else {
			System.out.println("Nonton aja lah...");
		}
		System.out.println("====================================================");
	}
}
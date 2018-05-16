/*
Created By	: Malik Chaudhary
Time 		: 16-05-2018 10:14AM

Soal :
skala nilai 1 sd 10

inputan :
skill drible    :
speed           :
body balance    :
jump            :
shooting power  :
accuracy        :
stamina         :
===================================================
posisi yang sesuai dengan anda adalah : 
		

- untuk menjadi posisi Center Back kriteria = body balance > 9, jump >= 7, speed >= 7, atau stamina = 10.
- untuk menjadi posisi Winger = speed dan skill drible wajib di atas 9.
- untuk menjadi posisi striker = accuracy wajib 10 dan shooting power diatas 8. atau jump, speed dan body balance minimal 9.
- jika semua kriteria nilai nya 10 kecuali stamina dibawah 4 maka posisinya adalah pelatih.
- meskipun semua kriteria diatas 9 namun stamina dibawah 8 maka posisi nya adalah Cadangan Mati.
- jika semua kriteria dibawah 2 kecuali stamina dan speed, posisi yang dambil adalah Wasit.
*/

import java.util.Scanner;
public class RizaldiIf2{
	public static void main(String[] args){
		Scanner bola = new Scanner(System.in);

		double drible, speed, balance, jump, shooting, accuracy, stamina, sembilan, tujuh, sepuluh, delapan, empat, dua;
		boolean centerBack, winger, striker, pelatih, cadangan, wasit;

		sembilan	= 9;
		tujuh		= 7;
		sepuluh		= 10;
		delapan		= 8;
		empat		= 4;
		dua			= 2;

		System.out.print("Skill Dribble	: ");
		drible = bola.nextDouble();

		System.out.print("Speed	: ");
		speed = bola.nextDouble();

		System.out.print("Body Balance	: ");
		balance = bola.nextDouble();

		System.out.print("Jump	: ");
		jump = bola.nextDouble();

		System.out.print("Shooting Power	: ");
		shooting = bola.nextDouble();

		System.out.print("Accuracy	: ");
		accuracy = bola.nextDouble();

		System.out.print("Stamina	: ");
		stamina = bola.nextDouble();

		System.out.println("=================================");


		centerBack	= ( (balance > sembilan && jump >= tujuh && speed >= tujuh) || stamina == sepuluh );
		winger 		= ( speed > sembilan && drible > sembilan );
		striker		= ( (accuracy == sepuluh && shooting > delapan) || ( jump >= sembilan && speed >= sembilan && balance >= sembilan ) );
		pelatih 	= ( drible == sepuluh && speed == sepuluh && balance == sepuluh && jump == sepuluh && shooting == sepuluh && accuracy == sepuluh && stamina < empat );
		cadangan 	= ( drible >= sembilan && speed >= sembilan && balance >= sembilan && jump >= sembilan && shooting >= sembilan && accuracy >= sembilan && stamina < delapan );
		wasit 		= ( drible < dua && speed >= dua && balance < dua && jump < dua && shooting < dua && accuracy < dua && stamina >= dua );

		if ( pelatih ) {
			System.out.println("Posisi yang cocok adalah : Pelatih");
		}else if ( cadangan ) {
			System.out.println("Posisi yang cocok adalah : Cadangan Mati");
		}else if ( wasit ) {
			System.out.println("Posisi yang cocok adalah : Wasit");
		}else if ( centerBack ) {
			System.out.println("Posisi yang cocok adalah : Center Back");
		}else if ( striker ) {
			System.out.println("Posisi yang cocok adalah : Striker");
		}else if ( winger ) {
			System.out.println("Posisi yang cocok adalah : Winger");
		}else{
			System.out.println("Posisi yang cocok adalah : tidak ada");
		}
	}
}
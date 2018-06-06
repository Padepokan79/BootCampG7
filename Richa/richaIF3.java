/* 
Created by  		: Richa Fitria
Date/hour			: 16 Mei 2018/ 10.16 AM
Updated by			:
Updated Date/hour	:

*/import java.util.Scanner;

public class RichaIF3 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	double maxRAB, totalRAB = 0, ironMan, thor, hulk, captain, spiderman, ironmanRAB, thorRAB, hulkRAB, captainRAB, spidermanRAB, sisaRAB;

	maxRAB = 50000;

	ironmanRAB = 15000;
	thorRAB = 32000;
	hulkRAB = 13500;
	captainRAB = 20500;
	spidermanRAB = 5000;
	sisaRAB = 0;


	System.out.println("Daftar performa avengers!");
	System.out.print("Iron man :");
	ironMan = keyboard.nextDouble ();

	System.out.print("Thor: ");
	thor = keyboard.nextDouble ();

	System.out.print("Hulk: ");
	hulk = keyboard.nextDouble ();

	System.out.print("Captain Amerika: ");
	captain = keyboard.nextDouble ();

	System.out.print("spiderman: ");
	spiderman = keyboard.nextDouble ();

	//iron man
	if (ironMan < 3) {
		ironmanRAB =0;
		sisaRAB = sisaRAB + 1000;
	}
	else if (ironMan >= 3 && ironMan <=5) {
		ironmanRAB = ironmanRAB*0.3;
	}
	else if (ironMan >= 5.1 && ironMan <=7) {
		ironmanRAB = ironmanRAB*0.5;
	}
	else if (ironMan >= 7.1 && ironMan <=9) {
		ironmanRAB = ironmanRAB*0.75;
	}
	else if (ironMan >= 9.1 && ironMan <=10) {
		ironmanRAB = ironmanRAB*1;
	}


	//thor

	if (thor < 3) {
		thorRAB = 0;
		sisaRAB = sisaRAB + 1000;
	}
	else if (thor >= 3 && thor <=5) {
		thorRAB = thorRAB*0.3;
	}
	else if (thor >= 5.1 && thor <=7) {
		thorRAB = thorRAB*0.5;
	}
	else if (thor >= 7.1 && thor <=9) {
		thorRAB = thorRAB*0.75;
	}
	else if (thor >= 9.1 && thor <=10) {
		thorRAB = thorRAB*1;
	}	


	//hulk
		if (hulk < 3) {
		hulkRAB = 0;
		sisaRAB = sisaRAB + 1000;
	}
	else if (hulk >= 3 && hulk <=5) {
		hulkRAB = hulkRAB*0.3;
	}
	else if (hulk >= 5.1 && hulk <=7) {
		hulkRAB = hulkRAB*0.5;
	}
	else if (hulk >= 7.1 && hulk <=9) {
		hulkRAB = hulkRAB*0.75;
	}
	else if (hulk >= 9.1 && hulk <=10) {
		hulkRAB = hulkRAB*1;
	}	


	// captain amerika
	if (captain < 3) {
		captainRAB = 0;
		sisaRAB = sisaRAB + 1000;
	}
	else if (captain >= 3 && captain <=5) {
		captainRAB = captainRAB*0.3;
	}
	else if (captain >= 5.1 && captain <=7) {
		captainRAB = captainRAB*0.5;
	}
	else if (captain >= 7.1 && captain <=9) {
		captainRAB = captainRAB*0.75;
	}
	else if (captain >= 9.1 && captain <=10) {
		captainRAB = captainRAB*1;
	}	


	// spider man
	if (spiderman < 3) {
		spidermanRAB = 0;
		sisaRAB = sisaRAB + 1000;
	}
	else if (spiderman >= 3 && spiderman <=5) {
		spidermanRAB = spidermanRAB*0.3;
	}
	else if (spiderman >= 5.1 && spiderman <=7) {
		spidermanRAB = spidermanRAB*0.5;
	}
	else if (spiderman >= 7.1 && spiderman <=9) {
		spidermanRAB = spidermanRAB*0.75;
	}
	else if (spiderman >= 9.1 && spiderman <=10) {
		spidermanRAB = spidermanRAB*1;
	}
	


	totalRAB = ironmanRAB + thorRAB + hulkRAB + captainRAB + spidermanRAB;
	System.out.println(sisaRAB);

	//perhitungan RAB
	if (totalRAB <= 50000){
		System.out.println("total RAB yang digunakan: " + (totalRAB));
		System.out.println("sisa RAB termasuk denda:" + (sisaRAB + (maxRAB-totalRAB)));
	}
	else {System.out.println("Sorry, RAB tidak mencukupi");
	}

}
}








/*3. Para Avengers sedang merencankan RAB tahun 2050 untuk upgrade senjata mereka. 
Iron man membutuhkan amunisi tambahkan untuk Jarvis sebesar $15000, Thor ingin membeli palu baru dengan kekuatan petir yang lebih dahsyat sebesar $32000, 
hulk ingin membeli peralatan lab sebesar $13500, captain america ingin membeli kendaraan baru yang diperkiran hingga $20500 
dan Spiderman ingin membeli jaring laba-laba anti badai sebesar $5000. 
Tapi pengeluaran tersebut tidak harus dipenuhi tergantung dari performa masing-masing avenger.
 Total RAB untuk tahun 2050 hanya sebesar $50000

skala performa 0.0-10.0

performa < 3 => tidak mendapatkan apa2 justru dikenakan denda sebesar $1000
performa 3 - 5 => mendapatkan dana sebesar 30% dari dana yang diajukan
performa 5.1 -7 =>  mendapatkan dana sebesar 50% dari dana yang diajukan
performa 7.1-9 => mendapatkan dana sebesar 75% dari dana yang diajukan
perform 9.1-10.0 => mendapatkan 100% dana 

output:

Daftar performa avengers!
Iron man: 5.6
Thor: 2.5
Hulk: 7.3
Captain Amerika: 9
Spiderman: 4

(jika melebihi RAB, output => Sorry, RAB tidak mencukupi )
total RAB yang digunakan: $34500

sisa RAB termasuk denda: $16500 */


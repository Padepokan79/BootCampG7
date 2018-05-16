import java.util.Scanner;

public class RizaldiIF2 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	double drible, speed, bodyBalance, jump, shootingPower, accuracy, stamina;


	System.out.print ("Skill drible: ");
	drible = keyboard.nextDouble ();

	System.out.print ("Speed: ");
	speed = keyboard.nextDouble ();

	System.out.print ("Body balance: ");
	bodyBalance = keyboard.nextDouble ();

	System.out.print ("Jump: ");
	jump = keyboard.nextDouble ();

	System.out.print ("Shooting power: ");
	shootingPower = keyboard.nextDouble ();

	System.out.print ("Accuracy: ");
	accuracy = keyboard.nextDouble ();

	System.out.print ("Stamina: ");
	stamina = keyboard.nextDouble ();

	System.out.println("===========================");

	System.out.print ("Posisi yang cocok adalah : " );

	if (bodyBalance > 9 && jump >= 7 && speed >= 7 && stamina == 10) {
		System.out.println ("Center Back");
	}

	else if  (speed > 9 && drible > 9 ) {
		System.out.println ("Winger");
	}
	else if  ((accuracy == 10 && shootingPower > 8) || (jump >= 9 && speed >= 9 && bodyBalance >= 9)){
		System.out.println ("Striker");
	}
	else if (((drible = speed = bodyBalance = jump = shootingPower = accuracy) ==10 ) && stamina < 4) {
		System.out.println ("Pelatih");
	}
	else if (((drible = speed = bodyBalance = jump = shootingPower = accuracy) > 9 ) && stamina < 4) {
		System.out.println ("Cadangan Mati");
	}

	else if ((drible = bodyBalance =jump = shootingPower =accuracy) < 2 )  {
		System.out.println ("Wasit");
	}
	else {System.out.println ("ditolak!");}
	
}
}

	/*skala nilai 1 sd 10

inputan :
skill drible    :
speed           :
body balance    :
jump            :
shooting power  :
accuracy        :
stamina         :
===================================================
posisi yang cocok adalah : (misal) center back.

- untuk menjadi posisi Center Back kriteria = body balance > 9, jump >= 7, speed >= 7, atau stamina = 10.
- untuk menjadi posisi Winger = speed dan skill drible wajib di atas 9.
- untuk menjadi posisi striker = accuracy wajib 10 dan shooting power diatas 8. atau jump, speed dan body balance minimal 9.
- jika semua kriteria nilai nya 10 kecuali stamina dibawah 4 maka posisinya adalah pelatih.
- meskipun semua kriteria diatas 9 namun stamina dibawah 8 maka posisi nya adalah Cadangan Mati.
- jika semua kriteria dibawah 2 kecuali stamina dan speed, posisi yang dambil adalah Wasit.

Soal no 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
tono ingin membeli tiket liburan ke bulan seharga 320000 usd.
gaji tono perbulan : Rp 1.000.000

inputan :
berapa uang tono            : Rp
====================================================
uang tono kurang sebesar    : Rp
lama tono harus menabung    : bulan
keterangan                  : sebutkan persentase uang tono ke harga tiket + catatan

berapa lama lagi tono harus menabung dari uang gaji bulanan nya ?

- jika uang tono lebih dari 90% dari harga tiket tulis catatan di keterangan " Sabar ton bentar lagi..."
- jika uang tono lebih dari 60% dari harga tiket tulis catatan di keterangan " jual rumah aja..."
- jika uang tono kurang dari 40% dari harga tiket tulis catatan di keterangan " bisa pergi, gak usah pulang..." */
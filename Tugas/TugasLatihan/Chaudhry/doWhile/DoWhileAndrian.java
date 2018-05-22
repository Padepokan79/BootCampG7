/*
	DATE CREATED : 20 MEI 2018
	TIME CREATED : 21.00 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK

	Disebuah event war antar server yang diselenggarakan oleh sebuah perusahaan game online
	menyatakan bahwa selama event para player yang memiliki level minimal 20 mampu mengikuti 
	event tersebut dan hadiah dari event tersebut adalah :
	-player hanya mampu melakukan hit sebanyak 10x
	-indeks dari level pemain yang dinputkan terdiri dari
		>  lvl*50 = demage
		>  lvl*100 = hpPlayer

	dan hadiah yang didapat dari event ini adalah :
	-pemain dengan demage 1000-1100 mendapatkan elixir x1
	-pemain dengan demage 1200-1300 mendapatkan potion x1
	-pemain dengan demage 1400-1600 mendapatkan gold 300k
	-pemain dengan demage 1600-2000 mendapatkan fragment Legendary weapon x1
	-pemain dengan demage spesial diantaranya 1734,1423,1933,1878,1656
		>1734 = mendapatkan boot of speed
		>1423 = mendapatkan arcana
		>1933 = mendapatkan Alpine set ursa
		>1878 = Golden baby roshan
		>1656 = Legacy Ethereal Flames

	-setelah 10 ronde selesai maka player akan bertemu dengan boss server yang memiliki : 
	- hpPlayer = 3x dari demage player
	- memiliki damage = 200 sampai 200 + 10x dari level player.
	- perbandingan 2 : 8, bila itu miss atau hit
	- item yang di dapat dari boss kill adalah 1 set Eternal pack, namun jika anda kalah 
	anda tidak mendapatkan semua barang dalam event.

	-total semua item yang di dapat harus diperlihatkan.

	output :
	Ketika false
	==========================================
	       SELAMAT DATANG DI LYTA GAME
	==========================================
	==========================================
	Dengan ini anda dinyatakan telah menetujui
	semua kosekuensi yang ada

	==========================================
	sebelum memulai game masukan level anda :
	49
	BE GONE DUDE YOU'RE TO EASY GOT KILLED
	==========================================
	And Event Done !!
	This what you've got from this event 0
	============================================================
	============================================================
	ketika True
	==========================================
	       SELAMAT DATANG DI LYTA GAME
	==========================================
	==========================================
	Dengan ini anda dinyatakan telah menetujui
	semua kosekuensi yang ada

	==========================================
	sebelum memulai game masukan level anda :
	52
	Selamat bermain
	Let's the game begin!!
	Demage : 1500
	Demage success, you obtain xxx
	Demage success, you obtain xxx
	Demage success, you obtain xxx
	missed
	==========================================
	And Event Done !!
	This what you've got from this event xxx
*/
import java.util.Scanner;
import java.util.Random;
public class DoWhileAndrian{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int damageBoss, angkaRandomPlayer, angkaRandomKom, damageAwalBos, inputLevel, roundeAwal, roundeMax, rounde, randMax, limapuluh, seratus, duaribu, levelMin, damage, maxHit, satu, hpBoss, hpPlayer, randDamage, randHealt, seribu;
		int seribu100, randDamageBoss, seribu200, seribu300, seribu400, seribu600;
		int angka1734, angka1423, angka1933, angka1878, angka1656;
		String inputKata, inputKata2, hadiahEvent, elixir, potion, gold, fragment, boot, arcana, alpine, golden, legacy;

		elixir 		= "mendapatkan elixir x1";
		potion 		= "mendapatkan potion x1";
		gold  		= "mendapatkan gold 300k";
		fragment 	= "mendapatkan fragment Legendary weapon x1";
		boot 		= "mendapatkan boot of speed";
		arcana 		= "mendapatkan arcana";
		alpine 		= "mendapatkan Alpine set ursa";
		golden 		= "mendapatkan Golden baby roshan";
		legacy 		= "mendapatkan Legacy Ethereal Flames";
		hadiahEvent = "";

		seribu100 = 1100;  	 	seribu400 = 1400; 		angka1734 = 1734; 		angka1878 = 1878;
		seribu200 = 1200;   	seribu600 = 1600;		angka1423 = 1423;		angka1656 = 1656;
		seribu300 = 1300;   	duaribu   = 2000;		angka1933 = 1933;

		rounde = 1;
		levelMin = 20;
		maxHit = 10;
		seribu = 1000;
		limapuluh = 50;
		seratus = 100;
		duaribu = 2000;
		hadiahEvent = "";

		damage = damageBoss = hpBoss = hpPlayer = randMax = 0;

		System.out.println("==========================================");
		System.out.println("       SELAMAT DATANG DI LYTA GAME        ");
		System.out.println("==========================================");
		System.out.println("");
		System.out.println("Dengan ini anda dinyatakan telah menetujui\nsemua kosekuensi yang ada");
		System.out.println("==========================================");

		System.out.print("Sebelum memulai game masukan level anda : ");
		inputLevel = keyboard.nextInt();
		if (inputLevel >= levelMin) {

			System.out.println("Selamat Bermain");
			System.out.println("Memulai Permainan");

			damage = inputLevel*limapuluh;
			hpPlayer     = inputLevel*seratus;
			
			satu = 1;
			while(satu <= maxHit){

				System.out.println("");
				// randDamage = rand.nextInt((damage + seribu) - damage) + (damage + 1);
				randDamage = rand.nextInt(seribu) + (damage + 1);
				System.out.println("Ronde "+(rounde++));
				System.out.println("Damage : "+randDamage);

				if ( randDamage >= seribu) {
					System.out.println("Anda "+elixir);
					hadiahEvent = hadiahEvent + elixir+"\n";
				}
				if ( randDamage >= seribu200 ) {
					System.out.println("Anda "+potion);
					hadiahEvent = hadiahEvent + potion+"\n";
				}
				if ( randDamage >= seribu400 ) {
					System.out.println("Anda "+gold);
					hadiahEvent = hadiahEvent + gold+"\n";
				}
				if ( randDamage >= seribu600 ) {
					System.out.println("Anda "+fragment);
					hadiahEvent = hadiahEvent + fragment+"\n";
				}
				if (randDamage == angka1734) {
					System.out.println(boot);
					hadiahEvent = hadiahEvent + boot+"\n";
				}
				if (randDamage == angka1423) {
					System.out.println(arcana);
					hadiahEvent = hadiahEvent + arcana+"\n";
				}
				if (randDamage == angka1933) {
					System.out.println(alpine);
					hadiahEvent = hadiahEvent + alpine+"\n";
				}
				if (randDamage == angka1878) {
					System.out.println(golden);
					hadiahEvent = hadiahEvent + golden+"\n";
				}
				if (randDamage == angka1656) {
					System.out.println(legacy);
					hadiahEvent = hadiahEvent + legacy+"\n";
				}

					System.out.println("-----------------------------------------------------");
					System.out.print("Lanjut ke Rounde berikutnya | Y/N | ? ");
					inputKata = keyboard.next();
					System.out.println("-----------------------------------------------------");
					
					if (inputKata.equals("Y")) {
						satu += 1;	
					}
					else{
						satu += 10;
					}
			}

			if (satu >= maxHit) {
					System.out.println("");
					System.out.println("============================");
					System.out.println("FIGHT BOSS");

					hpBoss 	= 3*damage;

					damageAwalBos  = 200;
					damageBoss     = damageAwalBos + (inputLevel*10);
					
					while( hpBoss > 0 && hpPlayer > 0 ){

						System.out.println("");
						System.out.print("Lawan Boss |Y| ? ");
						inputKata2 = keyboard.next();
						System.out.println("----------------------");

						if (inputKata2.equals("Y")) {
							angkaRandomPlayer    = rand.nextInt(10) + 1;
							if (angkaRandomPlayer <= 8) {
								System.out.println("Anda Miss");
							}
							else if(angkaRandomPlayer > 8){
								System.out.println("Anda Hit Boss");
								randDamage     = rand.nextInt(seribu) + (damage + 1);
								hpBoss -= randDamage;
							}
							System.out.println("----------------------");
							System.out.println("");
							System.out.println("Giliran Boss ---------");
							System.out.println("----------------------");

							angkaRandomKom = rand.nextInt(10) + 1;
							if (angkaRandomKom <= 8) {
								System.out.println("Boss Miss");
							}
							else if(angkaRandomKom > 8){
								System.out.println("Boss Hit Anda");
								randDamageBoss = rand.nextInt(damageBoss - damageAwalBos) + (damageAwalBos+1);
								hpPlayer -= randDamageBoss;
							}
							System.out.println("----------------------");
							System.out.println("");
							System.out.println("");
							if (hpBoss <= 0) {
								System.out.println("HP Boss   : "+(hpBoss*0));
								System.out.println("HP Player : "+hpPlayer);
							}else if (hpPlayer <= 0) {
								System.out.println("HP Boss   : "+hpBoss);
								System.out.println("HP Player : "+(hpPlayer*0));
							}else{
								System.out.println("HP Boss   : "+hpBoss);
								System.out.println("HP Player : "+hpPlayer);
							}
							System.out.println("----------------------");
						}

					}

					if (hpBoss > 0 && hpPlayer <= 0) {
						System.out.println("ANDA KALAH");
						System.out.println("Item yang anda miliki telah hangus");
					}
					else if (hpPlayer > 0 && hpBoss <= 0) {
						System.out.println("ANDA MENANG");
						System.out.println("Item yang anda miliki :\n\n- Mendapatkan 1 set Eternal pack");
						System.out.println(hadiahEvent);
					}
				}


		}
		else{
			System.out.println("BE GONE DUDE YOU'RE TO EASY GOT KILLED");
			System.out.println("==========================================");
			System.out.println("And Event Done !!");
			System.out.println("This what you've got from this event 0");
			System.out.println("==========================================");
		}


		

	}
}
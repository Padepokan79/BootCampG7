/*
Creted by	: Yana
Time		: 19 Mei 2018 17.19
*/

import java.util.Scanner;
import java.util.Random;

public class AndrianDoWhile{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();

		int level, hit=0, damage, ronde, hp, randomDamage, randomHp, jumlahDamage, jumlahHp,
			damageBos, hpBos, randomDamageBoss;
		String 	elixir = "elixir", potion = "potion", gold="gold", fragment="fragment Legendary Weapon", 
				bof = "boot of speed", arcana = "arcana", alpine = "alpine set ursa", roshan = "roshan",
				ethereal = "ethereal", hadiah="", option, option2;

		System.out.println();
		System.out.println("===========================");
		System.out.println("SELAMAT DATANG DI LYTA GAME");
		System.out.println("===========================");
		System.out.println();
		System.out.println("Dengan ini anda dinyatakan menyetujui semua konsesuaensi");
		System.out.println("===========================");
		System.out.print("Sebelum memulai game, masukkan level anda:");
		level = keyboard.nextInt();
		System.out.println();

		if ( level < 20 ) {
			System.out.println("===========================");
			System.out.println("Kamu terlalu mudah untuk dikalahkan");
			System.out.println("===========================");
			
		}else{
			System.out.println("===========================");
			System.out.println("Ayo mulai game");
			System.out.println("===========================");

			damage 			= level * 50;
			hp				= level * 100;
			jumlahDamage	= 0;
			jumlahHp		= 0;

			ronde = 1;
			do{
				System.out.println();
				System.out.println();
				System.out.println("RONDE "+ronde);
				System.out.println();
				randomDamage 	= random.nextInt(1000)+(damage+1);

				if (randomDamage >= 1000) {
					hadiah = hadiah + elixir+", ";
				}
				if (randomDamage >= 1200) {
					hadiah = hadiah + potion+", ";
				}
				if (randomDamage >= 1400) {
					hadiah = hadiah + gold+", ";
				}
				if (randomDamage >= 1600) {
					hadiah = hadiah + fragment+", ";
				}
				if (randomDamage >= 1200) {
					hadiah = hadiah + potion+", ";
				}
				if (randomDamage == 1734) {
					hadiah = hadiah + bof+", ";
				}
				if (randomDamage == 1423) {
					hadiah = hadiah + arcana+", ";
				}
				if (randomDamage == 1933) {
					hadiah = hadiah + alpine+", ";
				}
				if (randomDamage == 1878) {
					hadiah = hadiah + roshan+", ";
				}
				if (randomDamage == 1656) {
					hadiah = hadiah + ethereal+", ";
				}

				System.out.println("Damage  : "+randomDamage);
				System.out.println();	

				
				System.out.print("Apakana Anda mau lanjut hit? (Y/T) ");
				option = keyboard.next();	

				if (option.equals("Y")) {
					ronde++;
				}else{
					ronde += 10;
				}
				
			}while(ronde <= 10);

			if (ronde > 10) {
				
				hpBos		= 3 * damage;
				damageBos 	= 200;
				while(hpBos > 0 && hp > 0){
					randomDamageBoss = random.nextInt((10*level)-damageBos)+(damageBos+1);
					randomDamage 	= random.nextInt(1000)+(damage+1);

					System.out.println();
					System.out.println("===================================");
					System.out.println();
					System.out.println("HP Boss 	: "+hpBos);
					System.out.println("HP player	: "+hp);
					System.out.println();
					System.out.println("===================================");
					System.out.println();
					System.out.print("Siap melakukan hit? (Y/T) ");
					option2 = keyboard.next();
					System.out.println();
					if (option2.equals("Y")) {
						
						hit = random.nextInt(10)+1;

						if (hit > 8) {
							System.out.println("Anda Hit");
							hpBos = hpBos - randomDamageBoss;
						}
						else{
							System.out.println("Anda Miss");
						}

						hit = random.nextInt(10)+1;
						if (hit > 8) {
							System.out.println("Bos Hit");
							hp = hp - randomDamage;
						}
						else{
							System.out.println("Bos Miss");
						}
					}
				}
				
				if(hpBos > hp){
					hp = 0;
					System.out.println();
					System.out.println("++++++++++++++++++++++++++++");
					System.out.println();
					System.out.println("HP Anda : " +hp);
					System.out.println("HP Bos  : "+hpBos);
					System.out.println();
					System.out.println();
					System.out.println("Anda kalah.\nAnda tidak mendapatkan hadiah di event ini");
				}
				else if (hp > hpBos) {
					hpBos = 0;
					System.out.println();
					System.out.println("++++++++++++++++++++++++++++");
					System.out.println();
					System.out.println("HP Anda : " +hp);
					System.out.println("HP Bos  : "+hpBos);
					System.out.println();
					System.out.println();
					System.out.println("Anda menang.");
					System.out.println("Anda mendapatkan 1 SET Ethereal pack.");
					System.out.println("Anda mendapatkan : \n"+hadiah);
				}
			}
		}

	}
}

/*
Disebuah event war antar server yang diselenggarakan oleh sebuah perusahaan 
game online menyatakan bahwa selama event para player yang memiliki level 
minimal 50 mampu mengikuti event tersebut dan hadiah dari event tersebut adalah :
-player hanya mampu melakukan hit sebanyak 10x
-indeks dari level pemain yang dinputkan terdiri dari
	>  (lvl/0.2)*1000 = demage
	>  (lvl/0.8)*1000 = hp
-pemain dengan demage 1000-11001 mendapatkan elixir x1
-pemain dengan demage 12002-13003 mendapatkan potion x1
-pemain dengan demage 14004-16005 mendapatkan gold 300k
-pemain dengan demage 1600-20006 mendapatkan fragment Legendary weapon x1
-pemain dengan demage spesial diantaranya 1734,1423,1933,1878,1656
	>1734 = mendapatkan boot of speed
	>1423 = mendapatkan arcana
	>1933 = mendapatkan Alpine set ursa
	>1878 = Golden baby roshan
	>1656 = Legacy Ethereal Flames
-namun setiap hit mampu miss
-setelah 10 ronde selesai maka player akan bertemu dengan boss server yang memiliki 
hp 10x dari demage player, dan memiliki demage 0.1x dari hp player. 
dan item yang di dapat dari boss kill adalah 1 set Eternal pack, 
namun jika anda kalah anda tidak mendapatkan semua barang dalam event.
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
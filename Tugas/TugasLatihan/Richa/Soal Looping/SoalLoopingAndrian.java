/* 
Created by  		: Richa Fitria
Date/hour			: 21 Mei 2018/ 11.21 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class SoalLoopingAndrian {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random ();

		int level, hit,  damageLimit, randomDamagePlayer, randomDamageBoss, elixir=0, potion=0, gold=0, legendary=0, hpPlayer, hpBoss;
		int boot = 0, arcana = 0, alpine = 0, goldenBaby =0, etherealFlames =0, randomHitPlayer;
		String duelChoice, hitChoice;




		System.out.println("==========================================");
		System.out.println("        SELAMAT DATANG DI LYTA GAME       ");
		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.println("Dengan ini anda dinyatakan telah menetujui\nsemua kosekuensi yang ada");
		System.out.println();
		System.out.println("sebelum memulai game masukan level anda : ");
		level = keyboard.nextInt ();

		damageLimit = level*50;
		hpPlayer = level*100;
		hpBoss = 3 * damageLimit;
		
		randomDamageBoss = rand.nextInt((10*level)+200) + 200;

		if (level < 20) {
			System.out.println("BE GONE DUDE YOU'RE TO EASY GOT KILLED");
			System.out.println("==========================================");
		}

		else if ( level >= 20) {
			for (hit = 1; hit <= 10; hit++) {
				System.out.println("---------------------------------------");
				System.out.println("Hit " + hit);
				System.out.println("Selamat bermain\nLet's the game begin!!");
				randomDamagePlayer = rand.nextInt (damageLimit) + 1000;
				System.out.println("Damage: " + randomDamagePlayer);

				if (randomDamagePlayer > 1000) {
					System.out.println("Damage success, you obtain elixir");
					elixir++;
				}

				if (randomDamagePlayer > 1200) {
					System.out.println("Damage success, you obtain potion");
					potion++;
				}

				if (randomDamagePlayer > 1400) {
					System.out.println("Damage success, you obtain gold 300k");
					gold++;
				}

				if (randomDamagePlayer > 1600 ) {
					System.out.println("Damage success, you obtain fragment Legendary weapon");
					legendary++;
				}

				if (randomDamagePlayer == 1734) {
					System.out.println("you also obtain boot of speed");
					boot++;
				}
				if (randomDamagePlayer == 1423) {
					System.out.println("you also obtain arcana");
					arcana++;
				}
				if (randomDamagePlayer == 1933) {
					System.out.println("you also obtain Alpine set ursa");
					alpine++;
				}
				if (randomDamagePlayer == 1878) {
					System.out.println("you also obtain Golden baby roshan");
					goldenBaby++;
				}
				if (randomDamagePlayer == 1878) {
					System.out.println("you also obtain Legacy Ethereal Flames");
					etherealFlames++;
				}

			}
		hit++;

			//boss server
			randomDamagePlayer = rand.nextInt (damageLimit) + 1000;
			System.out.println("======================================");
			System.out.println("WELCOME TO BOSS FLOOR");
			System.out.println("BOSS stat : hp " + hpBoss + " , Damage " + randomDamageBoss);
			System.out.println("Continue to duel with boss (y/n)? ");
			duelChoice = keyboard.next ();


			while (hpBoss > 0 && hpPlayer > 0) {
				if (duelChoice.equals ("y")) {
					System.out.print("Lanjutkan hit boss (y/n): ");
					hitChoice = keyboard.next ();
					if (hitChoice.equals ("y")) {
						randomHitPlayer = rand.nextInt (10) + 1;
							if (randomHitPlayer > 2) {
								System.out.println("Hit!");
								System.out.println("-------------------------------");
								hpBoss = hpBoss - randomDamageBoss;
								System.out.println("HP boss: " + hpBoss);
								System.out.println("HP player: " + hpPlayer);

							}
							else if (randomHitPlayer== 1 || randomHitPlayer == 2) {
								System.out.println("Miss");
								System.out.println("-------------------------------");
								hpPlayer = hpPlayer - randomDamagePlayer;
								System.out.println("HP boss: " + hpBoss);
								System.out.println("HP player: " + hpPlayer);
							}
							System.out.println("-------------------------------");
					}

				}

				else {
				System.out.println("==========================================");
				System.out.println("And Event Done !!");
				System.out.println("Sorry you've got nothing from this event " );
				hpPlayer = 0; 
				}

			}

			if (hpBoss < hpPlayer) {
				System.out.println("PLAYER MENANG!");
				System.out.println("==========================================");
				System.out.println("And Event Done !!");
				System.out.println("This what you've got from this event elixir x" + elixir + ", potion x" + potion + ", gold 300k x" + gold + ", fragment Legendary weapon x" + legendary);
				System.out.println("Also you've got boot of speed x" + boot + ", arcana x" + arcana + ", Alpine set ursa x" + alpine + ", Golden baby roshan x " + goldenBaby + ", Legacy Ethereal Flames x" + etherealFlames);	
				System.out.println("Congratssss you've got 1 set Eternal pack");
			}

			else {
				System.out.println("BOSS MENANG!");
				System.out.println("==========================================");
				System.out.println("And Event Done !!");
				System.out.println("Sorry you've got nothing from this event " );
			}

		}


	}		
}


/*

 Disebuah event war antar server yang diselenggarakan oleh sebuah perusahaan game online menyatakan bahwa selama event para player yang memiliki level minimal 20 
 mampu mengikuti event tersebut:
-player hanya mampu melakukan hit sebanyak 10x
-indeks dari level pemain yang dinputkan terdiri dari
	>  lv*50 = demage
	>  lv*100 = hp
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

-setelah 10 ronde selesai maka player akan bertemu dengan boss server yang memiliki hp 3x dari demage player, dan memiliki demage Random 200 + 10x dari lv player.
 dan item yang di dapat dari boss kill adalah 1 set Eternal pack, namun jika anda kalah anda tidak mendapatkan semua barang dalam event.
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
30
Selamat bermain
Let's the game begin!!
Demage : 1500
Demage success, you obtain elixir x1
Demage success, you obtain potion x1
Demage success, you obtain gold 300k
missed
==========================================
And Event Done !!
This what you've got from this event elixir x1, potion x1, gold 300k, 1 set Eternal pack

catatan:
lv min 20 kondisi untuk mengikuti event = lv 30
Player hanya dapat 10x hit <<< kondisi untuk perulangan player

Player damage lv *50 = 1500
Player HP lv * 100 = 3000

Perulangan HIT player sebanyak 10x
Random : 1500 s.d 2500

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

Perulangan hit Boss
Hit miss player
HP boss nya habis , HP playernya habis >>> kondisi perulangan hit boss
HP boss 3x 1500 = 4500 
Random Damage boss 200 sampai 200 + 10x lv >>>> 200 s.d 500

Jika Player menang dapat 1 set Eternal pack dan seluruh item dari event
Jika Player kalah maka tidak dapat apapun dari event ini.


WELCOME TO BOSS FLOOR
BOSS stat : hp 3750 ,Damage 250

Continue to duel with boss (y/n)? y

Lanjutkan hit boss: y
Miss
--------------------------------------------------
Hp boss 3310
Your Hp 2340
--------------------------------------------------

Lanjutkan hit boss: y
Hit
--------------------------------------------------
Hp boss 2030
Your Hp 2300
--------------------------------------------------

Lanjutkan hit boss: y
Miss
--------------------------------------------------
Hp boss 1810
Your Hp 2060
--------------------------------------------------

Lanjutkan hit boss: y
Miss
--------------------------------------------------
Hp boss 1570
Your Hp 1900
--------------------------------------------------

Lanjutkan hit boss: y
Hit
--------------------------------------------------
Hp boss 290
Your Hp 1820
--------------------------------------------------

Lanjutkan hit boss: y
Miss
--------------------------------------------------
Hp boss 50
Your Hp 1580
--------------------------------------------------

Lanjutkan hit boss: y
Miss
--------------------------------------------------
Hp boss -390
Your Hp 1260
--------------------------------------------------
You win, boss died, and you got 1 set Eternal pack
==========================================
And Event Done !!
This what you've got from this event 1
Elixcir                          9
Potion                           5
Gold 300k                        4
Fragment Legendary weapon        1
Boot of speed                    0
Arcana                           0
Alpine set ursa                  0
Golden baby roshan               0

*/
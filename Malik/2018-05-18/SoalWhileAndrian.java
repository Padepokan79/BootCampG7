/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 10:30AM

Soal :

Disebuah event war antar server yang diselenggarakan oleh sebuah perusahaan game online menyatakan bahwa selama event 
para player yang memiliki level minimal 20 mampu mengikuti event tersebut dan hadiah dari event tersebut adalah :
-player hanya mampu melakukan hit sebanyak 10x
-indeks dari level pemain yang dinputkan terdiri dari
	>  lvl*50 = damage
	>  lvl*100 = hp

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

-setelah 10 ronde selesai maka player akan bertemu dengan boss server yang memiliki 

hp = 3x dari demage player
demage = 10x dari level player. 
dan item yang di dapat dari boss adalah 1 set Eternal pack, namun jika anda kalah anda tidak 
mendapatkan semua barang dalam event.

**total semua item yang di dapat harus diperlihatkan.

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
public class SoalWhileAndrian{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int level, maxHit, hit, damage, randomDamage, playerHp;
		int jmlElixir=0, jmlPotion=0, jmlGold=0, jmlFragment=0, jmlBoot=0, jmlArcana=0, jmlAlpine=0, jmlGolden=0, jmlLegacy=0;
		int hpBoss, damageBoss, randomBossDamage, missRandom;
		int nol, satu, tiga, sembilan, sepuluh, duaPuluh, limaPuluh, seratus, duaRatus, seribu, seribuDuaRatus, seribuEmpatRatus, seribuEnamRatus;
		int specialSatu, specialDua, specialTiga, specialEmpat, specialLima;

		nol 	= 0; 	limaPuluh	    = 50; 		sembilan	= 9; 		specialEmpat 	= 1878;
		satu 	= 1; 	seratus 	    = 100; 		duaRatus 	= 200; 		specialLima 	= 1656;
		tiga 	= 3; 	seribu 		    = 1000; 	specialSatu = 1734;
		sepuluh = 10; 	seribuDuaRatus  = 1200; 	specialDua 	= 1423; 	
		duaPuluh= 20; 	seribuEmpatRatus= 1400; 	specialTiga = 1933;

		System.out.println();
		System.out.println("===============================");
		System.out.println("  SELAMAT DATANG DI LYTA GAME  ");
		System.out.println("===============================");
		System.out.println("===============================");

		System.out.println();
		System.out.println("Dengan ini anda dinyatakan telah menetujui\nsemua kosekuensi yang ada");
		System.out.println();
		System.out.println("===============================");
		System.out.print("Sebelum memulai game masukkan level anda : ");
		level = scan.nextInt();
		System.out.println("SELAMAT BERMAIN!!!");
		System.out.println("Let's The game begin!");

		if ( level >= duaPuluh ) {
			maxHit	= sepuluh;
			hit 	= satu;
			damage	= level*limaPuluh;
			playerHp= level*seratus;
			while( hit <= maxHit ){
				randomDamage = random.nextInt(damage)+seribu;
				System.out.println("Damage : "+randomDamage);

				if ( randomDamage >= seribu  ) {
					System.out.println("Damage Sukses, kamu mendapatkan elixir x1 ");
					jmlElixir += satu;
				}
				if ( randomDamage >= seribuDuaRatus ) {
					System.out.println("Damage Sukses, kamu mendapatkan potion x1 ");
					jmlPotion += satu;
				}
				if ( randomDamage >= seribuEmpatRatus ) {
					System.out.println("Damage Sukses, kamu mendapatkan gold 300K ");
					jmlGold += satu;
				}
				if ( randomDamage >= seribuEnamRatus ) {
					System.out.println("Damage Sukses, kamu mendapatkan fragment Legendary weapon x1 ");
					jmlFragment += satu;
				}
				if ( randomDamage == specialSatu ) {
					System.out.println("Damage Sukses, kamu mendapatkan boot of speed ");
					jmlBoot += satu;
				}
				if ( randomDamage == specialDua ) {
					System.out.println("Damage Sukses, kamu mendapatkan arcana");
					jmlArcana += satu;
				}
				if ( randomDamage == specialTiga ) {
					System.out.println("Damage Sukses, kamu mendapatkan Alpine set ursa");
					jmlAlpine += satu;
				}
				if ( randomDamage == specialEmpat ) {
					System.out.println("Damage Sukses, kamu mendapatkan Golden baby roshan");
					jmlGolden += satu;
				}
				if ( randomDamage == specialLima ) {
					System.out.println("Damage Sukses, kamu mendapatkan Legacy Ethereal Flames");
					jmlLegacy += satu;
				}
				hit++;
			}
			System.out.println();
			System.out.println();
			System.out.println("==================================================================");
			System.out.println("                          LAWAN BOOSS                             ");
			System.out.println("==================================================================");
			
			hpBoss 		= tiga*damage;
			damageBoss	= (sepuluh*level)+duaRatus;
			randomBossDamage = nol;
			while( hpBoss > nol || playerHp > nol ){
				randomDamage 	 = random.nextInt(damage)+seribu;
				randomBossDamage = random.nextInt(duaRatus)+(damageBoss-duaRatus);
				missRandom 		 = random.nextInt(sepuluh)+satu;

				if ( missRandom >= sembilan ) {
					randomDamage = nol;
					System.out.println("Anda MISS");
				}else{
					randomDamage = randomDamage;
					System.out.println("Anda NEMBAK");
				}	
				hpBoss -= randomDamage;
				playerHp -= randomBossDamage;

				System.out.println("Damage anda     : "+randomDamage);
				System.out.println("Damage boss     : "+randomBossDamage);
				System.out.println("Sisa HP BOSS    : "+randomBossDamage);
				System.out.println("Sisa HP Player  : "+randomDamage);
				System.out.println("============================================================");
				System.out.println();
			}
			if ( hpBoss > playerHp ) {
				System.out.println("Boss Menang ");
				System.out.println("Anda tidak mendapatkan apa apa");
			}else{
				System.out.println();
				System.out.println("Player Menang ");
				System.out.println("Anda mendapatkan hadiah dari event ");
				System.out.println("===================================");
				System.out.println("Mendapatkan Elexir                    :"+jmlElixir+"X");
				System.out.println("Mendapatkan potion                    :"+jmlPotion+"X");
				System.out.println("Mendapatkan Gold 300K                 :"+jmlGold+"X");
				System.out.println("Mendapatkan fragment legendary weapon :"+jmlFragment+"X");
				System.out.println("Mendapatkan Boot of Speed             :"+jmlBoot+"X");
				System.out.println("Mendapatkan Arcana                    :"+jmlArcana+"X");
				System.out.println("Mendapatkan Alpine set ursa           :"+jmlAlpine+"X");
				System.out.println("Mendapatkan Golden Baby Roshan        :"+jmlGolden+"X");
				System.out.println("Mendapatkan Legacy Ethereal Flames    :"+jmlLegacy+"X");
			}
		}else{
			System.out.println("MAAF LEVEL ANDA "+level+", ANDA HARUS MENCAPAI LEVEL 20 DAHULU");
		}
	}
}
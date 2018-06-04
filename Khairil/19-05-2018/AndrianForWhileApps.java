/*
	 Program     : Tugas For While - Andrian
     Creator     : Khairil
     Created At  : 19 Mei 2018 11:40 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class AndrianForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random randomNum = new Random();
		String goBoss, hitBoss;
		int inputDamage, hit, maxHit, levelling, minLevel, getElixir, getPotion, getGold300, getFragmentLegend, bootOfSpeed, arcena, alpineSetUrsa, goldenBabyRoshan, legacyEtherealFrames, damage, hpPlayer, hpBoss, randomDamageBoss, randomDamage, damageLimit, damageBoss, getBootOfSpeed, getArcana, getAlpineSetUrsa, getGoldenBabyRoshan, getLegacyEthernalFrames, randomDamagePlayer;

		goBoss = "";
		hpPlayer = 0;
		hpBoss = 0;
		maxHit = 10;
		damage = 50;
		hit = 0;
		bootOfSpeed = 1734;
		arcena = 1423;
		alpineSetUrsa =1933;
		goldenBabyRoshan = 1878;
		legacyEtherealFrames = 1656;
		minLevel = 20;
		getElixir = getPotion = getGold300 = getFragmentLegend = getBootOfSpeed = getArcana = getAlpineSetUrsa = getGoldenBabyRoshan = getLegacyEthernalFrames = 0;

		System.out.println("===========================================");
		System.out.println("        SELAMAT DATANG DI LYTA GAME        ");
		System.out.println("===========================================");
		System.out.println("===========================================");
		System.out.println("Dengan ini anda dinyatakan telah menyetujui");
		System.out.println("semua kosekuensi yang ada");
		System.out.println();
		System.out.println("===========================================");
		System.out.println("sebelum memulai game masukan level anda :  ");
		levelling = keyboard.nextInt();
		if(levelling < minLevel) {
			System.out.println("BE GONE DUDE YOU'RE TOO EASY GOT KILLED");
			System.out.println("===========================================");
			System.out.println("And Event Done !!");
			System.out.println("This what you've got from this event 0");
			System.out.println("===========================================");
			System.out.println("===========================================");
		}
		else {
			damageLimit = damage * levelling;
			hpPlayer = 100 * levelling;
			System.out.println("Selamat bermain");
			System.out.println("Let's the game begin!!");
			
			while(hit <= maxHit) {
				randomDamage = randomNum.nextInt(2000)+1000;

					if(randomDamage < 1100) {
						System.out.println("Damage Success, you obtain Elixir x1");
						getElixir++;
					}
					if(randomDamage < 1300 ) {
						System.out.println("Damage Success, you obtain Potion x1");	
						getPotion++;
					}
					if(randomDamage < 1600 ) {
						System.out.println("Damage Success, you obtain Gold 300k 1x");
						getGold300++;
					}
					if(randomDamage >= 1600 ) {
						System.out.println("Damage Success, you obtain Fragment Legendary Weapon 1x");	
						getFragmentLegend++;
					}
					if(randomDamage == bootOfSpeed) {
						System.out.println("Damage Success, you obtain Boot of Speed");	
						getBootOfSpeed++;
					}
					if(randomDamage == arcena) {
						System.out.println("Damage Success, you obtain Arcana");	
						getArcana++;
					}
					if(randomDamage == alpineSetUrsa) {
						System.out.println("Damage Success, you obtain Alpine Set Ursa");	
						getAlpineSetUrsa++;
					}
					if(randomDamage == goldenBabyRoshan) {
						System.out.println("Damage Success, you obtain Golden Baby Roshan");
						getGoldenBabyRoshan++;	
					}
					if(randomDamage == legacyEtherealFrames) {
						System.out.println("Damage Success, you obtain Legacy Ethereal Frames");
						getLegacyEthernalFrames++;	
					}
				hit++;
			}
			
			hpBoss = 3 * damageLimit;
			damageBoss = randomNum.nextInt(10 * levelling)+200;
			
			System.out.println("Continue to duel with BOSS ???");
			goBoss = keyboard.next();	

			if(goBoss.equals("Y")) {
				randomDamageBoss = randomNum.nextInt(10*levelling)+200;
				randomDamagePlayer = randomNum.nextInt(10)+1;
				
				while(hpBoss > 0 && hpPlayer > 0) {
					System.out.println("Welcome to BOSS FLOOR");
					System.out.println("BOSS stat : hp " + hpBoss + ", Damage " + damageBoss);
					System.out.println("Type any key to hit boss : ");
					hitBoss = keyboard.next();
					if(randomDamagePlayer < 3 ) {
						System.out.println("Miss");
						System.out.println("--------------------------------------------------");
						hpPlayer = hpPlayer - randomDamageBoss;
						System.out.println("Hp boss " + hpBoss);
						System.out.println("Your Hp " + hpPlayer);
						System.out.println("--------------------------------------------------");
					}

					else if(randomDamagePlayer >= 3) {
						System.out.println("HIT");
						System.out.println("--------------------------------------------------");
						hpBoss = hpBoss - randomDamagePlayer * 100;
						System.out.println("Hp boss " + hpBoss);
						System.out.println("Your Hp " + hpPlayer);
						System.out.println("--------------------------------------------------");					
					}
				}

				if(hpBoss < hpPlayer) {				
					System.out.println("And Event Done");
					System.out.println("This what you've got from this event");
					System.out.println("Elixir                    : " + getElixir + " items");
					System.out.println("Potion                    : " + getPotion + " items");
					System.out.println("Gold 300k                 : " + getGold300 + " items");
					System.out.println("Fragment Legendary Weapon : " + getFragmentLegend + " items");
					System.out.println("Boot of Speed             : " + getBootOfSpeed + " items");
					System.out.println("Arcana                    : " + getArcana + " items");
					System.out.println("Alpine Set Ursa           : " + getAlpineSetUrsa + " items");
					System.out.println("Golden Baby Roshan        : " + getGoldenBabyRoshan + " items");
					System.out.println("Legacy Ethernal Frames    : " + getLegacyEthernalFrames + " items");
				}
				else if(hpPlayer < hpBoss) {
					System.out.println("And Event Done");
					System.out.println("This nothing what you've got from this event");
				}

			}

			else if(goBoss.equals("N")) {
				System.out.println("And Event Done!");
				System.out.println("This nothing what you've got from this event");				
			}				
		}
	}
}
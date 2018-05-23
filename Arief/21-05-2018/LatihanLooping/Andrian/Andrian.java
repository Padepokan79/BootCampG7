/*
Date Created	: 20 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class Andrian {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();
		int hpPlayer, dmgPlayer, hpBos, dmgBos, dmgBosDef, lvl, hit, maxHit, spcDmg1, spcDmg2, spcDmg3,
			spcDmg4, spcDmg5, maxRandomDmg, randomDmg, hitPlayer, tempHit, totHit, nol, ten, dua,
			boot, arcana, ursaSet, roshan, legacy, missDmg, elix, pot, gold, fragment;
		boolean etPack;

		hit = 1;
		dua = 2;
		spcDmg1 = 1734; // Boot of Speed
		spcDmg2 = 1432; // Arcana
		spcDmg3 = 1933; // Alpine set Ursa
		spcDmg4 = 1878; // Golden baby Roshan
		spcDmg5 = 1656; // Legacy Ethereal Flames
		randomDmg = 1000;
		ten = maxHit = 10;
		maxRandomDmg = 2000;
		boot = arcana = ursaSet = roshan = legacy = elix = pot = gold = fragment = nol = totHit = tempHit = 0;
		etPack = false;

		System.out.println("==========================================");
	    System.out.println("	SELAMAT DATANG DI LYTA GAME");
		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.println("Dengan ini anda dinyatakan telah menyetujui");
		System.out.println("semua kosekuensi yang ada");
		System.out.println("==========================================");
		System.out.println("sebelum memulai game masukan level anda :");
		lvl = inputKey.nextInt();
		dmgPlayer = lvl * ((ten * ten)/dua);
		hpPlayer = lvl * (ten * ten);
		
		if (lvl < (ten * dua)) {
			System.out.println("BE GONE DUDE YOU'RE TO EASY GOT KILLED");		
		}else {
			System.out.println("Selamat bermain");
			System.out.println("Let's the game begin!!");
			//hit Damage
			while (hit <= maxHit) {
				hitPlayer = rand.nextInt(randomDmg) + (dmgPlayer + 1);
				System.out.println("Damage Success: " + hitPlayer + " damage, ");

				if (hitPlayer == spcDmg1) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
					System.out.println("\t\tYou obtain Boot of Speed");
					boot+=1;
					// boot = true;
				}
				if (hitPlayer == spcDmg2) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
					System.out.println("\t\tYou obtain Arcana");
					arcana+=1;
					// arcana = true;
				}
				if (hitPlayer == spcDmg3) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
			 		System.out.println("\t\tYou obtain Alpine set Ursa");
			 		ursaSet+=1;
			 		// ursaSet = true;
				}
				if (hitPlayer == spcDmg4) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
					System.out.println("\t\tYou obtain Golden baby Roshan ");
					roshan+=1;
					// roshan = true;
				}
				if (hitPlayer == spcDmg5) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
					System.out.println("\t\tYou obtain Legacy Ethereal Flames");
					legacy+=1;
					// legacy = true;
				}
				
				if (hitPlayer >= 1000) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
					System.out.println("\t\tYou obtain Elixir X 1");
					elix+=1;
					// arcana = true;
				}
				if (hitPlayer >= 1200) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
			 		System.out.println("\t\tYou obtain Potion X 1");
			 		pot+=1;
			 		// ursaSet = true;
				}
				if (hitPlayer >= 1400) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
					System.out.println("\t\tYou obtain Gold 300k ");
					gold+=1;
					// roshan = true;
				}
				if (hitPlayer >= 1600) {
					// System.out.print("Damage Success: " + hitPlayer + " damage, ");
					System.out.println("\t\tYou obtain Fragment Legendary Weapon");
					fragment+=1;
					// legacy = true;
				}else {
					// System.out.println("Damage Success: " + hitPlayer + " damage");
				}
				tempHit+=hitPlayer;
				hit++;
			}
			totHit+=tempHit;
			// System.out.println("Total Hit damage: " + totHit);
			System.out.println("==========================================");

			//Boss Server
			hpBos = dmgPlayer * 3;
			dmgBosDef = 200 + (lvl * ten);

			System.out.println("Boss Server");
			System.out.println("==========================================");
			do{
				System.out.println("Current Bos HP \t\t: " + hpBos);
				System.out.println("Current Player HP \t: " + hpPlayer);
				System.out.println();
				System.out.println("Bos & Player Attack each other");
				System.out.println();

				dmgBos = rand.nextInt(dmgBosDef) + 200;
				hitPlayer = rand.nextInt(randomDmg) + (dmgPlayer + 1);
				// missDmg = rand.nextBoolean();
				missDmg = rand.nextInt(10)+1;
				
				if (missDmg == 1 || missDmg == 2) {
					System.out.println("Player Missed");
					System.out.println("Boss Hit\t\t: " + dmgBos);
					hpPlayer = hpPlayer - dmgBos;
				}else{
					System.out.println("Player Hit\t\t: " + hitPlayer);
					System.out.println("Boss Hit\t\t: " + dmgBos);
					hpBos = hpBos - hitPlayer;
					hpPlayer = hpPlayer - dmgBos;
				}
				if (hpBos <= nol) {
					etPack = true;
					hpBos = 0;
					if (hpPlayer <= nol) {
						hpPlayer = 0;
					}
				}else if (hpPlayer <= nol) {
					etPack = false;
					hpPlayer = 0;
					if (hpBos <= nol) {
						hpBos = 0;
					}
				}
				System.out.println();
				System.out.println("Attacked Bos HP \t: " + hpBos);
				System.out.println("Attacked Player HP \t: " + hpPlayer);
				System.out.println("==========================================");
			}while (hpPlayer > nol && hpBos > nol);
		}

		System.out.println("==========================================");
		System.out.println("And Event Done !!");
		System.out.print("This what you've got from this event ");

		if (etPack == false) {
			System.out.println("0");
		}else {
			System.out.println("\n1 Set Ethernal Pack ");
			if (elix>0) {
				System.out.println("Elixir X " + elix + " ");
			}
			if (pot>0) {
				System.out.println("Potion X " + pot + " ");
			}
			if (gold>0) {
				System.out.println("Gold 300k X " + gold + " = " + (gold*300) + "K");
			}
			if (fragment>0) {
				System.out.println("Fragment Legendary Weapon X " + fragment + " ");
			}
			if (boot>0) {
				System.out.println("Boot of Speed X " + boot + " ");
			}
			if (arcana>0) {
				System.out.println("Arcana X " + arcana + " ");
			}
			if (ursaSet>0) {
				System.out.println("Alpine set Ursa X " + ursaSet + " ");
			}
			if (legacy>0) {
				System.out.println("Legacy Ethereal Flames X " + legacy + " ");
			}
		}
	

	}
}
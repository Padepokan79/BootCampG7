/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
import java.util.Scanner;
import java.util.Random;

public class TugasLoopingAndrianV2 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();


		int level, minLevel=20, hit=1, maxHit=10, damagePlayer, damageBoss, hpPlayer, hpBoss, damagePlayerOne,damageSpecial1=1734, serang, 
			damageSpecial2=1423, damageSpecial3=1933, damageSpecial4=1878, damageSpecial5=1656, damageBossRandom, damagePlayerRandom,
			hadiah1=0, hadiah2=0, hadiah3=0, hadiah4=0, hadiah11=0, hadiah12=0, hadiah13=0, hadiah14=0, hadiah15=0, hadiah=0;
		String itemEvent1="Elixcir",
				itemEvent2="Potion",
				itemEvent3="Gold 300k",
				itemEvent4="Fragment Legendary weapon",
				itemEventSpecial1="Boot of speed",
				itemEventSpecial2="Arcana",
				itemEventSpecial3="Alpine set ursa",
				itemEventSpecial4="Golden baby roshan",
				itemEventSpecial5="Legacy Ethereal Flames",
				itemboss="1 set Eternal pack",
				totalHadiah="\n ",
				command="";


		System.out.println("==========================================");
		System.out.println("       SELAMAT DATANG DI LYTA GAME");
		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.println("Dengan ini anda dinyatakan telah menetujui\nsemua kosekuensi yang ada\n");
		System.out.println("==========================================");
		System.out.println("sebelum memulai game masukan level anda :");
		level = key.nextInt();

		damagePlayer = level*50;
		hpPlayer = level*100;
		damageBoss = level*10;
		hpBoss = 3*damagePlayer;

		if (level>=minLevel) {
			System.out.println("Let's the game begin!!");

			while (level>=20 && hit<=maxHit) {
				
				if (command.equals("Y")||command.equals("y") ) {
					damagePlayerRandom = rand.nextInt(damagePlayer)+1000;
					System.out.println(damagePlayerRandom);
				}
				else {
					damagePlayerRandom = 0;
				}


				if (damagePlayerRandom>=1000) {
					System.out.println("damage success, you obtain "+itemEvent1);
					totalHadiah=totalHadiah+" "+itemEvent1;
					hadiah1+=1;
				} 
				if (damagePlayerRandom>=1200) {
					System.out.println("damage success, you obtain "+itemEvent2);
					totalHadiah=totalHadiah+" "+itemEvent2;
					hadiah2+=1;
				}
				if (damagePlayerRandom>=1600) {
					System.out.println("damage success, you obtain "+itemEvent3);
					totalHadiah=totalHadiah+" "+itemEvent3;
					hadiah3+=1;
				}
				if (damagePlayerRandom>=2000 ) {
					System.out.println("damage success, you obtain "+itemEvent4);
					totalHadiah=totalHadiah+" "+itemEvent4;
					hadiah4+=1;
				}
				if (damagePlayerRandom==damageSpecial1) {
					System.out.println("damage success, you're lucky.. obtain "+itemEventSpecial1);
					totalHadiah=totalHadiah+" "+itemEventSpecial1;
					hadiah11+=1;
				}
				if (damagePlayerRandom==damageSpecial2) {
					System.out.println("damage success, you're lucky.. obtain "+itemEventSpecial2);
					totalHadiah=totalHadiah+" "+itemEventSpecial2;
					hadiah12+=1;
				}
				if (damagePlayerRandom==damageSpecial3) {
					System.out.println("damage success, you're lucky.. obtain "+itemEventSpecial3);
					totalHadiah=totalHadiah+" "+itemEventSpecial3;
					hadiah13+=1;
				}
				if (damagePlayerRandom==damageSpecial4) {
					System.out.println("damage success, you're lucky.. obtain "+itemEventSpecial4);
					totalHadiah=totalHadiah+" "+itemEventSpecial4;
					hadiah14+=1;
				}
				if (damagePlayerRandom==damageSpecial5) {
					System.out.println("damage success, you're lucky.. obtain "+itemEventSpecial5);
					totalHadiah=totalHadiah+" "+itemEventSpecial5;
					hadiah15+=1;
				}
				System.out.println("Lanjutkan hit server: ");
				command = key.next();
				hit++;
			}

			System.out.println();
			System.out.println();
			System.out.println("WELCOME TO BOSS FLOOR");
			System.out.println("BOSS stat : hp "+hpBoss+" ,Damage "+damageBoss);
			damagePlayerRandom=0;	
			System.out.println();
			System.out.print("Continue to duel with boss (y/n)? ");
			command = key.next();

			if (command.equals("Y")||command.equals("y") ) {
				do {
					System.out.println();

					System.out.print("Lanjutkan hit boss: ");
					command = key.next();

					if (command.equals("Y")||command.equals("y")) {
						serang = rand.nextInt(10)+1;
						if (serang>2) {
							System.out.println("Hit");
							damageBossRandom = 0;
							damagePlayerRandom = rand.nextInt(damagePlayer)+1000;
							hpBoss = hpBoss - damagePlayerRandom;
							hpPlayer = hpPlayer - damageBossRandom;
							
						}
						else {
							System.out.println("Miss");
							damageBossRandom = rand.nextInt(damageBoss)+200;
							damagePlayerRandom = 0;
							hpBoss = hpBoss - damagePlayerRandom;
							hpPlayer = hpPlayer - damageBossRandom;
						}

						System.out.println("--------------------------------------------------");
						System.out.println("Hp boss "+hpBoss);
						System.out.println("Your Hp "+hpPlayer);
						System.out.println("--------------------------------------------------");

					}
				} while (command.equals("y")&& hpBoss>=0 && hpPlayer>=0) ;
				if (hpBoss<=0) {
					System.out.println("You win, boss died, and you got "+itemboss);
					totalHadiah=totalHadiah+" "+itemboss;
					hadiah+=1;
					command="n";
						System.out.println("==========================================");
						System.out.println("And Event Done !!");
						System.out.println("This what you've got from this event "+hadiah);
						System.out.println(itemEvent1+"\t\t\t\t "+hadiah1);
						System.out.println(itemEvent2+"\t\t\t\t "+hadiah2);
						System.out.println(itemEvent3+"\t\t\t "+hadiah3);
						System.out.println(itemEvent4+"\t "+hadiah4);
						System.out.println(itemEventSpecial1+"\t\t\t "+hadiah11);
						System.out.println(itemEventSpecial2+"\t\t\t\t "+hadiah12);
						System.out.println(itemEventSpecial3+"\t\t\t "+hadiah13);
						System.out.println(itemEventSpecial4+"\t\t "+hadiah14);
						System.out.println(itemEventSpecial5+"\t\t "+hadiah15);
				}
				else if (hpPlayer<=0) {
					System.out.println("You died, and you got nothing");
					hadiah=0;
					command="n";
				} 

				//System.out.println(totalHadiah);
			}
			else {
				command = "n";
			}

		}
		else {
			System.out.println("Game Over !");
		}
	}
}
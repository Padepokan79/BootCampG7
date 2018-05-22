/*
	Created By Vikri
	19/05/2018
	16:36
*/
import java.util.Scanner;
import java.util.Random;

public class SoalAndrianWhile{
	public static void main(String[] args) {
		double damage, damage2, level, hp, ronde, bosHp, bosDamage;
		int elx = 0, potion = 0, gold = 0, fragment = 0, bos = 0, arcan = 0, alphine = 0, roshan = 0, legacy = 0, ethernal = 0;
		Scanner string = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("=======================================");
		System.out.println("     SELAMAT DATANG DI LYTA GAME");
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("Dengan ini anda dinyatakan telah menetujui\n"+
						   "semua kosekuensi yang ada\n");
		System.out.println("=======================================");
		System.out.print("Masukan Level Anda: ");
		level = string.nextDouble();

		ronde = 1;
		if (level>=20) {
			System.out.println("Selamat bermain");
			System.out.println("Let's the game begin");
			do{
				damage2 = level*50;
				hp = level*100;

				damage = rand.nextInt(1000)+damage2;
				System.out.println("Hit "+(int)ronde+" success");
				if (damage>=1000) {
					System.out.println("\t- You obtain elixir");
					elx += 1;
				}
				if (damage>=1200) {
					System.out.println("\t- You obtain potion");
					potion += 1;
				}
				if (damage>=1400) {
					System.out.println("\t- You obtain 300k Gold");
					gold += 1;
				}
				if (damage>=1600) {
					System.out.println("\t- You obtain fragment legendary weapon");
					fragment += 1;
				}

				if (damage==1734) {
					System.out.println("\t- You obtain boot of speed");
					bos += 1;
				} else if (damage==1423) {
					System.out.println("\t- You obtain arcana");
					arcan += 1;
				} else if (damage==1933) {
					System.out.println("\t- You obtain Alphine set ursa");
					alphine += 1;
				} else if (damage==1874) {
					System.out.println("\t- You obtain roshan");
					roshan += 1;
				} else if (damage==1656) {
					System.out.println("\t- You obtain legacy etheral flames");
					legacy += 1;
				}

				ronde++;
			}while(ronde<11);
			System.out.println("=======================================");
			bosHp = damage2*3;
			bosDamage = level*10+200;

			double hit = 1, bosDamage2, myDamage;
			int dmg;
			while(bosHp>0&&hp>0&&hit<=10){

				hp = hp - bosDamage;
				dmg = rand.nextInt(10)+1;
				if (dmg==1||dmg==2) {
					System.out.println("Missed");
				} else {
					bosHp = bosHp - damage2;
					System.out.println("Hit "+(int)damage2);
				}
				System.out.println("Sisa My Hp: "+(int)hp);
				System.out.println("Sisa Bos Hp: "+(int)bosHp);

				hit++;
			}
			System.out.println("==============================");
			System.out.println("And Event Done !!");
			System.out.println("This what you've got from this event: ");
			if (hp<1&&bosHp>1) {
				System.out.println("u lose");
			} else {
				System.out.println("\t - 1 Set Ethernal Pack");
				if (elx>0)
					System.out.println("\t - Elixir "+elx+"x");
				if (potion>0) 
					System.out.println("\t - Potion "+potion+"x");
				if (gold>0) 
					System.out.println("\t - gold "+(300*gold)+"k");
				if (fragment>0) 
					System.out.println("\t - Fragment Legendary Weapon "+fragment+"x");
				if (bos>0) 
					System.out.println("\t - Boot of speed "+bos+"x");
				if (arcan>0) 
					System.out.println("\t - Arcana "+arcan+"x");
				if (alphine>0) 
					System.out.println("\t - Alphine Set Ursa "+alphine+"x");
				if (roshan>0) 
					System.out.println("\t - Golden Baby Roshan "+roshan+"x");
				if (legacy>0) 
					System.out.println("\t - Legacy Ethernal Flames "+legacy+"x");
			}
		} else {
				System.out.println("Level Kurang");
		}
	}
}
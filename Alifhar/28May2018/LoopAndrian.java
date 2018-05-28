/*
	* Created by:	Alifhar Juliansyah
	* 				21-05-2018	08.20
	* Updated by:
	*
*/
import java.util.Scanner;
import java.util.Random;

public class LoopAndrian{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int lvl, dmg, hit, hp, bosDmg, bosHit, bosHp, randomDmg=1000, elixir=0, potion=0, gold=0, weapon=0, boot=0, arcana=0, alpine=0, roshan=0, ethereal=0, miss;

		System.out.print("Masukkan level anda: ");
		lvl=scan.nextInt();

		dmg=lvl*50;
		hp=lvl*100;

		System.out.println("\nHit the treasure box for 10 times");
		for(int turn=1; turn<=10; turn++){
			hit=rand.nextInt(randomDmg)+dmg+1;
			if(turn%2==0)
				System.out.print("\t");
			System.out.println(hit);

			if(hit>=1000)
				elixir++;
			if(hit>=1200)
				potion++;
			if(hit>=1400)
				gold+=300;
			if(hit>=1600)
				weapon++;
			if(hit==1743)
				boot++;
			if(hit==1423)
				arcana++;
			if(hit==1933)
				alpine++;
			if(hit==1878)
				roshan++;
			if(hit==1656)
				ethereal++;
		}

		System.out.println("\n--------------------------------------");
		System.out.println("Guardian of the Treasure has appear!!");
		System.out.println("--------------------------------------");
		bosDmg=lvl*10;
		bosHp=dmg*3;
		System.out.println("Your Health: "+hp);
		System.out.println("Boss Health: "+bosHp);
		while(bosHp>0 && hp>0){
			System.out.println("\nClash happen");
			miss=rand.nextInt(10);
			if(miss>1){
				hit=rand.nextInt(randomDmg)+dmg+1;
				bosHp-=hit;
			}
			else
				System.out.println("Your attack missed");
			bosHit=200+rand.nextInt(bosDmg)+1;
			hp-=bosHit;
			if(bosHp<=0)
				bosHp=0;
			if(hp<=0)
				hp=0;
			System.out.println("Your Health: "+hp);
			System.out.println("Boss Health: "+bosHp);
		}

		System.out.println("\n================================");
		if(hp>0){
			System.out.println("YOU'VE DEFEATED THE ENEMY");
			System.out.println("Press Enter");
			scan.nextLine(); scan.nextLine();
			System.out.println("You've got");
			if(elixir>0)
				System.out.println("Elixir x"+elixir);
			if(potion>0)
				System.out.println("Potion x"+potion);
			if(gold>0)
				System.out.println("Gold "+gold+"k");
			if(weapon>0)
				System.out.println("Fragment Legendary Weapon x"+weapon);
			if(boot>0)
				System.out.println("Boot of Speed x"+boot);
			if(arcana>0)
				System.out.println("Arcana x"+arcana);
			if(alpine>0)
				System.out.println("Alpine set Ursa x"+alpine);
			if(roshan>0)
				System.out.println("Golden Baby Roshan x"+roshan);
			if(ethereal>0)
				System.out.println("Legacy Ethereal Flames x"+ethereal);
		}
		else
			System.out.println("You've LOST");
		System.out.println("================================");
	}
}
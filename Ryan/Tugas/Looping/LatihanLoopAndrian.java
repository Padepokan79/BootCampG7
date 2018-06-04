/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 21 May 2018 10:11
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class LatihanLoopAndrian{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();


          String pilihan="";
          int level, hitItem=10, damagePlayer=0, hpPlayer=0, damagePlayerRandom=0,
          damageBos=0, hpBos=0, damageBosRandom=0, serang,
          elixir=0, potion=0, gold=0, weapon=0, bootOf=0, arcana=0, ursa=0, roshan=0, flames=0;

          System.out.println("\n==========================================");
          System.out.println("----------WELCOME TO BOSS GAME-------------");
          System.out.println("==========================================");

          System.out.print("\nSebelum memulai permainan, masukan level anda : ");
          level = key.nextInt();
          if (level >= 20) {
               damagePlayer = 50*level;
               hpPlayer = 100*level;

               damageBos = 10*level + 200;
               hpBos = 3*damagePlayer;
               System.out.println("Selamat Bermain\n");     
          }
          else {
               System.out.println("Game Over, min level for event is 20");
          }

          while (level >= 20 && hitItem > 0) {
               System.out.println();
               System.out.print("Hit Item (y/n) : ");
               pilihan = key.next();
               if (pilihan.equals("y")) {
                    damagePlayerRandom = rand.nextInt(1000)+damagePlayer;
               }
               else {
                    System.out.println("You can not get item");
                    damagePlayerRandom = 0;
               }

               if (damagePlayerRandom >= 1000) {
                    System.out.println("You get elixir x1");
                    elixir++;
               }
               if (damagePlayerRandom >= 1200) {
                    System.out.println("You get potion x1");
                    potion++;
               }
               if (damagePlayerRandom >= 1400) {
                    System.out.println("You get gold 300k");
                    gold++;
               }
               if (damagePlayerRandom >= 1600) {
                    System.out.println("You get fragment Legendary weapon x1");
                    weapon++;
               }
               if (damagePlayerRandom == 1734) {
                    System.out.println("You get Rare Item Boot of speed");
                    bootOf++;
               }
               if (damagePlayerRandom == 1423) {
                    System.out.println("You get Rare Item Arcana");
                    arcana++;
               }
               if (damagePlayerRandom == 1933) {
                    System.out.println("You get Rare Item Alpine set ursa");
                    ursa++;
               }
               if (damagePlayerRandom == 1878) {
                    System.out.println("You get Rare Item Golden Baby roshan");
                    roshan++;
               }
               if (damagePlayerRandom == 1656) {
                    System.out.println("You get Rare Item Legacy Ethereal Flames");
                    flames++;
               }

               hitItem--;
          }

          if (hitItem == 0 && level >= 20) {
               System.out.println();
               System.out.println("Continue Kill the Boss (y/t) : ");
               pilihan = key.next();
               System.out.println();
               if (pilihan.equals("y")) {
                    do{
                         System.out.print("Hit the boss (y/t) : ");
                         pilihan = key.next();
                         if (pilihan.equals("y")) {
                              serang = rand.nextInt(10)+1;
                              if (serang > 2) {
                                   damagePlayerRandom = rand.nextInt(damagePlayer);
                                   hpBos = hpBos - damagePlayerRandom;
                                   System.out.println("Oh yess you get Attack the boss!!!");
                                   System.out.println();
                              }
                              else {
                                   damageBosRandom = rand.nextInt(damageBos)+200;
                                   hpPlayer = hpPlayer - damageBosRandom;
                                   System.out.println("Oh no miss attack you Attack by boss !!!");
                                   System.out.println();
                              }
                         }

                         System.out.println("HP Player : "+hpPlayer);
                         System.out.println("HP Boss : "+hpBos);

                    }while(pilihan.equals("y") && hpPlayer > 0 && hpBos > 0);

                    if (hpBos < 1) {
                         System.out.println();
                           System.out.println("Congrats you win the game");
                           System.out.println("List You get Item  ");
                           System.out.println("Elixir\t\t: "+elixir);
                           System.out.println("Potion\t\t: "+potion);
                           System.out.println("Gold 300k\t: "+gold);
                           System.out.println("Fragment Legendary Weapon : "+weapon);
                           System.out.println("And Rare Item "); 
                           System.out.println("Boot Of Speed\t\t: "+bootOf);
                           System.out.println("Arcana\t\t\t: "+arcana);
                           System.out.println("Alpine set Ursa\t\t: "+ursa);
                           System.out.println("Golden baby roshan\t: "+roshan);
                           System.out.println("Legacy Ethereal flames\t: "+flames);  
                         }
                    else if (hpPlayer < 1) {
                              System.out.println("Oh no Boss win the game");
                              System.out.println("You lost the item");
                              System.out.println("Game Over!!!!!!!");
                         }     
               }
               else {
                    System.out.println("Game over you dont get item and defeat in the game");
               }
          }
               
          


          

	}
}
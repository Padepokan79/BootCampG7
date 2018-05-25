/*
 * File           : AndrianGame.java
 * Project Name   : Andrian
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Andrian
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 9:15:53 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 10:47:30 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class AndrianGame{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();

        Boolean haveWinner;
        int hitAttempt, levelIn, playerDamage, playerHp, damageRand,
        elixir, potion, arcane, gold300K, fragment, alpineSet, goldenBaby,
        bootOfSpeed, legacyEtheral, damageRandBoss, hpBoss, damageBoss, test, missRand;

        levelIn=0;
        playerHp=0;
        playerDamage=0;
        haveWinner=true;

        System.out.println("Berapa level anda : ");
        levelIn=keyboard.nextInt();
        
        if(levelIn>=20){

            elixir          =0;
            potion          =0;
            arcane          =0;
            gold300K        =0;
            fragment        =0;
            alpineSet       =0;
            goldenBaby      =0;
            bootOfSpeed     =0;
            legacyEtheral   =0;
            playerDamage    =levelIn*50;
            playerHp        =levelIn*100;

            for(hitAttempt=1; hitAttempt<=10; hitAttempt+=1){ // start hitting until 10 times
                

                damageRand=rand.nextInt(playerDamage)+1000;
                System.out.println("player damage = "+damageRand);

                if(damageRand>=1000){
                    elixir+=1;
                }
                if(damageRand>=1200){
                    potion+=1;
                }
                if(damageRand>=1400){
                    gold300K+=1;
                }
                if(damageRand>=1600){
                    fragment+=1;
                }
                if(damageRand==1734){
                    bootOfSpeed+=1;
                }
                if(damageRand==1423){
                    arcane+=1;
                }
                if(damageRand==1933){
                    alpineSet+=1;
                }
                if(damageRand==1878){
                    goldenBaby+=1;
                }
                if(damageRand==1656){
                    legacyEtheral+=1;
                }
            }// end hitting if 10 times

            System.out.println("========================================");
            System.out.println(" ");

            hpBoss=(3*playerDamage);
            damageBoss=(10*levelIn)+200;

            
            // test=0;
            while(hpBoss>0||playerHp>0){ // face the BOSS
                // test+=1;
                damageRand=rand.nextInt(playerDamage)+1000;
                damageRandBoss=rand.nextInt(200)+damageBoss-200;

                missRand=rand.nextInt(10)+1;
                if(missRand>=9){
                    damageRand=0;
                    System.out.println("Hit anda miss di giliran ini !!! ");
                }else
                {
                    damageRand=damageRand;
                }

                hpBoss-=damageRand;
                playerHp-=damageRandBoss;

                System.out.println("damage anda              : "+damageRand);
                System.out.println("damage boss              : "+damageRandBoss);
                System.out.println("Sisa HitPoint anda       : "+damageRand);
                System.out.println("Sisa HitPoint boss       : "+damageRandBoss);
                System.out.println("========================================");
                
            }
            haveWinner=true;
            if(haveWinner){
                System.out.println("========================================");
                System.out.println("Item yang anda dapat diantaranya        : ");
                System.out.println("Elixir                      : "+elixir);
                System.out.println("Potion                      : "+potion);
                System.out.println("Gold 300k                   : "+gold300K);
                System.out.println("Fragment Legendary Weapon   : "+fragment);
                System.out.println("========================================");
                System.out.println("Special Item                            : ");
                System.out.println("Boot Of Speed       : "+bootOfSpeed);
                System.out.println("Arcane              : "+arcane);
                System.out.println("Alpine Set Ursa     : "+alpineSet);
                System.out.println("Golden Baby Roshan  : "+goldenBaby);
            }
        }
    }
}
/*
 * File           : ChaudryLoopingGame.java
 * Project Name   : Chaudry
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Chaudry
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Saturday, 26th May 2018 11:16:01 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Saturday, 26th May 2018 11:16:04 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class ChaudryLoopingGame{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        int soulPly, soulComp, ratioSoul, round;
        char randAlphabets;
        String  guess;
        Boolean playWinRound, haveWinnerRanga, haveWinnerComp, inputCorrect;
        System.out.println("============================================");

        soulPly=1;
        soulComp=1;
        ratioSoul=6;
        haveWinnerRanga=false;
        haveWinnerComp=false;
        round=0;
        while((soulPly<16&&soulComp<16)&&(haveWinnerRanga==false&&haveWinnerComp==false)&&round<20){
            round+=1;
            System.out.println("Ronde           : "+round);
            System.out.println("Nyawa Anda      : "+soulPly);
            System.out.println("Nyawa Komputer  : "+soulComp);
            System.out.println("============================================");
            
            randAlphabets=(char) (rand.nextInt(26)+'A');
            System.out.println("Masukkan huruf : ");
            guess=keyboard.next();
            System.out.println("============================================");

            if(guess.matches("(a-zA-Z)")){
                soulPly+=2;
                System.out.println("Huruf Komputer : "+randAlphabets);
                System.out.println("Tebakan anda BENAR ");
            }else{
                soulPly-=1;
                soulComp+=2;
                System.out.println("Huruf Komputer : "+randAlphabets);
                System.out.println("Tebakan anda SALAH ");
            }

            // 
            System.out.println("============================================");
            if(soulPly-soulComp>=ratioSoul){
                haveWinnerRanga=true;
                System.out.println("Anda MENANG !!!");
                System.out.println("============================================");
                System.out.println("Nyawa Anda      : "+soulPly);
                System.out.println("Nyawa Komputer  : "+soulComp);
                System.out.println("============================================");
            }
            else if(soulComp-soulPly>=ratioSoul){
                haveWinnerComp=true;
                System.out.println("Komputer MENANG !!!");
                System.out.println("============================================");
                System.out.println("Nyawa Anda      : "+soulPly);
                System.out.println("Nyawa Komputer  : "+soulComp);
                System.out.println("============================================");
            }
            else if(round>=20){
                haveWinnerRanga=true;
                System.out.println("Anda MENANG pada ronde ke 20 !!!");
                System.out.println("============================================");
                System.out.println("Nyawa Anda      : "+soulPly);
                System.out.println("Nyawa Komputer  : "+soulComp);
                System.out.println("============================================");
            }

            if(haveWinnerRanga&&round<=8){
                System.out.println("Anda CHEATER");
            }else if(haveWinnerRanga&&(round>8&&round<=11)){
                System.out.println("Anda NICE");
            }else if(haveWinnerRanga&&round>11){
                System.out.println("Anda NOOB");
            }

        }

    }
}
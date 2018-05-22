/*
 * File           : YanaMarbles.java
 * Project Name   : Yana
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Yana
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 10:11:21 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 10:11:26 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class YanaMarbles{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();

        int manMarbles, budiMarbles, minute, tonoMarbles, tonoRandom;
        
        tonoMarbles=500;
        budiMarbles=200;
        manMarbles=10;
        minute=0;
        tonoRandom=rand.nextInt(6)+1;
        do{
            budiMarbles+=20;
            manMarbles+=40;
            tonoMarbles+=tonoRandom;
            minute+=1;
            if(minute==10){
                tonoMarbles+=budiMarbles;
            }
            System.out.println("kelereng Budi       : "+budiMarbles);
            System.out.println("kelereng Man        : "+manMarbles);
        }while(manMarbles<budiMarbles);

            System.out.println("========================================");
            System.out.println("Man menyusul Budi Pada menit ke "+minute);
            
            tonoRandom=rand.nextInt(6)+1;
            // minute=0;
        do{
            minute++;
            manMarbles+=40;
            tonoMarbles+=tonoRandom;

            System.out.println("kelereng Tono       : "+tonoMarbles);
            System.out.println("kelereng Man        : "+manMarbles);

        }while(manMarbles<tonoMarbles);
            System.out.println("========================================");
            System.out.println("Man menyusul Tono Pada menit ke "+minute);

        
    }
}
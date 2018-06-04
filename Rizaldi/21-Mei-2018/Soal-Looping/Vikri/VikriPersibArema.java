/*
 * File           : VikriPersibArema.java
 * Project Name   : Vikri
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Vikri
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 9:10:03 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 9:11:25 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class VikriPersibArema{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();

        int persibGoal, aremaGoal, round, persibTry, aremaTry, persibScore, aremaScore;
        
        persibGoal=0;
        aremaGoal=0;
        persibScore=1;
        aremaScore=4;
        for(round=1; round<3; round++){

            System.out.println("============================================");
            System.out.println("Masukkan gol Persib babak ke "+round+" : ");
            persibTry=keyboard.nextInt();
            System.out.println("Masukkan gol Arema babak  ke "+round+" : ");
            aremaTry=keyboard.nextInt();
            System.out.println("============================================");
            
            persibGoal+=persibTry;
            aremaGoal+=aremaTry;

        }
        System.out.println("Skor Akhir adalah           = "+persibScore+" : "+aremaScore);
        System.out.println("Skor Tebakan anda adalah    = "+persibGoal+" : "+aremaGoal);
        
        if(persibGoal==persibScore&&aremaGoal==aremaScore){
            System.out.println("selamat anda mendapat paket umroh !!!");
        }
        else if(persibGoal==persibScore||aremaGoal==aremaScore){
            System.out.println("selamat anda mendapat kaos Atep !!!");
        }
        else{
            System.out.println("Maaf coba lagi minggu depan");
        }
    }
}
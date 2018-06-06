/*
 * File           : MalikPencilGame.java
 * Project Name   : Malik
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Malik
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Sunday, 27th May 2018 12:00:10 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Sunday, 27th May 2018 12:00:13 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class MalikPencilGame{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        
        String isSacrifice;
        int qtyPencil, randPencilByComp, chance, score;
        score=0;
        chance=5;

        System.out.println("============================================");
        System.out.println("Kesempatan Anda     : "+chance);
        System.out.println("Masukkan Jumlah Pensil  : ");
        qtyPencil=keyboard.nextInt();
        
        randPencilByComp=rand.nextInt(qtyPencil);
        // System.out.println("Jumlah Pensil           : "+randPencilByComp);

        do{
        chance-=1;
        System.out.println("============================================");
        System.out.println("Tebak Jumlah Pensil  : ");
        qtyPencil=keyboard.nextInt();

        if(qtyPencil==randPencilByComp){
            score+=10;
            chance+=1;
        }

        System.out.println("Scor Anda           : "+score);
        System.out.println("Kesempatan Anda     : "+chance);
        
        if(chance==0&&score>=10){
        System.out.println("Apakah anda ingin menukar 10 point untuk 1 kesemapatan ?");
        isSacrifice=keyboard.next();
            if(isSacrifice.equals("y")||isSacrifice.equals("Y")){
                chance+=1;
                score-=10;
                System.out.println("Anda telah menukar skore anda");
                System.out.println("Skor anda       : "+score);
                System.out.println("Kesempatan anda : "+chance);
            }
        }
        
        }while(chance>0);

    }
}
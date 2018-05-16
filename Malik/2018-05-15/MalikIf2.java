/*
created by : Malik Chaudhary
time : 15-05-2018 2:08PM
Soal :

Budi ingin mengetahui seberapa baik dirinya melalui, mesin pendeteksi
   kebaikan yang berada di CiMallik, Mall termegah di Wakanda. 

   bila skala jujur seseorang mencapai 8, bohong dibawah 5, sombong tidak lebih dari 6, serta angkuh dibawah 7
   maka seseorang tsb dianggap baik.
   bila jujur seseorang mencapai 9, dan sombong tidak lebih dari 2, maka mereka dianggap baik walaupun bohong serta angkuh di atas rata rata 
   bila jumlah skala 5 kebawah maka mereka dianggap kurang baik
   bila jumlah seluruh skala diatas 35 mereka sangat baik
   bila jumlah seluruh skala di bawah 15 mereka buruk

   output
   ===================================
         DETECTED UR ATTITUDE
   ===================================
   skala jujur anda : 9
   skala bohong anda : 9
   skala sombong anda : 9
   skala angkuh anda : 9
   ------------------------------------
   SELAMAT! anda sangat baik !   

*/

import java.util.Scanner;
public class MalikIf2{
   public static void main(String[] args){
      Scanner sifat = new Scanner(System.in);

      double jujur, bohong, sombong, angkuh;

      System.out.println("======================");
      System.out.println(" DETECTED UR ATTITUDE ");
      System.out.println("======================");
      System.out.print("skala jujur anda : ");
      jujur = sifat.nextDouble();
      System.out.print("skala bohong anda : ");
      bohong = sifat.nextDouble();
      System.out.print("skala sombong anda : ");
      sombong = sifat.nextDouble();
      System.out.print("skala angkuh anda : ");
      angkuh = sifat.nextDouble();
      System.out.println("------------------------");


      if ( ( jujur+bohong+angkuh+sombong ) > 35 ) {
            System.out.print("SELAMAT! anda sangat baik");  
      }else if ( ( jujur+bohong+angkuh+sombong ) < 15 ) {
            System.out.print("SELAMAT! anda buruk"); 
      }else if ( ( jujur+bohong+angkuh+sombong ) < 5 ) {
            System.out.print("SELAMAT! anda kurang baik"); 
      }else if ( jujur == 8 ) {
         if ( bohong < 5 ) {
            if ( sombong <= 6 ) {
               if ( angkuh < 7 ) {
                  System.out.print("SELAMAT! anda baik");
               }
            }
         }
      }else if ( jujur == 9 ) {
         if ( sombong <= 2 ) {
            System.out.print("SELAMAT! anda baik");
         }
      }else{

            System.out.print("SELAMAT! anda biasa");
      }
   
   }
}
/*
created by  : Malik Chaudhary
time        : 15-05-2018 2:08PM
update      : 15-05-2018 8:39PM

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
      int tigaLima, limaBelas, lima, delapan, enam, tujuh, sembilan, dua;

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

      tigaLima    = 35;
      limaBelas   = 15;
      lima        = 5;
      delapan     = 8;
      enam        = 6;
      tujuh       = 7
      sembilan    = 9;
      dua         = 2;

      if ( ( jujur+bohong+angkuh+sombong ) > tigaLima ) {
            System.out.print("SELAMAT! anda sangat baik");  
      }else if ( ( jujur+bohong+angkuh+sombong ) < limaBelas ) {
            System.out.print("SELAMAT! anda buruk"); 
      }else if ( ( jujur+bohong+angkuh+sombong ) < lima ) {
            System.out.print("SELAMAT! anda kurang baik"); 
      }else if ( jujur == delapan ) {
         if ( bohong < lima ) {
            if ( sombong <= enam ) {
               if ( angkuh < tujuh ) {
                  System.out.print("SELAMAT! anda baik");
               }
            }
         }
      }else if ( jujur == sembilan ) {
         if ( sombong <= dua ) {
            System.out.print("SELAMAT! anda baik");
         }
      }else{

            System.out.print("SELAMAT! anda biasa");
      }
   
   }
}
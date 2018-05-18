/*
 * File           : KalimatSegitiga.java
 * Project Name   : Tugas_Prima_segitiga_ketupat
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Prima_segitiga_ketupat
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 17th May 2018 4:33:01 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Thursday, 17th May 2018 4:33:09 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class KalimatSegitiga{
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
        Scanner keyLine = new Scanner (System.in);

        int limit, tinggi, lebar, lengthSent=0;
        String sentences;
        System.out.print("Masukan batas segitiga : ");
        limit = keyboard.nextInt();
        System.out.print("Masukkan kalimat : ");
        sentences = keyLine.nextLine();

        for(tinggi=0; tinggi<limit; tinggi++){
            for(lebar=tinggi; lebar<sentences.length(); lebar++){
                System.out.print(" ");
            }
            for(int word=0; word<=tinggi; word++){
                if(lengthSent<sentences.length()){
                    System.out.print(sentences.substring(lengthSent, lengthSent+1));
                    System.out.print(" ");
                    lengthSent++;
                }
            }
            System.out.println();
        }

    }
}

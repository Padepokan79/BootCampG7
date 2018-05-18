/*
 * File           : Diamond.java
 * Project Name   : Tugas_Prima_segitiga_ketupat
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_Prima_segitiga_ketupat
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 17th May 2018 9:31:31 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Thursday, 17th May 2018 9:31:34 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class Diamond{
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
        Scanner keyLine = new Scanner (System.in);

        int limit, tinggi, lebar, lengthSent=0;
        String sentences;

        System.out.print("Masukan batas segitiga : ");
        limit = keyboard.nextInt();        

        for(tinggi=0; tinggi<limit/2+1; tinggi++){
            for(lebar=0; lebar<limit/2-tinggi; lebar++){
                System.out.print(" ");
            }
            for(lebar=0; lebar<2*tinggi+1; lebar++){
                if(tinggi==0||lebar==0||lebar==2*tinggi){                    
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");                    
                }
            }
            System.out.println();
        }
        for(tinggi=limit/2-1; tinggi>=0; tinggi--){
            for(lebar=0; lebar<limit/2-tinggi; lebar++){
                System.out.print(" ");
            }
            for(lebar=0; lebar<2*tinggi+1; lebar++){
                if(tinggi==0||lebar==0||lebar==2*tinggi){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

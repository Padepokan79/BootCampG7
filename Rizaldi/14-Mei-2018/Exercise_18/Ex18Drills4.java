/*
 * File           : Ex18Drills4.java
 * Project Name   : Exercise_18
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_18
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 10:34:51 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 10:35:27 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class Ex18Drills4{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int passCapacity;
                
        System.out.println("Masukkan jumlah penumpang : ");
        passCapacity=keyboard.nextInt();

        if(passCapacity>=60){
            System.out.println("Bis dengan Kursi 60 ");
        }
        if(passCapacity>=45){
            System.out.println("Bis dengan Kursi 45 ");
        }
        if(passCapacity>=32){
            System.out.println("Bis dengan Kursi 32 ");
        }
        if(passCapacity>=18){
            System.out.println("Bis dengan Kursi 18 ");
        }
        if(passCapacity>=12){
            System.out.println("Bis dengan Kursi 12 ");
        }
        if(passCapacity>=6 || passCapacity<=6){
            System.out.println("Bis dengan Kursi 6 ");
        }


    }
}
/*
 * File           : AriefSoalIf1.java
 * Project Name   : Arief
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Arief
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 15th May 2018 1:28:17 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 15th May 2018 1:28:34 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class AriefSoalIf1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        int ram, hdd, minWallet, maxWallet, minRam, minHdd;
        Double processor, price;
        String name;

        minWallet=7000000;
        maxWallet=10000000;
        minRam=8;
        minHdd=500;

        System.out.println("======================================================");
        System.out.println("Merek           : ");
        name=keyboard.next();
        System.out.println("RAM             : ");
        ram=keyboard.nextInt();
        System.out.println("HDD  (giga)       : ");
        hdd=keyboard.nextInt();
        System.out.println("Processor       : ");
        processor=keyboard.nextDouble();
        System.out.println("Harga           : ");
        price=keyboard.nextDouble();
        System.out.println("======================================================");
        
        if(name.equals("SAMSUNG")){
            System.out.println("Status  :   Anda Fanboy");
        }
        if((price>=minWallet&&price<=maxWallet)&&(ram>=minRam)&&(hdd>=minHdd)&&(processor>=2.8&&processor<=3.5)){
            System.out.println("Status  :   Setuju untuk dibeli");
        }
        if(ram<minRam&&hdd<minHdd){
            System.out.println("Status  :   Laptop Ngelag");
        }
        if(name.equals("SAMSUNG")&&price>maxWallet){
            System.out.println("Status  :   Anda Sultan Fanboy");
        }
        
        


        
    }
}
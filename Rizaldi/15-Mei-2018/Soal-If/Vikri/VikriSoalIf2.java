/*
 * File           : VikriSoalIf2.java
 * Project Name   : Vikri
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Vikri
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 15th May 2018 1:07:24 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 15th May 2018 1:07:26 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class VikriSoalIf2{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        int mathVal, religionVal, utang, minMath, minReligion, utangCon;
        String name, spp;

        minMath=72;
        minReligion=75;
        utangCon=0;


        System.out.println("======================================================");
        System.out.println("masukkan nama           : ");
        name=keyboard.next();
        System.out.println("masukkan nilai mtk      : ");
        mathVal=keyboard.nextInt();
        System.out.println("masukkan nilai agama    : ");
        religionVal=keyboard.nextInt();
        System.out.println("utang  uang pembangunan    : ");
        utang=keyboard.nextInt();
        System.out.println("status pembayaran spp (lunas/tidak)    : ");
        spp=keyboard.next();


        if(!(name.equals("andi"))&&mathVal>=minMath&&religionVal>=minReligion){
            System.out.println("======================================================");
            System.out.println("selamat "+name+" anda naik kelas");
        }
        else if(spp.equals("LUNAS")&&(utang<=utangCon)){
            System.out.println("======================================================");
            System.out.println("selamat "+name+" anda naik kelas");
        }
        else if(name.equals("andi")){
            System.out.println("Maaf andi anda tidak naik kelas");
        }
        else{
            System.out.println("Masukkan data dengan benar");
        }
    }
}
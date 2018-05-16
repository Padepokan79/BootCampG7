/*
 * File           : VikriSoalIf1.java
 * Project Name   : Yana
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Yana
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 15th May 2018 12:51:38 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 15th May 2018 12:51:40 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class VikriSoalIf1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        int qtyChild, qtyWife;

        System.out.println("======================================================");
        System.out.println("masukkan jumlah anak    : ");
        qtyChild=keyboard.nextInt();
        System.out.println("masukkan jumlah isteri  : ");
        qtyWife=keyboard.nextInt();

        if(qtyChild>=2&&qtyWife==1){
            System.out.println("selamat... anda diberi mobil oleh nenek");
        }else if(qtyChild==1&&qtyWife>=2){
            System.out.println("selamat... anda diberi mobil oleh nenek");
        }else{
            System.out.println("anda tidak dapat mobil");
        }
    }
}
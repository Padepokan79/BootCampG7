/*
 * File           : AriefSoalIf2.java
 * Project Name   : Tol Ganjil Genap
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Arief
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Tuesday, 15th May 2018 2:06:23 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Tuesday, 15th May 2018 2:06:28 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class AriefSoalIf2{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);

        int tanggal, capMachine, oddNumber, oddDate, flat, tipe;
        String libur, letter, guard;
        

        System.out.println("======================================================");
        System.out.println("Tanggal         : ");
        tanggal=keyboard.nextInt();
        System.out.println("Flat Nomor      : ");
        flat=keyboard.nextInt();
        System.out.println("Hari Libur (Y/N): ");
        libur=keyboard.next();
        System.out.println("Jenis Kendaraan (jumlah roda): ");
        tipe=keyboard.nextInt();
        System.out.println("Kapasitas Mesin : ");
        capMachine=keyboard.nextInt();
        System.out.println("Surat Izin      : ");
        letter=keyboard.next();
        System.out.println("Pengawalan      : ");
        guard=keyboard.next();
        System.out.println("======================================================");
        
        oddNumber=flat%2;
        oddDate=tanggal%2;        


        if(((oddDate==0)&&(oddNumber==0)||((oddDate==1)&&(oddNumber==1)))&&(libur.equals("Y"))&&((capMachine>1000)&&(tipe!=2))&&(letter.equals("Y")&&(guard.equals("Y")))){
            System.out.println("Diijinkan Memasuki Toll");
        }
        else if(((oddDate==0)&&(oddNumber==0)||((oddDate==1)&&(oddNumber==1)))){
            System.out.println("Khusus kendaraan dengan plat ganjil genap, begitupun sebaliknya");
        }
        else if(libur.equals("Y")){
            System.out.println("Bebas masuk hari libur");
        }
        else if((capMachine<1000)&&(tipe==2)){
            System.out.println("kendaraan Roda 2 dilarang masuk");
        }else{
            System.out.println("silakan masukkan data dengan benar");
        }        
        
        
        
        


        
    }
}
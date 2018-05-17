/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 09:07 
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LatihanIfArief2{
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);

        int tanggal, capMachine, oddNumber, oddDate, flat, tipe;
        String libur, letter, guard;
        

        System.out.println("======================================================");
        System.out.print("Tanggal\t: ");
        tanggal = keyboard.nextInt();
        System.out.print("Flat Nomor\t: ");
        flat = keyboard.nextInt();
        System.out.print("Hari Libur (Y/N)\t: ");
        libur = keyboard.next();
        System.out.print("Jenis Kendaraan (jumlah roda)\t: ");
        tipe = keyboard.nextInt();
        System.out.print("Kapasitas Mesin\t: ");
        capMachine = keyboard.nextInt();
        System.out.print("Surat Izin\t: ");
        letter = keyboard.next();
        System.out.print("Pengawalan\t: ");
        guard = keyboard.next();
        System.out.println("======================================================");
        
        oddNumber = flat%2;
        oddDate = tanggal%2;        


        if(((oddDate == 0) && (oddNumber == 0) || ((oddDate == 1) && (oddNumber == 1))) && (libur.equals("Y")) && ((capMachine > 1000) && (tipe != 2)) && (letter.equals("Y") && (guard.equals("Y")))){
            System.out.println("Diijinkan Memasuki Toll");
        }
        else if(((oddDate == 0) && (oddNumber == 0) || ((oddDate == 1) && (oddNumber == 1)))){
            System.out.println("Khusus kendaraan dengan plat ganjil genap, begitupun sebaliknya");
        }
        else if(libur.equals("Y")){
            System.out.println("Bebas masuk hari libur");
        }
        else if((capMachine < 1000) && (tipe == 2)){
            System.out.println("kendaraan Roda 2 dilarang masuk");
        }else{
            System.out.println("silakan masukkan data dengan benar");
        }        
        
        
        
        


        
    }
}
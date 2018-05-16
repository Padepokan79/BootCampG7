/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 16 May 2018 10:20
     * Updated By : 
     * Updated At : 
*/


import java.util.Scanner;

public class LatihanIfVikri2{
    public static void main(String[] args){
        Scanner key = new Scanner (System.in);

        int nilaiMtk, nilaiAgm, utang, matematikaMinumum, agamaMinimum, pemabayaran;
        String nama, spp;

        matematikaMinumum = 72;
        agamaMinimum = 75;
        pemabayaran = 0;


        System.out.println("======================================================");
        System.out.print("masukkan nama\t: ");
        nama = key.next();
        System.out.print("masukkan nilai mtk\t: ");
        nilaiMtk = keyboard.nextInt();
        System.out.print("masukkan nilai agama\t: ");
        nilaiAgm = keyboard.nextInt();
        System.out.print("utang  uang pembangunan\t: ");
        utang = keyboard.nextInt();
        System.out.print("status pembayaran spp (L/BL)    : ");
        spp = keyboard.next();


        if( !(nama.equals("andi")) && nilaiMtk >= matematikaMinumum && nilaiAgm >= agamaMinimum{
            System.out.println("======================================================");
            System.out.println("selamat "+ nama +" anda naik kelas");
        }
        else if(spp.equals("L") && (utang <= pembayaran)){
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
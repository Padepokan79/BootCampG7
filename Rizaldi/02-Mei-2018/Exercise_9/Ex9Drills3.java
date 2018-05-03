/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 11:23 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex9Drills3{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);

        String  namaDepan, namaBelakang, tempatLahir, bulanLahir, alamat, kecamatan, kota, provinsi, tanggalLahir, text, textDesc;
        int tahunLahir, kodePos, usia, currYear;
        

        System.out.print("Nama Depan :");
        namaDepan = keyboard.next();        

        System.out.print("Nama Belakang :");
        namaBelakang = keyboard.next();        

        System.out.print("Tempat Lahir :");
        tempatLahir = keyboard.next();

        System.out.print("Tanggal Lahir :");
        tanggalLahir = keyLine.nextLine();                                   

        System.out.print("Tahun Lahir :");
        tahunLahir = keyboard.nextInt();          

        System.out.print("Alamat :");
        alamat = keyLine.nextLine();   

        System.out.print("Kecamatan :");
        kecamatan = keyboard.next();   
                     
        System.out.print("Kota/Kabupaten :");
        kota = keyLine.nextLine();   
        
        System.out.print("Provinsi :");
        provinsi = keyLine.nextLine();   

        System.out.print("Kode Pos :");
        kodePos = keyboard.nextInt();   

        currYear=2018;
        usia=currYear-tahunLahir;

        textDesc="Selamat Datang, \n"+namaDepan+" "+namaBelakang+", "+usia+" tahun."+
                " Lahir di "+tempatLahir+", "+tanggalLahir+" "+tahunLahir+". \n"+
                "Beralamat di "+alamat+", Kec."+kecamatan+" "+kota+" "+provinsi+" \n"+
                "Kode Pos "+kodePos+".\n"+"\nTerimakasih Sudah bergabung Dengan Kami";

        
        System.out.println("========================================================================");
        System.out.println("=                           REGISTRASI BERHASIL                        =");
        System.out.println("========================================================================");
        System.out.println("                                                                        ");
        System.out.println(textDesc);        
        System.out.println("                                                                        ");
        

    }
}
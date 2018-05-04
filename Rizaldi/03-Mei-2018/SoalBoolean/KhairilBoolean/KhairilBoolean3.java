/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 15:13 AM
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class KhairilBoolean3{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        String ticketClass, gender;
        int qtyFlight, minDFFlight, minTFlightMale, minTFlightFemale;
        boolean bussLoungeDFClass, bussLoungeTClassMale, bussLoungeTClassFemale, classD, classF, classT, male, female;

        System.out.println("Sebutkan kelas tiket pesawat : ");        
        ticketClass=keyboard.next();
        System.out.println("Sebutkan gender anda : ");        
        gender=keyboard.next();
        System.out.println("Berapa jumlah penerbangan anda : ");        
        qtyFlight=keyboard.nextInt();                     
        
        classD=ticketClass.equals("D");
        classF=ticketClass.equals("F");
        classT=ticketClass.equals("T");

        male=gender.equals("pria");
        female=gender.equals("wanita");

        minDFFlight=30;
        minTFlightMale=20;
        minTFlightFemale=15;

        bussLoungeDFClass=((classD||classF)&&(male||female)&&(qtyFlight>=minDFFlight));
        bussLoungeTClassMale=(classT&&male&&qtyFlight>=minTFlightMale);
        bussLoungeTClassFemale=(classT&&female&&qtyFlight>=minTFlightFemale);
        
        System.out.println("    ");        
        System.out.println("akses untuk kelas D atau F ? "+bussLoungeDFClass);
        System.out.println("akses untuk kelas T pria ? "+bussLoungeTClassMale);
        System.out.println("akses untuk kelas T wanita ? "+bussLoungeTClassFemale);
        
        
                

    }
}

//Tidak ada pilihan apakah itu masuk kelas bisnis atau bukan
//Boleh pilih kelas bisnis (Y/T) atau opsi pemilihan kelas
// Kelas D / Wanita / 6 (F) harusnya T
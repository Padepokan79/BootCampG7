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
        
        String ticketClass, gender, classBuss;
        int qtyFlight, minDFFlight, minTFlight;
        boolean bussLoungeDFClass, bussLoungeTClass, classD, classF, classT, male, female, bussClass, ecoClass, condition1, loungeAcc;

        System.out.println("Apakah jenis kelas nya bisnis (Y/T) : ");        
        classBuss=keyboard.next();
        System.out.println("Sebutkan kelas tiket pesawat : ");        
        ticketClass=keyboard.next();
        System.out.println("Sebutkan gender anda : ");        
        gender=keyboard.next();
        System.out.println("Berapa jumlah penerbangan anda : ");        
        qtyFlight=keyboard.nextInt();                     
        
        bussClass=classBuss.equals("Y");
        ecoClass=classBuss.equals("T");

        classD=ticketClass.equals("D");
        classF=ticketClass.equals("F");
        classT=ticketClass.equals("T");

        male=gender.equals("pria");
        female=gender.equals("wanita");

        minTFlight=30;
        minDFlightMale=20;
        minDFlightFemale=15;


        condition1=(bussClass)
        bussLoungeTClass=((male||female)&&qtyFlight>=minTFlight&&classT);
        bussLoungeDFClass=((classD||classF)&&((male&&qtyFlight>=minDFFlight)||(female&&qtyFlight>=minDFlightFemale)));
        
        loungeAcc=(condition1&&(bussLoungeTClass||bussLoungeDFClass))
        
        System.out.println("    ");        
        System.out.println("masuk lounge ? "+loungeAcc);        
        
        
                

    }
}
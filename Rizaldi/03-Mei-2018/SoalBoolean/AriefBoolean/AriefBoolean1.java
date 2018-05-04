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

public class AriefBoolean1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        int noFlat, date, oddNumber, oddDate;
        boolean highWay, highWayEv, highWayOd, isOddNumber, isOddDate;

        System.out.println("Sebutkan plat nomor kendaraan anda : ");        
        noFlat=keyboard.nextInt();
        System.out.println("Masukkan tanggal : ");        
        date=keyboard.nextInt();
        
        oddNumber=noFlat%2;
        oddDate=date%2;        

        highWayEv=(oddNumber==0&&oddDate==0);
        highWayOd=(oddNumber!=0&&oddDate!=0);
        highWay=(highWayEv||highWayOd);
        
        System.out.println("    ");                
        System.out.println("pada tanggal "+date+" kendaraan dengan plat nomor : "+noFlat+" boleh masuk tol = "+highWay);        
    }
}
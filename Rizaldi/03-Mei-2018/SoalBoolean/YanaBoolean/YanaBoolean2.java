/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 13:45 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class YanaBoolean2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        String gender, akreditasi, degree;
        Double ipkS1, ipkS2, totalIpk, avgIpk, limitIpk;
        int valAkreditasi;        
        boolean scholarship, male, female, akd, akdA, akdB, akdC, s2;
        
        System.out.println("masukkan jenis kelamin (laki-laki/perempuan) : ");
        gender=keyboard.next();

        System.out.println("masukkan jenjang pendidikan : ");
        degree=keyboard.next();

        System.out.println("berapa IPK S1 anda : max 4.0");
        ipkS1=keyboard.nextDouble();

        System.out.println("berapa IPK S2 anda : max 4.0");
        ipkS2=keyboard.nextDouble();

        System.out.println("apa akreditasi kampus anda : ");
        akreditasi=keyboard.next();
        
        limitIpk=3.25;
        male=gender.equals("laki-laki");        
        female=gender.equals("perempuan"); 
        s2=degree.equals("S2");

        totalIpk=ipkS1+ipkS2;
        avgIpk=totalIpk/2;          

        akdA=akreditasi.equals("A");
        akdB=akreditasi.equals("B");
        akdC=akreditasi.equals("C");

        scholarship=((male||female)&&s2&&avgIpk>=limitIpk&&(akdA||akdB));

        System.out.println("diterima kerja ? : "+scholarship);

    }
}
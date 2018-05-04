/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 14:20 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class YanaBoolean3{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        String gender, scholarType, letter;
        Double ipk, algoVal, dbVal, langPrgVal, minIpkA, minIpkB, avgLangProgDB, limitAvgLangProgDB, limitAlgoVal, semester;
        int qwe;
        boolean scholarshipA, scholarshipB, male, female, ppaLetter;
        
        System.out.println("masukkan jenis kelamin (laki-laki/perempuan) : ");
        gender=keyboard.next();

        System.out.println("semester ke berapa anda sekarang : (angka)");
        semester=keyboard.nextDouble();

        System.out.println("pilih jenis beasiswa (PPA/PPB)");
        scholarType=keyboard.next();

        System.out.println("berapa ipk anda : ");
        ipk=keyboard.nextDouble();
        
        System.out.println("berapa nilai matkul algoritma anda : dari skala 0 sd 10");
        algoVal=keyboard.nextDouble();

        System.out.println("berapa nilai matkul database anda : dari skala 0 sd 10");
        dbVal=keyboard.nextDouble();

        System.out.println("berapa nilai matkul bahasa pemrograman anda : dari skala 0 sd 10");
        langPrgVal=keyboard.nextDouble();

        System.out.println("apakah anda punya surat keterangan tidak mampu : (ya/tidak)");
        letter=keyboard.next();
        
    
        male=gender.equals("laki-laki");        
        female=gender.equals("perempuan"); 
        
        minIpkA=2.75;
        minIpkB=3.0;

        limitAlgoVal=8.0;
        limitAvgLangProgDB=8.0;
        avgLangProgDB=(langPrgVal+dbVal)/2.0;

        ppaLetter=letter.equals("ya");        

        scholarshipA=((male||female)&&(semester>=3&&semester<=5)&&ipk>=minIpkA&&ppaLetter);
        scholarshipB=((male||female)&&(semester>=3&&semester<=5)&&ipk>=minIpkB&&algoVal>=limitAlgoVal&&avgLangProgDB>=limitAvgLangProgDB);

        System.out.println("status diterima untuk beasiswa PPA : "+scholarshipA);
        System.out.println("status diterima untuk beasiswa PPB : "+scholarshipB);

    }
}
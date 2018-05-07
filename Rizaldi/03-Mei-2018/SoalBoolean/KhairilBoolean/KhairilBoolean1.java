/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 15:55 AM
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class KhairilBoolean1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);

        String gender, participation, domisili;
        Double mathVal, mathVal2, minMath, semester, maxSemester;        
        boolean criteriaPassed, male, female, partValue, domValue;        

        System.out.println("Masukkan gender : ");        
        gender=keyboard.next();
        System.out.println("Pernah mengikuti seleksi : (Y/T)");        
        participation=keyboard.next();
        System.out.println("Domisili asal : ");        
        domisili=keyLine.nextLine();
        System.out.println("Nilai matematika semester 1: ");        
        mathVal=keyboard.nextDouble();
        System.out.println("Nilai matematika semester 2: ");        
        mathVal2=keyboard.nextDouble();
        
        
        minMath=8.0;        
        male=gender.equals("pria");
        female=gender.equals("wanita");
        partValue=participation.equals("T");
        domValue=domisili.equals("Bandung");
        
        criteriaPassed=((male||female)&&partValue&&domValue&&mathVal>=minMath&&mathVal2>=minMath);
        System.out.println("    ");        
        System.out.println("kriteria memnuhi untuk seleksi ? "+criteriaPassed);
        
                

    }
}

//bukan lama semester maksudnya ada 2 nilai matematika yang harus 8 
//semester 1 dan semester 2
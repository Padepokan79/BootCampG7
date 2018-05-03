/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 09:10 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex14Drills2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        double income, cute;
        boolean allowed;
        
        System.out.println("Masukkan usia : ");
        age=keyboard.nextInt();

        System.out.println("berapa tingkat kegantenganmu, dari skala 0.0 s/d 10.0 : ");
        cute=keyboard.nextDouble();

        System.out.println("Sebutkan penghasilanmu, minimal 5000000 ? : ");
        income=keyboard.nextDouble();        
        
        allowed=(age>=30&&income>=5000000);

        System.out.println("persetujuan si kakek tentang calon pasangan : "+allowed);

    }
}
/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 20:12
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class AndrianBoolean2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        String gender, ktp;
        int age, minAge;
        Double salary, height, minHeightFemale, minHeightMale, minSalary;
        boolean male, female, ktpY, maleInv, femaleInv, invited;

        System.out.println("sebutkan gender anda (pria/wanita) : ");        
        gender=keyboard.next();                                        
        System.out.println("sebutkan usia anda : ");        
        age=keyboard.nextInt();                 
        System.out.println("apakah anda sudah punya KTP (Y/T) : ");        
        ktp=keyboard.next();                 
        System.out.println("berapa penghasilan anda : ");        
        salary=keyboard.nextDouble();                 
        System.out.println("berapa tinggi badan anda : ");        
        height=keyboard.nextDouble();                 
        
        minAge=25;
        minSalary=3000000.0;
        minHeightMale=160.0;
        minHeightFemale=153.0;

        ktpY=ktp.equals("Y");
        male=gender.equals("pria");
        female=gender.equals("wanita");

        maleInv=(male&&age>=minAge&&ktpY&&salary>minSalary&&height>minHeightMale);
        femaleInv=(female&&age>=minAge&&ktpY&&salary>minSalary&&height>minHeightFemale);
        invited=(maleInv||femaleInv);

        System.out.println("    ");                
        System.out.println("anda boleh masuk ke pesta = "+invited);           
    }
}
/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 09:49 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class LadiesNight{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        double cute;
        String gender;
        boolean allowed, cewek, cowok;
        
        System.out.println("Masukkan Gender (cewek/cowok): ");
        gender=keyboard.next();

        System.out.println("Masukkan usia : ");
        age=keyboard.nextInt();

        System.out.println("berapa tingkat kecantikan, dari skala 0.0 s/d 10.0 : ");
        cute=keyboard.nextDouble();
    
        cewek=gender.equals("cewek");
        cowok=gender.equals("cowok");

        allowed=(cewek&&age>=21&&age<=30&&cute>=8);

        System.out.println("Orang tersebut boleh masuk : "+allowed);

    }
}
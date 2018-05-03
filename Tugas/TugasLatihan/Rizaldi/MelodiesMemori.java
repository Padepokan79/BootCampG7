/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 09:55 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class MelodiesMemori
{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int age;    
        String gender;    
        boolean allowed, cewek, cowok;
        
        System.out.println("Masukkan gender (cewek/cowok): ");
        gender=keyboard.next();

        System.out.println("Masukkan usia : ");
        age=keyboard.nextInt();

        cewek=gender.equals("cewek");
        cowok=gender.equals("cowok");

        allowed=(age>40&&(cewek||cowok));

        System.out.println("Orang tersebut boleh masuk : "+allowed);

    }
}
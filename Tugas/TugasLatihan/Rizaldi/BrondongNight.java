/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 10:06 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BrondongNight{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int age;    
        String gender;    
        double cute;
        boolean allowed, cewek, cowok;
        
        System.out.println("Masukkan gender (cewek/cowok): ");
        gender=keyboard.next();

        System.out.println("Masukkan usia : ");
        age=keyboard.nextInt();
        
        System.out.println("Masukkan tingkat penampilan anda dari skala 0.0 s/d 10.0 : ");
        cute=keyboard.nextDouble();

        cewek=gender.equals("cewek");
        cowok=gender.equals("cowok");

        allowed=((cewek&&age>=30&&age<=45&&cute>=8)||(cowok&&age>=30&&age<=45&&cute>=8));

        System.out.println("Orang tersebut boleh masuk : "+allowed);

    }
}
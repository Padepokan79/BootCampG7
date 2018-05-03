/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 20:27 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex14Drills1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        double income, cute, happiness;
        boolean allowed, allowed2;
        
        System.out.println("Enter your age : ");
        age=keyboard.nextInt();

        System.out.println("Enter your really income : ");
        income=keyboard.nextDouble();

        System.out.println("How cute are you, on a scale from 0.0 to 10.0 ? : ");
        cute=keyboard.nextDouble();

        System.out.println("How happy do you make them ?, on a scale from 0.0 to 10.0 ? : ");
        happiness=keyboard.nextDouble();

        allowed2=(age>20&&age<25&&(happiness>7.0&&happiness<=10.0));
        allowed=((age>20&&age<40&&(income>50000||cute>=8.5))||allowed2);

        System.out.println("Allowed to date my grandchild : "+allowed);

    }
}
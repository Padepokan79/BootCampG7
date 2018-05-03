/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 11:23 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex9Drills1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        double meter, kg, bmi, inches, pounds, incToMeter, poundsToKg;

        System.out.print("Your height in inches :");
        inches = keyboard.nextDouble();

        System.out.print("Your weight in pounds: ");
        pounds = keyboard.nextDouble();

        incToMeter=inches*0.0254;
        poundsToKg=pounds*0.453592;
        meter=incToMeter;
        kg=poundsToKg;
        bmi = kg/(meter*meter);

        System.out.println("Your BMI is "+bmi);
    }
}
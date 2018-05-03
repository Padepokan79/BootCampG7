/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 11:30 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex9Drills2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        double meter, kg, bmi, feet, inches, pounds, incToMeter, feetToMeter, poundsToKg, totMeter;

        System.out.print("Your height in feet   :");
        feet = keyboard.nextDouble();

        System.out.print("Your height in inches :");
        inches = keyboard.nextDouble();

        System.out.print( "Your weight in pounds: " );
        pounds = keyboard.nextDouble();


        incToMeter=inches*0.0254;
        feetToMeter=feet*0.3048;
        totMeter=incToMeter+feetToMeter;
        poundsToKg=pounds*0.453592;
        meter=totMeter;
        kg=poundsToKg;

        bmi = kg/(meter*meter);

        System.out.println("Your BMI is "+bmi);
    }
}
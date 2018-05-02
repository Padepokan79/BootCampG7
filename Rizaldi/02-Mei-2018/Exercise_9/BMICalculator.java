/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 11:22 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BMICalculator{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        double meter, kg, bmi;

        System.out.print("Your height in meter :");
        meter = keyboard.nextDouble();

        System.out.print( "Your weight in kg: " );
        kg = keyboard.nextDouble();

        bmi = kg/(meter*meter);

        System.out.println("Your BMI is "+bmi);
    }
}
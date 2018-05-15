/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 04 May 2018 20:45 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BMICategories{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);

        Double bmi;

        System.out.print( "Enter Your BMI : " );
        bmi = keyboard.nextDouble();

        System.out.print("BMI category : ");
        if(bmi<15.0){
            System.out.println("very severely underweight");
        }
        else if(bmi<=16.0){
            System.out.println("severely underweight");
        }
        else if(bmi<18.5){
            System.out.println("underweight");
        }
        else if(bmi<25.0){
            System.out.println("normal weight");
        }
        else if(bmi<30.0){
            System.out.println("overweight");
        }
        else if(bmi<35.0){
            System.out.println("moderately obese");
        }
        else if(bmi<40.0){
            System.out.println("severely obese");
        }
        else{
            System.out.println("very severely /\"morbidly\"obese");
        }
    }
}
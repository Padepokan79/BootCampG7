/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 04 May 2018 21:10 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex19Drills2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);

        Double bmi, weight, height, heightInMeter;

        System.out.print( "Enter Your Weight : " );
        weight = keyboard.nextDouble();
        System.out.print( "Enter Your Height : " );
        height = keyboard.nextDouble();

        heightInMeter=height/100.0;
        bmi=(weight/(heightInMeter*heightInMeter));        

        System.out.println("Your BMI value is : "+bmi);

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
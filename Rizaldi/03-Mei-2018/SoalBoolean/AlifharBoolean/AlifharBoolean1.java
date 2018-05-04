/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 20:35
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class AlifharBoolean1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
                
        Double workSpeed, cute, age, expWork, minSpeed, minCute, minAge, minExp, maxSpeed, maxCute;
        Boolean partner;

        System.out.println("berapa skala anda dalam kecepatan bekerja  : ");        
        workSpeed=keyboard.nextDouble();                                        
        System.out.println("berapa skala anda dalam berpenampilan rapi : ");        
        cute=keyboard.nextDouble();                                        
        System.out.println("berapakah usia anda : ");        
        age=keyboard.nextDouble();                                        
        System.out.println("berapa tahunkah pengalaman anda : ");        
        expWork=keyboard.nextDouble();                                        
        
        minSpeed=8.0;
        maxSpeed=10.0;
        minCute=9.0;
        maxCute=10.0;
        minAge=30.0;
        minExp=3.0;

        partner=((workSpeed>=minSpeed&&workSpeed<=maxSpeed)&&(cute>=minCute&&cute<=maxCute)&&age>minAge&&expWork>=minExp);

        System.out.println("    ");                
        System.out.println("anda bisa menjadi partner bisnis = "+partner);           
    }
}
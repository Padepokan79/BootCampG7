/*
 * File           : Ex18Drills2.java
 * Project Name   : Exercise_18
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_18
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 9:29:04 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 9:32:41 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class Ex18Drills2{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int age, childAge, ageRatio;
        double income, cute;

        
        
        
        System.out.println("Enter your age : ");
        age=keyboard.nextInt();

        System.out.println("Enter your really income : ");
        income=keyboard.nextDouble();

        System.out.println("How cute are you, on a scale from 0.0 to 10.0 ? : ");
        cute=keyboard.nextDouble();

        childAge=25;
        ageRatio=age-childAge;

        if(age>=30 && income>=5000000.0){
            System.out.println("Kakek setuju ");    
        }else{
            System.out.println("Kakek tidak setuju ");    
        }

        if(age>20&&age<40 && (income>50000||cute>=8.0)){
            System.out.println("Nenek setuju ");    
        }else{
            System.out.println("Nenek tidak setuju ");    
        }

        if(ageRatio<=5 && (income>5000000||cute>=8.0)){
            System.out.println("Ayah setuju ");    
        }else{
            System.out.println("Ayah tidak setuju ");    
        }

        if((age>=17&& age<30) && income>=5000000.0 && cute>=8.0){
            System.out.println("Ibu setuju ");    
        }else{
            System.out.println("Ibu tidak setuju ");    
        }

        if(age==0 && income==0.0 && cute==0){
            System.out.println("Tidak setuju semua !!! ");    
        }        

    }
}
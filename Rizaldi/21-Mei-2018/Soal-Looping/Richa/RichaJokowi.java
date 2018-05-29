/*
 * File           : RichaJokowi.java
 * Project Name   : Richa
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Soal-Looping\Richa
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Sunday, 27th May 2018 2:18:47 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Sunday, 27th May 2018 2:18:50 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Random;
import java.util.Scanner;

public class RichaJokowi{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        String pangkat;
        double grade, salary, firstSalary, salaryInc, salaryMultBy2, age, year;
        
        System.out.println("============================================");
        System.out.println("Gaji Pak Jokowi ");
        System.out.println("============================================");
        
        firstSalary=1500000;
        salary=0;
        age=31;
        year=12;
        grade=1;
        salaryMultBy2=firstSalary*2;
        salaryInc=0;

        System.out.println("Umur Pak Jokowi :"+age);
        System.out.println("Gaji Pak Jokowi :"+firstSalary);
        System.out.println("============================================\n");    
        do{
            age++;
            grade++;

            if(grade==5){
                grade=0;
                pangkat="ya";
                firstSalary=firstSalary*2;
            }
            else{
                salaryInc=(1500000*5/100);
                firstSalary+=salaryInc;
                pangkat="tidak";
            }

            salary=firstSalary;
            System.out.println("Umur Pak Jokowi :"+age);
            System.out.println("Naik Pangktat   :"+pangkat);
            System.out.printf("Gaji Pak Jokowi : %.2f",salary);
            System.out.println("");
            System.out.println("============================================\n");    
            
        }while(age<56);
        

    }
}
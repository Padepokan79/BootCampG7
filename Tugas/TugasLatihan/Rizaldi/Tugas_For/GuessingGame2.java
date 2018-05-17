/*
 * File           : GuessingGame2.java
 * Project Name   : Tugas_For
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_For
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 2:58:29 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 2:58:33 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;
import java.util.Random;

public class GuessingGame2{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);        
        Random rand = new Random();
        
        int number, maxGuess, index, gues, cold, warm, hot;
        
        number=rand.nextInt(10)+1;
        maxGuess=3;
        cold=3;
        warm=2;
        hot=1;
        
        System.out.println("Enter a Guess : ");                            
        // System.out.println("Correct number is : "+number);                            
                
        
        for(index=1; index<=maxGuess; index++){ 
            gues=keyboard.nextInt();                 
            if(gues==number){
                System.out.println("CORRECT");                            
                index=index+maxGuess;
            }
            else{
                
                if((gues==(number+hot)||gues==(number-hot))&&index<maxGuess){
                    System.out.println("HOT");                            
                }
                else if((gues==(number+warm)||gues==(number-warm))&&index<maxGuess){
                    System.out.println("WARM");                            
                }
                else if(index<maxGuess){
                    System.out.println("COLD");                            
                }
                
            }
            
        }        
        System.out.println("Correct answer is : "+number);                            
        
    }
}
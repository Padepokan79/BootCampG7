/*
 * File           : GuessingGame1.java
 * Project Name   : Tugas_For
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas_For
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 2:40:09 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 2:40:12 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;
import java.util.Random;

public class GuessingGame1{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);        
        Random rand = new Random();
        
        int number, maxGuess, index, gues;
        
        number=rand.nextInt(10);
        maxGuess=3;
        
        
        System.out.println("Enter a Guess : ");                            
        System.out.println("Correct number is : "+number);                            
                
        
        for(index=1; index<=maxGuess; index++){ 
            gues=keyboard.nextInt();                 
            if(gues==number){
                System.out.println("CORRECT");                            
                index=index+3;
            }
            else{
                System.out.println("WRONG");                            
            }
        }        
        System.out.println("correct answer is : "+number);                            
        
    }
}
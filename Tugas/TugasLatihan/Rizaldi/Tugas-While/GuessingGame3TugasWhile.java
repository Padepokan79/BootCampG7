/*
 * File           : GuessingGame3TugasWhile.java
 * Project Name   : Tugas-While
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-While
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 17th May 2018 1:31:41 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Thursday, 17th May 2018 1:32:11 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;
import java.util.Random;

public class GuessingGame3TugasWhile{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);        
        Random rand = new Random();
        
        int number, maxGuess, index, gues, cold, warm, hot, round, indexRound, point;
        
        round=10;
        
        maxGuess=3;
        cold=3;
        warm=2;
        hot=1;
            ;// inisialisasi dikeluarkan=======================
        
        // System.out.println("Correct number is : "+number);                            

        indexRound=1;
        while(indexRound<=round){            
            number=rand.nextInt(10)+1;
            System.out.println("Round================================== "+indexRound);
            point=0;

            for(index=1; index<=maxGuess; index++){ 
                System.out.println("Enter a Guess : ");                                            
                gues=keyboard.nextInt();                 
                
                if(gues==number){                    
                    point=point+1;
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
            System.out.println("=========================================="); 
            System.out.println("Correct answer is : "+number); 
            System.out.println("you won "+point+" from round "+indexRound+" !!!"); 
            System.out.println("=========================================="); 
                                  
            indexRound=indexRound+1;
        }                                    
        // System.out.println("Correct answer is : "+number);                                    
        
    }
}


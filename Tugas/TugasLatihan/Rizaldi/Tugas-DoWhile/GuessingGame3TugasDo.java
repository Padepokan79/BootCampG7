/*
 * File           : GuessingGame3TugasDo.java
 * Project Name   : Tugas-DoWhile
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-DoWhile
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Friday, 18th May 2018 1:30:53 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Friday, 18th May 2018 1:32:02 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;
import java.util.Random;

public class GuessingGame3TugasDo{
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

            point=0;
        indexRound=1;
        do{            
            number=rand.nextInt(10)+1;
            System.out.println("Round================================== "+indexRound);
            index=1;

            do{                 
                System.out.println("Enter a Guess : ");                                            
                gues=keyboard.nextInt();                 
                
                if(gues==number){                    
                    point=point+1;
                    System.out.println("CORRECT");
                    System.out.println("you won === "+point);
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
            index++;
            indexRound=indexRound+1;
        }while( index<=maxGuess );        
            System.out.println("=========================================="); 
            System.out.println("Correct answer is : "+number); 
            System.out.println("you won "+point+" from round 10 !!!"); 
            System.out.println("=========================================="); 
                                  
            
        }while(indexRound<=round);                                    
            if(point>9){
                System.out.println("you are hacker "); 
            }
            else if(point>8){
                System.out.println("you are proffesional"); 
            }
            else if(point>7){
                System.out.println("you are advanced"); 
            }
            else{
                System.out.println("you are amateur"); 
            }
        // System.out.println("Correct answer is : "+number);                                    
        
    }
}


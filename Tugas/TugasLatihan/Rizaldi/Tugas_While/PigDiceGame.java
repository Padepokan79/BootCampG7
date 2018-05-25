/*
 * File           : PigDiceGame.java
 * Project Name   : Tugas-While
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-While
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 17th May 2018 1:27:51 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Thursday, 17th May 2018 1:27:53 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */



import java.util.Random;
import java.util.Scanner;

public class PigDiceGame{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        Random rand = new Random();
        
        int maxPoint, humanPoint, compPoint, point, diceHuman, diceComp,
        turnComp, tossComp, tossHuman, roundPoint;
        String isToss, toss;
        
        // System.out.println("masuk sini !!!");            

        point=0;
        diceComp=0;
        diceHuman=0;
        roundPoint=0;
        maxPoint=100;
        

        compPoint=0;
        humanPoint=0;        
        while(compPoint<maxPoint&&humanPoint<maxPoint){// batas lempar dadu jika ada pemain capai 100 point
            tossComp=0;
            for(turnComp=0; turnComp<3; turnComp++){// comp turn first
                tossComp=rand.nextInt(6)+1;
                System.out.println("angka dadu komputer : "+tossComp);
                compPoint+=tossComp;
            }            
            System.out.println("======================================================");
                    
                                    
            while(tossHuman!=1&&humanPoint<maxPoint&&toss.equals("y")&&compPoint<maxPoint){
                tossHuman=rand.nextInt(6)+1;    
                humanPoint+=tossHuman;
                System.out.println("angka dadu anda -----------------------> "+tossHuman);

                System.out.print("lempar dadu ? ");
                toss=keyboard.next();                
                if(toss.equals("y")){
                    tossHuman=rand.nextInt(6)+1;
                    System.out.println("angka dadu anda -----------------------> "+tossHuman);                    
                    humanPoint+=tossHuman;                                       
                }else{
                    toss="t";
                }

                
                // roundPoint=humanPoint;
                        
                System.out.println("--> Point komputer  = "+compPoint);
                System.out.println("--> Point anda      = "+humanPoint);
                if(tossHuman==1){
                        
                            // humanPoint=0;
                            System.out.println("angka dadu anda -----------------------> "+tossHuman+" , sial !!!");
                            System.out.println("point ronde ini hangus !!!");
                }
            }
                   
        }
        if(compPoint>=maxPoint&&humanPoint<maxPoint){
            System.out.println("=====================>COMPUTER WIN !!!");
        }
        else{
            System.out.println("=====================>KAMU MENANG !!!");
        }
    }
}
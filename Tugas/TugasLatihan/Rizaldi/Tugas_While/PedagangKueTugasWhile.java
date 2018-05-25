/*
 * File           : PedagangKueTugasWhile.java
 * Project Name   : Tugas-While
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi\Tugas-While
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Thursday, 17th May 2018 12:51:19 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Thursday, 17th May 2018 12:51:56 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class PedagangKueTugasWhile{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        int n, timeLimit, minutToHour, hour, minute, minuteLimit, hourLimit, qtyCake, cake;        

        System.out.println("Kue yang tersisa : ");            
        
        n=0;
        cake=200;
        minute=60;        
        hourLimit=8;
        minuteLimit=30;
        minutToHour=hourLimit*minute;

        timeLimit=minutToHour+minuteLimit;
        timeLimit=timeLimit/15;

        while(n<=timeLimit)
        {
            cake=cake-3;
            n=n+1;
        }
        System.out.print(cake);


        // for(n=0; n<=timeLimit; n++){ // 1 ~ 100
        // cake=cake-3;                                                                   
        // }        
        // System.out.print(cake);                            
    }
}
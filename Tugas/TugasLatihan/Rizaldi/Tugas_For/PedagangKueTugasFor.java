/*
 * File           : PedagangKueTugasFor.java
 * Project Name   : Rizaldi
 * Project Path   : d:\xampp\htdocs\BootCampG7\Tugas\TugasLatihan\Rizaldi
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 11:40:24 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 11:40:29 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */



import java.util.Scanner;

public class PedagangKueTugasFor{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        int n, timeLimit, minutToHour, hour, minute, minuteLimit, hourLimit, qtyCake, cake;        

        System.out.println("Kue yang tersisa : ");            
        
        cake=200;
        minute=60;        
        hourLimit=8;
        minuteLimit=30;
        minutToHour=hourLimit*minute;

        timeLimit=minutToHour+minuteLimit;
        timeLimit=timeLimit/15;



        for(n=0; n<=timeLimit; n++){ // 1 ~ 100
        cake=cake-3;                                                                   
        }        
        System.out.print(cake);                            
    }
}
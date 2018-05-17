/*
 * File           : CountingFor.java
 * Project Name   : Exercise_44
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\16-Mei-2018\Exercise_44
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 11:32:55 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 11:33:04 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */



import java.util.Scanner;

public class CountingFor{
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        
        int n;
        String message;

        System.out.println("Enter a message and ill display it five times.");
        System.out.print("Message :");
        message=keyboard.nextLine();

        for(n=1; n<=5; n++){
            System.out.println(n+". "+message);
        }

        System.out.println("\nNow ill show it ten times  and count by 5s.");
        for(n=5; n<=50; n+=5){
            System.out.println(n+". "+message);
        }

        System.out.println("\nFinally, three times counting backward.");
        for(n=3; n>0; n-=1){
            System.out.println(n+". "+message);
        }        
    }
}
/*
 * File           : GenderTiles.java
 * Project Name   : Exercise_21
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_21
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 11:45:36 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 11:45:40 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class GenderTiles{
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        String title;

        System.out.print("First name :");
        String first=keyboard.next();
        System.out.print("Last name :");
        String last=keyboard.next();
        System.out.print("Gender (M/F) :");
        String gender=keyboard.next();
        System.out.print("Age :");
        int age=keyboard.nextInt();

        if(age<20){
            title=first;
        }
        else{
            if(gender.equals("F")){
                System.out.print("Are you maried, "+first+" ? (Y/N) : ");
                String maried=keyboard.next();
                if(married.equals("Y")){
                    title="Mrs.";
                }
                else{
                    title="Ms";
                }            
            System.out.println( "\n" + title + " " + last );
            
        }        

    }
}
/*
 * File           : ComparingNumbers.java
 * Project Name   : Exercise_16
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_16
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 8:52:57 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 8:53:10 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */





import java.util.Scanner;

public class ComparingNumbers{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);

        double first, second;

        System.out.print("Give me two numbers. First : ");
        first=keyboard.nextDouble();
        System.out.print("Second : ");
        second=keyboard.nextDouble();

        if(first<second){
            System.out.println(first+" is Less THAN "+second);
        }
        if(first<=second){
            System.out.println(first+" is  LESS THAN/EQUAL TO "+second);
        }
        if(first==second){
            System.out.println(first+" is EQUAL TO "+second);
        }
        if(first>=second){
            System.out.println(first+" is GREATER THAN/EQUAL TO "+second);
        }
        if(first>second){
            System.out.println(first+" is GREATER THAN "+second);            
        }
        if(first!=second){
            System.out.println(first+" is NOT EQUAL TO "+second);
        }
    }
}
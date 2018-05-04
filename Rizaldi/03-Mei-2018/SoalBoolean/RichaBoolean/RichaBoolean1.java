/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 03 May 2018 15:03 AM
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class RichaBoolean1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyLine = new Scanner(System.in);
        
        String name;
        Double budget, minBudget, freeDay, minDay;

        boolean holiday;
        

        
        System.out.println("=====================WELCOME TO TRAVEL CHOICE CLUB=====================");
        System.out.println("Are you able to go to lombok this week? please fill our form below!    ");
        System.out.println("                                                                       ");
        System.out.println("What's your name?");
        name=keyboard.next();
        System.out.println("How much budget do you have, "+name+" (in dollar)");
        budget=keyboard.nextDouble();
        System.out.println("Enter available date you have! (you may only choose 1 day, in number)");
        freeDay=keyboard.nextDouble();
        System.out.println("=======================================================================");
        
        minBudget=520.0;
        minDay=5.0;
        holiday=(budget>minBudget&&freeDay<=minDay);
        
        System.out.println("This is your result, "+name+"....");        
        System.out.println("Are you allowed go to lombok ? "+holiday);        
        

    }
}
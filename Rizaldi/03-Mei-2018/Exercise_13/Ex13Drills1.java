/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 02 May 2018 20:15 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex13Drills1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);
        String word;
        Boolean yep, nope;
        
        System.out.println("Type the word \"weasel\", please.");
        word=keyboard.next();

        yep="weasel".equals(word); // IT IS STILL WORK EVEN THE POSITION WAS CHANGING.
        nope= !word.equals("weasel");

        System.out.println("You typed what was requested : "+yep);
        System.out.println("You ignored polite instructions : "+nope);

    }
}
/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 04 May 2018 20:45 AM     
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex18Drills1{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);

        String secret, secret1, guess;

        System.out.print( "What's the secret word? " );
        guess = keyboard.next();

        secret = "please";
        secret1 = "qwerty";

        if ( guess.equals(secret)||guess.equals(secret1)) {
        System.out.println( "That's correct!" );
        }
        else {
        System.out.println( "No, the secret word isn't \"" + guess + "\"." );
        }

        if ( guess == secret ) {
        System.out.println( "(This will never ever show, no matter what.)" );
        }       
    }
}
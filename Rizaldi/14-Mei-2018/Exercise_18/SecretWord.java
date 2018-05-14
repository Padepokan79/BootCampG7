/*
 * File           : SecretWord.java
 * Project Name   : Exercise_18
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\14-Mei-2018\Exercise_18
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 14th May 2018 9:19:56 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 14th May 2018 9:20:08 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */





import java.util.Scanner;

public class SecretWord{
    public static void main( String[] args){
        Scanner keyboard = new Scanner(System.in);

        String secret, secret1, guess;

        System.out.print( "What's the secret word? " );
        guess = keyboard.next();

        secret = "please";

        if ( guess.equals(secret)) {
        System.out.println( "That's correct!" );
        }
        else {
        System.out.println( "No, the secret word isn't \"" + guess + "\"." );
        }

        if ( guess == secret ) {
        System.out.println( "(This will never ever show, no matter what.)" );
        }       

        // untuk data string harus pakai format (.equals)
    }
}
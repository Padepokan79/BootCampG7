/*
 * File           : Ex49Drills2.java
 * Project Name   : Exercise_49
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Exercise_49
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 1:48:24 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 1:48:29 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

public class Ex49Drills2 {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
        int toFind;
        Boolean cek=false;

        System.out.print("There are " + orderNumbers.length);
        System.out.println(" orders in the database.");

        System.out.print("Orders: ");

        for ( int num : orderNumbers ) {
            System.out.print( num + " " );
        }
        System.out.println();

        System.out.print("Which order to find? ");
        toFind = keyboard.nextInt();

        for ( int num : orderNumbers ) {
            if ( num == toFind ) {
                System.out.println( num + " found.");
                cek=true;    
            }
        }
            if(cek==false){
                    System.out.println(+toFind+" is Not found.");
            }
    }
}
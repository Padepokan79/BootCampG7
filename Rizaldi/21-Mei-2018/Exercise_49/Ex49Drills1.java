/*
 * File           : Ex49Drills1.java
 * Project Name   : Exercise_49
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Exercise_49
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 1:52:14 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 1:52:17 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */





import java.util.Scanner;

public class Ex49Drills1 {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
            int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
            int toFind, num; // tidak bisa di deklarasikan di atas untuk penggunaan for each

            System.out.print("There are " + orderNumbers.length);
            System.out.println(" orders in the database.");

            System.out.print("Orders: ");

            for ( num : orderNumbers ) {
                System.out.print( num + " " );
            }
            System.out.println();

            System.out.print("Which order to find? ");
            toFind = keyboard.nextInt();

            for ( num : orderNumbers ) {
            if ( num == toFind ) {
                System.out.println( num + " found.");
            }            
        }
    }
}
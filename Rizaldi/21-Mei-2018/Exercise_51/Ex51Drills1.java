/*
 * File           : Ex51Drills1.java
 * Project Name   : Exercise_51
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\21-Mei-2018\Exercise_51
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Monday, 21st May 2018 2:25:56 pm
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Monday, 21st May 2018 2:26:10 pm
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




public class Ex51Drills1{
    public static void main( String[] args ) {
        int[] arr = new int[1000];

        // We almost always use a for loop to access each slot of an array.
        for ( int i=0 ; i < arr.length ; i++ ) {
        arr[i] = 1 + (int)(Math.random()*100);
        }

        // Displaying all the values in an array usually looks like this

        System.out.print("Values: ");
        for ( int i=0 ; i < arr.length ; i++ ) {
        System.out.print(arr[i] + " ");
        }
        System.out.println();

        //////////////////////////////////////
        // But let's break this down step-by-step...
        // Put a number into each slot of the array, one at a time.
        arr[0] = 6;
        arr[1] = 7;
        arr[2] = 8;
        // Then display the values in those slots, one at a time.
        System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);

        //////////////////////////////////////
        // Put a random number 1-100 into each slot of the array, one at a time.
        arr[0] = 1 + (int)(Math.random()*100);
        arr[1] = 1 + (int)(Math.random()*100);
        arr[2] = 1 + (int)(Math.random()*100);
        // Display them again, one at a time.
        System.out.println("Values: " + arr[0] + " " + arr[1] + " " + arr[2]);
        //////////////////////////////////////
        // This is a bit silly, but try to understand it.
        int m = 0;
        arr[m] = 1 + (int)(Math.random()*100);
        m = 1;
        arr[m] = 1 + (int)(Math.random()*100);
        m = 2;
        arr[m] = 1 + (int)(Math.random()*100);
        // Display them again.
        System.out.print("Values: ");
        m = 0;
        System.out.print(arr[m] + " ");
        m = 1;
        System.out.print(arr[m] + " ");
        m = 2;
        System.out.print(arr[m] + " ");

        System.out.println();

        //////////////////////////////////////
        // This is even more silly but it works.
        int n = 0;
        arr[n] = 1 + (int)(Math.random()*100);
        n++;
        arr[n] = 1 + (int)(Math.random()*100);
        n++;
        arr[n] = 1 + (int)(Math.random()*100);
        n++;
        // Display them again.
        System.out.print("Values: ");
        n = 0;
        System.out.print(arr[n] + " ");
        n++;
        System.out.print(arr[n] + " ");
        n++;
        System.out.print(arr[n] + " ");
        n++;
        System.out.println();
        //////////////////////////////////////
        // Now does using a loop make more sense?
        for ( int q=0 ; q < arr.length ; q++ ) {
        arr[q] = 1 + (int)(Math.random()*100);
        }
        // I hope so. If not, read through this code again more slowly.
        System.out.print("Values: ");
        for ( int q=0 ; q < arr.length ; q++ ) {
        System.out.print(arr[q] + " ");
        }
    System.out.println();
    }
}
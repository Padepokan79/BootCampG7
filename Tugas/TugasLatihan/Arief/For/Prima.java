/*
Date Created	: 17 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class Prima{
    public static void main( String[] args){
        Scanner inputKey = new Scanner(System.in);
        
        int number, index, temp;    
        Boolean isPrime;

        System.out.println("Batas : ");
        number = inputKey.nextInt();

        for (index = 2; index <= number; index++ ) {
            isPrime = true;

            for (temp = 2; temp < index; temp++ ) {
                if(index % temp == 0){
                    isPrime = false;
                }
            }

            if (isPrime == true){
            System.out.print(index + " ");
            }
        }

    }
}
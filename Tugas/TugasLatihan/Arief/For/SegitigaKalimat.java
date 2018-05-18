/*
Date Created	: 17 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class SegitigaKalimat {
    public static void main( String[] args){
        Scanner inputKey = new Scanner(System.in);

        int wordLength = 0, row, space, column, limit;
        String word;

        System.out.print("Input Kalimat: ");
        word = inputKey.nextLine();

        System.out.print("Input batas: ");
        limit = inputKey.nextInt();


        for (row = 1; row <= limit; row++) {
            for (space = row; space <= word.length(); space++) {
                System.out.print(" ");
            }  
            for (column = 0; column <= (row * 2) - 2; column+=2) {
                if (wordLength<word.length()) {
                    System.out.print(word.substring(wordLength,wordLength+1)); // charAt : sebagai pemecah variable word
                    System.out.print(" ");
                    wordLength++;
                }
            }
            System.out.println();
        }
    }
}
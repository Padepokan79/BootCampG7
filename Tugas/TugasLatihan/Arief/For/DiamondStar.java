/*
Date Created	: 17 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class DiamondStar {
    public static void main( String[] args){
        Scanner inputKey = new Scanner(System.in);

        int x, row, space, limit, index;
        String kalimat;

        for (index = 0; index < 1; ) {
        System.out.print("Input batas: ");
        limit = inputKey.nextInt();

            if (limit%2==1) {
                for (row = 0; row < limit/2+1; row++) {
                    for (space = 0; space < limit/2-row; space++) {
                        System.out.print(" ");
                    }
                    for (space = 0; space < 2*row+1; space++) {
                        if (row == 0 || space == 0 || space == 2*row) {
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                for (row = limit/2-1; row >= 0; row--) {
                    for (space = 0; space < limit/2-row; space++) {
                        System.out.print(" ");
                    }
                    for (space = 0; space < 2*row+1; space++) {
                        if (row == 0 || space == 0 || space == 2*row) {
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                index=1;
            }else {
                System.out.println("Angka gak boleh genap");
                index=0;
            }

        }

    }
}
/*
	Created By Vikri
	17/05/2018
	5:23
*/
import java.util.Scanner;
public class Tugas3{
	public static void main(String [] args){
        int j, i;
        System.out.println();
        for (i = 0; i < 9/2+1; i++) {
            for (j = 0; j < 9/2-i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2*i+1; j++) {
                if (i == 0 || j == 0 || j == 2*i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (i = 9/2-1; i >= 0; i--) {
            for (j = 0; j < 9/2-i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2*i+1; j++) {
                if (i == 0 || j == 0 || j == 2*i) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
	Created By Vikri
	17/05/2018
	3:37
*/
import java.util.Scanner;
public class Tugas1{
	 public static void main(String[] args) {
        int bilangan, pembagi, batas;
        Scanner input = new Scanner(System.in);

        System.out.print("Batas: ");
        batas=input.nextInt();

        for (bilangan = 1; bilangan <= batas; bilangan++) {
            int x = 0;
            for (pembagi = 2; pembagi <= bilangan; pembagi++) {
 
                if (bilangan % pembagi == 0) {
                    if (bilangan != pembagi) {
                        x = 1;
                    }
                    if (x != 1 && bilangan == pembagi) {
                        System.out.print(bilangan+" ");
                    }
                }
            }
        }
 
    }
}
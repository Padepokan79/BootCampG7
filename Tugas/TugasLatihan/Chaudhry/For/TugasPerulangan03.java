/*
	DATE CREATED : 16 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class TugasPerulangan03{
	public static void main(String[] args){
		
		for (int i = 0; i < 9/2+1; i++) {
			for (int j = 0; j < 9/2-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				if (i == 0 || j == 0 || j == 2*i) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 9/2-1; i >= 0; i--) {
			for (int j = 0; j < 9/2-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
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
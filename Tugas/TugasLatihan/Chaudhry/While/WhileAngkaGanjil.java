/*
	DATE CREATED : 17 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class WhileAngkaGanjil{
	public static void main(String[] args){
		int kelipatan = 4, seribu = 1000, hasil = 1;

		while (hasil >= 1 && hasil <= 1000) {
			if (hasil%2 == 1 || hasil%kelipatan == 0) {
				System.out.print(hasil+" ");
			}
			hasil = hasil + 1;
		}


	}
}
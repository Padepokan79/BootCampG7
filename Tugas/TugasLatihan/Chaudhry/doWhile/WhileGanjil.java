/*
	DATE CREATED : 18 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class WhileGanjil{
	public static void main(String[] args){
		int kelipatan = 4, seribu = 1000, hasil = 1;

		do{
			if (hasil%2 == 1 || hasil%kelipatan == 0) {
				System.out.print(hasil+" ");
			}
			hasil += 1;
		}while(hasil >= 1 && hasil <= 1000);
		

	}
}
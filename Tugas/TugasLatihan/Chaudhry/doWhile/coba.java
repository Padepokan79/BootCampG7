/*
	DATE CREATED : 18 MEI 2018
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;
public class coba{
	public static void main(String[] args){
		Random r = new Random();
		char huruf = (char) (r.nextInt(26)+'A');
		System.out.print("Huruf "+huruf);
	}
}
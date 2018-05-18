/*
	* Created by:	Alifhar Juliansyah
	* 				17-05-2018	12.56
	* Updated by:
	*
*/
import java.util.Scanner;

public class TugasWhile1{
	public static void main(String[] args) {
		System.out.println("Angka ganjil dan angka kelipatan 4");
		int i=1;
		while(i<=1000){
			if(i%4==0 || i%2==1)
				System.out.print(i+"\t");
			i++;
		}
	}
}
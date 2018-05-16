/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	11.39
	* Updated by:
	*
*/
import java.util.Scanner;

public class TugasFor1{
	public static void main(String[] args) {
		System.out.println("Angka ganjil dan angka kelipatan 3");
		for(int i=1;i<=1000;i++)
			if(i%4==0 || i%2==1)
				System.out.print(i+"\t");
	}
}
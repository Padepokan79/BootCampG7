/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	15.11
	* Updated by:
	*
*/

import java.util.Scanner;

public class BoolRizaldi1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int a,b,c,d,e,f,g,h;
		boolean lulus;

		System.out.print("\nNilai Mata Kuliah A: ");
		a=keyboard.nextInt();
		System.out.print("Nilai Mata Kuliah B: ");
		b=keyboard.nextInt();
		System.out.print("Nilai Mata Kuliah C: ");
		c=keyboard.nextInt();
		System.out.print("Nilai Mata Kuliah D: ");
		d=keyboard.nextInt();
		System.out.print("Nilai Mata Kuliah E: ");
		e=keyboard.nextInt();
		System.out.print("Nilai Mata Kuliah F: ");
		f=keyboard.nextInt();
		System.out.print("Nilai Mata Kuliah G: ");
		g=keyboard.nextInt();
		System.out.print("Nilai Mata Kuliah H: ");
		h=keyboard.nextInt();
		
		lulus=( a>=7 && c>=7 && d>=7 && e>=7 && ( (b>=7 && f>=7) || (b>=7 && g>=7) || (b>=7 && h>=7) || (f>=7 && g>=7) || (f>=7 && g>=7) || (g>=7 && h>=7) ) );

		System.out.println("Anda dinyatakan lulus "+lulus);
	}
}
/*
 * File           : AlifharSoalIf3.java
 * Project Name   : Alifhar
 * Project Path   : d:\xampp\htdocs\BootCampG7\Rizaldi\15-Mei-2018\Soal-If\Alifhar
 * ---------------
 * Author         : Rizaldi R_Nensia
 * Email          : rizaldi.95@gmail.com
 * File Created   : Wednesday, 16th May 2018 8:43:35 am
 * ---------------
 * Modified By    : Rizaldi R_Nensia
 * Last Modified  : Wednesday, 16th May 2018 8:43:39 am
 * ---------------
 * Copyright Rizaldi R_Nensia - >R<
 */




import java.util.Scanner;

	public class AlifharSoalIf3 {
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);

			double a, b, c, x1, x2, square;

			System.out.println("masukan angka a,b,c jika ax^2 + bx + c");
			System.out.print("a = ");
			a = keyboard.nextDouble();
			System.out.print("b = ");
			b = keyboard.nextDouble();
			System.out.print("c = ");
			c = keyboard.nextDouble();

			square = Math.sqrt(b*b-4*a*c);
			x1 = ((-b) + square) / (2*a);
			x2 = ((-b) - square) / (2*a);


			if ((b*b-4*a*c)==0){
				System.out.println("akar kembar, dengan: ");
				System.out.println("X= "+x1);
			}
			else if((b*b-4*a*c) > 0){
				System.out.println("akar berbeda, dengan: ");
				System.out.println("X1= "+x1+" ,X2= "+x2);
			}
			else if((b*b-4*a*c) > 0){
				System.out.println("akar imajiner, dengan: ");
				System.out.println("X1= "+x1+" ,X2= "+x2);
			}else{
				System.out.println("Not Defined !!!");
			}
		}
	}
/*
	DATE CREATED 	: 15 MEI 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
public class Alifhar02{
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		int a, b, c, d, four, two, one, nol;
		double x1, x2;
		nol = 0;
		four = 4;
		two = 2;
		one = 1;
		
		System.out.println("====================================");
		System.out.print("Nilai a: ");
		a 	= key.nextInt();
		System.out.print("Nilai b: ");
		b 	= key.nextInt();
		System.out.print("Nilai c: ");
		c 	= key.nextInt();
		System.out.println("");
		
		if (a == one || a == -one) {
			if (a < nol) {
				System.out.print("Persamaan kuadrat adalah -x^2 " );
			}else{
				System.out.print("Persamaan kuadrat adalah x^2 " );
			}
		}else{
			System.out.print("Persamaan kuadrat adalah "+a+"x^2 " );
		}
		

		if (b == one || b == -one) {
			if (b < nol) {
				System.out.print("- x " );
			}else if (b > nol) {
				System.out.print("+ x " );
			}	
		}else{
			if (b < nol) {
				System.out.print("- "+(-b)+"x " );
			}else if (b > nol) {
				System.out.print("+ "+b+"x " );
			}
		}


		if (c < nol) {
			System.out.println("- "+(-c)+" = 0" );
		}else if (c > nol) {
			System.out.println("+ "+c+" = 0" );
		}
		else{
			System.out.println(" = 0");
		}
		System.out.println("====================================");

		d = (b*b) - four*a*c;
		if (d == nol) {
			System.out.println("Maka didapatkan akar-akar dari persamaan tersebut adalah: Akar Kembar");	
			 x1 = (-b + Math.sqrt(d)) / (two * a);
			 x2 = (-b - Math.sqrt(d)) / (two * a);
			 System.out.println("x1 = " + x2 + " dan x2 = " + x1);
		}else if (d < nol) {
			System.out.println("Maka didapatkan akar-akar dari persamaan tersebut adalah: Akar Imajiner");	
		}else{
			System.out.println("Maka didapatkan akar-akar dari persamaan tersebut adalah: Akar Berbeda");	
			 x1 = (-b + Math.sqrt(d)) / (two * a);
			 x2 = (-b - Math.sqrt(d)) / (two * a);
			 System.out.println("x1 = " + x2 + " dan x2 = " + x1);
		}

		 
	}
}
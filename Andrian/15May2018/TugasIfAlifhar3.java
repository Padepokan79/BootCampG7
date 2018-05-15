/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfAlifhar3 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double a, b, c, x1, x2, square;

			System.out.println("masukan angka a,b,c dimana ax^2 + bx + c");
			System.out.print("a = ");
			a = key.nextDouble();
			System.out.print("b = ");
			b = key.nextDouble();
			System.out.print("c = ");
			c = key.nextDouble();

			square = Math.sqrt(b*b-4*a*c);
			x1 = ((-b) + square) / (2*a);
			x2 = ((-b) - square) / (2*a);


			if ((b*b-4*a*c)==0) {
				System.out.println("akar kembar, dengan: ");
				System.out.println("X= "+x1);
			}
			else if ((b*b-4*a*c) > 0) {
				System.out.println("akar beda, dengan: ");
				System.out.println("X1= "+x1+" ,X2= "+x2);
			}
			else if ((b*b-4*a*c) > 0) {
				System.out.println("akar imajiner, dengan: ");
				System.out.println("X1= "+x1+" ,X2= "+x2);
			}
		}
	}
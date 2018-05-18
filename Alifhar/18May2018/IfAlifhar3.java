/*
	* Created by:	Alifhar Juliansyah
	* 				17-05-2018	13.46
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfAlifhar3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		double x1, x2, det;
		String stat;

		System.out.println("====================================================");
		System.out.print("nilai a: ");
		a=scan.nextInt();
		System.out.print("nilai b: ");
		b=scan.nextInt();
		System.out.print("nilai c: ");
		c=scan.nextInt();

		det=b*b-4*a*c;
		x1=(-b+Math.sqrt(det))/(2*a);
		x2=(-b-Math.sqrt(det))/(2*a);

		if(det>0)
			stat="akar berbeda";
		else if(det==0)
			stat="akar sama";
		else
			stat="akar imajiner";

		System.out.println("\nPersamaan kuadratnya adalah "+a+"x^2 + ("+b+")x + "+(c)+" = 0");
		System.out.println("====================================================");
		System.out.println("Maka didapatkan akar akar dari persamaan adalah");
		System.out.println(stat+", dengan");
		System.out.println("x1 = "+x1+" dan x2 = "+x2);
		System.out.println("====================================================");
	}
}
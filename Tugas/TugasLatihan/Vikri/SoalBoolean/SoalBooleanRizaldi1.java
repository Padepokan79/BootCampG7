/*
	Created By Vikei
	13/05/2018
	19:35
*/
import java.util.Scanner;
public class SoalBooleanRizaldi1{
	public static void main(String[] args) {
		boolean lulus, minLulus, req1, req2, req3, req4, req5, req6, req7, req8;
		double a,b,c,d,e,f,g,h;

		Scanner input = new Scanner(System.in);

		System.out.print("Nilai A: ");
		a = input.nextDouble();

		System.out.print("Nilai B: ");
		b = input.nextDouble();

		System.out.print("Nilai C: ");
		c = input.nextDouble();

		System.out.print("Nilai D: ");
		d = input.nextDouble();

		System.out.print("Nilai E: ");
		e = input.nextDouble();

		System.out.print("Nilai F: ");
		f = input.nextDouble();

		System.out.print("Nilai G: ");
		g = input.nextDouble();

		System.out.print("Nilai H: ");
		h = input.nextDouble();

		req1 = (a >= 7 && a <= 10);
		req2 = (b >= 7 && b <= 10);
		req3 = (c >= 7 && c <= 10);
		req4 = (d >= 7 && d <= 10);
		req5 = (e >= 7 && e <= 10);
		req6 = (f >= 7 && f <= 10);
		req7 = (g >= 7 && g <= 10);
		req8 = (h >= 7 && h <= 10);

		minLulus = req3 && req4 && req5 && req1;
		lulus = minLulus&&(req1||req2||req3||req4||req5||req6||req7||req8);
		System.out.print("lulus ga?" +lulus);
	}
}
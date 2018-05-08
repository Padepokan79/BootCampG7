/* 
Created by  		: Richa Fitria
Date/hour			: 3 Mei 2018/ 10.52 PM
Updated by			:
Updated Date/hour	:

*/


import java.util.Scanner;

public class RizaldiBoolean1 {
	public static void main  (String[] args) {
		Scanner keyboard = new Scanner (System.in);

		double a,b,c,d,e,f,g,h;
		boolean lulus;

		System.out.println ("Universitas Gajah Duduk");

		System.out.print ("Nilai matakuliah A: ");
		a= keyboard.nextDouble ();

		System.out.print ("Nilai matakuliah B: ");
		b= keyboard.nextDouble ();

		System.out.print ("Nilai matakuliah C: ");
		c= keyboard.nextDouble ();

		System.out.print ("Nilai matakuliah D: ");
		d= keyboard.nextDouble ();

		System.out.print ("Nilai matakuliah E: ");
		e= keyboard.nextDouble ();

		System.out.print ("Nilai matakuliah F: ");
		f= keyboard.nextDouble ();

		System.out.print ("Nilai matakuliah G: ");
		g= keyboard.nextDouble ();

		System.out.print ("Nilai matakuliah H: ");
		h= keyboard.nextDouble ();


		lulus = (a >= 7 && c >= 7 && d >= 7 && e >= 7) && (((b >= 7 || f >=7) && (g >= 7  || h >=7)) || ((b >= 7 || h >=7) && (g >= 7  || h >=7))) ;

		System.out.println ("Saya lulus? " + lulus);
	}
}


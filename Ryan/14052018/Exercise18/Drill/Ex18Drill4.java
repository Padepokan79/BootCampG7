/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 Mei 2018 10:34 
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex18Drill4 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int bis1, bis2, bis3, bis4, bis5, bisE, jmlPenumpang;

		bis1 = 60;
		bis2 = 45;
		bis3 = 32;
		bis4 = 18;
		bis5 = 12;
		bisE = 6;

		System.out.println("===== Welcome To Ikan Travel =====");
		System.out.print("\nMasukan Jumlah Penumpang : ");
		jmlPenumpang = keyboard.nextInt();
		System.out.println("Bis Yang tersedia :");

		if (jmlPenumpang >= bis1) {
			System.out.println("Bis Dengan Kursi : "+bis1);
		}
		if (jmlPenumpang >= bis2){
			System.out.println("Bis Dengan Kursi : "+bis2);
		}
		if (jmlPenumpang >= bis3){
			System.out.println("Bis Dengan Kursi : "+bis3);
		}
		if (jmlPenumpang >= bis4){
			System.out.println("Bis Dengan Kursi : "+bis4);
		}
		if (jmlPenumpang >= bis5){
			System.out.println("Bis Dengan Kursi : "+bis5);
		}
		if (jmlPenumpang >= bisE || jmlPenumpang <= bisE) {
			System.out.println("Bis Dengan Kursi : "+bisE);
		}
	}
}
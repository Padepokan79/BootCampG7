/*
	* Created by:	Alifhar Juliansyah
	* 				20-05-2018	22.59
	* Updated by:
	*
*/
import java.util.Scanner;
public class LoopRicha{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int now=56, age, before=25;
		double salary=1500000;
		String raise;

		System.out.println("=====================");
		System.out.println("   Gaji Pak Jokowi");
		System.out.println("=====================");

		age=now-before;
		System.out.println("\nUmur: " + age + " tahun");
		System.out.println("Naik pangkat? Tidak");
		System.out.printf("gaji : %.0f \n", salary);
		age++;
		System.out.println("\n----------------------");


		while (age <= now) {
			System.out.println("\nUmur: " + age + " tahun");
			System.out.print("Naik pangkat?");			

			if (age%5==0) {
				System.out.println(" (y/n)");
				raise = scan.next();
				if (raise.equals("y")) {
					salary=salary*2;
					System.out.printf("gaji : %.0f \n", salary);
				}
			}else {
				System.out.println(" Tidak");
				salary+=salary*0.05;
				System.out.printf("gaji : %.0f \n", salary);
			}
			age++;
			System.out.println("\n----------------------");
		}

	}
}
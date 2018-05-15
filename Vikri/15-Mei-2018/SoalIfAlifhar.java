/*
	Created By Vikri
	15/05/2017
	8:27
*/
import java.util.Scanner;
public class SoalIfAlifhar{
	public static void main(String[] args) {
		double bilangan, ganjilGenap, bulat;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Bilangan: ");
		bilangan = input.nextDouble();

		ganjilGenap = bilangan%2;
		bulat = bilangan%1;

		System.out.println("\nBilangan Tersebut adalah: ");
		if (bilangan<0) {
			if (ganjilGenap==0) {
				if (bulat==0) {
					System.out.println("Bilangan bulat Genap Negatif");	
				} else {
					System.out.println("Bilangan rill Genap Negatif");
				}
			} else{
				if (bulat==0) {
					System.out.println("Bilangan bulat Ganjil Negatif");	
				} else {
					System.out.println("Bilangan rill Ganjil Negatif");
				}
			}
		} else if (bilangan>=0) {
			if (ganjilGenap==0) {
				if (bulat==0) {
					System.out.println("Bilangan bulat Genap Positif");	
				} else {
					System.out.println("Bilangan rill Genap Positif");
				}
			} else if(ganjilGenap<=1){
				if (bulat==0) {
					System.out.println("Bilangan bulat Ganjil Positif");	
				} else {
					System.out.println("Bilangan rill Ganjil Positif");
				}
			}
		}
	}
}
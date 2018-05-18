/*
Date Created	: 16 May 2016
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Ryan01{
	public static void main(String[] args){
		Scanner inputKey = new Scanner(System.in);
		double jarak, speed1, speed2, speed3, gas1, gas2, gas3, jam1, jam2, jam3, liter1, liter2, liter3;
		String hemat, cepat;

		speed1 = 30;
		speed2 = 35;
		speed3 = 45;
		gas1 = 15;
		gas2 = 10;
		gas3 = 20;

		System.out.print("Jarak tempuh (dalam km) : ");
		jarak = inputKey.nextDouble();
		System.out.println("Mobil rekomendasi : ");

		jam1 = jarak / speed1;
		jam2 = jarak / speed2;
		jam3 = jarak / speed3;
		liter1 = jarak / gas1;
		liter2 = jarak / gas2;
		liter3 = jarak / gas3;

		
		if(jam1 < jam2){
			cepat = "mobil 1";
			if(jam3 < jam1){
				cepat = "mobil 3";
			}
		}else{
			cepat = "mobil 2";
			if(jam3 < jam2){
				cepat = "mobil 3";
			}
		}

		if(liter1 < liter2){
			hemat = "mobil 1";
			if(liter3 < liter1){
				hemat = "mobil 3";
			}
		}else{
			hemat = "mobil 2";
			if(liter3 < liter2){
				hemat ="mobil 3";
			}
		}

		System.out.println("Rekomendasi mobil paling cepat: " + cepat);
		System.out.println("Rekomendasi mobil paling hemat: " + hemat);

	}
}
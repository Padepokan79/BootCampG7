/*
	* Created by:	Alifhar Juliansyah
	* 				16-05-2018	09.25
	* Updated by:
	*
*/
import java.util.Scanner;

public class IfRyan1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String cepat, hemat;
		double kmph1=30, kmph2=35, kmph3=45, fuel1=15, fuel2=10, fuel3=20, jarak, jam1, jam2, jam3, liter1, liter2, liter3;

		System.out.print("Tentukan jarak tempuh: ");
		jarak=scan.nextDouble();

		jam1=jarak/kmph1; jam2=jarak/kmph2; jam3=jarak/kmph3;
		liter1=jarak/fuel1; liter2=jarak/fuel2; liter3=jarak/fuel3;

		System.out.println("\nJarak Perjalanan "+jarak+" km");
		System.out.printf("Mobil 1 : %.2f jam dan %.2f", jam1, liter1);
		System.out.printf("\nMobil 2 : %.2f jam dan %.2f", jam2, liter2);
		System.out.printf("\nMobil 3 : %.2f jam dan %.2f", jam3, liter3);

		if(jam1<jam2){
			cepat="mobil 1";
			if(jam3<jam1)
				cepat="mobil 3";
		}
		else{
			cepat="mobil 2";
			if(jam3<jam2)
				cepat="mobil 3";
		}

		if(liter1<liter2){
			hemat="mobil 1";
			if(liter3<liter1)
				hemat="mobil 3";
		}
		else{
			hemat="mobil 2";
			if(liter3<liter2)
				hemat="mobil 3";
		}

		System.out.println("\n\nRekomendasi mobil tercepat : "+cepat);
		System.out.println("Rekomendasi mobil terhemat : "+hemat);
	}
}
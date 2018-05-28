/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 20 May 2018 16:15
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;
import java.util.Random;

public class LatihanLoopVikri{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		int babak = 1, persibBabak1 = 0, aremaBabak1 = 0, skorPersib, skorArema;

		System.out.println("=================================");

		do{
			System.out.print("Masukan gol Persib babak ke "+babak+"\t: ");
			persibBabak1 = key.nextInt() + persibBabak1;
			System.out.print("Masukan gol Arema babak ke "+babak+"\t: ");
			aremaBabak1 = key.nextInt() + aremaBabak1;
			System.out.println("=================================");
			babak++;
		}while (babak <= 2);

		skorPersib = rand.nextInt(11);
		skorArema = rand.nextInt(11);
		System.out.println("\nSkor Akhirnya adalah \t"+skorPersib+" : "+skorArema);
		System.out.println("Skor tebakan Anda \t"+persibBabak1+" : "+aremaBabak1);
		System.out.println("=================================");

		if (skorPersib == persibBabak1 && skorArema == aremaBabak1) {
			System.out.println("Selamat anda mendapat paket umroh dengan pemain persib");
		}
		else if (skorPersib == persibBabak1 || skorArema == aremaBabak1) {
			System.out.println("Selamat anda mendapat kaos Atep");	
		}
		else {
			System.out.println("Maaf Coba lagi minggu depan");
		}
		System.out.println("=================================");
	}
}
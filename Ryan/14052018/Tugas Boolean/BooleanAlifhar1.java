/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At :    
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BooleanAlifhar1 {
	public static void main(String [] args ) {
		Scanner keyboard = new Scanner(System.in);

		double kecepatan, kerapihan;
		int usia, pengalaman;
		boolean hasil;

		System.out.println("Berapa tahun usia anda : ");
		usia = keyborad.nextInt();

		System.out.println("Berapa lama pengalaman anda (Tahun) : ");
		pengalaman = keyboard.nextInt();

		System.out.println("Seberapa cepat anda bekerja (skala 0.0 sampai 10.0) :  ");
		cepat = keyboard.nextDouble();

		System.out.println("Seberapa rapih anda dalam berpakaian (skala 0.0 sampai 10.0) : ");
		rapi = keyboard.nextDouble();

		hasil = kecepatan >= 8.0 && kerapihan>= 9.0 && usia > 30 && pengalaman >= 3;

		System.out.println("Dari keterangan anda diatas, Berarti anda : " + hasil);
	}
}
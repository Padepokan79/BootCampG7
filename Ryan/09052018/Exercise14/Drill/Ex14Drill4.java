/*
     * Ayah cari pasangan untuk anak
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 11:14
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex14Drill4{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age, ageAnak, perbedaanUsia;
		double cute, sallary;
		boolean allowed;

		System.out.println("Anak saya berumur : ");
		ageAnak = keyboard.nextInt();

		System.out.println("Berapa umurmu anak muda? ");
		age = keyboard.nextInt();

		System.out.println("Penghsilan per-bulan mu berapa? ");
		sallary = keyboard.nextDouble();

		System.out.println("Dan menurut mu kegantenganmu jika diukur dari skala 0.0 sampai 10.0, nilai berapa kegantenganmu? ");
		cute = keyboard.nextDouble();

		perbedaanUsia = ageAnak-age; 

		allowed = (perbedaanUsia<=5 && perbedaanUsia >= -5 && (cute > 8 || sallary > 5000000));

		System.out.println("Oke dari perbandingan kakek, kamu : "+allowed);
	}
}
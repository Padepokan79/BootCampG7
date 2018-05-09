/*
     * Kakek cari Pasangan untuk Cucu
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 10:59
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Ex14Drill2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		double cute, sallary;
		boolean allowed;

		System.out.println("Berapa umurmu anak muda? ");
		age = keyboard.nextInt();

		System.out.println("Penghsilan per-bulan mu berapa? ");
		sallary = keyboard.nextDouble();

		System.out.println("Dan menurut mu kegantenganmu jika diukur dari skala 0.0 sampai 10.0, nilai berapa kegantenganmu? ");
		cute = keyboard.nextDouble();

		allowed = (age>=30 && sallary>=5000000);

		System.out.println("Oke dari perbandingan kakek, kamu : "+allowed);
	}
}
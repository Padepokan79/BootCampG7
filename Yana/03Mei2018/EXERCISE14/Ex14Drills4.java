/*
Create by	: Yana
Time 		: 3 Mei 2018 09.23
Update by	:
*/

import java.util.Scanner;

public class Ex14Drills4{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		umurPasangan, umurWanita, selisihUmur1, selisihUmur2;
		double	ganteng, kekayaan;
		boolean allowed;

		System.out.print("Umur calon pasangan: ");
		umurPasangan = keyboard.nextInt();

		System.out.print("Ganteng calon pasangan: ");
		ganteng = keyboard.nextInt();

		System.out.print("Kekayaan calon pasangan: ");
		kekayaan = keyboard.nextInt();

		umurWanita 	= 24;
		selisihUmur1= umurWanita - umurPasangan;
		selisihUmur2= umurPasangan - umurWanita;

		allowed = ((selisihUmur1 <= 5 || selisihUmur2 <=5) && kekayaan >= 5000000 && ganteng >= 8.0);

		System.out.println(" Pasangan ini diterima oleh Ibu: " +allowed);
	}
}
/*
Create by	: Yana
Time 		: 3 Mei 2018 09.17
Update by	:
*/

import java.util.Scanner;

public class Ex14Drills3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		umurPasangan;
		double	ganteng, kekayaan;
		boolean allowed;

		System.out.print("Umur calon pasangan: ");
		umurPasangan = keyboard.nextInt();

		System.out.print("Ganteng calon pasangan: ");
		ganteng = keyboard.nextInt();

		System.out.print("Kekayaan calon pasangan: ");
		kekayaan = keyboard.nextInt();

		allowed	= (umurPasangan >= 17 && umurPasangan < 30 && ganteng >= 8.0  && kekayaan >= 5000000);

		System.out.println(" Pasangan ini diterima oleh Ibu: " +allowed);
	}
}
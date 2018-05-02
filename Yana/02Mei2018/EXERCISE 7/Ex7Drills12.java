/*
Create by	: Yana
Time 		: 2 Mei 2018 10.15
Update by	:
*/

import java.util.Scanner;

public class Ex7Drills12{
	public static void main( String[] args){

		Scanner keyboard	= new Scanner(System.in);

		System.out.println("Berapa jumlah keluarga burung jika jika meliki 2 ekor anak?");
		keyboard.nextInt();

		//Jika inputkan dengan huruf atau simbol maka akan error
		//Jika inputkan dengan angka selain bilangan riil maka akan error

		System.out.println("Berapa meterkah jiak Andi mengelilingi setengah lapangan dengan keliling 57 meter?");
		keyboard.nextDouble();

		//Jika inputkan selain angka maka akan error 

		System.out.println("Siapa naka dari kembara Ipin?");
		keyboard.next();

		// System.out.println("Is there anything else you wpuld like to say?");
		// keyboard.next();	

	}
}
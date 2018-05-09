// Created by vikri
// 08/05/2018
import java.util.Scanner;

public class Ex7D1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What city is the capital France?");
		keyboard.next();
			//bisa diinput oleh bilangan integer maupun huruf karakter
		System.out.println("What is 6 multiplied by 7?");
		keyboard.nextInt();
		    //hanya bisa diinput oleh bilangan angka. seperti 1,2,3,87,9
			//tidak bisa diinput oleh karakter huruf A-Z, dan Simbol
		System.out.println("Enter a number between 0.0 and 1.0");
		keyboard.nextDouble();
			//hanya bisa diinput oleh bilangan angka bilangan rill seperti 0.5, 0.7.
			//tidak bisa diinput oleh huruf A-Z, dan Simbol
		System.out.println("Is there anything else you would like to say?");
		keyboard.next();
			//bisa diinput oleh bilangan integer maupun huruf karakter
	}
}
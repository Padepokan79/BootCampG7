/*
Create by	: Yana
Time 		: 3 Mei 2018 10.04
Update by	:
*/

import java.util.Scanner;

public class TugasBoolean2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		umur;
		double	penampilan;		
		boolean allowed;
		String	jenisKelamin;

		System.out.print("jenisKelamin \"Cewek\" atau \"Cowok\": ");
		jenisKelamin = keyboard.next();

		System.out.print("Umur cewek/cowok: ");
		umur = keyboard.nextInt();

		allowed = ( umur > 40 && ( jenisKelamin.equals("Cewek") || jenisKelamin.equals("Cowok") ));

		System.out.println("Cewek/Cowok ini diizinkan untuk masuk: " +allowed);
	}
}
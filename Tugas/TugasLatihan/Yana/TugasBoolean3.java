/*
Create by	: Yana
Time 		: 3 Mei 2018 10.13
Update by	:
*/

import java.util.Scanner;

public class TugasBoolean3{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int		umur;
		double	penampilan;		
		boolean allowed;
		String	jenisKelamin;


		System.out.print("jenisKelamin \"Cewek\" atau \"Cowok\": ");
		jenisKelamin = keyboard.next();

		System.out.print("Umur: ");
		umur = keyboard.nextInt();

		System.out.print("Penampilan: ");
		penampilan = keyboard.nextDouble();

		allowed = ( umur >= 21 && umur <= 30 && penampilan >= 8 && ( jenisKelamin.equals("Cowok") || jenisKelamin.equals("Cewek") ) );

		System.out.println("Cewek/Cowok ini diizinkan untuk masuk: " +allowed);
	}
}
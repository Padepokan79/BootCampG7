/*
Create by	: Yana
Time 		: 3 Mei 2018 10.26
Update by	:
*/

import java.util.Scanner;

public class TugasBoolean4{
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

		allowed = ( ( jenisKelamin.equals("Cewek") && umur >= 30 && umur <= 45 && penampilan >= 8 ) || ( jenisKelamin.equals("Cowok") && umur >= 20 && umur <= 25 && penampilan < 8 ) );

		System.out.println("Cewek/Cowok ini diizinkan untuk masuk: " +allowed);
	}
}
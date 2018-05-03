/*
	 Program     : Hari Kamis, Ladies Night
     Creator     : Khairil
     Created At  : 3 Mei 2018 09:50 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class Soal1 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		double cute;
		boolean entrance;

		System.out.println( "Enter your age, hey ladies" );
		age = keyboard.nextInt();

		System.out.println( "How Cute Are you, on a scale from 0.0 to 10.0? " );
		cute = keyboard.nextDouble();

		entrance = ( age >= 21 && age <= 30 && cute >= 8 );

		System.out.println( "Can you entrance, lady ? " + entrance);
	}
}

/*
Hari Kamis, Ladies Night

-Cewek Cantik berusia 21 tahun sampai 30 Tahun
-Selain Itu tidak Boleh Masuk
*/
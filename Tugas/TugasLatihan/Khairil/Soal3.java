/*
	 Program     : Hari Sabtu, Jomblo Night 
     Creator     : Khairil
     Created At  : 3 Mei 2018 10:15 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class Soal3 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String gender;
		int age;
		double performance;
		boolean entrance;

		System.out.println( "Are you man or woman ? type \n\"Woman\" or \"Man\"");
		gender = keyboard.next();

		System.out.println( "Enter your age, hey " + gender + " ?" );
		age = keyboard.nextInt();

		System.out.println( "Are you cute, my " + gender + " ? Scale 0.0 to 10.0" );
		performance = keyboard.nextDouble();		

		entrance = ( age >= 21 && age <= 30 );

		System.out.println( "Can you entrance, " + gender +" ? " + entrance);
	}
}

/*
Hari Sabtu, Jomblo Night 

-Cewek atau Cowok yang berusia 21 tahun sampai 30 tahun
 Penampilan Menarik
Selain itu Tidak boleh masuk
*/
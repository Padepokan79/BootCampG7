/*
	 Program     : Hari Jumat, Melodies Memori
     Creator     : Khairil
     Created At  : 3 Mei 2018 10:05 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class Soal2 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String gender;
		int age;
		boolean entrance;

		System.out.println( "Are you boy or girl ? type \n\"Boy\" or \"Girl\"");
		gender = keyboard.next();		

		System.out.println( "Enter your age, hey " + gender + " ?" );
		age = keyboard.nextInt();

		entrance = ( age > 40 );

		System.out.println( "Can you entrance, " + gender +" ? " + entrance);
	}
}

/*
Hari Jumat, Melodies Memori

-Cewek atau Cowok yang berusia lebih dari 40 tahun.
-Selain Itu tidak boleh masuk
*/
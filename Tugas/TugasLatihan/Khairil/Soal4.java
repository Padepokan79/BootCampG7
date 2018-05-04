/*
	 Program     : Hari Selasa, Brondong Night  
     Creator     : Khairil
     Created At  : 3 Mei 2018 10:18 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class Soal4 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String gender;
		int age, minAge, maxAge, wminAge, wmaxAge;
		double performance;
		boolean entrance;

		minAge  = 20;
		maxAge  = 25;
		wminAge = 30;
		wmaxAge = 45;

		System.out.println( "Are you man or woman ? type \n\"Woman\" or \"Man\"");
		gender = keyboard.next();

		System.out.println( "Enter your age, hey " + gender + " ?" );
		age = keyboard.nextInt();

		System.out.println( "Are you cute, my " + gender + " ? Scale 0.0 to 10.0" );
		performance = keyboard.nextDouble();		

		entrance = ( (gender.equals("Woman") && performance>= 8 && age >= wminAge && age <= wmaxAge) || (gender.equals("Man") && performance < 8 && age >= minAge && age <= maxAge) );

		System.out.println( "Can you entrance, " + gender +" ? " + entrance);
	}
}

/*
Hari Selasa, Brondong Night 

-Cewek Cakep usia 30 sampai 45 tahun
-Cowok gk Ganteng usia 20 sampai 25 tahun
*/
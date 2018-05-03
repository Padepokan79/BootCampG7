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
		int age;
		double performance;
		boolean entrance;

		System.out.println( "Are you man or woman ? type \n\"Woman\" or \"Man\"");
		gender = keyboard.next();

		System.out.println( "Enter your age, hey " + gender + " ?" );
		age = keyboard.nextInt();

		System.out.println( "Are you cute, my " + gender + " ?" );
		performance = keyboard.nextDouble();		

		entrance = ( (gender.equals("Woman") && performance>= 8 && age >= 30 && age <= 45) || (gender.equals("Man") && performance < 8 && age >= 20 && age <= 25) );

		System.out.println( "Can you entrance, " + gender +" ? " + entrance);
	}
}

/*
Hari Selasa, Brondong Night 

-Cewek Cakep usia 30 sampai 45 tahun
-Cowok gk Ganteng usia 20 sampai 25 tahun
*/
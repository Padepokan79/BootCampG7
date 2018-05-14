/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex15Drills1 {
		public static void main( String[] args){
			Scanner keyboard = new Scanner(System.in);
			int age;

			System.out.print("How old are you? ");
			age = keyboard.nextInt();

			System.out.print("You are: ");
			if (age < 13){
				System.out.println("\ttooo young to create a Facebook Ac");
			}
			if (age < 16){
				System.out.println("\ttooo young to get a driver's lisence");
			}
			if (age < 18){
				System.out.println("\ttooo young to get a tatto");
			}
			if (age < 21){
				System.out.println("\ttooo young to drinkalcohol");
			}
			if (age < 35){
				System.out.println("\ttooo young to run for President of the U.S.");
				System.out.println("\t\t(How sad! )");
				// Because if you type greater than 35 is already pass the statment, and the program won't tell you anything 
			}
		}
	}
/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex14Drills1{
		public static void main (String[] args){
			Scanner keyboard = new Scanner(System.in);
			int age;
			double income, cute, happy;
			boolean allowed, allowed2;

			System.out.println("Enter your age: ");
			age = keyboard.nextInt();

			System.out.println("Enter your yearly income: ");
			income = keyboard.nextDouble();

			System.out.println("How cute are you, on a scale 0.0 to 10.0? ");
			cute = keyboard.nextDouble();

			allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5) );

			System.out.println("How happy do you make them,scale 0.0 to 10.0 ? ");
			happy = keyboard.nextDouble();

			allowed2 = (age > 25 && age < 40 && happy >= 7.0);


			System.out.println("Allowed to date my grandchild? " + allowed + " And you happy about your life? " + allowed2);

		}
	}
/* 	Date 		: 2/5/2018    
	Time 		: 09:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class RudeQuestions {
		public static void main( String[] args){
			String name;
			int age;
			double weight, income;

			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Hello what is your name ?");
			name = keyboard.next();

			System.out.print("Hi, " + name + "! How old are you ?");
			age = keyboard.nextInt();

			System.out.println("So you're " + age + "eh? That's not very old.");
			System.out.print("How much do you weigh, " + name + "? ");
			weight = keyboard.nextDouble();

			System.out.println( weight + "! Better keep that quiet!!");
			System.out.print("Finally, whar's your income, " + name + "? " );
			income = keyboard.nextDouble();

			System.out.print("Hopefully that is " + income + " per hour" );
			System.out.println(" and not per year!");
			System.out.print("Well, thanks for answering my rude question, ");
			System.out.println(name + ".");

		}
	}
	/*
		* Created by:	Alifhar Juliansyah
		* 				14-05-2018	08.55
		* Updated by:
		*
	*/
	import java.util.Scanner;

	public class Ex16Drills1{
		public static void main(String[] args){
			Scanner keyboard=new Scanner(System.in);
			double first, second;

			System.out.print("Give me two numbers. First: ");
			first=keyboard.nextDouble();
			System.out.print("Second: ");
			second=keyboard.nextDouble();

			if(first<second){
				System.out.println(first+" is LESS THAN "+second);
			}
			if(first<=second){
				System.out.println(first+" is LESS THAN/EQUAL TO "+second);
			}
			if(first==second){
				System.out.println(first+" is EQUAL TO "+second);
			}
			if(first>second){
				System.out.println(first+" is GREATER THAN "+second);
			}
			if(first>=second){
				System.out.println(first+" is GREATER THAN/EQUAL TO "+second);
			}
			if(first!=second)
				System.out.println(first+" is NOT EQUAL TO "+second);
				System.out.println("Hey.");
			//"Hey." is not the part of if statement body
			//If there's no curly bracket, it is just the first statement after if that include as the part of the if body
			//so it mean "Hey." will be printed no matter the condition of first != second
		}
	}
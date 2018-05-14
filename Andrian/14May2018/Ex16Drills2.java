/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex16Drills2 {
		public static void main(String[]args){
			Scanner key = new Scanner(System.in);
			double first, second;

			System.out.print("Give me two numbers. First: ");
			first = key.nextDouble();
			System.out.println("Second: ");
			second = key.nextDouble();

			if (first < second ){
				System.out.println( first + " is LESS THAN " + second );
			}
			if (first <= second){
				System.out.println( first + " is LESS THAN/EQUAL TO " + second );
			}
			if ( first == second ){
				System.out.println( first + " is EQUAL TO " + second );
			}
			if (first >= second){
				System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
			}
			if (first > second){
				System.out.println( first + " is GREATER THAN " + second );
			}
			if (first != second) {
				System.out.println( first + " is NOT EQUAL TO " + second );
				System.out.println("Hey. ");
				}	
				// if you add the braces on the if body then the statetment is fulfilled then the word "hey" will be printed and if not fulfilled it won't
				// and if you didn't add the braces no matter what the statment the word "hey" it would be printed. 					
		}
	}
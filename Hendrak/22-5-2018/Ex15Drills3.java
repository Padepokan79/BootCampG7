//Created by : Hendra Kurniawan
//Date : 20 Mei 2018 Time : 10:27 AM
//Modified by :
import java.util.Scanner;

public class Ex15Drills3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
			int age;

			System.out.print( "How old are you ? " );
			age = keyboard.nextInt();

			System.out.println( "You are :");
			if(age < 13){
				System.out.println("\ttoo young to create faecbook account !!");
			}
			if(age >= 13){
				System.out.println("\tOld enough to create faecbook account !!");
			}
			
			if(age < 16){
				System.out.println("\ttoo young to get a drive's license");
			}
			if(age >= 16){
				System.out.println("\tOld enough to get a drive's license");
			}

			if(age < 18){
				System.out.println("\ttoo young to get a tattoo");
			}
			if(age >= 18){
				System.out.println("\tOld enough to get a tattoo");
			}
			if(age < 21){
				System.out.println("\ttoo young to drink alcohol");
			}
			if(age >= 21){
				System.out.println("\tOld enough to drink alcohol");
			}

			if(age < 35){
				System.out.println("\ttoo young to run for president of U.S. ");
				System.out.println("\t\t(How Sad!!!)");
			}
			if(age >= 35){
				System.out.println("\tOld enough to run for president of U.S. ");
				
			}
			if(age < 65){
				System.out.println("\ttoo young to retire!!");
			}
			if(age >= 65){
				System.out.println("\tYou are old enough to retire!!");
			}
			
	}

}
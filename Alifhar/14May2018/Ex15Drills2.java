/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	08.39
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex15Drills2{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int age;

		System.out.print("How old are you? ");
		age=keyboard.nextInt();

		System.out.println("You are: ");
		if(age<13){
			System.out.println("\ttoo young to create a Facebook account");
		}
		if(age>=13){
			System.out.println("\told enough to create a Facebook account");
		}
		if(age<16){
			System.out.println("\ttoo young to get a driver's license");
		}
		if(age>=16){
			System.out.println("\told enough to get a driver's license");
		}
		if(age<18){
			System.out.println("\ttoo young to get a tatto");
		}
		if(age>=18){
			System.out.println("\told enough to get a tatto");
		}
		if(age<21){
			System.out.println("\ttoo young to drink alcohol");
		}
		if(age>=21){
			System.out.println("\told enough to drink alcohol");
		}
		if(age<35){
			System.out.println("\ttoo young to run for President of the U.S.");
			System.out.println("\t\t(How sad!)");
		}
		if(age>=35){
			System.out.println("\told enough to run for President of the U.S.");
			System.out.println("\t\t(Yeayy!)");
		}
		if(age<60){
			System.out.println("\ttoo young to retire");
		}
		if(age>=60){
			System.out.println("\told enough to retire");
		}
	}
}
//nothing get printed. That's because no condition are true
//example: if we type 37 then it is greater than 13, 16, 18, 21 and 35
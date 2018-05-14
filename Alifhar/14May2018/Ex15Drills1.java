/*
	* Created by:	Alifhar Juliansyah
	* 				14-05-2018	08.37
	* Updated by:
	*
*/
import java.util.Scanner;

public class Ex15Drills1{
	public static void main(String[] args){
		Scanner keyboard=new Scanner(System.in);
		int age;

		System.out.print("How old are you? ");
		age=keyboard.nextInt();

		System.out.println("You are: ");
		if(age<13){
			System.out.println("\t too young to create a Facebook account");
		}
		if(age<16){
			System.out.println("\ttoo young to get a driver's license");
		}
		if(age<18){
			System.out.println("\ttoo young to get a tatto");
		}
		if(age<21){
			System.out.println("\ttoo young to drink alcohol");
		}
		if(age<35){
			System.out.println("\ttoo young yo run for President of the U.S.");
			System.out.println("\t\t(How sad!)");
		}
	}
}
//nothing get printed. That's because no condition are true
//example: if we type 37 then it is greater than 13, 16, 18, 21 and 35
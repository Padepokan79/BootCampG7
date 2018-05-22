/*
	 Program     : Tugas For While - Richa
     Creator     : Khairil
     Created At  : 20 Mei 2018 07:00 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;
import java.util.Random;

public class RichaForWhileApps {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Random num = new Random();

		String choice;
		int age, agePakJokowi, time, ageAgo, firstAge, yearPromote; 
		double basicSalary, promoteSalary, upgradeSalary, annualInc, totalSalary; 

		choice = "";
		agePakJokowi = 56;
		yearPromote = 5;
		ageAgo = 25;
		annualInc = 0.05;
		promoteSalary = 2;
		firstAge = agePakJokowi - ageAgo;
		basicSalary = 1500000;


		for(time = 1; time <= agePakJokowi; time++) {

			upgradeSalary = annualInc * basicSalary;
			totalSalary = basicSalary + upgradeSalary;
			System.out.println("==================");
			System.out.println(" Gaji Pak Jokowi");
			System.out.println("==================");

			System.out.println("Umur: " + firstAge++ + " tahun");
			System.out.printf("Gaji : %.2f", basicSalary);
			System.out.println();
			
			if(time % 5 != 0) {
				System.out.println("Naik pangkat? Tidak");
				basicSalary+=upgradeSalary;	
			}

			else if(time % 5 == 0) {	
				System.out.print("Naik pangkat ? ");
				choice = keyboard.next();

				time+=yearPromote;
				if(choice.equals("Ya")) {
					basicSalary = totalSalary * 2;
				}
				else if(choice.equals("Tidak")) {
					basicSalary+=upgradeSalary;
				}
			}

			System.out.println("-------------------");
		}
	}
}
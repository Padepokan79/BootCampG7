package View;

import Controller.AnalisSistem;
import Controller.Employee;
import Controller.Programmer;
import Controller.Tester;

public class EmployeeSalaryApp {

	public static void main(String[] args) {
		Programmer   pro 	= new Programmer("Malik", "73823523", "Karawang", "Middle", 10, true, 3, 5);
		Tester       tes 	= new Tester("Yana", "267527353", "Karawang", "Senior", 3, true, 5000, 3);
		AnalisSistem as 	= new AnalisSistem("Malik", "3232532", "Karawang", "Senior", 0, false, 10);
		
		System.out.println(pro.toString());
		System.out.println("==================================");
		System.out.println(tes.toString());
		System.out.println("==================================");
		System.out.println(as.toString());
	}

}

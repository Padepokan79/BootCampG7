/*
	DATE CREATED : 21 MEI 2018
	TIME 		 : 13.40 WIB
	AUTHOR 		 : NURDHIAT CHAUDHARY MALIK
*/
import java.util.Scanner;
import java.util.Random;
public class Ex48Drills1{
	public static void main(String[] args){
		String[] nama = {"Hanif", "Yana", "Malik", "Rizaldi"};

		System.out.println("\tFor Each :");
		System.out.println("\t----------");
		for (String name : nama) {
			System.out.println("\t"+name);
		}

			System.out.println("");

		System.out.println("\tFor      :");
		System.out.println("\t----------");
		for (int index = 0; index < nama.length; index++) {
			String absen = nama[index];
			System.out.println("\t"+absen+"\t\t"+absen.toUpperCase());
		}
	}
}
//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 2:15 PM
//Modified :
import java.util.Scanner;
public class Ex49Drills2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828};
		int toFind,ketemu=0;
		

		System.out.print("There are " + orderNumbers.length);
		System.out.println(" order in databse. ");

		System.out.print("Orders : ");
		for(int num : orderNumbers)
		{
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();

		for( int num : orderNumbers)
		{
			if(num == toFind)
			{
				System.out.println(num + " found");
				ketemu +=1;

			}

		}
		if(ketemu==0)
		{
			System.out.println("Not Found");
		}



	}
}

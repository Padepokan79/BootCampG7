//createby:Hendra Kurniawan 
//Date:17 Mei 2018 Time:15:27
//Modified by :
import java.util.Scanner;

public class Ex7Drills2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "What city os the capital of France ?");
		keyboard.next();

		System.out.println( "What is 6 multiplied by 7?");
		keyboard.nextInt();

		System.out.println( "Enter a number between 0.0 and 1.0.");
		keyboard.nextDouble();

		System.out.println( "Is there anything else you would like to say?");
		keyboard.next();
	}

}//Masukan yang dapat membuat program error yaitu char/string karena type 
//data double hanya bisa memasukan data berupa angka

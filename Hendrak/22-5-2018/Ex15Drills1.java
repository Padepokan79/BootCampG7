//Created by : Hendra Kurniawan
//Date : 19 Mei 2018 Time : 10:17 PM
//Modified by :
import java.util.Scanner;

public class Ex15Drills1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
			int age;

			System.out.print( "How old are you ? " );
			age = keyboard.nextInt();

			System.out.println( "You are :");
			if(age < 13){
				System.out.println("\ttoo young to create faecbook account !!");
			}
			if(age < 16){
				System.out.println("\ttoo young to get a drive's license");
			}
			if(age < 18){
				System.out.println("\ttoo young to get a tattoo");
			}
			if(age < 21){
				System.out.println("\ttoo young to drink alcohol");
			}
			if(age < 35){
				System.out.println("\ttoo young to run for president of U.S. ");
				System.out.println("\t\t(How Sad!!!)");
			}
	}

}
//tidak ada keterangan yang dicetak tentang umur yang lebih dari 35 tahun
//karena umur tersebut tidak memenuhi kondisi if statement pada program
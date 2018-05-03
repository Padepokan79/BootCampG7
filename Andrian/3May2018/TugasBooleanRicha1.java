/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanRicha1 {
		public static void main(String[]args){
			Scanner key = new Scanner(System.in);
			String nama,date;
			int duit, duitminimal;
			boolean hasil;


			duitminimal = 520;

			System.out.println("=============== WELCOME TO TRAVEL CHOICE CLUB ===================");
			System.out.println("Are you able to go Lombok this week? Please fill our form below!");
			System.out.println("\nWhat's your name? ");
			nama = key.next();

			System.out.println("How much budget do you have, "+nama+" (in dollar)?");
			duit = key.nextInt();

			System.out.println("Enter available date you have! (you may only choose 1 day, in number): ");
			date = key.next();


			hasil = duit>=duitminimal && (date.equals("1") ||  date.equals("2") || date.equals("3") ||  date.equals("4") || date.equals("5") );

			System.out.println("==================================================================");
			System.out.println("This is your result, " +nama+ ". . . . ");
			System.out.println("Are you allowed go to lombok?" + hasil);
		}
	}
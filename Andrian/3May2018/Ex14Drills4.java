/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class Ex14Drills4{
		public static void main(String [] args ){
			Scanner keyboard = new Scanner(System.in);
			int umur, penghasilan, umuranak;
			double ganteng;
			boolean hasil;

			umuranak = 20;

			System.out.print("Berapa umur kamu? ");
			umur = keyboard.nextInt();

			System.out.println("Berapa penghasilan anda? ");
			penghasilan = keyboard.nextInt();

			System.out.print("Apakah anda ganteng dari skala 0.0 sampai 10.0?  ");
			ganteng = keyboard.nextDouble();

			hasil = ( (umur <= umuranak+5 && umur >= umuranak-5) && (penghasilan > 5000000 && ganteng > 8));

			System.out.println("Dari data yang diinputkan, hasil anda " + hasil + " menikahi putri saya.");

		}
	}
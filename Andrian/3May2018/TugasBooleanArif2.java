/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanArif2{
		public static void main(String[] args ){
			Scanner keyboard = new Scanner(System.in);
			String hari;
			boolean hasil;

			System.out.print("Masukan hari ini hari apa? ");
			hari = keyboard.next();

			hasil = hari.equals("senin") || hari.equals("selasa") || hari.equals("rabu") || hari.equals("kamis") || hari.equals("sabtu");

			System.out.println("Apakah toko pada hari itu buka? " + hasil );
		}
	}

/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanArif3{
		public static void main(String[] args ){
			Scanner keyboard = new Scanner(System.in);
			int ram, ram1, hdd, hdd1;
			double proci, proci1, proci2;
			boolean hasil;

			ram1 = 8;
			hdd1 = 1000;
			proci1 = 3.0;
			proci2 = 4.5;

			System.out.print("Masukan spesifikasi yang anda inginkan ");

			System.out.print("Masukan besar ram(GB): ");
			ram = keyboard.nextInt();
			
			System.out.print("Masukan besar hdd(GB): ");
			hdd = keyboard.nextInt();

			System.out.print("Masukan besar processor: ");
			proci = keyboard.nextDouble();

			hasil = ram >= ram1 && hdd>=hdd1 && (proci >= proci1 && proci <= proci2); 

			System.out.println("Apakah toko pada hari itu buka? " + hasil );
		}
	}

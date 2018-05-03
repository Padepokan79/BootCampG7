/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanArif1{
		public static void main(String[] args ){
			Scanner keyboard = new Scanner(System.in);
			int plat,tanggal;
			boolean hasil;

			System.out.print("Masukan tanggal hari ini ");
			tanggal = keyboard.nextInt();
			System.out.println("Masukan plat nomor anda");
			plat = keyboard.nextInt();

			hasil = (tanggal%2) == (plat%2);

			System.out.println("Apakah anda berhak memasuki tol? " +hasil);
		}
	}

/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanAlifhar1 {
		public static void main(String [] args ) {
			Scanner key = new Scanner(System.in);
			double cepat, rapi, skalacepat, skalarapi;
			int usia, usiaMinimal, pengalaman, pengalamanMinimal;
			boolean hasil;

			skalacepat = 8;
			skalarapi = 9;
			usiaMinimal = 30;
			pengalamanMinimal = 3;

			System.out.println("Berapa tahun usia anda? ");
			usia = key.nextInt();

			System.out.println("Berapa lama pengalaman anda? ");
			pengalaman = key.nextInt();

			System.out.println("Seberapa cepat anda bekerja dari skala 0.0 hingga 10.0? ");
			cepat = key.nextDouble();

			System.out.println("Seberapa rapih anda berpakaian dari skala 0.0 hingga 10? ");
			rapi = key.nextDouble();

			hasil = cepat>=skalacepat && rapi>=skalarapi && usia>usiaMinimal && pengalaman>=pengalamanMinimal;

			System.out.println("Apakah anda mampu bermitra dengan saya, jawabannya " + hasil);
		}
	}
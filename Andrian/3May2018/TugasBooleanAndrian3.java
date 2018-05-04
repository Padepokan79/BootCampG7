/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanAndrian3 {
		public static void main(String [] args){
			Scanner keyboard = new Scanner(System.in);
			int tingkat, tingkatminimal,kolamRenang, kolamRenangMinimal, garasi, garasiMinimal,flora, floraMinimal, floraMinimal1;
			double luas, luasMinimal, luasMinimal1;
			String lokasi;
			boolean hasil;

			tingkatminimal = 3;
			kolamRenangMinimal = 2;
			garasiMinimal = 3;
			luasMinimal = 0.3;
			luasMinimal1 = 0.7;
			floraMinimal = 5;
			floraMinimal1 = 8;
			
			System.out.print("Dimanakah letak rumah yang dijual? ");
			lokasi = keyboard.next();

			System.out.print("Berapa besar luas tanah tersebut? ");
			luas = keyboard.nextDouble();

			System.out.println("Berapa hingga tingkat berapa rumah itu bisa ditingkatkan? ");
			tingkat = keyboard.nextInt();

			System.out.println("Mmapu dibangun berapa kolam renang di lokasi tersebut? ");
			kolamRenang = keyboard.nextInt();

			System.out.print("Berapa kapastitas garasi di lokasi? ");
			garasi = keyboard.nextInt();

			System.out.print("Berapa kapastitas Flora di lokasi? ");
			flora = keyboard.nextInt();

			hasil = (lokasi.equals("heidelberg") && luas>=luasMinimal1 && tingkat>=tingkatminimal && garasi>=garasi && kolamRenang>=kolamRenangMinimal && flora>=floraMinimal) || (lokasi.equals("heidelberg") && luas>=luasMinimal1 && tingkat<=tingkatminimal && garasi>=garasi && kolamRenang<=kolamRenangMinimal && flora>=floraMinimal1);

			System.out.println("jika true maka dibeli selain itu dilarang, hasil: " + hasil);
		}
	}
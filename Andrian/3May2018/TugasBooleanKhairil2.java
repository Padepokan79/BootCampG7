/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanKhairil2 {
		public static void main (String [] args){
			Scanner key = new Scanner(System.in);
			int roti, mentega, solusi, kismis,selai,hargaroti,hargamentega,hargaselai,hargakismis,hargaminimum,harga,totalroti,totalmentega,totalkismis,totalselai;
			boolean hasil;

			hargaroti = 15000;
			hargamentega = 3500;
			hargaselai = 8500;
			hargakismis = 7500;
			hargaminimum = 100000;

			System.out.println("Masukan berapa banyak roti yang anda beli: ");
			roti = key.nextInt();

			System.out.println("Masukan berapa banyak mentega yang anda beli: ");
			mentega = key.nextInt();

			System.out.println("Masukan berapa banyak selai yang anda beli: ");
			selai = key.nextInt();

			System.out.println("Masukan berapa banyak kismis yang anda beli: ");
			kismis = key.nextInt();


			totalroti = roti*hargaroti;
			totalmentega = mentega*hargamentega;
			totalkismis = kismis*hargakismis;
			totalselai = selai*hargaselai;
			harga = totalselai + totalkismis + totalmentega +totalroti ;

			hasil = totalmentega==hargamentega && totalroti==hargaroti && harga<hargaminimum;


			System.out.println("Apakah yang anda beli kurang dari 100rb: " + hasil);


		}
	}

	//Tampilkan total belanjanya 
	//Total harga harusnya <= 100000
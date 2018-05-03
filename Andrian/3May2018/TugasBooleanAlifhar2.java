/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanAlifhar2{
		public static void main(String[]args){
			Scanner key = new Scanner(System.in);
			String warna,tahun;
			int kecepatan, kecepatanLama,kecepatanBaru;
			boolean hasil;

			kecepatanLama = 40;
			kecepatanBaru = 40+30;

			System.out.println("tuliskan warna mobil tersebut ");
			warna = key.next();

			System.out.println("Seberapa cepat mobil itu dapat melaju ");
			kecepatan = key.nextInt();

			System.out.println("Keluaran tahun berapa mobil tersebut? ");
			tahun = key.next();

			hasil = warna.equals("biru") && kecepatan>kecepatanBaru && (tahun.equals("2016") || tahun.equals("2017"));

			System.out.println("Apakah Deo harus membeli mobil tersebut " + hasil);

		}
	}
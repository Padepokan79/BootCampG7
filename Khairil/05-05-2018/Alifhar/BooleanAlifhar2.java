/*
	 Program     : Boolean Alifhar 2 / Mobil Baru Deo
     Creator     : Khairil
     Created At  : 3 Mei 2018 18:50 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

class BooleanAlifhar2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner another = new Scanner(System.in);
		String inputWarna, warnaIngin;
		int inputKecepatan, kecMobLama, kecMin, inputTahun, tahunKeluaran1, tahunKeluaran2;
		boolean minatMobil;

		System.out.print( "Warna yang diinginkan ?  " );
		inputWarna = another.nextLine();

		System.out.print( "Kecepatan yang diharapkan ?  " );
		inputKecepatan = keyboard.nextInt();

		System.out.print( "Tahun keluaran ?  " );
		inputTahun = keyboard.nextInt();

		kecMobLama = 40;
		warnaIngin = "biru";
		kecMin = kecMobLama + 30;
		tahunKeluaran1 = 2016;
		tahunKeluaran2 = 2017;

		minatMobil = ( inputWarna.equals(warnaIngin) && inputKecepatan >= kecMin && ( inputTahun == tahunKeluaran1 || inputTahun == tahunKeluaran2 ) );

		System.out.println( "Sesuai dengan kriteria ?  : " + minatMobil );		
	}
}
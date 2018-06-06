/*
Created by 	: Yana
Time		: 17 Mei 2018 12.59
*/

public class TugasDoWhile2{
	public static void main(String[] args) {

		int stokKue, periodik, kuePerPeriodeik, waktu, waktuMax;

		stokKue	= 200;
		kuePerPeriodeik = 3;
		periodik= 15;
		waktu	= 510;

		do{

			waktu -= periodik;

			stokKue = stokKue - kuePerPeriodeik;
			System.out.println("stok kue " +stokKue);
		}while(waktu>=0);
	}
}
/*
Seorang Pedagang kue, setiap harinya membawa 200 potong kue untuk di jual.
Setiap 15 menit penjual tersebut berhasil menjual 3 potong kue.
Berapakah kue yang tersisa jika si penjual berjualan selama 8 jam 30 menit?
*/
//Created by :Hendra Kurniawan
//Date : 22 Mei 2018 Time : 8:47 AM
//Modified : 
import java.util.Scanner;

public class RizaldiIf3{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);


		double uang,gajiBulan = 1000000,usd = 32000000;
		//konversi dollar ke rupiah
		double uangLiburan = 32000000* 14172.48;
		double lamaNabung,presentase;
		System.out.println("==========================");
		System.out.print("Berapa uang tono         : Rp." );
		uang = keyboard.nextDouble();
		lamaNabung = (uangLiburan-uang)/gajiBulan;
		double uangKurang = uangLiburan - uang;
		presentase = (uang/uangLiburan) * 100;

		System.out.println("==========================");
		System.out.println("Uang tono kurang sebesar : Rp."+ uangKurang );
		System.out.println("Lama tono harus menabung : Rp."+ lamaNabung+" Bulan" );
		if (presentase > 90)
		{
			System.out.println("Keterangan               : Sabar ton bentar lagi!");
		}
		else if ( presentase >60 && presentase <=90)
		{
			System.out.println("Keterangan               : Jual rumah aja!!");
		}
		else if (presentase <= 60)
		{
			System.out.println("Keterangan               : Bisa pergi, gak usah pulang..!!");
		}
		

	}
}
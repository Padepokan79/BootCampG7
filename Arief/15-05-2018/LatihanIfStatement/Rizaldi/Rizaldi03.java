/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
public class Rizaldi03 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		double 	uang, bulanan, tahun, tahunan, tiket, target, usd, lama, persentase,
				harga, uangKurang, persen90, persen60, persen40;

		// USD to IDR 14084

		bulanan = 1000000;
		tahun = 12;
		usd = 14084;
		harga = 320000;
		persen40 = 40.0/100;
		persen60 = 60.0/100;
		persen90 = 90.0/100;
		tiket =  harga * usd;

		System.out.print("Uang Tono\t\t:");
		uang = inputKey.nextDouble();

		uangKurang = tiket - uang;

		System.out.printf("Uang Tono Kurang sebesar Rp. %.0f \n",uangKurang);

		target = uangKurang/bulanan;

		System.out.printf("lama tono harus menabung %.0f bulan\n", target);
		
		persentase = (uang / tiket) * 100;

		System.out.printf("keterangan %.0f persen", persentase);

		if (uang > (persen90 * tiket)) {
			System.out.println(" Sabar ton bentar lagi...");
		}else if (uang > (persen60 * tiket)) {
			System.out.println(" jual rumah aja...");
		}else if (uang < (persen40 * tiket)) {
			System.out.println(" bisa pergi, gak usah pulang...");
		}


	}
}
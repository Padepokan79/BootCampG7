/*
	Created By Vikri
	29/05/2018
	Start : 9:37
	End   : 11:00
*/
import java.util.Scanner;
public class Quiz3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tabungan = 0, bulanke, convertAnggota = 0, convertLama = 0, batas = 1000, batas2 = 1000, pengkalianRibuan = 1000;
		String anggota, lama;

		do{
			System.out.print("Masukan Jumlah anggota: ");
			anggota = scan.next();

			if (anggota.matches("[0-9]*")) {
				convertAnggota = Integer.parseInt(anggota);
				if (convertAnggota >= 1&&convertAnggota <= 6) {
					batas = 0;
				} else if (convertAnggota<2) {
					System.out.println("Maaf, Jumlah keluarga Tidak boleh kurang dari 2");
				} else {
					System.out.println("Maaf, Jumlah keluarga Tidak boleh Lebih dari 12.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				batas--;
			}

		}while(batas > 0);

		do{
			System.out.print("Masukan Lama: ");
			lama = scan.next();

			if (anggota.matches("[0-9]*")) {
				convertLama = Integer.parseInt(lama);
				if (convertLama > 1&&convertLama <= 6) {
					batas2 = 0;
				} else if (convertLama>6) {
					System.out.println("Maaf, Lama Tidak boleh Lebih dari 6");
				} else {
					System.out.println("Maaf, Lama Tidak boleh Kurang dari 1");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				batas2--;
			}

		}while(batas2 > 0);

		System.out.println("Tabungan Keluarga\n");

		for (bulanke = 1; bulanke <= convertLama; bulanke++) {
			int tabungan2 = 0;
			if (bulanke % 2 == 1) {
				for (int hari = 31; hari > 0; hari--) {
					tabungan2 += hari*pengkalianRibuan*convertAnggota;
					tabungan += hari*pengkalianRibuan*convertAnggota;
					//untuk mengkalikan dari tanggal yang angka nya satuan jadi ribuan
				}
				System.out.println("Tabungan Keluarga bulan ke "+bulanke+" : "+tabungan2);
			} else if (bulanke == 2) {
				for (int hari = 28; hari > 0; hari--) {
					tabungan2 += hari*pengkalianRibuan*convertAnggota;
					tabungan += hari*pengkalianRibuan*convertAnggota;
					//untuk mengkalikan dari tanggal yang angka nya satuan jadi ribuan
				}
				System.out.println("Tabungan Keluarga bulan ke "+bulanke+" : "+tabungan2);
			} else {
				for (int hari = 30; hari > 0; hari--) {
					tabungan2 += hari*pengkalianRibuan*convertAnggota;
					tabungan += hari*pengkalianRibuan*convertAnggota;
					//untuk mengkalikan dari tanggal yang angka nya satuan jadi ribuan
				}
				System.out.println("Tabungan Keluarga bulan ke "+bulanke+" : "+tabungan2);
			}
		}

		System.out.println("Jumlah Tabungan: "+tabungan);

	}
}
/*
     * Tes1\3 Java.
     *
     * Programmer : Ryan Ahmad N
     * Created By :	Ryan Ahmad N
     * Created At : 29 May 2018 08:30 - 09:30
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Kuis3Ryan{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int[] jmlHari = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] tabunganPerBulan = new int[jmlHari.length];
		String jmlKeluarga, lamaTabungan;
		int jmlKeluargaIn=0, lamaTabunganIn=0, cek=1, totalTabungan=0, keluargaMax=6, keluargaMin=2, bulanMax=jmlHari.length, bulanMin=1;

		for (int hari = 0;hari < jmlHari.length ;hari++ ) {
			for (int tabung = 0;tabung < jmlHari[hari] ; tabung++) {
				tabunganPerBulan[hari] = tabunganPerBulan[hari]+(tabung+1)*1000;
			}
		}

		// for (int t : tabunganPerBulan) {
		// 	System.out.println(t);
		// }

		System.out.println("\nTabungan keluarga");
		System.out.println();
		System.out.print("Masukan Jumlah Keluarga : ");
		do{
			jmlKeluarga = key.nextLine();
			if (jmlKeluarga.matches("[0-9 ]+")) {
				jmlKeluargaIn = Integer.parseInt(jmlKeluarga);
				if (jmlKeluargaIn > keluargaMax) {
					System.out.println("Maaf, Jumlah keluarga tidak boleh lebih dari "+keluargaMax+".\nSilahkan input kembali.");
					cek = 0;
				}
				else if (jmlKeluargaIn < keluargaMin) {
					System.out.println("Maaf, Jumlah keluarga tidak boleh kurang dari "+keluargaMin+".\nSilahkan input kembali.");
					cek = 0;
				}
				else{
					cek = 1;
				}
			}
			else {			
				System.out.println("Maaf, input yang diterima hanya angka.\nSilahkan input kembali");
				cek = 0;
			}
		}while (cek == 0);
		System.out.println();

		System.out.print("Masukan lama tabungan : ");
		do{
			lamaTabungan = key.nextLine();
			if (lamaTabungan.matches("[0-9 ]+")) {
				lamaTabunganIn = Integer.parseInt(lamaTabungan);
				if (lamaTabunganIn > bulanMax) {
					System.out.println("Maaf, Lama tabungan tidak boleh lebih dari "+bulanMax+" bulan.\nSilahkan input kembali.");
					cek = 0;
				}
				if (lamaTabunganIn < bulanMin) {
					System.out.println("Maaf, Lama tabungan tidak boleh kurang dari "+bulanMin+" bulan.\nSilahkan input kembali.");
					cek = 0;
				}
				else{
					cek = 1;
				}
			}
			else {			
				System.out.println("Maaf, input yang diterima hanya angka.\nSilahkan input kembali");
				cek = 0;
			}
		}while (cek == 0);

		System.out.println();
		int bulan = 1;
		while (bulan <= lamaTabunganIn) {
			totalTabungan = totalTabungan+tabunganPerBulan[bulan-1]*jmlKeluargaIn;
			System.out.println("Bulan Ke "+bulan+" Sebesar "+tabunganPerBulan[bulan-1]*jmlKeluargaIn);
			bulan++;
		}
		System.out.println();
		System.out.println("Total tabungan Selama "+lamaTabunganIn+" dengan "+jmlKeluargaIn+" anggota keluarga adalah "+totalTabungan);

	}
}
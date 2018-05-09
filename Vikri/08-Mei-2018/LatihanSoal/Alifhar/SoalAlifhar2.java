/*  Created By Vikri
	08/05/2018
*/
public class SoalAlifhar2{
	public static void main(String[] args) {
		int bInggris, Istirahat, Math, baris, total, jam, jam2, menit, menit2, detik, detik2;
		
		bInggris = 6000;
		Istirahat = 1800;
		Math = 7200;
		baris = 1234;
		total = bInggris + Istirahat + Math + baris;

		jam = total/3600;
		jam2 = total%3600;
		menit = jam2/60;
		detik = jam2%60;

		System.out.println(total+" Jam "+menit+" Menit "+detik+" Detik");
	}
}
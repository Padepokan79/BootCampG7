package soalKangHendra1;

import java.util.ArrayList;

/**
 * SoalArrayList
 * Soal1.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 09.00.07 22 Jun 2018
 */

public class Soal1 {

	public static void main(String[] args) {
		String Budi,Bedu;
		double jarakBudi=350.0, jarakBedu=0.0, kecBudi=80.0/60.0, kecBedu=60.0/60.0;
		int waktu = 0;
		
		ArrayList<Integer> budi = new ArrayList<Integer>();
		ArrayList<Integer> bedu = new ArrayList<Integer>();
		
		bedu.add((int)jarakBedu);
		budi.add((int)jarakBudi);
		do {
			waktu++;
			jarakBedu = jarakBedu + kecBedu;
			jarakBudi = jarakBudi - kecBudi;
			bedu.add((int)jarakBedu);
			budi.add((int)jarakBudi);
		} while (bedu.get(waktu) < budi.get(waktu));
		
		System.out.println("Mereka bertemu pada kilometer ke "+bedu.get(waktu));
		System.out.println("Pada Menit ke "+waktu);
	}

}

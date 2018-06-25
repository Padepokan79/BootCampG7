package soal1;

import java.util.ArrayList;

/**
 * Created by : Alifhar Juliansyah
 * Jun 22, 2018
 * 8:58:20 AM
 */

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int waktu=0;
		double yogyakarta=0, malang=350, jarakBedu, jarakBudi;
		ArrayList<Integer> bedu=new ArrayList<Integer>();
		ArrayList<Integer> budi=new ArrayList<Integer>();
		double speedBeduPerjam=60, speedBudiPerjam=80, speedBeduPermenit=speedBeduPerjam/60, speedBudiPermenit=speedBudiPerjam/60;

		jarakBedu=yogyakarta;
		jarakBudi=malang;
		bedu.add((int)jarakBedu);
		budi.add((int)jarakBudi);
		do {
			waktu++;
			jarakBedu+=speedBeduPermenit;
			jarakBudi-=speedBudiPermenit;
//			System.out.println(speedBudiPermenit);
//			System.out.println(jarakBedu+" "+jarakBudi);
			bedu.add((int)jarakBedu);
			budi.add((int)jarakBudi);
		} while (bedu.get(waktu)<budi.get(waktu));
		
		System.out.println("Jarak mereka ketika bertemu adalah "+bedu.get(waktu));
		System.out.println("dengan waktu "+waktu+" menit");		
	}

}

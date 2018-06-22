package soal1;

/**
 * @author rifanandrian
 * @date Jun 22, 2018
 * @time 9:00:58 AM
 * email : muhamadrifanandrian@gmail.com
 */
import java.util.*;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kecBudiPerjam=80.0, kecBeduPerjam=60.0, kecBudiPerMenit=kecBudiPerjam/60.0, kecBeduPerMenit=kecBeduPerjam/60.0;
		double jarakBudi = 350, jarakBedu = 0;
		int menit=0;
		
		ArrayList<Integer> budi = new ArrayList<Integer>();
		ArrayList<Integer> bedu = new ArrayList<Integer>();
		
		budi.add(350);
		bedu.add(0);
		do {
			jarakBedu+=kecBeduPerMenit;
			jarakBudi-=kecBudiPerMenit;
			bedu.add((int) jarakBedu);
			budi.add((int) jarakBudi);
			System.out.println(jarakBedu);
			System.out.println(jarakBudi);
			menit++;
		} while (bedu.get(menit)<budi.get(menit));
		
		System.out.println("bertemu pada jarak "+bedu.get(menit));
		System.out.println(menit);
	}

}

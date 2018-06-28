package No1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> listJarakBedu = new ArrayList<Integer>();
		ArrayList<Integer> listJarakBudi = new ArrayList<Integer>();
//		ArrayList<Integer> listWaktuBedu = new ArrayList<Integer>();
		
		int		jarakTempuh = 350, kecepatanBedu = 60, kecepatanBudi = 80, jam = 6, waktu = 0,
				yohya = 0, malang = 350;
		double 	kecepatanBeduPermenit = kecepatanBedu / 60,
				kecepatanBudiPermenit = kecepatanBudi / 60,
				jarakBedu = 0, jarakBudi = 0;
		
//		for (int index = kecepatanBedu; index <= jarakTempuh; index += kecepatanBedu) {
//			waktu++;
//			listJarakBedu.add(index);
//			listWaktuBedu.add(waktu);
//		}
//		
//		for (int index = kecepatanBudi; index <= jarakTempuh; index += kecepatanBudi) {
//			waktu++;
//			listJarakBudi.add(index);
//		}
//		
//		for (Integer jarakBedu : listJarakBedu) {
//			System.out.println("Pada pukul " +listWaktuBedu.indexOf(jarakBedu)+ " dan jarak " +jarakBedu);
//		}
//		
//		for (Integer jarakBudi : listJarakBudi) {
//			System.out.println("Pada pukul  dan jarak " +jarakBudi);
//		}
		
		do {
			waktu++;
			jarakBedu += kecepatanBeduPermenit;
			jarakBudi -= kecepatanBudiPermenit;
			
			listJarakBedu.add((int) jarakBedu);
			listJarakBudi.add((int) jarakBudi);
		}while(listJarakBedu.get(waktu) < listJarakBudi.get(waktu));
		
		System.out.println("Budi dan Bedu bertemu pada jarak "+listJarakBedu.get(waktu));
		jam += waktu/60;
		System.out.println("pada jam "+jam);
	}
	
}

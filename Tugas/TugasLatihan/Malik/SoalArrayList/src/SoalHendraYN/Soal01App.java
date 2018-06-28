/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-22
 * 
 * */

package SoalHendraYN;

import java.util.ArrayList;

public class Soal01App {

	public static void main(String[] args) {
		int jarakBedu = 0, jarakBudi = 0, jarakKota = 350, jarakAwal = 0, 
			jarakTemuBedu = 0, range = 0, jarakTemuBudi = 0, waktu = 0, 
			kmMenit = 15, kmBeduMenit = 15, kmBudiMenit = 20, jam = 0, menit = 0, waktuBerangkat = 6;
		ArrayList<Integer> arrJarakBedu = new ArrayList<Integer>(); 
		ArrayList<Integer> arrJarakBudi = new ArrayList<Integer>(); 
		
		for(int index = jarakAwal; index < jarakKota; index += kmMenit) {
			arrJarakBedu.add(jarakBedu);
			arrJarakBudi.add(jarakBudi);
			jarakBedu += kmBeduMenit;
			jarakBudi += kmBudiMenit;
		}
		
		for(int index = 0; index < arrJarakBedu.size(); index++) {
			range = arrJarakBedu.get(index)+arrJarakBudi.get(index);
			if (range == jarakKota) {
				jarakTemuBedu = arrJarakBedu.get(index);
				jarakTemuBudi = arrJarakBudi.get(index);
				waktu = arrJarakBedu.indexOf(arrJarakBedu.get(index))*kmMenit;
				
			}
		}
		
		System.out.println("Jarak bedu "+jarakTemuBedu+" KM, jarak budi "+jarakTemuBudi+" KM");
		for(int index = 1; index <= waktu; index ++) {
			menit = index;
			if (menit == 60) { 
				jam++;
				index = 1;
				waktu -= 60;
			}
		}
		jam = waktuBerangkat+jam;
		System.out.println("Bedu dan budi berpapasan pada pukul "+jam+"."+menit);
		
		
		
	}

}

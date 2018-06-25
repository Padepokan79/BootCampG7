/*
 * DATE CREATED    : 22 JUNI 2018
 * DATE UPDATE     : 24 Juni 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalHendraYN;

import java.util.ArrayList;

public class MainAppSoal01 {

	public static void main(String[] args) {
		int jarakKota = 350, jarakAwal = 0, waktuBertemu = 0, pukulBerangkat = 6, waktuBertemuMenit = 0, waktuBerpapasan = 0;
		int jarakBedu = 0, jarakBudi = 0, range = 0, kmBedu = 15, kmBudi = 20, menit = 15;

		ArrayList<Integer> arrBedu = new ArrayList<Integer>();
		ArrayList<Integer> arrBudi = new ArrayList<Integer>();
		
		for(int index = jarakAwal; index <= jarakKota; index += menit) {
			arrBedu.add(jarakBedu);
			arrBudi.add(jarakBudi);
			jarakBedu += kmBedu;
			jarakBudi += kmBudi;
		}
		for(int index = 0; index < arrBedu.size(); index++) {
			range = arrBedu.get(index) + arrBudi.get(index);
			if (range == jarakKota) {
				jarakBedu = arrBedu.get(index);
				jarakBudi = arrBudi.get(index);
				waktuBerpapasan = arrBedu.indexOf(arrBedu.get(index))*menit;
			}	
		}
		System.out.println("Jarak Bedu -> "+jarakBedu+"Km - Jarak Budi -> "+jarakBudi+"Km");
		if (waktuBerpapasan >= 60) {
			waktuBertemu = waktuBerpapasan/60;
			waktuBertemuMenit = waktuBerpapasan - (waktuBertemu*60);
		}
		System.out.println("Pada pukul : 0"+(waktuBertemu+pukulBerangkat)+"."+waktuBertemuMenit+" pagi");
		
		
	}
}

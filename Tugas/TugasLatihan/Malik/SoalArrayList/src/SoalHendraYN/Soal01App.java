/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-22
 * 
 * */

package SoalHendraYN;

import java.util.ArrayList;

public class Soal01App {

	public static void main(String[] args) {
		int jarak = 350, kecBedu = 60, kecBudi = 80, jarakAwal = 0;
		ArrayList<Integer> arrJarakBedu = new ArrayList<Integer>(); 
		ArrayList<Integer> arrJarakBudi = new ArrayList<Integer>(); 
		
		for(int index = jarakAwal; index < jarak; index += 5) {
			arrJarakBedu.add(index);
		}
		System.out.println();
		for(int index = jarak; index > jarakAwal; index -= 5) {
			arrJarakBudi.add(index);
		}
		
		for(int index = 0; index < arrJarakBedu.size(); index += kecBedu) {
			
		}
		
		for(int jarakYogya : arrJarakBedu) {
			System.out.println(jarakYogya);
		}
		System.out.println();
		for(int jarakMalang : arrJarakBudi) {
			System.out.println(jarakMalang);
		}
	}

}

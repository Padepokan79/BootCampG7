/*
 * DATE CREATED    : 22 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalHendraYN;

import java.util.ArrayList;

public class MainAppSoal01 {

	public static void main(String[] args) {
		int jarakKota = 350, jarakAwal = 0;
		int kecepatanBedu = 60, kecepatanBudi = 80;

		ArrayList<Integer> arrBedu = new ArrayList<Integer>();
		ArrayList<Integer> arrBudi = new ArrayList<Integer>();
		
		for(int index = jarakAwal; index <= jarakKota; index += 5) {
			arrBedu.add(index);
		}
		for(int index = jarakKota; index >= jarakAwal ; index -= 5) {
			arrBudi.add(index);
		}
		
		for(int index = 0; index <= arrBedu.size(); index++) {
			if (arrBedu.get(index) == arrBudi.get(index)) {
				System.out.println("Berpapasan pada jarak "+arrBedu.get(index));
			}
		}
	}
	

}

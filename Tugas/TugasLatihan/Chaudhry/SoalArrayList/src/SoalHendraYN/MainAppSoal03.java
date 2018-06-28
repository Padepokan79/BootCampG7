/*
 * DATE CREATED    : 22 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalHendraYN;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAppSoal03 {
		
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String inputAngka;
		int banding01, banding02, jmlAngkaSama = 0, convert;
				;
		ArrayList<Integer> listAngka = new ArrayList<Integer>();
		ArrayList<Integer> listPosisi = new ArrayList<Integer>();
		
		listAngka.add(4);		listAngka.add(5);		listAngka.add(4);
		listAngka.add(3);		listAngka.add(7);		listAngka.add(6);
		listAngka.add(2);		listAngka.add(5);		listAngka.add(4);
		listAngka.add(4);		listAngka.add(3);		listAngka.add(3);
		listAngka.add(2);		listAngka.add(5);		listAngka.add(4);
		listAngka.add(6);		listAngka.add(3);		listAngka.add(4);
		listAngka.add(2);		listAngka.add(3);		listAngka.add(2);
		listAngka.add(5);		listAngka.add(23);		listAngka.add(2);
		
		System.out.print("Masukan angka yang dicari : ");
		inputAngka = key.nextLine();
		convert = Integer.parseInt(inputAngka);
		
		for(int index = 0; index < listAngka.size(); index++) {
			if (convert == listAngka.get(index)) {
				jmlAngkaSama += 1;
				listPosisi.add(index+1);
			}
		}
		System.out.println("");
		for (Integer angka : listAngka) {
			System.out.print(angka+" ");
		}
		System.out.println("");
		System.out.println("Angka "+inputAngka+" ada "+jmlAngkaSama+", ditemukan pada posisi");
		for (Integer obj : listPosisi) {
			System.out.print(obj+" ");
		}
	}

}

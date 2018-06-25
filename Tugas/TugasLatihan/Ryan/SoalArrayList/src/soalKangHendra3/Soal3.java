package soalKangHendra3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *SoalArrayList
 * Soal3.java
 ----------------------------
 * @author Ryan Ahmad Nuriana
 * 10.18.07 22 Jun 2018
 */
public class Soal3 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		ArrayList<Integer> angka = new ArrayList<Integer>(Arrays.asList(4, 3, 2, 4, 2, 6, 2, 5, 5, 7, 5, 3, 5, 3, 3, 23, 4, 6, 4, 3, 4, 4, 2, 2));
		int pilihan, cek=0;
		
		System.out.print("Masukan Angka : ");
		pilihan = key.nextInt();
		for (Integer integer : angka) {
			cek++;
			if (pilihan == integer) {
				System.out.print(cek+" ");
			}
		}
	}

}

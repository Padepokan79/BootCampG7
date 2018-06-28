package No3;

import java.util.ArrayList;
import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input	= new Scanner(System.in);
		ArrayList<Integer> listAngka = new ArrayList<Integer>();		
		listAngka.add(4);
		listAngka.add(3);
		listAngka.add(2);
		listAngka.add(4);
		listAngka.add(2);
		listAngka.add(6);
		listAngka.add(2);
		listAngka.add(5);
		listAngka.add(5);
		listAngka.add(7);
		listAngka.add(5);
		listAngka.add(3);
		listAngka.add(5);
		listAngka.add(3);
		listAngka.add(3);
		listAngka.add(23);
		listAngka.add(4);
		listAngka.add(6);
		listAngka.add(4);
		listAngka.add(3);
		listAngka.add(4);
		listAngka.add(4);
		listAngka.add(2);
		listAngka.add(2);
		
		ArrayList<Integer> listHasil = new ArrayList<Integer>();
		System.out.println("Masukkan angka yang diari : ");
		int angka = input.nextInt();
		int jumlah = 0;
		for (Integer angkaHasil : listAngka) {
			if (angka == angkaHasil) {
				listHasil.add(jumlah);
			}
			jumlah++;
		}
		System.out.println("Angka "+angka+" ada "+listHasil.size()+" ditemukan pada posisi");
		
		for (Integer hasil : listHasil) {
			System.out.print(hasil+", ");
		}
	}

}

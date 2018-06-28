package SoalHendraYN;

import java.util.ArrayList;
import java.util.Scanner;

public class SoalKetiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		int cari, index, banyak=0;
		ArrayList<Integer> arrAngka = new ArrayList<>();
		ArrayList<Integer> posisi = new ArrayList<>();
		arrAngka.add(4); 
		arrAngka.add(3);
		arrAngka.add(2);
		arrAngka.add(4);
		arrAngka.add(2);
		
		arrAngka.add(6);
		arrAngka.add(2);
		arrAngka.add(5);
		arrAngka.add(5);
		arrAngka.add(7);
		
		arrAngka.add(5);
		arrAngka.add(3);
		arrAngka.add(5);
		arrAngka.add(3);
		arrAngka.add(3);
		
		arrAngka.add(23);
		arrAngka.add(4);
		arrAngka.add(6);
		arrAngka.add(5);
		arrAngka.add(3);
		
		arrAngka.add(4);
		arrAngka.add(4);
		arrAngka.add(2);
		arrAngka.add(2);
		
		System.out.print("Masukan angka yang dicari : ");
		cari = key.nextInt();
		for(index = 0 ; index < arrAngka.size(); index++) {
			if(cari == arrAngka.get(index)) {
				banyak += 1;
				posisi.add(index + 1);
			}
		}
		
		System.out.println("Angka " + cari + " ada " + banyak +", ditemukan pada posisi");
		for (Integer integer : posisi) {
			System.out.print(integer +", ");
		}
	}

}

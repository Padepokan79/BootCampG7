/*
 * Name Create 	: Malik Chaudhary
 * Time Create  : 2018-06-22
 * 
 * */

package SoalHendraYN;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal03App {

	public static void main(String[] args) {
		int angkaCari, qtyAngka = 0;
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arrAngka = new ArrayList<Integer>();
		ArrayList<Integer> arrAngkaTemu = new ArrayList<Integer>();
		
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
		arrAngka.add(4);
		arrAngka.add(3);
		arrAngka.add(4);
		arrAngka.add(4);
		arrAngka.add(2);
		arrAngka.add(2);
		
		System.out.print("Masukan arrAngka yang dicari : ");
		angkaCari = scan.nextInt();
		
		for(int index = 0; index < arrAngka.size(); index++) {
			if (angkaCari == arrAngka.get(index)) {
				arrAngkaTemu.add(index+1);
				qtyAngka++;
			}
		}
		System.out.print("Angka "+angkaCari+" ada "+qtyAngka+", ditemukan pada posisi");
		System.out.println();
		for(int angka : arrAngkaTemu) {
			System.out.print(" "+angka);
		}
	}
}

package Menghitung;

import java.util.Scanner;

public class validasi {
	
	public validasi(){
		
	}
	
	public String validasiHuruf(String inputPilihan, Scanner key, int conversiInputan, boolean status, String kondisi) {
		do {
			System.out.print("Inputkan Angka : ");
			inputPilihan = key.nextLine();
			if(inputPilihan.matches("[0-9-.]*")) {
				if(kondisi.equals("menu")) {
					conversiInputan = Integer.parseInt(inputPilihan);
					
					if(conversiInputan > 8) {
						System.out.println("Inputan tidak boleh lebih dari 8");
						status = false;
					}else if(conversiInputan < 1) {
						System.out.println("Inputan tidak boleh kurang dari 1");
						status = false;
					}else {
						status = true;
					}
				}
				else if(kondisi.equals("hitung")){
					if(Integer.parseInt(inputPilihan) < 0) {
						status = false;
					}else {
						status = true;
					}
				}
			}
			else if(inputPilihan.indexOf('-') == 0) {
				System.out.println("Maaf inputan tidak boleh negatif");
			}
			else if(!inputPilihan.matches("[0-9]*")) {
				System.out.println("Maaf inputan hanya berupa angka!");
				status = false;
			}
			else {
				status = true;
			}
		}while(status != true);
		
		return inputPilihan;
	}
}


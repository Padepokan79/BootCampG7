package geometry;

import java.util.*;

public class BangunDatar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		Lingkaran datar1 = new Lingkaran();
		Persegi datar2 = new Persegi();
		Persegi datar3 = new Persegi();
		Segitiga datar4 = new Segitiga();
		String pick, repeatMenu;
		Boolean pickOption, repeat;
		double r, length, wide, side, alas, height;
		r=0;
		length=0;
		wide=0;
		side=0;
		alas=0;
		height=0;
		
		
		repeat=false;
		do {
			System.out.println("====================================");
			System.out.println("Menu Bangun Datar");
			System.out.println("====================================");
			System.out.println("1. Lingkaran");
			System.out.println("2. Persegi Panjang ");
			System.out.println("3. Persegi ");
			System.out.println("4. Segitiga ");
			System.out.println("====================================");
			
			pickOption=false;
			do {// looping validasi untuk pilih menu
				System.out.println("Silakan Pilih Menu : ");
				pick=key.next();
				if(validasiAngka(pick))	{
					if(Integer.parseInt(pick)>0&&Integer.parseInt(pick)<5) {
						pickOption=true;
					}
					else {
						pickOption=false;
						System.out.println("Input Harus angka dengan kisaran 1-4");
					}
				}			
			}while(pickOption==false);

			
			if(pick.equals("1")) {// jika pilih lingkaran
				System.out.println("Anda pilih menu LINGKARAN");
				pickOption=false;
				do {// validasi pilih luas atau keliling lingkaran
					pickOption=false;
					do {
						System.out.println("pilih Luas/Keliling");
						pick=key.next();
						pickOption = validasiHuruf(pick);
					}while(pickOption==false);
					
					if(pick.equals("Luas")) {
						pickOption=true;
						do {// validasi input jari-jari untuk Luas
							System.out.println("Masukkan jari jari : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									r=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						
						datar1.areaCircle(r);
					}
					else if(pick.equals("Keliling")) {
						pickOption=true;
						do {// validasi input jari-jari untuk keliling
							System.out.println("Masukkan jari jari : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									r=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						
						datar1.perimeterCircle(r);
					}
					else {
						pickOption=false;
						System.out.println("Input tidak ada yang benar !");
					}

				}while(pickOption==false);
				
			}
			else if(pick.equals("2")) {// jika pilih persegi panjang
				System.out.println("Anda pilih menu PERSEGI PANJANG");
				pickOption=false;
				do {// validasi pilih luas atau keliling persegi panjang
					pickOption=false;
					do {
						System.out.println("pilih Luas/Keliling");
						pick=key.next();
						pickOption = validasiHuruf(pick);
					}while(pickOption==false);
					
					if(pick.equals("Luas")) {
						pickOption=true;
						
						do {// looping validasi untuk input panjang untuk persegi panjang
							System.out.println("Masukkan Panjang  : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									length=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						do {// looping validasi untuk input lebar untuk persegi panjang
							System.out.println("Masukkan Lebar    : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									wide=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						
						datar2.areaRectangle(wide, length);
					}
					else if(pick.equals("Keliling")) {
						pickOption=true;
						do {// looping validasi input panjang untuk keliling persegi panjang
							System.out.println("Masukkan Panjang  : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									length=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						do {// looping validasi input lebar untuk kelling persegi panjang
							System.out.println("Masukkan Lebar    : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									wide=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						
						datar2.perimeterRectangle(wide, length);
					}
					else {
						pickOption=false;
						System.out.println("Input tidak ada yang benar !");
					}	
				}while(pickOption==false);
			}
			else if(pick.equals("3")) {// jika pilih persegi
				System.out.println("Anda pilih menu PERSEGI");
				pickOption=false;
				do {// validasi pilih luas atau keliling persegi
					pickOption=false;
					do {
						System.out.println("pilih Luas/Keliling");
						pick=key.next();
						pickOption = validasiHuruf(pick);
					}while(pickOption==false);
					
					if(pick.equals("Luas")) {
						pickOption=true;
						
						do {// looping validasi input sisi untuk Luas Persegi
							System.out.println("Masukkan sisi  : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									side=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						datar3.areaSquare(side);
					}
					else if(pick.equals("Keliling")) {
						pickOption=true;
						
						do {// looping validasi input sisi untuk keliling persegi
							System.out.println("Masukkan sisi  : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									side=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption);
						
						datar3.perimeterSquare(side);
					}
					else {
						pickOption=false;
						System.out.println("Input tidak ada yang benar !");
					}
				}while(pickOption==false);
			}
			else if(pick.equals("4")) {// jika pilih segitiga
				System.out.println("Anda pilih menu SEGITIGA");
				pickOption=false;
				do {// validasi pilih luas atau keliling segitiga
					pickOption=false;
					do {
						System.out.println("pilih Luas/Keliling");
						pick=key.next();
						pickOption = validasiHuruf(pick);
					}while(pickOption==false);
					
					if(pick.equals("Luas")) {
						pickOption=true;
						
						do {// looping validasi input alas untuk Luas segitiga
							System.out.println("Masukkan alas   : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									alas=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						
						do {// looping validasi input tinggi untuk Luas segitiga
							System.out.println("Masukkan tinggi : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									height=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						
						datar4.areaTriangle(alas, height);
					}
					else if(pick.equals("Keliling")) {
						pickOption=true;
						
						do {// validasi looping input sisi untuk keliling segitiga
							System.out.println("Masukkan sisi   : ");
							pick=key.next();
							if(validasiAngka(pick)) {
								if(Double.parseDouble(pick)>=0) {
									pickOption=true;
									side=Double.parseDouble(pick);
								}
								else {
									pickOption=false;
									System.out.println("Input Harus angka lebih dari nol");
								}
							}
							else {
								pickOption=false;
							}
						}while(pickOption==false);
						datar4.perimeterTriangle(side);
					}
					else {
						pickOption=false;
						System.out.println("Input tidak ada yang benar !");
					}
				}while(pickOption==false);
			}
			System.out.println("====================================");
			pickOption=false;

			do {
				System.out.print("Pilih Menu Lain (Ya/Tidak) ");		
				repeatMenu=key.next();
				pickOption=validasiHuruf(repeatMenu);
			}while(pickOption==false);
			
			if(repeatMenu.equals("Ya")) {
				repeat=true;
			}
			else {
				repeat=false;
				System.out.print("TERIMA KASIH !");		
			}
			
		}while(repeat==true);

	}

	private static Boolean validasiHuruf(String pick) {
		Boolean pickOption;
		if(pick.matches("([a-z A-Z])+")){
			pickOption=true;
		}
		else {
			pickOption=false;
			System.out.println("Input harus berupa huruf");
		}
		return pickOption;
	}

	private static Boolean validasiAngka(String pick) {
		Boolean pickOption;
		if(pick.matches("([-.0-9])+")) {
			pickOption=true;
		}
		else {
			pickOption=false;
			System.out.println("Input harus berupa angka !");
		}
		return pickOption;
	}
}



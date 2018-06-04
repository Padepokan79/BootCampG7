package geometry;

import java.util.*;

public class BangunRuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		Lingkaran tabung = new Lingkaran();
		Lingkaran bola = new Lingkaran();
		Persegi balok = new Persegi();
		Persegi kubus = new Persegi();
		String pick, repeatMenu;
		Boolean pickOption, repeat;
		double r, length, wide, side, alas, height, jari2;
		jari2=0;
		height=0;
		length=0;
		wide=0;
		side=0;
		alas=0;
		height=0;
		
		
		repeat=false;
		do {
			System.out.println("====================================");
			System.out.println("Menu Bangun Ruang");
			System.out.println("====================================");
			System.out.println("1. Volume Tabung");
			System.out.println("2. Volume Bola");
			System.out.println("3. Volume Balok");
			System.out.println("4. Volume Kubus");
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
			
			if(pick.equals("1")) {// jika pilih Volume Tabung
				System.out.println("Anda pilih menu Volume TABUNG");
				pickOption=false;
				do {// looping validasi untuk input jari-jari
					System.out.println("Masukkan jari jari	: ");
					pick=key.next();
					if(validasiAngka(pick)) {
//						pickOption=true;
//						jari2= Double.parseDouble(pick);
						if(Double.parseDouble(pick)>=0) {
							pickOption=true;
							jari2=Double.parseDouble(pick);
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
				
				pickOption=false;
				do {// looping validasi untuk input tinggi
					System.out.println("Masukkan Tinggi		: ");
					pick=key.next();
					if(validasiAngka(pick)) {
//						pickOption=true;
//						height= Double.parseDouble(pick);
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
				tabung.tubeCircle(jari2, height);
			}
			else if(pick.equals("2")) {// jika pilih Volume Bola
				System.out.println("Anda pilih menu Volume BOLA");

				pickOption=false;
				do {
					System.out.println("Masukkan jari jari	: ");
					pick=key.next();
					if(validasiAngka(pick)) {
//						pickOption=true;
//						jari2= Double.parseDouble(pick);
						if(Double.parseDouble(pick)>=0) {
							pickOption=true;
							jari2=Double.parseDouble(pick);
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
				bola.ballCirle(jari2);
			}
			else if(pick.equals("3")) {// jika pilih Volume Balok
				System.out.println("Anda pilih menu Volume BALOK");

				pickOption=false;
				do {// looping validasi untuk input panjang
					System.out.println("Masukkan Panjang	: ");
					pick=key.next();
					if(validasiAngka(pick)) {
//						pickOption=true;
//						length= Double.parseDouble(pick);
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

				pickOption=false;
				do {
					System.out.println("Masukkan Lebar		: ");
					pick=key.next();
					if(validasiAngka(pick)) {
//						pickOption=true;
//						wide= Double.parseDouble(pick);
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

				pickOption=false;
				do {
					System.out.println("Masukkan Tinggi		: ");
					pick=key.next();
					if(validasiAngka(pick)) {
//						pickOption=true;
//						height= Double.parseDouble(pick);
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
				balok.rectVolume(wide, height, length);
			}
			else if(pick.equals("4")) {// jika pilih Volume Kubus
				System.out.println("Anda pilih menu Volume KUBUS");
				pickOption=false;
				do {
					System.out.println("Masukkan sisi		: ");
					pick=key.next();
					if(validasiAngka(pick)) {
//						pickOption=true;
//						side= Double.parseDouble(pick);
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
				kubus.cubeVolume(side);
			}
			
			//=============================================
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

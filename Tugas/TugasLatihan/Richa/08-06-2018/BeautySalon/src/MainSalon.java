/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 09.05 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.Scanner;
import java.util.Date;

public class MainSalon {

	public static void main(String[] args) {
	
	String membership, apakahService, apakahProduct, jenisMember = " ";
	boolean apakahMember=false, valid = true;
	String hargaService, hargaProduct;
	
	Scanner keyboard = new Scanner (System.in);
	Date tanggal = new Date ();
	Visit v = new Visit ();
	
	
	System.out.println("=========WELCOME TO BEAUTY SALON=========");
	System.out.println();
	
	do {
		System.out.print("Masukkan nama: ");
		String nama = keyboard.next();
		Visit vis = new Visit(nama, tanggal);
		valid = validasiHuruf (nama,valid);
	} while (valid == false);
	
	do {
		System.out.println("Apakah Anda seorang Member? (y/t) ");
		membership = keyboard.next();
		valid = validasiHuruf (membership,valid);
		valid = validasiYaTidak(membership, valid);
	} while (valid == false);

	if (membership.equals("y")) {
		apakahMember = true;
	}
	else if (membership.equals("t")) {
		apakahMember = false;
	}
	v.setMember(apakahMember);
	
	if (apakahMember == true ) {
		do {
			System.out.println("Apakah jenis member Anda?");
			jenisMember = keyboard.next ();
			valid = validasiHuruf (jenisMember, valid);
			if (jenisMember.equals("premium") || jenisMember.equals("Premium")) {
				valid = true;
    		}
    		else if (jenisMember.equals("gold") || jenisMember.equals("Gold")) {
    			valid = true;
    		}
    		else if (jenisMember.equals("silver") || jenisMember.equals("Silver")) {
    			valid = true;
    		}
    		else {
    			System.out.println("Maaf member tidak ada. Silahkan input lagi!");
    			valid = false;
    		}
		} while (valid == false);
	}
	
	v.setMemberType(jenisMember);
	
	do {
		System.out.println("Apakah Anda ingin service? (y/t)");
		apakahService = keyboard.next ();
		valid = validasiHuruf (apakahService,valid);
		valid = validasiYaTidak(apakahService, valid);
	} while (valid == false);

	
	if (apakahService.equals("y")) {
		do {
			System.out.println("masukkan harga service");
			hargaService = keyboard.next ();
			valid = validasiAngka (hargaService, valid);
		} while (valid == false);
	}
	else {
		hargaService = "0";
	}
	
	v.setServiceExpense(convertStringtoDoub (hargaService));
	
	
	do {
		System.out.println("Apakah Anda ingin membeli product? (y/t)");
		apakahProduct = keyboard.next ();
		valid = validasiHuruf (apakahProduct,valid);
		valid = validasiYaTidak(apakahProduct, valid);
	} while (valid == false);
	
	if (apakahProduct.equals("y")) {
		do{
			System.out.println("masukkan harga product");
			hargaProduct = keyboard.next ();
			valid = validasiAngka (hargaProduct, valid);
		} while (valid == false);
		
	}
	else {
		hargaProduct = "0";
	}
	
	v.setProductExpense(convertStringtoDoub (hargaProduct));

	v.besarDiskon();
	
	System.out.println("Total bayar service: "+ hargaService);
	System.out.println("Total bayar product: " + hargaProduct);
	
	double totalHargaBelumDiskon = (convertStringtoDoub (hargaService)) +(convertStringtoDoub (hargaProduct));
	
	if (apakahMember == true) {
		System.out.println("Selamat, " + v.nama + "! karena Anda adalah anggota " + v.getMemberType()+ ", Anda mendapat diskon sebesar " + (totalHargaBelumDiskon- (v.getProductExpense()+v.getServiceExpense())) );
	}
			
	System.out.println("Sehingga total bayar Anda menjadi " + (v.getProductExpense()+v.getServiceExpense()));
	
	System.out.println();
	System.out.println("============THANKYOU============");
	
	}
	
	
	//METHOD-METHOD VALIDASI
	
	String input;
	boolean validAngka, validHuruf, validYaTidak;
	
	public static double convertStringtoDoub (String inputString) {
		return Double.parseDouble(inputString);
	}
	
	public static boolean validasiAngka (String input, boolean validAngka) {
		if (input.matches("[0-9]+")) {
			validAngka = true;
		}
		else {
			validAngka = false;
			System.out.println("Maaf, input harus berupa angka. Silahkan coba lagi!");
		}
		return validAngka;
	}
	
	public static boolean validasiHuruf (String input, boolean validHuruf) {
		if (input.matches("[a-zA-Z]+")) {
			validHuruf = true;
		}
		else {
			validHuruf = false;
			System.out.println("Maaf, input harus berupa huruf. Silahkan coba lagi!");
		}
		return validHuruf;
	}
	
	public static boolean validasiYaTidak (String input, boolean validYaTidak) {
		if (input.equals("y") || input.equals("t")) {
			validYaTidak = true;
		}
		else if (!input.equals("y") || !input.equals("t")) {
			System.out.println("Input harus dalam y/t");
			validYaTidak = false;
		}
		return validYaTidak;
	}
	
}


/*
Masukkan Nama               : rio
apakah anda Member          : y/t
    > kalau Member          : Premium, gold, silver

Masukkan tanggal            : 12-12-12
Apakah anda ingin service   : y/t
    > kalau service         : masukkan harga service

Apakah anda ingin product   : y/t
    > kalau product         : masukkan harga product

total bayar anda            : Double totalBayar
diskon                      : Double discount

1. Abstract class Person()
    - String nama, int usia, String gender
    - method toString()
2. Class Customer()
    - String nama, memberType
    - Boolean isMember
    -method toString()
3. class Visit()
    - Date date,  Double serviceExpense, Double productExpense, Double totalExpense, Double discount, 


*/
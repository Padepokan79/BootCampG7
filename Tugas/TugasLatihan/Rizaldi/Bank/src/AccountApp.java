import java.util.*;

import javax.print.attribute.standard.PrinterLocation;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		String input, nama;
		int id;
		Boolean cek=false, repeat=false;
		Double saldo=50000.0, setor=0.0, tarik=0.0, saldoTemp=0.0;

		
		cek=false;
		do {// validasi input nama
			System.out.println("Masukkan Nama\t: ");
			input = key.next();
			cek = valHuruf(input);
			nama = input;
		}while(cek==false);
		
		cek=false;
		do {
			System.out.println("Masukkan id\t: ");
			input = key.next();
			cek = valAngka(input);
			id = convertToInt(input);
		}while(cek==false);

		cek=false;
		do {
			System.out.println("Masukkan saldo awal\t: ");
			input = key.next();
			if(cek = valAngka(input)) {
				cek=true;
				saldo = convertToDouble(input);
			}
			else {
				cek=false;
			}

		}while(cek==false);
		System.out.println("\njumlah saldo awal\t: "+saldo);		
		System.out.println("==============================");
		Account acc = new Account(nama, id, saldo);// reference object
		System.out.println("nama\t: "+acc.name);		
		System.out.println("id\t: "+acc.idNumber);
		System.out.println("saldo\t: "+acc.saldo);
		System.out.println("==============================");
		repeat=false;
		do {
			System.out.println("\nMenu Nasabah");
			System.out.println("1. Cek Saldo");
			System.out.println("2. Menabung/Deposit");
			System.out.println("3. Withdraw/Tarik");
			System.out.println("0. Exit\n");

			cek=false;
			do {// validasi input menu
				System.out.println("Silakan Pilih Menu Nasabah :\t");
				input = key.next();
				cek = validasiInputMenu(input);
			}while(cek==false);

			if(cek=convertToInt(input)==1) {
				acc.viewSaldo();
				acc.saldo=saldo;
				System.out.println("Kembali ke menu awal (y/t)");
				input = key.next();
				repeat = repeatMenu(input);
			}
			else if(cek=convertToInt(input)==2) {
				cek=false;
				do {
					System.out.println("Masukkan jumlah uang :\t");
					input = key.next();
					if(cek = valAngka(input)) {
						if((setor = convertToDouble(input))>0.0) {
							cek=true;
						}
						else {
							cek=false;
							System.out.println("setor harus lebih dari nol");
						}
					}
					else {
						cek=false;
					}
				}while(cek==false);
				setor = convertToDouble(input);
				acc.saldo=saldo;
//				acc.setorBank(saldo, setor);
				saldoTemp=saldo+setor;

				System.out.println("Kembali ke menu awal (y/t)");
				input = key.next();
				repeat = repeatMenu(input);
			}
			else if(cek=convertToInt(input)==3) {
				cek=false;
				do {
					System.out.println("Masukkan jumlah uang :\t");
					input = key.next();
					if(cek = valAngka(input)) {
						if((tarik = convertToDouble(input))>0.0) {
							cek=true;
						}
						else {
							cek=false;
							System.out.println("setor harus lebih dari nol");
						}
					}
					else {
						cek=false;
					}
				}while(cek==false);
				acc.tarik=tarik;
				saldoTemp=saldo-tarik;
				acc.tarikBank();
				acc.saldo=saldo;
				System.out.println("Kembali ke menu awal (y/t)");
				input = key.next();
				repeat = repeatMenu(input);
			}
			else if(cek=convertToInt(input)==0) {
				repeat=false;
				System.out.println("TERIMA KASIH !!!");
			}
			acc.saldo=saldoTemp;
			saldo=saldoTemp;
		}while(repeat==true);

		
		
	}

	private static Boolean repeatMenu(String input) {
		Boolean repeat;
		if(input.matches("([a-zA-Z])+")) {
			if(input.equals("y")) {
				repeat=true;
			}
			else {
				repeat=false;
				System.out.println("TERIMA KASIH !!!");
			}
		}
		else {
			repeat=false;
			System.out.println("TERIMA KASIH !!!");
		}
		return repeat;
	}

	private static Double convertToDouble(String input) {
		return Double.parseDouble(input);
	}

	private static Boolean validasiInputMenu(String input) {
		Boolean cek;
		if(cek = valAngka(input)) {
			if((cek=convertToInt(input)>=0)&&(cek=convertToInt(input)<=3)) {
				cek=true;
			}
			else {
				cek=false;
				System.out.println("Input angka harus dalam range 0-3\n");
			}
		}
		else {
			cek=false;
		}
		return cek;
	}

	private static int convertToInt(String input) {
		return Integer.parseInt(input);
	}

	private static Boolean valAngka(String input) {
		Boolean cek;
		if(input.matches("([-.0-9])+")) {
			cek=true;
		}
		else {
			cek=false;
			System.out.println("Input hanya boleh angka\n");
		}
		return cek;
	}

	private static Boolean valHuruf(String input) {
		Boolean cek;
		if(input.matches("([a-z A-Z])+")) {
			cek=true;
		}
		else {
			cek=false;
			System.out.println("Input hanya boleh huruf\n");
		}
		return cek;
	}

}

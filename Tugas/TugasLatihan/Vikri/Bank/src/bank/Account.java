package bank;

import java.util.*;
public class Account {
	static Scanner scan = new Scanner(System.in);
	static String nama, id, deposit, quest, ans;
	static int conv, saldo;
	static boolean cek = false, cek2;
	public Account() {
		
	}
	static void cek() {
		if(cek == false) {
			cek = true;
		} else {
			cek = false;
		}
	}
	static void valHuruf() {
		if(ans.matches("[0-9-.*/ ]+")) {
			System.out.println("Inputan harus huruf");
		} else {
			cek();
		}
	}
	
	static void valAngka() {
		if(ans.matches("[0-9-.]+")) {
			if(Double.parseDouble(ans)>=0) {
				cek();
			} else {
				System.out.println("Angka tidak boleh kurang dari nol");
			}
		} else {
			System.out.println("Inputan harus angka");
		}
	}
	
	void garis() {
		System.out.println("=======================================");
	}
//	static String questions(String tanya) {
//		System.out.print(tanya+" ");
//		ans = scan.nextLine();
//		valHuruf();
//		return ans;
//	}
//	static String questions2(String tanya) {
//		System.out.print(tanya+" ");
//		ans = scan.next();
//		valAngka();
//		return ans;
//	}
	static int conv() {
		return conv =  (int) Double.parseDouble(ans);
	}
//	static String questions3(String tanya) {
//		System.out.print(tanya+" ");
//		ans = scan.next();
//		valAngka();
//		conv();
//		return ans;
//	}
	boolean validAng(boolean cek2, String quest) {
		cek = cek2;
		do {
			System.out.print(quest+" ");
			ans = scan.next();
			valAngka();
		}while(cek == false);
		return cek = true;
	}
	boolean validHuruf(boolean cek2, String quest) {
		cek = cek2;
		do {
			System.out.print(quest+" ");
			ans = scan.next();
			valHuruf();
		}while(cek == false);
		return cek = true;
	}
	int menu(int men) {
		do {
			validAng(false, "Masukan Menu: ");
		}while(men == 1);
		return men;
	}
	void validSaldoKurang(int saldo2, int tarikan){
		this.saldo = saldo2;
		if(saldo < tarikan) {
			System.out.println("Saldo anda hanya "+saldo+" kurang dari "+tarikan);
		} else {
			saldo -= tarikan;
			System.out.println("ditarik Rp. "+tarikan);
			System.out.println("Saldo sekarang Anda sebesar Rp. "+saldo);
		}
	}
	
	int tampilSaldo(int saldo) {
		this.saldo = saldo;
		garis();
		System.out.println("Saldo Anda sebesar Rp. "+saldo);
		garis();
		return saldo;
	}
	
	int tambahSaldo(boolean cek,int saldo2) {
		garis();
		int s;
		saldo = saldo2;
		do {
			validAng(false, "Masukan berapa saldonya: ");
			s = Integer.parseInt(ans);
			saldo += s;
			System.out.println("ditabung Rp. "+s);
			System.out.println("Saldo sekarang Anda sebesar Rp. "+saldo);
			cek = true;
		}while(cek==false);
		garis();
		return saldo;
	}
	
	int tarikSaldo(boolean cek, int saldo2) {
		garis();
		int s;
		do {
			validAng(false, "Masukan berapa saldo yang ditarik: ");
			s = Integer.parseInt(ans);
			validSaldoKurang(saldo2, s);
			cek = true;
		}while(cek==false);
		garis();
		return saldo;
	}
}

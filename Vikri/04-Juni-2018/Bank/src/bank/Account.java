package bank;

import java.util.*;
public class Account {
	static Scanner scan = new Scanner(System.in);
	static String nama, id, deposit, quest, ans;
	static int conv;
	static boolean cek = false;
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
	static String questions(String tanya) {
		System.out.print(tanya+" ");
		ans = scan.next();
		valHuruf();
		return ans;
	}
	static String questions2(String tanya) {
		System.out.print(tanya+" ");
		ans = scan.next();
		valAngka();
		return ans;
	}
	static int conv() {
		return conv =  (int) Double.parseDouble(ans);
	}
	static String questions3(String tanya) {
		System.out.print(tanya+" ");
		ans = scan.next();
		valAngka();
		conv();
		return ans;
	}
}

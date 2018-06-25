package bank;

import java.util.*;
public class AccountApp {
	public static void main(String[] args) {
		String nama, id;
		int dep, exit = 0, menu, temp = 0;
		
		Scanner scan = new Scanner(System.in);
		Account acc = new Account();
		
		do {
			acc.questions("Masukan Nama: ");
			nama = acc.ans;
		}while(acc.cek == false);
		
		do {
			acc.questions2("Masukan no id: ");
			id = acc.ans;
		}while(acc.cek == true);
		
		do {
			acc.questions2("Masukan Deposit Pertama Anda: ");		
		}while(acc.cek == false);
		dep = acc.conv();
		
		acc.garis();

		System.out.println("akun anda adalah "+id+" atas nama "+nama+" dengan saldo Rp. "+dep);
		temp += dep;
		
		do {
			int stop = 1;
			do {
				acc.questions3("Masukan Menu: ");
				menu = acc.conv;
				stop = 1;
			}while(stop == 0);
			
			if(menu < 0) {
				System.out.println("Angka tidak boleh kurang dari 0");
			} else if (menu > 3) {
				System.out.println("Angka lebih dari 4");
			} else if (menu == 0){
				exit = 1;
			} else {
				if(menu == 1) {
					System.out.println("Saldo Anda sebesar Rp. "+temp);
					exit = 1;
				} else if(menu == 2) {
					acc.cek = true;
					do {
						acc.questions2("Masukan saldo: ");
						int s = Integer.parseInt(acc.ans);
						temp += s;
						System.out.println("ditabung Rp. "+s);
						System.out.println("Saldo sekarang Anda sebesar Rp. "+temp);
					}while(acc.cek==false);
					exit = 1;
				} else {
					do {
						acc.questions2("Masukan berapa saldo yang ingin diambil: ");
						temp -= (int)acc.conv;
						System.out.println("diambil Rp. "+acc.conv);
						System.out.println("Saldo sekarang Anda sebesar Rp. "+temp);
					}while(acc.cek==true);
					exit = 1;
				} 
			}
		}while(exit == 1);
		System.out.println("thx :)");
	}
}

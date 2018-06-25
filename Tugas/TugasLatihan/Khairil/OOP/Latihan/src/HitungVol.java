import java.util.Scanner;
import validasi.*;
import volumeBangun.*;

class HitungVol {

	private static Scanner input;

	public static void main(String[] args) {
		String inputanMenu, inputanSisi, inputanPanjang, inputanLebar, inputanJari, inputanTinggi;
		int inputanMen, inputanSisiInt, inputanPanjangInt, inputanLebarInt, inputanJariInt, inputanTinggiInt;
		boolean cek = false;
		ValidAngka valAngka = new ValidAngka();
		Bola bolala = new Bola();
		KubusBalok kuba = new KubusBalok();
		Tabung tabungs = new Tabung();
		input = new Scanner(System.in);
		inputanMenu = inputanSisi = inputanPanjang = inputanLebar = "";
		inputanMen = inputanSisiInt = inputanJariInt = inputanTinggiInt = 0;
		inputanPanjangInt = inputanLebarInt = 0;
		
		System.out.println("Silahkan Pilih : ");
		System.out.println("1. Kubus");
		System.out.println("2. Bola");
		System.out.println("3. Balok");
		System.out.println("4. Tabung");
		while(cek == false) {
			System.out.println("Input pilihan anda:");
			inputanMenu = input.nextLine();
			
			if(valAngka.harusAngka(inputanMenu, cek)) {
				cek = true;
				if(inputanMen < 1 && inputanMen > 4) {
					System.out.println("Inputan salah.");
					System.out.println("Coba lagi");
					cek = false;					
				}
				else {
					cek = true;
				}
			}
			else {
				System.out.println("Inputan harus angka.");
				System.out.println("Coba lagi");				
				cek = false;
				
			}
		}
		inputanMen = Integer.parseInt(inputanMenu);
		
		if(inputanMen == 1) {
			System.out.println("Kubus");
			while(cek == true) {
				System.out.println("Input sisi:");
				inputanSisi = input.nextLine();
				if(valAngka.harusAngka(inputanSisi, cek)) {
					inputanSisiInt = Integer.parseInt(inputanSisi);				
					kuba.volumeKubus(inputanSisiInt);
					kuba.printVolumeKubus();
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}					
			}
		}
		else if(inputanMen == 2) {
			System.out.println("Bola");
			while(cek == true) {
				System.out.println("Input jari:");
				inputanJari = input.nextLine();
				if(valAngka.harusAngka(inputanJari, cek)) {
					inputanJariInt = Integer.parseInt(inputanJari);				
					bolala.volumeBola(inputanJariInt);
					bolala.printvolumeBola();
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}					
			}				
			cek = true;
		}
		else if(inputanMen == 3) {
			System.out.println("Balok");
			while(cek == true) {
				System.out.println("Input Panjang : ");
				inputanPanjang = input.nextLine();
				if(valAngka.harusAngka(inputanPanjang, cek)) {
					inputanPanjangInt = Integer.parseInt(inputanPanjang);				
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}
				System.out.println("Input Lebar : ");
				inputanLebar = input.nextLine();
				if(valAngka.harusAngka(inputanLebar, cek)) {
					inputanLebarInt = Integer.parseInt(inputanLebar);				
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}
				System.out.println("Input Tinggi : ");
				inputanTinggi = input.nextLine();
				if(valAngka.harusAngka(inputanTinggi, cek)) {
					inputanTinggiInt = Integer.parseInt(inputanTinggi);				
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}					
			}
			kuba.volumeBalok(inputanPanjangInt, inputanLebarInt, inputanTinggiInt);
			kuba.printVolumeBalok();
			cek = true;
		}			
		else if(inputanMen == 4) {
			System.out.println("Tabung");
			while(cek == true) {
				System.out.println("Input jari:");
				inputanJari = input.nextLine();
				if(valAngka.harusAngka(inputanJari, cek)) {
					inputanJariInt = Integer.parseInt(inputanJari);
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}
				System.out.println("Input tinggi : ");
				inputanTinggi = input.nextLine();
				if(valAngka.harusAngka(inputanTinggi, cek)) {
					inputanTinggiInt = Integer.parseInt(inputanTinggi);				
					cek = false;
				}
				else {
					System.out.println("Inputan harus angka.");
					System.out.println("Coba lagi");				
					cek = true;				
				}					
			}
			tabungs.volumeTabung(inputanJariInt, inputanTinggiInt);
			tabungs.printvolumeTabung();
			cek = true;
		}
		else {
			cek = false;
			System.out.println("Inputan salah.");
			System.out.println("Coba lagi");
		}
	}
}
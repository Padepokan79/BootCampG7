package bangunDatarRuang;
import java.util.Scanner;
public class PerhitunganBangunRuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input 	= new Scanner(System.in);
		Validation valid = new Validation();
		
		String 	inputMenu, masukan;
		boolean validasi = false;
		int 	inputPanjang, inputLuas, inputTinggi; //balok
		int 	inputSisi; //kubus
		int 	inputr;
		double  inputphi;
		
		do {
			System.out.println("Perhitungan Bangun Ruang");
			System.out.println("1. Balok");
			System.out.println("2. Kubus");
			System.out.println("3. Bola");
			System.out.println("4. Tabung");
			System.out.println("===============================");
			System.out.print("Masukkan pilihan anda: ");
			inputMenu = input.nextLine();
			System.out.println();
			//validasi
			if (inputMenu.matches("[0-9]+")) {
				if (Integer.parseInt(inputMenu) > 0 && Integer.parseInt(inputMenu) < 5) {
					validasi = true;
				}
				else {
					System.out.println();
					System.out.println("Gunakan angka 1-4");
					System.out.println();
				}
			}
			else {
				System.out.println();
				System.out.println("Tidak boleh kosong/menggunakan huruf/simbol");
				System.out.println();
			}
		}while(validasi == false);
		
		validasi = false;
		
		if (inputMenu.equals("1")) {
			SegiEmpat segiempat	= new SegiEmpat();
			//Balok
			do {
				System.out.print("Masukkan panjang: ");
				masukan = input.nextLine();
				validasi = valid.validasiInput(validasi, masukan);
			}while(validasi == false);
			inputPanjang = Integer.parseInt(masukan);
			
			do {
				System.out.print("Masukkan lebar: ");
				masukan = input.nextLine();
				validasi = inputValidasi(masukan, validasi);
			}while(validasi == false);
			inputLuas = Integer.parseInt(masukan);
			
			do {
				System.out.print("Masukkan tinggi: ");
				masukan = input.nextLine();
				validasi = inputValidasi(masukan, validasi);
			}while(validasi == false);
			inputTinggi = Integer.parseInt(masukan);
			
			//inisialisasi
			segiempat.panjangSE 	= inputPanjang;
			segiempat.luasPersegiSE = inputLuas;
			segiempat.tinggiSE 		= inputTinggi;
			
			//menghitung dan cetak volume balok
			System.out.println();
			segiempat.volumeBalok(inputPanjang, inputLuas, inputTinggi);
			segiempat.printVolumeBalok();
		}
		else if (inputMenu.equals("2")) {
			SegiEmpat segiempat	= new SegiEmpat();
			//kubus
			do {
				System.out.print("Masukkan panjang sisi: ");
				masukan = input.nextLine();
				validasi = inputValidasi(masukan, validasi);
			}while(validasi == false);
			inputSisi = Integer.parseInt(masukan);
			
			//inisialisasi
			segiempat.sisiSE 	= inputSisi;
			
			//menghitung dan cetak volume kubus
			System.out.println();
			segiempat.volumeKubus(inputSisi);
			segiempat.printVolumeKubus();
		}
		else if (inputMenu.equals("3")) {
			Lingkaran lingkaran	= new Lingkaran();
			//bola
			do {
				System.out.print("Masukkan jari-jari: ");
				masukan = input.nextLine();
				validasi = inputValidasi(masukan, validasi);
			}while(validasi == false);
			inputr = Integer.parseInt(masukan);
			inputphi = 22.0/7;
			
			//inisialisasi
			lingkaran.phiL 	= inputphi;
			lingkaran.rL 	= inputr;
			
			//mencetak dan hitung volume bola
			lingkaran.volumeBola();
			lingkaran.printVolumeBola();
		}
		else if (inputMenu.equals("4")) {
			Lingkaran lingkaran	= new Lingkaran();
			//tabung
			do {
				System.out.print("Masukkan jari-jari: ");
				masukan = input.nextLine();
				validasi = inputValidasi(masukan, validasi);
			}while(validasi == false);
			inputr = Integer.parseInt(masukan);
			
			do {
				System.out.print("Masukkan tinggi: ");
				masukan = input.nextLine();
				validasi = inputValidasi(masukan, validasi);
			}while(validasi == false);
			inputTinggi = Integer.parseInt(masukan);
			inputphi = 22.0/7;
			
			//INISIALISASI
			lingkaran.phiL = inputphi;
			lingkaran.rL = inputr;
			lingkaran.tL = inputTinggi;
			
			//mencetak dan hitung volume tabung
			lingkaran.volumeTabung();
			lingkaran.printVolumeTabung();
		}
		
	}

	private static boolean inputValidasi(String masukan, boolean validasi) {
		if (masukan.matches("[0-9]+") && !masukan.matches("-?[0-9]")) {
			if (Integer.parseInt(masukan) > 0) {
				validasi = true;
			}
			else {
				System.out.println("Masukkan angka lebih dari 0");
			}
		}
		else {
			System.out.println("Tidak boleh memasukkan huruf / simbol");
		}
		return validasi;
	}

}
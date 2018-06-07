package bank;

public class Contoh {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String tampInput;
		boolean cek = false;
		int input =0, sisi = 0, panjang=0, lebar=0, tinggi=0;
		
		System.out.println("Hitung bangun Datar dan bangun Ruang Persegi \n");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Balok");
		System.out.println("4. Kubus");
		
		do {
			System.out.println("\nMasukan bangun yang akan di hitung (1 s.d 4)");
			tampInput = kb.next();
			if (cekValidasi(cek, tampInput)) {
				if (convertKeInt(tampInput) > 0 && convertKeInt(tampInput) <=4) {
					cek = true;
					input = convertKeInt(tampInput);
				}else {
					System.out.println("Inputan yang anda masukan salah!!");
					System.out.println("Masukan angka 1 s.d 4 ");
				}
			}else {
				System.out.println("Inputan yang diterima hanya berupa angka !!");
			}
			
		} while (cek == false);

		if (input == 1) {
			cek = false;
			sisi = inputDanValidasi("Masukan Sisi dari Persegi", tampInput, kb, cek);
			SegiTiga persegi = new SegiTiga();
			persegi.luasDanKelilingPersegi();
			persegi.printLuasDanKeliling();
			
		} else if (input == 2) {
			cek = false;
			panjang = inputDanValidasi("Masukan Panjang ", tampInput, kb, cek);
			lebar = inputDanValidasi("Masukan Lebar ", tampInput, kb, cek);
			SegiTiga persegi = new SegiTiga(panjang, lebar);
			persegi.luasDanKelilingPersegiPanjang();
			persegi.printLuasDanKeliling();
		}else if (input == 3) {
			cek = false;
			panjang = inputDanValidasi("Masukan Panjang :", tampInput, kb, cek);
			lebar = inputDanValidasi("Masukan Lebar :", tampInput, kb, cek);
			tinggi = inputDanValidasi("Masukan Tinggi :", tampInput, kb, cek);
			SegiTiga persegi = new SegiTiga(panjang, lebar, tinggi);
			persegi.volumeBalok();
			persegi.printVolume();
		}else if (input == 4) {
			cek = false;
			sisi = inputDanValidasi("Masukan Sisi dari Kubus :", tampInput, kb, cek);
			SegiTiga persegi = new SegiTiga();
			persegi.volumeKubus();
			persegi.printVolume();
		}
		
	}
	public static boolean cekValidasi(boolean cek, String validasi) {
		if (validasi.matches("[0-9]*")) {
			if (Integer.parseInt(validasi) > 0) {
				cek = true;
			}	
		}
		return cek;
	}
	
	public static int convertKeInt(String inputString) {
		return Integer.parseInt(inputString);
	}
	
	public static boolean validasiCek(boolean cek, String tampInput) {
		if (cekValidasi(cek, tampInput)) {
			cek = true;
		}else {
			System.out.println("input yang diterima hanya berupa angka positif saja!!");
		}
		return cek;
	}
	public static int inputDanValidasi(String namaPertanyaan, String tampInput, Scanner kb, boolean cek) {
		do {
			System.out.println(namaPertanyaan);
			tampInput = kb.next();
			cek = validasiCek(cek, tampInput);	
		} while (cek == false);
		return convertKeInt(tampInput);
	}
}

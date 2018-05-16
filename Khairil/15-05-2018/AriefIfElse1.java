/*
	 Program     : Soal 1 - Arief
     Creator     : Khairil
     Created At  : 15 Mei 2018 11:01 AM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class AriefIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String inputHariLibur, inputSuratIzin, inputPengawalan;
		int inputPlatNomor, inputJenisKendaraan, inputTanggal, inputKapasitasMesin, satuAjah, nolAjah, mod, mod2, seribu;
		boolean liburY, liburT, siY, siT, pengalawanY, pengalawanT, rodaDua, same;

		System.out.println("___________________________________________");
		System.out.println();
		System.out.println("Jalan Bebas Hambatan dan Kenangan PasoePati");
		System.out.println("___________________________________________");
		System.out.println();
		System.out.print("Plat Nomor		: ");
		inputPlatNomor = keyboard.nextInt();
		System.out.print("Tanggal			: ");
		inputTanggal = keyboard.nextInt();		
		System.out.print("Hari Libur		: ");
		inputHariLibur = keyboard.next();
		System.out.print("Jenis Kendaraan	: ");
		inputJenisKendaraan = keyboard.nextInt();		
		System.out.print("Kapasitas Mesin	: ");
		inputKapasitasMesin = keyboard.nextInt();	
		System.out.print("Surat Izin		: ");
		inputSuratIzin = keyboard.next();
		System.out.print("Pengawalan		: ");
		inputPengawalan = keyboard.next();

		nolAjah = 0;
		satuAjah = 1;
		mod = inputPlatNomor % 2;
		mod2 = inputTanggal % 2;
		same = (mod == mod2);
		rodaDua = (inputKapasitasMesin >= 1000 || ( inputKapasitasMesin < 1000 && inputSuratIzin.equals("Y") && inputPengawalan.equals("Y") ));
		seribu = 1000;

		if(inputHariLibur.equals("Y")) {
			if(same || !same) {
				if(inputJenisKendaraan > 2 || (inputJenisKendaraan == 2 && rodaDua) ) {
					System.out.println("Diizinkan Masuk Tol");
				}
				else {
					System.out.println("Tidak diperbolehkan masuk");	
				}
			}
		}
		else if(inputHariLibur.equals("T")){
			if(same) {
				if(inputJenisKendaraan > 2 || (inputJenisKendaraan == 2 && rodaDua) ) {
					System.out.println("Diizinkan Masuk Tol");	
				}
				else {
					System.out.println("Tidak diperbolehkan masuk");
				}
			}
		}
	}
}
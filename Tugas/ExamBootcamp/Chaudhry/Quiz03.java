/*
	DATE CREATED      : 29 MEI 2018
	TIME START        : 10.35
	TIME FINISH       : 11.40
	AUTHOR            : NURDHIAT CHAUDHARY MALIK
*/	
import java.util.Scanner;
import java.util.Random;
public class Quiz03{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner key	= new Scanner(System.in);

		int conversiInputJml, conversiInputLama, minJmlKeluarga, maxJmlKeluarga, minLamaNabung, maxLamaNabung, hargaTabungan, penguranganHargaTabung, tglAwal, totalTabungan, setBulan;
		int bulanAwal, maxHariBulan, maxHariBulan2, maxHariFeb, operasiHitungBesaran, jan, feb, mar, april, mei, jun, juli, agus, sept, okt, nop, desem;
		String inputJmlKeluarga, inputLamaNabung;
		conversiInputJml 	= conversiInputLama = operasiHitungBesaran = totalTabungan = setBulan = 0;
		minJmlKeluarga 	= 2;
		maxJmlKeluarga	= 6;
		minLamaNabung 	= bulanAwal = tglAwal = 1;
		maxLamaNabung 	= 12;
		maxHariBulan 	= 31;
		maxHariBulan2	= 30;
		mar 			= 3;		okt 	= 10;
		mei 			= 5;		desem 	= 12;
		juli 			= 7;		jan 	= 1;
		agus 			= 8;

		feb 			= 2;		sept 	= 9;
		april 			= 4;		nop 	= 11;
		jun 			= 6;		maxHariFeb 	= 28;

		penguranganHargaTabung 	= 1000;
		hargaTabungan 	= 31000;

		do{
			System.out.println("");
			System.out.print("Input jumlah anggota keluarga : ");
			inputJmlKeluarga = key.nextLine();
			
			if (inputJmlKeluarga.matches("[0-9]*")) {
				conversiInputJml = Integer.parseInt(inputJmlKeluarga);

				if (conversiInputJml < minJmlKeluarga) {
					System.out.println("Maaf jumlah keluarga tidak boleh kurang dari 2");
				}
				else if (conversiInputJml > maxJmlKeluarga) {
					System.out.println("Maaf jumlah keluarga tidak boleh lebih dari 6");
				}
			}
			else if (!inputJmlKeluarga.matches("[0-9]*")) {
					System.out.println("Maaf inputan yang diterima hanya berupa angka");
			}
	
		}while(conversiInputJml < minJmlKeluarga || conversiInputJml > maxJmlKeluarga || !inputJmlKeluarga.matches("[0-9]*") );

		do{	
				System.out.print("Input Lama tabungan : ");
				inputLamaNabung = key.nextLine();
				if (inputLamaNabung.matches("[0-9]*")) {
					conversiInputLama = Integer.parseInt(inputLamaNabung);
					
					if (conversiInputLama > maxLamaNabung) {
						System.out.println("Maaf Lama tabungan tidak boleh lebih dari 12");
					}
					else if (conversiInputLama < minLamaNabung) {
						System.out.println("Maaf Lama tabungan tidak boleh kurang dari 1");
					}
				}
				else if (!inputLamaNabung.matches("[0-9]*")) {
						System.out.println("Maaf inputan yang diterima hanya berupa angka");
				}

		}while(conversiInputLama > maxLamaNabung || conversiInputLama < minLamaNabung || !inputLamaNabung.matches("[0-9]*"));		
		
		for (int index = bulanAwal; index <= conversiInputLama; index++) {
			

			if (index == feb) {
				hargaTabungan 		 = 28000;
				operasiHitungBesaran = 0;
				tglAwal 			 = 1;
				for (int tanggal = tglAwal; tanggal <= maxHariFeb; tanggal++) {
					if (tanggal != tglAwal) {
						hargaTabungan 	= (hargaTabungan - penguranganHargaTabung);
					}
					operasiHitungBesaran = operasiHitungBesaran + hargaTabungan;
				}
			}

			if (index == jan || index == mar || index == mei || index == juli || index == agus || index == okt || index == desem) {
				hargaTabungan 		 = 31000;
				operasiHitungBesaran = 0;
				tglAwal 			 = 1;
				for (int tanggal = tglAwal; tanggal <= maxHariBulan; tanggal++) {
					if (tanggal != tglAwal) {
						hargaTabungan 	= (hargaTabungan - penguranganHargaTabung);
					}
					operasiHitungBesaran = operasiHitungBesaran + hargaTabungan;
				}
			}

			if (index == april || index == jun || index == sept || index == nop) {
				hargaTabungan 		 = 31000;
				operasiHitungBesaran = 0;
				tglAwal 			 = 1;
				for (int tanggal = tglAwal; tanggal <= maxHariBulan2; tanggal++) {
					if (tanggal != tglAwal) {
						hargaTabungan 	= (hargaTabungan - penguranganHargaTabung);
					}
					operasiHitungBesaran = operasiHitungBesaran + hargaTabungan;
				}
			}
			operasiHitungBesaran = operasiHitungBesaran*conversiInputJml;
			System.out.println("Tabungan pada bulan ke "+index+" sebesar "+(operasiHitungBesaran));
			totalTabungan 	= totalTabungan + operasiHitungBesaran;
			setBulan += 1;
		}
			System.out.println("Total tabungan selama "+setBulan+" dengan "+inputJmlKeluarga+" adalah "+totalTabungan);						

	}
}
/*
 * DATE CREATED    : 22 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalRizaldiKhairilRicha;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String inputAngka;
		int incomeSenin = 0, incomeSelasa = 0, incomeRabu = 0, incomeKamis = 0, incomeJumat = 0, incomeSabtu = 0, incomeMinggu = 0, incomeSeminggu = 0;
		int totalReguler = 0, totalVip = 0, totalVvip = 0, indexTiket = 0, maxReguler = 100, maxVip = 60, maxVvip = 40;
		double rasio = 0;
		maxReguler *= 7;
		maxVip *= 7;
		maxVvip *= 7;
		
		TiketBioskop reguler = new TiketBioskop("Reguler", 35000, 80, 50, 50, 75, 20, 100, 100);
		TiketBioskop vip = new TiketBioskop("Vip", 50000, 30, 20, 20, 23, 50, 60, 60);
		TiketBioskop vvip = new TiketBioskop("Vvip", 75000, 15, 30, 30, 30, 25, 40, 40);
		
		ArrayList<TiketBioskop> listTiket = new ArrayList<TiketBioskop>();
		listTiket.add(reguler);
		listTiket.add(vip);
		listTiket.add(vvip);
		
		TiketBioskop qtyReguler = new TiketBioskop(80, 50, 50, 75, 20, 100, 100);
		TiketBioskop qtyVip = new TiketBioskop(30, 20, 20, 23, 50, 60, 60);
		TiketBioskop qtyVvip = new TiketBioskop(15, 30, 30, 30, 25, 40, 40);
		
		ArrayList<TiketBioskop> totalQtyReguler = new ArrayList<TiketBioskop>();
		totalQtyReguler.add(qtyReguler);
		ArrayList<TiketBioskop> totalQtyVip = new ArrayList<TiketBioskop>();
		totalQtyVip.add(qtyVip);
		ArrayList<TiketBioskop> totalQtyVvip = new ArrayList<TiketBioskop>();
		totalQtyVvip.add(qtyVvip);
			
		for (TiketBioskop tiketReguler : totalQtyReguler) {			for (TiketBioskop tiketVip : totalQtyVip) {			for (TiketBioskop tiketVvip : totalQtyVvip) {
			totalReguler += tiketReguler.tiketSenin;					totalVip += tiketVip.tiketSenin;					totalVvip += tiketVvip.tiketSenin;
			totalReguler += tiketReguler.tiketSelasa;					totalVip += tiketVip.tiketSelasa;					totalVvip += tiketVvip.tiketSelasa;
			totalReguler += tiketReguler.tiketRabu;						totalVip += tiketVip.tiketRabu;						totalVvip += tiketVvip.tiketRabu;
			totalReguler += tiketReguler.tiketKamis;					totalVip += tiketVip.tiketKamis;					totalVvip += tiketVvip.tiketKamis;
			totalReguler += tiketReguler.tiketJumat;					totalVip += tiketVip.tiketJumat;					totalVvip += tiketVvip.tiketJumat;
			totalReguler += tiketReguler.tiketSabtu;					totalVip += tiketVip.tiketSabtu;					totalVvip += tiketVvip.tiketSabtu;
			totalReguler += tiketReguler.tiketMinggu;					totalVip += tiketVip.tiketMinggu;					totalVvip += tiketVvip.tiketMinggu;
		}															}													}
		ArrayList<Integer> totalTiket = new ArrayList<Integer>();
		totalTiket.add(totalReguler*4);
		totalTiket.add(totalVip*4);
		totalTiket.add(totalVvip*4);
		
		ArrayList<String> namaTiket = new ArrayList<String>();
		namaTiket.add("Reguler");
		namaTiket.add("Vip");
		namaTiket.add("Vvip");
		
		for (TiketBioskop tiketBioskop : listTiket) {
			incomeSenin += tiketBioskop.getHargaTiket()*tiketBioskop.tiketSenin;
			incomeSelasa += tiketBioskop.getHargaTiket()*tiketBioskop.tiketSelasa;
			incomeRabu += tiketBioskop.getHargaTiket()*tiketBioskop.tiketRabu;
			incomeKamis += tiketBioskop.getHargaTiket()*tiketBioskop.tiketKamis;
			incomeJumat += tiketBioskop.getHargaWeekEns()*tiketBioskop.tiketJumat;
			incomeSabtu += tiketBioskop.getHargaWeekEns()*tiketBioskop.tiketSabtu;
			incomeMinggu += tiketBioskop.getHargaWeekEns()*tiketBioskop.tiketMinggu;	
		}
		incomeSeminggu = incomeSenin + incomeSelasa + incomeRabu + incomeKamis + incomeJumat + incomeSabtu + incomeMinggu;

		System.out.println("[1] --> Total penjualan tiket perhari");
		System.out.println("[2] --> Total penjualan tiket seminggu");
		System.out.println("[3] --> Jenis tiket terbanyak dijual selama sebulan");
		System.out.println("[4] --> Jenis tiket tersedikit dijual selama sebulan");
		System.out.println("[5] --> Rata-rata jumlah penjualan tiket perkelas selama sebulan");
		System.out.println("[6] --> Persentasi rasio penjualan dari ketiga kelas masing masing tiket perminggu");
		System.out.print("Masukan pilihan : ");
		inputAngka = key.nextLine();
		
		if (inputAngka.equals("1")) {
			System.out.println("Penjualan tiket hari senin Rp."+incomeSenin);
			System.out.println("Penjualan tiket hari selasa Rp."+incomeSelasa);
			System.out.println("Penjualan tiket hari rabu Rp."+incomeRabu);
			System.out.println("Penjualan tiket hari kamis Rp."+incomeKamis);
			System.out.println("Penjualan tiket hari jumat Rp."+incomeJumat);
			System.out.println("Penjualan tiket hari sabtu Rp."+incomeSabtu);
			System.out.println("Penjualan tiket hari minggu Rp."+incomeMinggu);
		
		}else if (inputAngka.equals("2")) {
			System.out.println("Penjualan tiket selama seminggu Rp."+incomeSeminggu);
			
		}else if (inputAngka.equals("3")) {
			for(int index = 0; index < totalTiket.size(); index++) {
				if (totalTiket.get(0) < totalTiket.get(index)) {
					indexTiket = index;
				}
			}
			System.out.println("Tiket terbanyak dijual selama sebulan adalah Tiket "+namaTiket.get(indexTiket)+" sebanyak "+totalTiket.get(indexTiket));
		
		}else if (inputAngka.equals("4")) {
			for(int index = 0; index < totalTiket.size(); index++) {
				if (totalTiket.get(0) > totalTiket.get(index)) {
					indexTiket = index;
				}
			}
			System.out.println("Tiket tersedikit dijual selama sebulan adalah Tiket "+namaTiket.get(indexTiket)+" sebanyak "+totalTiket.get(indexTiket));
		
		}else if (inputAngka.equals("5")) {
			System.out.println("Rata rata jumlah penjualan Tiket "+namaTiket.get(0)+" perhari selama sebulan adalah "+totalTiket.get(0)/30);
			System.out.println("Rata rata jumlah penjualan Tiket "+namaTiket.get(1)+" perhari selama sebulan adalah "+totalTiket.get(1)/30);
			System.out.println("Rata rata jumlah penjualan Tiket "+namaTiket.get(2)+" perhari selama sebulan adalah "+totalTiket.get(2)/30);
		
		}else if (inputAngka.equals("6")) {
			rasio = (totalReguler*100)/maxReguler;
			System.out.println("Persentase tiket "+namaTiket.get(0)+" adalah "+rasio+"%");
			rasio = (totalVip*100)/maxVip;
			System.out.println("Persentase tiket "+namaTiket.get(1)+" adalah "+rasio+"%");
			rasio = (totalVvip*100)/maxVvip;
			System.out.println("Persentase tiket "+namaTiket.get(2)+" adalah "+rasio+"%");
		
		}
	}

}

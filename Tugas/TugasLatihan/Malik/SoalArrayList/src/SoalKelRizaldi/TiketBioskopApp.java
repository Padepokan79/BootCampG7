package SoalKelRizaldi;

import java.util.ArrayList;
import java.util.Scanner;

public class TiketBioskopApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu,
		incomeSenin = 0,
		incomeSelasa= 0,
		incomeRabu  = 0,
		incomeKamis = 0,
		incomeJumat = 0,
		incomeSabtu = 0,
		incomeMinggu= 0,
		qtySenin 	= 0,
		qtySelasa	= 0,
		qtyRabu  	= 0,
		qtyKamis 	= 0,
		qtyJumat 	= 0,
		qtySabtu 	= 0,
		qtyMinggu	= 0,
		qtyRegular  = 0,
		qtyVip		= 0,
		qtyVvip 	= 0,
		indexTiket  = 0,
		maxRegular 	= 100,
		maxVip 		= 60,
		maxVvip 		= 40;
		
		TiketBioskop reguler = new TiketBioskop("Regular", 35000, 80, 50, 50, 75, 20, 100, 100);
		TiketBioskop vip 	 = new TiketBioskop("Vip", 50000, 30, 20, 20, 23, 50, 60, 60); 
		TiketBioskop vvip 	 = new TiketBioskop("Vvip", 75000, 15, 30, 30, 30, 25, 40, 40);
		
		TiketBioskop jumRegular  = new TiketBioskop(80, 50, 50, 75, 20, 100, 100);
		TiketBioskop jumVip 	 = new TiketBioskop(30, 20, 20, 23, 50, 60, 60);
		TiketBioskop jumVvip 	 = new TiketBioskop(15, 30, 30, 30, 25, 40, 40);
		
		
		System.out.println();
		System.out.println("1. total penjualan tiket perhari");
		System.out.println("2. total penjualan tiket seminggu");
		System.out.println("3. jenis tiket terbanyak dijual selama sebulan");
		System.out.println("4. jenis tiket tersedikit dijual selama sebulan");
		System.out.println("5. rata rata jumlah penjualan tiket perkelas selama sebulan (4 minggu)");
		System.out.println("6. persentasi rasio penjualan dari ketiga kelas masing masing tiket perminggu.");
		System.out.print("Masukan menu pilihan : ");
		menu = scan.nextInt();
		
		ArrayList<TiketBioskop> arrBioskop    = new ArrayList<TiketBioskop>();
		ArrayList<TiketBioskop> arrQtyRegular = new ArrayList<TiketBioskop>();
		ArrayList<TiketBioskop> arrQtyVip	  = new ArrayList<TiketBioskop>();
		ArrayList<TiketBioskop> arrQtyVvip	  = new ArrayList<TiketBioskop>();
		ArrayList<Integer> arrQtyTiket	  	  = new ArrayList<Integer>();
		ArrayList<String> arrNamaTiket	  	  = new ArrayList<String>();
		
		arrBioskop.add(reguler);
		arrBioskop.add(vip);
		arrBioskop.add(vvip);
		
		arrQtyRegular.add(jumRegular);
		arrQtyVip.add(jumVip);
		arrQtyVvip.add(jumVvip);
		
		for(TiketBioskop tiket : arrBioskop) {
			arrNamaTiket.add(tiket.kelasTiket);
			incomeSenin += tiket.hargaDays*tiket.qtySenin;
			incomeSelasa += tiket.hargaDays*tiket.qtySelasa;
			incomeRabu += tiket.hargaDays*tiket.qtyRabu;
			incomeKamis += tiket.hargaDays*tiket.qtyKamis;
			incomeJumat += tiket.hargaEnd*tiket.qtyJumat;
			incomeSabtu += tiket.hargaEnd*tiket.qtySabtu;
			incomeMinggu += tiket.hargaEnd*tiket.qtyMinggu;
		}
		
		for(TiketBioskop tiket : arrQtyRegular) {
			qtyRegular += tiket.qtySenin;
			qtyRegular += tiket.qtySelasa;
			qtyRegular += tiket.qtyRabu;
			qtyRegular += tiket.qtyKamis;
			qtyRegular += tiket.qtyJumat;
			qtyRegular += tiket.qtySabtu;
			qtyRegular += tiket.qtyMinggu;
		}
		
		for(TiketBioskop tiket : arrQtyVip) {
			qtyVip += tiket.qtySenin;
			qtyVip += tiket.qtySelasa;
			qtyVip += tiket.qtyRabu;
			qtyVip += tiket.qtyKamis;
			qtyVip += tiket.qtyJumat;
			qtyVip += tiket.qtySabtu;
			qtyVip += tiket.qtyMinggu;
		}
		
		for(TiketBioskop tiket : arrQtyVvip) {
			qtyVvip += tiket.qtySenin;
			qtyVvip += tiket.qtySelasa;
			qtyVvip += tiket.qtyRabu;
			qtyVvip += tiket.qtyKamis;
			qtyVvip += tiket.qtyJumat;
			qtyVvip += tiket.qtySabtu;
			qtyVvip += tiket.qtyMinggu;
		}
		
		arrQtyTiket.add(qtyRegular);
		arrQtyTiket.add(qtyVip);
		arrQtyTiket.add(qtyVvip);
		
		if (menu == 1) {
			System.out.println("Penghasilan hari senin  : Rp. "+incomeSenin);
			System.out.println("Penghasilan hari selasa : Rp. "+incomeSelasa);
			System.out.println("Penghasilan hari rabu   : Rp. "+incomeRabu);
			System.out.println("Penghasilan hari kamis  : Rp. "+incomeKamis);
			System.out.println("Penghasilan hari jumat  : Rp. "+incomeJumat);
			System.out.println("Penghasilan hari sabtu  : Rp. "+incomeSabtu);
			System.out.println("Penghasilan hari minggu : Rp. "+incomeMinggu);
		}else if (menu == 2) {
			System.out.println("Penghasilan seminggu : Rp. "+(incomeJumat+incomeKamis+incomeRabu+incomeSelasa+incomeSenin+incomeSabtu+incomeMinggu));
		}else if (menu == 3) {
			for(int index = 0; index < arrQtyTiket.size(); index++) {
				if (arrQtyTiket.get(0) < arrQtyTiket.get(index)) {
					indexTiket = index;
				}
			}
			System.out.println("Jenis tiket paling banyak terjual adalah "+arrNamaTiket.get(indexTiket)+" Sebanyak "+arrQtyTiket.get(indexTiket));
		}else if (menu == 4) {
			for(int index = 0; index < arrQtyTiket.size(); index++) {
				if (arrQtyTiket.get(0) > arrQtyTiket.get(index)) {
					indexTiket = index;
				}
			}
			System.out.println("Jenis tiket paling sedikit terjual adalah "+arrNamaTiket.get(indexTiket)+" Sebanyak "+arrQtyTiket.get(indexTiket));
		}else if (menu == 5) {
			System.out.println("Rata rata jumlah penjualan tiket "+arrNamaTiket.get(0)+" perhari selama sebulan adalah "+((arrQtyTiket.get(0)*4)/30));
			System.out.println("Rata rata jumlah penjualan tiket "+arrNamaTiket.get(1)+" perhari selama sebulan adalah "+((arrQtyTiket.get(1)*4)/30));
			System.out.println("Rata rata jumlah penjualan tiket "+arrNamaTiket.get(2)+" perhari selama sebulan adalah "+((arrQtyTiket.get(2)*4)/30));
		}else if (menu == 6) {
			int rasioRegular, rasioVip, rasioVvip;
			maxRegular  = maxRegular*7;
			maxVip 		= maxVip*7;
			maxVvip 	= maxVvip*7;
			
			rasioRegular = (qtyRegular*100)/maxRegular;
			rasioVip 	 = (qtyVip*100)/maxVip;
			rasioVvip	 = (qtyVvip*100)/maxVvip;
			for(int index = 0; index < 4; index++) {
				
			}
			System.out.println("Persentase penjualan tiket regular adalah "+rasioRegular+"%");
			System.out.println("Persentase penjualan tiket vip adalah "+rasioVip+"%");
			System.out.println("Persentase penjualan tiket vvip adalah "+rasioVvip+"%");
		}
	}

}

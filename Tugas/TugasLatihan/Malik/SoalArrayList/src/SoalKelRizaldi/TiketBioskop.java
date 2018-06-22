package SoalKelRizaldi;

public class TiketBioskop {
	String kelasTiket;
	int hargaDays, hargaEnd, qtySenin, qtySelasa, qtyRabu, qtyKamis, qtyJumat, qtySabtu, qtyMinggu;
	
	TiketBioskop(String kelas, int harga, int qtySenin, int qtySelasa, int qtyRabu, int qtyKamis, int qtyJumat, int qtySabtu, int qtyMinggu){
		kelasTiket 		= kelas;
		hargaDays 		= harga;
		hargaEnd 		= harga+10000;
		this.qtySenin	= qtySenin;
		this.qtySelasa 	= qtySelasa;
		this.qtyRabu 	= qtyRabu;
		this.qtyKamis 	= qtyKamis;
		this.qtyJumat 	= qtyJumat;
		this.qtySabtu 	= qtySabtu;
		this.qtyMinggu 	= qtyMinggu;
	}
	
	TiketBioskop(int qtySenin, int qtySelasa, int qtyRabu, int qtyKamis, int qtyJumat, int qtySabtu, int qtyMinggu){
		this.qtySenin	= qtySenin;
		this.qtySelasa 	= qtySelasa;
		this.qtyRabu 	= qtyRabu;
		this.qtyKamis 	= qtyKamis;
		this.qtyJumat 	= qtyJumat;
		this.qtySabtu 	= qtySabtu;
		this.qtyMinggu 	= qtyMinggu;
	}
	
}

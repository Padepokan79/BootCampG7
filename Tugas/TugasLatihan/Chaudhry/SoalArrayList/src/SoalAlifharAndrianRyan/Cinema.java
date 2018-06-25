/*
 * DATE CREATED    : 22 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

package SoalAlifharAndrianRyan;

public class Cinema {
	String jenisTiket;
	int kapasitas, kapasitasSenin, kapasitasSelasa, kapasitasRabu, kapasitasKamis, kapasitasJumat, kapasitasSabtu, kapasitasMinggu;
	private int hargaWeeks, hargaWeekEnd;
	
	public Cinema() {
		
	}
	public Cinema(String jenisTiket, int kapasitas, int hargaWeeks, int hargaWeekEnd, int kapasitasSenin, int kapasitasSelasa, int kapasitasRabu, int kapasitasKamis, int kapasitasJumat, int kapasitasSabtu, int kapasitasMinggu ) {
		this.jenisTiket = jenisTiket;
		this.kapasitas = kapasitas;
		this.hargaWeeks = hargaWeeks;
		this.hargaWeekEnd = hargaWeekEnd;
		this.kapasitasSenin = kapasitasSenin;
		this.kapasitasSelasa = kapasitasSelasa;
		this.kapasitasRabu = kapasitasRabu;
		this.kapasitasKamis = kapasitasKamis;
		this.kapasitasJumat = kapasitasJumat;
		this.kapasitasSabtu = kapasitasSabtu;
		this.kapasitasMinggu = kapasitasMinggu;
	}
	
	int getHargaWeeks() {
		return hargaWeeks;
	}
	int getHargaWeekEnd() {
		return hargaWeekEnd;
	}
}

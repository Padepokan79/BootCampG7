/*
 * DATE CREATED : 21 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */
public class Kereta {
	private int hargaTiket;
	int jmlPenumpangSatu, jmlPenumpangDua, jmlPenumpangTiga, jmlPenumpangEmpat, jmlPenumpangLima, jmlPenumpangEnam, jmlPenumpangTujuh;
	String jenisKelas;
	
	public Kereta() {
		
	}
	public Kereta(String jenisKelas, int hargaTiket, int jmlPenumpangSatu, int jmlPenumpangDua, int jmlPenumpangTiga, int jmlPenumpangEmpat, int jmlPenumpangLima, int jmlPenumpangEnam, int jmlPenumpangTujuh ) {
		this.jenisKelas = jenisKelas;
		this.hargaTiket = hargaTiket;
		this.jmlPenumpangSatu = jmlPenumpangSatu;
		this.jmlPenumpangDua  = jmlPenumpangDua;
		this.jmlPenumpangTiga = jmlPenumpangTiga;
		this.jmlPenumpangEmpat = jmlPenumpangEmpat;
		this.jmlPenumpangLima = jmlPenumpangLima;
		this.jmlPenumpangEnam = jmlPenumpangEnam;
		this.jmlPenumpangTujuh = jmlPenumpangTujuh;
	}
	
	int getHargaTiket() {
		return hargaTiket;
	}
	
}

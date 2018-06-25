package Gaji;

public class Tester extends Karyawan {
	private Karyawan karyawan;
	private int lembur, pph, bonus, bpjsKesehatan, bpjsKerja;
	
	public Tester() {
	}
	public Tester(Karyawan karyawan) {
		this.karyawan = karyawan;
	}
	public Karyawan getKaryawan() {
		return karyawan;
	}
	public int getLembur() {
		return lembur;
	}
	public int getPph() {
		return pph;
	}
	public int getBonus() {
		return bonus;
	}
	public int getBpjsKesehatan() {
		return bpjsKesehatan;
	}
	public int getBpjsKerja() {
		return bpjsKerja;
	}
	
	public String toString() {
		return karyawan.toString()+"\nBesar nilai lembur : "+getLembur()+"\nBesar nilai PPH : "+getPph()+"\nBesar nilai Bonus : "+
				getBonus()+"\nBesar nilai BPJS Kesehatan : "+getBpjsKesehatan()+"\nBesar nilai BPJS Ketenaga Kerjaan : "+getBpjsKerja();
	}

}
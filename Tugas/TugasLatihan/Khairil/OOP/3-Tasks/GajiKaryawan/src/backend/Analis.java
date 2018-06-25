package backend;

public class Analis extends Karyawan implements BPJS {
	private Karyawan karyawan;
	private int jamLembur;
	private double lembur, pph, bpjsKesehatan, bpjsKerja, totalPenghasilan, tunjangan, gajiSebulan, thp,
					potongNaker, potongSehat, potonganBPJSSehat, potonganBPJSNaker;
	
	public Analis() {
	}
	
	public Analis(Karyawan karyawan, int jamLembur) {
		this.karyawan = karyawan;
		this.jamLembur = jamLembur;
	}
	
	public Karyawan getKaryawan() {
		return karyawan;
	}
	public double getLembur() {
		return lembur;
	}
	public double getPph() {
		return pph;
	}
	public double getBpjsKesehatan() {
		return bpjsKesehatan;
	}
	public double getBpjsKerja() {
		return bpjsKerja;
	}
	
	public double tunjang() {
		tunjangan = 1000000;
		return tunjangan;
	}
	
	public double totHasil() {
		totalPenghasilan = karyawan.getGapok() + tunjangan;
		return totalPenghasilan;
	}
	
//	@Override
	public double getBPJSKesehatan(double totalPenghasilan) {
//		double potonganBPJSSehat;
		potonganBPJSSehat = totHasil() * persenbpjsKesehatan;
		return potonganBPJSSehat;
	}
	
//	@Override
	public double getBPJSKetenagaKerjaan(double totalPenghasilan) {
//		double potonganBPJSNaker;
		potonganBPJSNaker = totHasil() * persenbpjsKetenagaKerjaan;
		return potonganBPJSNaker;
	}
	
	public double tehape() {
		thp = gajiSebulan - (potonganBPJSSehat + potonganBPJSNaker) + lembur;
		return thp;
	}
	
	public double bulanan() {
		gajiSebulan = karyawan.getGapok() + tunjangan;
		return gajiSebulan;
	}
	
	public double lemburan() {
		lembur = 1.5 * 1.0/173.0 * gajiSebulan;
		return lembur;
	}
	
	public String toString() {
		return "Besar nilai lembur\t\t   : "+ lembur +
				"\nBesar nilai BPJS Kesehatan\t : "+potonganBPJSSehat+
				"\nBesar nilai BPJS Ketenaga Kerjaan : "+potonganBPJSNaker+
				"\nTunjangan " +tunjangan;
	}

	public double getTotalGaji() {
		return bulanan() + lemburan() + + tunjang();
	}
	
	public double getBebanGaji() {
		return getBPJSKesehatan(totHasil()) + getBPJSKetenagaKerjaan(totHasil());
	}
	
	public double getTotalBersih() {
		return getTotalGaji() - getBebanGaji();
	}	
}
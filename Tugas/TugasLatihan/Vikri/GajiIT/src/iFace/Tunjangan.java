package iFace;

public class Tunjangan extends Karyawan implements TunjanganPotongan{
	private double pph, total, tTransport, tunjangan, tKeluarga, totalLembur, fixBug, bonus, bKesehatan, bKetenagaKerjaan, lamaLembur;
	double gajiBersih, ptkp, pkp, pkp2;
	
	public Tunjangan(String nama, String nik, String penempatan, String bagian, String tingkatan, int lama, int lamaLembur, int fixBug, boolean cek) {
		super(nama, nik, penempatan, bagian, tingkatan, lama, cek);
		this.lamaLembur = lamaLembur;
		this.fixBug = fixBug;
	}
	
	public double getPph() {
		return pph;
	}
	public void setPph(double pph) {
		this.pph = pph;
	}
	
	public double getLamaLembur() {
		return lamaLembur;
	}
	
	public void setLamaLembur(double lamaLembur) {
		this.lamaLembur = lamaLembur;
	}
	
	public double getFixBug() {
		return fixBug;
	}
	
	public void setFixBug(double fixBug) {
		this.fixBug= fixBug;
	}
	
	@Override
	public double tTransport(String penempatan) {
		if(penempatan.equals("Jakarta")) {
			tTransport = 1000000;
		} else {
			tTransport = 0;
		}
		return tTransport;
	}
	@Override
	public double lembur(double gaji, double lamaLembur) {
		return totalLembur = lamaLembur * 1.5 * 1/173 * gaji;
	}

	@Override
	public double tunjanganPegawai(String tingkatan) {
		if(tingkatan.equals("Junior")) {
			tunjangan = 200000;
		} else if(tingkatan.equals("Middle")) {
			tunjangan = 300000;
		} else {
			tunjangan = 500000;
		}
		return tunjangan;
	}
	@Override
	public double tunjanganKeluarga(double gaji, boolean cek) {
		if(cek == true){
			tKeluarga = 0.02 * gaji;
		} else {
			tKeluarga = 0 * gaji;
		}
		return tKeluarga;
	}
	@Override
	public double bonus(double fixBug) {
		if(fixBug*20000>500000) {
			bonus = 500000;
		} else {
			bonus = fixBug*20000;
		}
		return bonus;
	}

	@Override
	public double bKesehatan(double gaji) {
		return bKesehatan = 0.01 * (gaji+tKeluarga+tunjangan+tTransport);
	}

	@Override
	public double bKetenagakerjaan(double gaji) {
		return bKetenagaKerjaan = 0.01*(gaji+tKeluarga+tunjangan+tTransport);
	}
	
	@Override
	public double total() {
		return total = gajiPokok + tunjanganKeluarga(gajiPokok, isCekKeluarga()) + tunjanganPegawai(getTingkatan())+tTransport(getPenempatan())+lembur(gajiPokok, getLamaLembur())+bonus(getFixBug())-(bKesehatan(gajiPokok)+bKetenagakerjaan(gajiPokok));
	}
	
	@Override
	public double pPH(double total) {
		
		gajiBersih = (total * 12);
		ptkp = 3600000;
		
		if(tKeluarga > 0) {
			ptkp += 3000000;
		}
		if(ptkp > gajiBersih) {
			pph = 0;
		} else {
			pkp = gajiBersih - ptkp;
			if (pkp < 50000000) {
				pph = pkp * 5/100;
				pph = pph/12;
			} else if (pkp > 50000000&&pkp<=250000000) {
				pkp2 = pkp - 50000000;
				pph += 50000000*5/100;
				pph += pkp2*15/100;
				pph = pph/12;
			} else if (pkp > 250000000&&pkp < 50000000) {
				pph += 50000000*5/100;
				pkp2 = pkp - 250000000;
				pph += 25000000*15/100;
				pph += pkp2*25/100;
				pph = pph/12;
			} else {
				pph += 50000000*5/100;
				pph += 250000000*15/100;
				pph += 500000000*25/100;
				pkp2  = pkp - 500000000;
				pph += pkp2*30/100;
				pph = pph/12;
			}
		}
		return pph;
	}
	
	public double total2() {
		return total = total() - pPH(total());
	}
	
	public String toString() {
		return 	super.toString()+
				"-------------------------------------------"+"\n"+
				"Gaji Pokok\t: "+(int)GajiPokok()+"\n"+
				"-------------------------------------------"+"\n"+
				"T. Keluarga\t: "+(int)tunjanganKeluarga(gajiPokok, isCekKeluarga())+"\n"+
				"T. Pegawai\t: "+(int)tunjanganPegawai(getTingkatan())+"\n"+
				"T. Transport\t: "+(int)tTransport(getPenempatan())+"\n"+
				"Lembur\t\t: "+(int)lembur(gajiPokok, getLamaLembur())+"\n"+
				"Bonus\t\t: "+(int)bonus(getFixBug())+"\n"+
				"-------------------------------------------"+"\n"+
				"P. BPJS Kesehatan\t: "+(int)bKesehatan(gajiPokok)+"\n"+
				"P. BPJS Ketenagakerjaan\t: "+(int)bKetenagakerjaan(gajiPokok)+"\n"+
				"PPH\t\t\t: "+(int)pPH(total())+"\n"+
				"-------------------------------------------"+"\n"+
				"Total Gaji: \t\t: "+(int)total2();
	}
}

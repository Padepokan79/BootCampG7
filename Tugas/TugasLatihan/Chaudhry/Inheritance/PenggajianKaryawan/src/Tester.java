
public class Tester extends Karyawan implements PenentuGapok, NominalDefault {
	private int lembur, testCase, lamaKerja, jmlAnak;
	private String posisi, tingkatan, statusMenikah;
	private double gapok, uangLembur, tunjanganPegawai, tunjanganTransport = 0, tunjanganKeluarga = 0, potBpjsKaryawan, bonus;
	private double tunSusis, tunAnak, gajiKotor, gajiNetto, jmlPtkp = 0, jmlPkp = 0, potPph = 0;
	
	public Tester(String nama, String nik) {
		super(nama, nik);
	}
	
	void setTestCase(int test) {
		testCase = test;
	}
	int getTestCase() {
		return testCase;
	}
	
	void setJamLembur(int lembur) {
		this.lembur = lembur;
	}
	int getJamLembur() {
		return lembur;
	}
	
	void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	String getPosisi() {
		if(posisi.equals("1")) {
			posisi = "Programmer";
			
		}else if(posisi.equals("2")) {
			posisi = "Sistem Analis";
		
		}else if(posisi.equals("3")){
			posisi = "Tester";
		}
		return posisi;
	}
	
	void setLamaKerja(int lama) {
		lamaKerja = lama;
	}
	int getLamaKerja() {
		return lamaKerja;
	}
	
	void setTingkatan(String tingkatan) {
		this.tingkatan = tingkatan;
	}
	String getTingkatan() {
		if(tingkatan.equals("1")) {
			tingkatan = "Junior";
			
		}else if(tingkatan.equals("2")) {
			tingkatan = "Middle";
		
		}else if(tingkatan.equals("3")){
			tingkatan = "Senior";
		}
		return tingkatan;
	}
	
	void setMenikah(String menikah) {
		statusMenikah = menikah;
	}
	
	void setJmlAnak(int jml) {
		jmlAnak = jml;
	}
	int getJmlAnak() {
		return jmlAnak;
	}
	
	void hitungGapok(int lamaKerja, String tingkatan) {
		if(tingkatan.equals("Junior")) {
			if(lamaKerja >= 0 && lamaKerja <= 1) {
				gapok = getUmk(getPenempatanKerja())*tsJunior[0];
			
			}else if(lamaKerja > 1 && lamaKerja <= 3) {
				gapok = getUmk(getPenempatanKerja())*tsJunior[1];
			
			}else if(lamaKerja > 3) {
				gapok = getUmk(getPenempatanKerja())*tsJunior[2];
			}
		
		}else if(tingkatan.equals("Middle")) {
			if(lamaKerja >= 0 && lamaKerja <= 2) {
				gapok = getUmk(getPenempatanKerja())*tsMiddle[0];
			
			}else if(lamaKerja > 2 && lamaKerja <= 4) {
				gapok = getUmk(getPenempatanKerja())*tsMiddle[1];
			
			}else if(lamaKerja > 4) {
				gapok = getUmk(getPenempatanKerja())*tsMiddle[2];
			}
			
		}else if(tingkatan.equals("Senior")) {
			if(lamaKerja >= 0 && lamaKerja <= 2) {
				gapok = getUmk(getPenempatanKerja())*tsSenior[0];
			
			}else if(lamaKerja > 2 && lamaKerja <= 4) {
				gapok = getUmk(getPenempatanKerja())*tsSenior[1];
			
			}else if(lamaKerja > 4) {
				gapok = getUmk(getPenempatanKerja())*tsSenior[2];
			}
		}
	}
	double getGapok() {
		return gapok;
	}
	
	void hitungTunjanganPegawai(String tingkatan) {
		if(tingkatan.equals("Junior")) {
			tunjanganPegawai = tunjanganJunior;
			
		}else if(tingkatan.equals("Middle")) {
			tunjanganPegawai = tunjanganMiddle;
			
		}else if(tingkatan.equals("Senior")) {
			tunjanganPegawai = tunjanganSenior;
		}
	}
	double getTunjanganPegawai() {
		return tunjanganPegawai;
	}
	
	void hitungBonus(int kerjaan) {
		bonus = (kerjaan/100)*testCase;
		if(bonus > 500000) {
			bonus = 500000;
		}
	}
	double getBonus() {
		return bonus;
	}
	
	void hitungTunjanganTransport() {
		if(getPenempatanKerja().equals("Jakarta")) {
			tunjanganTransport = tunjanganTrans;
		}
	}
	double getTunTransport() {
		return tunjanganTransport;
	}
	
	void hitungTungjanganKeluarga(String status) {
		if(status.equals("S")) {
			tunjanganKeluarga = tunKeluarga*getGapok();
		}
	}
	double getTunKeluarga() {
		return tunjanganKeluarga;
	}
	
	void hitungPotBpjs() {
		potBpjsKaryawan = potBpjs*(getGapok() + getTunjanganPegawai() + getTunTransport() + getTunKeluarga()); 
	}
	double getPotBpjs() {
		return potBpjsKaryawan;
	}
	
	void hitungLembur(double lamaLembur) {
		uangLembur = 1.5 * 1.0/173.0 * (getGapok() + getTunjanganPegawai() + getTunKeluarga() + getTunTransport() + getBonus());
		uangLembur = uangLembur*lamaLembur;
	}
	double getUangLembur() {
		return uangLembur;
	}
	
	void hitungPph() {
		tunSusis 	= tunSusi*getGapok();
		if(getJmlAnak() <= 2) {
			tunAnak 	= (tunSon*getGapok())*getJmlAnak();
		}else {
			tunAnak 	= (tunSon*getGapok())*2;
		}
		
		gajiKotor = tunSusis + tunAnak + getTunjanganPegawai() + getTunTransport();
		gajiNetto = gajiKotor - ((biayaJabatan*gajiKotor) + (iuranPensiun*(getGapok()+tunSusis+tunAnak)));
		gajiNetto = gajiNetto*12;
		
		jmlPtkp += ptkpPribadi;
		if(statusMenikah.equals("S")) {
			jmlPtkp += ptkpMenikah;
		}
		if(getJmlAnak() <= 3) {
			jmlPtkp += (ptkpAnak*getJmlAnak());
			
		}else if(getJmlAnak() > 3) {
			jmlPtkp += (ptkpAnak*3);
		}
		
		jmlPkp = gajiNetto - jmlPtkp;
		if(jmlPkp <= 0) {
			potPph = potPph;
			
		}else {
			if (jmlPkp <= tarifPph50) {
				potPph = (jmlPkp*5)/100;
			}
			else if (jmlPkp > tarifPph50 && jmlPkp <= tarifPph250) {
				potPph = ((tarifPph50*5)/100) + ( ((jmlPkp-tarifPph50)*15)/100 );
			}
			else if (jmlPkp > tarifPph250 && jmlPkp <= tarifPph500) {
				potPph = ((tarifPph50*5)/100) + ((tarifPph200*15)/100) + ( ((jmlPkp - (tarifPph50 + tarifPph200))*25)/100 );
			}
			else if (jmlPkp > tarifPph500) {
				potPph = ((tarifPph50*5)/100) + ((tarifPph200*15)/100) + ((tarifPph250*25)/100) + ( ((jmlPkp - (tarifPph50 + tarifPph200 + tarifPph250))*30)/100 );
			}
			potPph = potPph/12;
		}
	}
	
	double getPotPph() {
		return potPph;
	}
	
	public void tampilData() {
		super.tampilData();
		System.out.println("Posisi              : "+getPosisi());
		System.out.println("Tingkatan           : "+getTingkatan());
		System.out.println("Jam Lembur          : "+getJamLembur());
		System.out.println("Test Case           : "+getTestCase());
		System.out.println("Gaji Pokok          : "+getGapok());
		System.out.println("------------------------------------");
		System.out.println("Bonus               : "+getBonus());
		System.out.println("Tunjangan Pegawai   : "+getTunjanganPegawai());
		System.out.println("Tunjangan Transport : "+getTunTransport());
		System.out.println("Tunjangan Keluarga  : "+getTunKeluarga());
		System.out.println("Uang Lembur         : "+getUangLembur());
		System.out.println("------------------------------------");
		System.out.println("Pot. BPJS Kesehatan : "+getPotBpjs());
		System.out.println("Pot. KetenagaKerjaan: "+getPotBpjs());
		System.out.println("Pot. PPH            : "+getPotPph());
	}
}

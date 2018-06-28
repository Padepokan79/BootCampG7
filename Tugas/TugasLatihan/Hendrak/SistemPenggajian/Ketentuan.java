package SistemPenggajianKaryawanIT;

public interface Ketentuan {
	double bpjsKesehatan = 0.1, bpjsKetenagakerjaan = 0.1, tnjKeluarga=0.2, tnjSuamiIstri = 0.1, tnjAnak = 0.02;
	double tunjanganJunior = 200000, tunjanganMiddle = 300000, tunjanganSenior = 500000;
	double tnjTransport = 1000000;
	double bonusFixing = 20000, bonusTest = 25000, lembur = 1.5 * 1/173;
	
	double [] pgJunior = {1 , 1.2 , 1.5 };
	double [] pgMiddle = {1.7 , 1.8 , 2.1 };
	double [] pgSenior = {2.5 , 2.7 , 2.8  };
	double [] saJunior = {1.2 , 1.3 , 1.6  };
	double [] saMiddle = {1.8 , 1.9 , 2.2  };
	double [] saSenior = {2.7 , 2.9 , 3.0  };
	double [] tsJunior = {1.1 , 1.2 , 1.5  };
	double [] tsMiddle = {1.8 , 1.9 , 2.1  };
	double [] tsSenior = {2.6 , 2.7 , 2.8  };
	
	public double getTunjanganTransport(String penempatan);
	public double getBpjsKesehatan(double totalPenghasilan);
	public double getBPJSKetenagakerjaan(double totalPenghasilan);
	public double getTunjanganKeluarga(String menikah, double gapok);
	public double getTotalPenghasilan(double gapok, double tunjanganPegawai, double tunjanganTransport, double tunjanganKeluarga);
	public double getGajiSebulan(double totalPenghasilan, double bonus);
	public double getUangLembur(double gajiSebulan, double lamaLembur);
	public double getPPh(String menikah, int anak, double tnjPegawai, double tnjTransport,double tnjKeluarga, double gapok);
	

	
}

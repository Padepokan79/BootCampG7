package iFace;

interface TunjanganPotongan {
	double lembur(double gaji, double lama);
	double tunjanganPegawai(String tingkatan);
	double tunjanganKeluarga(double gaji, boolean cek);
	double bonus(double fix);
	double pPH(double gaji);
	double bKesehatan(double gaji);
	double bKetenagakerjaan(double gaji);
	double tTransport(String penempatan);
	double total();
}

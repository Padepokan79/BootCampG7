package Gaji;

public interface BPJS {
	double persenbpjsKesehatan = 0.01;
	double persenbpjsKetenagaKerjaan = 0.01;
	
	double getBPJSKetenagaKerjaan(double totalPenghasilan);
	double getBPJSKesehatan(double totalPenghasilan);
}

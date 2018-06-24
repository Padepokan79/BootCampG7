package backend;

public interface BPJS {
	double persenbpjsKetenagaKerjaan = 0.01;
	double persenbpjsKesehatan = 0.01;
	
	double getBPJSKesehatan(double potonganBPJS);
	double getBPJSKetenagaKerjaan(double potonganBPJS);

}

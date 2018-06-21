package pns;

public interface Tunjangan {
	int tunjanganJunior=200000,
		tunjanganMiddle=300000,
		tunjanganSenior=500000,
		transportJakarta=1000000;
	double	keluarga=0.02;
	
	void hitungTunjangan(boolean married);
	void hitungTunjangan();
}

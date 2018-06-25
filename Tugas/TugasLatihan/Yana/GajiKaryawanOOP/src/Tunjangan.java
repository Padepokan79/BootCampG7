
public interface Tunjangan {
	double 	transportasi 		= 1000000;
	double	tunjanganJunior		= 200000;
	double 	tunjanganMiddle		= 300000;
	double 	tunjanganSenior		= 500000;
	double 	tunjanganKeluarga	= 0.02;
	
//	double hitungTunjangan();
	double hitungTujangan(boolean married);
}

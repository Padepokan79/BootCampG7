
public interface Pph {
	double 	biayaJabatanPPH = 0.05;
	double 	iuranPensiunPPH	= 0.0475;
	double 	pribadi			= 36000000;
	double 	kawin			= 3000000;
	double 	batasPKP1		= 50000000;
	double 	batasPKP2		= 250000000;
	double 	batasPKP3		= 500000000;
	double	persenBatasPKP1	= 0.05;
	double	persenBatasPKP2	= 0.15;
	double	persenBatasPKP3	= 0.25;
	double	persenBatasPKP4	= 0.30;
	int		bulan			= 12;
	int		penguranganKel	= 1;
	int		bebasPajak		= 0;
	
	public double pph();
//	public double biayaJabatan();
//	public double iuranPensiun();
}
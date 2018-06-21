
public class Tester extends Karyawan{

	Karyawan karyawan;
	String tingkatan,status;
	
	double[] jts = {110.0/100.0, 120.0/100.0, 150.0/100.0};
	double[] mts = {180.0/100.0, 190.0/100.0, 210.0/100.0};
	double[] sts = {260.0/100.0, 270.0/100.0, 280.0/100.0};
	
	public Tester(Karyawan karyawan, String tingkatan, String status) {
		this.karyawan = karyawan;
		this.tingkatan = tingkatan;
		this.status = status;
	}
	public Tester(String nama, int nik, String posisi, String penempatan, int lamaKerja, String tingkatan) {
		super(nama, nik, posisi, penempatan, lamaKerja);
		this.tingkatan = tingkatan;
	}
	double gapok() {
		if(tingkatan.equals("Junior") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*jts[0];	
		}
		else if(tingkatan.equals("Junior") && karyawan.getLamaKerja() <= 2) {
			return karyawan.getGapok()*jts[1];	
		}
		else if(tingkatan.equals("Junior") && karyawan.getLamaKerja() > 2) {
			return karyawan.getGapok()*jts[2];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*mts[0];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() <= 3) {
			return karyawan.getGapok()*mts[1];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() > 3) {
			return karyawan.getGapok()*mts[2];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*sts[0];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() <= 3) {
			return karyawan.getGapok()*sts[1];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() > 3) {
			return karyawan.getGapok()*sts[2];	
		}
		else {
			return karyawan.getGapok();
		}
	}
	
	double tunjanganJabatan() {
		if(tingkatan.equalsIgnoreCase("junior")) {
			karyawan.setTunjangan(200000);
			return karyawan.getTunjangan();
		}
		else if(tingkatan.equalsIgnoreCase("middle")) {
			karyawan.setTunjangan(300000);
			return karyawan.getTunjangan();
		}
		else if(tingkatan.equalsIgnoreCase("senior")) {
			karyawan.setTunjangan(500000);
			return karyawan.getTunjangan();
		}
		else {
			return karyawan.getTunjangan();
		}
	}
	double tunjangan() {
		if (status.equalsIgnoreCase("k")) {
			karyawan.setTunjangan(gapok()*2.0/100.0);
			return karyawan.getTunjangan();
		}
		else {
			return karyawan.getTunjangan();
		}
	}
	double bpjsKes() {
		return (karyawan.getGapok()+karyawan.getTunjangan())*1.0/100.0;
	}
	double bpjsKet() {
		return (karyawan.getGapok()+karyawan.getTunjangan())*1.0/100.0;
	}
	@Override
	public String toString() {
		
		return "--------------------------"+
		"\nGaji Pokok : Rp."+gapok()+
		"\nMempunyai Tunjangan : Rp."+tunjangan()+
		"\n--------------------------"+
		"\nPotongan BPJS Kesehatan : Rp."+bpjsKes()+
		"\nPotongan BPJS Ketenagakerjaan : Rp."+bpjsKet()+
		"\nPotongan PPH : "+
		"\n---------------------------"+
		"\nLembur : "+
		"\nBonus : "+
		"\n---------------------------"+
		"\nGaji Bersih : ";
	}
}

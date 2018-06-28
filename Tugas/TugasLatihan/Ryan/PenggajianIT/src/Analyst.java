
public class Analyst extends Karyawan{

	Karyawan karyawan;
	String tingkatan,status;
	
	double[] jas = {120.0/100.0, 130.0/100.0, 160.0/100.0};
	double[] mas = {180.0/100.0, 190.0/100.0, 220.0/100.0};
	double[] sas = {270.0/100.0, 290.0/100.0, 300.0/100.0};
	
	public Analyst(Karyawan karyawan, String tingkatan, String status) {
		this.karyawan = karyawan;
		this.tingkatan = tingkatan;
		this.status = status;
	}
	public Analyst(String nama, int nik, String posisi, String penempatan, int lamaKerja, String tingkatan) {
		super(nama, nik, posisi, penempatan, lamaKerja);
		this.tingkatan = tingkatan;
	}
	double gapok() {
		if(tingkatan.equals("Junior") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*jas[0];	
		}
		else if(tingkatan.equals("Junior") && karyawan.getLamaKerja() <= 2) {
			return karyawan.getGapok()*jas[1];	
		}
		else if(tingkatan.equals("Junior") && karyawan.getLamaKerja() > 2) {
			return karyawan.getGapok()*jas[2];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*mas[0];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() <= 3) {
			return karyawan.getGapok()*mas[1];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() > 3) {
			return karyawan.getGapok()*mas[2];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*sas[0];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() <= 3) {
			return karyawan.getGapok()*sas[1];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() > 3) {
			return karyawan.getGapok()*sas[2];	
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

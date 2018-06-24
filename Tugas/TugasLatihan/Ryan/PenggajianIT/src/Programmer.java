
public class Programmer extends Karyawan{

	Karyawan karyawan;
	String tingkatan,status;
	
	double[] jpg = {100.0/100.0, 120.0/100.0, 150.0/100.0};
	double[] mpg = {170.0/100.0, 180.0/100.0, 210.0/100.0};
	double[] spg = {250.0/100.0, 270.0/100.0, 280.0/100.0};
	
	public Programmer(Karyawan karyawan, String tingkatan, String status) {
		this.karyawan = karyawan;
		this.tingkatan = tingkatan;
		this.status = status;
	}
	public Programmer(String nama, int nik, String posisi, String penempatan, int lamaKerja, String tingkatan) {
		super(nama, nik, posisi, penempatan, lamaKerja);
		this.tingkatan = tingkatan;
	}
	double gapok() {
		if(tingkatan.equals("Junior") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*jpg[0];	
		}
		else if(tingkatan.equals("Junior") && karyawan.getLamaKerja() <= 2) {
			return karyawan.getGapok()*jpg[1];	
		}
		else if(tingkatan.equals("Junior") && karyawan.getLamaKerja() > 2) {
			return karyawan.getGapok()*jpg[2];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*mpg[0];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() <= 3) {
			return karyawan.getGapok()*mpg[1];	
		}
		else if(tingkatan.equals("Middle") && karyawan.getLamaKerja() > 3) {
			return karyawan.getGapok()*mpg[2];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() <= 1) {
			return karyawan.getGapok()*spg[0];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() <= 3) {
			return karyawan.getGapok()*spg[1];	
		}
		else if(tingkatan.equals("Senior") && karyawan.getLamaKerja() > 3) {
			return karyawan.getGapok()*spg[2];	
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

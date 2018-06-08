package iFace;

public class TestKaryawan {
	public static void main(String[] args) {
		Programmer pg= new Programmer("", "", "", "", "", 0, 0, 0, false);
	
		Validasi valid = new Validasi();
		
		valid.valHuruf(false, "Masukan Nama Anda: ");
		pg.nama = valid.hasil;
		
		valid.valAngka(false, "Masukan NIK: ");
		pg.setNik(valid.hasil);
		
		valid.valHuruf(false, "Ditempatkan di: ");
		pg.setPenempatan(valid.hasil);
		
		valid.valHuruf(false, "Tikatan Kerja: ");
		pg.setTingkatan(valid.hasil);
		
		valid.valHuruf(false, "Bagian: ");
		pg.setBagian(valid.hasil);
		
		valid.valAngka(false, "Lama Kerja: ");
		pg.setLama(Integer.parseInt(valid.hasil));
		
		System.out.println("------------------------------------------");
		
		valid.valBoolean(false, "Apakah sudah Berkeluarga: ");
		pg.setCekKeluarga(valid.hasilBool);
		
		System.out.println("------------------------------------------");
	
		valid.valBoolean(false, "Apakah Anda pernah Mem Fix Bug: ");
		if(valid.hasilBool == true) {
			valid.valAngka(false, "Berapa Kali? ");
			pg.setFixBug(valid.hasilAngka);
		}
		
		System.out.println("------------------------------------------");
		
		valid.valBoolean(false, "Apakah Anda pernah Lembur: ");
		if(valid.hasilBool == true) {
			valid.valAngka(false, "Berapa Jam? ");
			pg.setLamaLembur(valid.hasilAngka);
		}
		
		System.out.println(pg.toString());
	}
}

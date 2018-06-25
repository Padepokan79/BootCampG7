package SistemPenggajianKaryawanIT;

public class Programmer extends Karyawan implements Ketentuan {
	Karyawan karyawan;
	private double bonus, gapok, totalPenghasilan, gajiSebulan, tunjanganPegawai, tunjanganKeluarga, tunjanganTransport,pph;
	private int fixingBug;
	
	

	public Programmer() {
		
	}
	
	public Programmer(String nik, String nama, String penempatan, String tingkatan) {
		super(nik, nama, penempatan, tingkatan);
	}
	
	public Programmer(Karyawan karyawan) {
		this.karyawan = karyawan;
	}
	public void setGapok(double gapok) {
		this.gapok = gapok;
	}

	public double getTunjanganKeluarga() {
		return tunjanganKeluarga;
	}

	public double getTunjanganTransport() {
		return tunjanganTransport;
	}
	

	public double getBonus() {
		return bonus;
	}
    
	public double getTunjanganPegawai() {
		return tunjanganPegawai;
	}

	public int getFixingBug() {
		return fixingBug;
	}

	public void setFixingBug(int fixingBug) {
		this.fixingBug = fixingBug;
	}
	
	public double getTunjanganTransport(String penempatan) {
		if(penempatan.equals("jakarta")) {
			return tunjanganTransport = tnjTransport;
		}
		else 
		{   
		    return 0;
		}
	}
	
	public double hitungBonus(int fixing) {
		bonus = bonusFixing * fixing;
		if (bonus > 500000) {
			bonus = 500000;
		}
		return bonus;
	}
	
	
	@Override
	public double getBpjsKesehatan(double totalPenghasilan) {
		return totalPenghasilan* 0.01;
	}

	@Override
	public double getBPJSKetenagakerjaan(double totalPenghasilan) {
		return totalPenghasilan* 0.01;
	}

	@Override
	public double getTunjanganKeluarga(String menikah, double gapok) {
		// TODO Auto-generated method stub
		if(menikah.equals("y")) {
		
			return tnjKeluarga * gapok;
		}
		else
		{
			return 0;
		}
	}
	
	public double hitungGapok(String tingkatan, int lamaKerja, double umk) {
		
		if(tingkatan.equals("junior")){
			if(lamaKerja >=0 && lamaKerja <=1) {
				gapok = pgJunior[0]* umk;
			}
			else if(lamaKerja >=2 && lamaKerja <=3) {
				gapok = pgJunior[1]* umk;
			}
			else if(lamaKerja >3) {
				gapok = pgJunior[2]* umk;
			}
			tunjanganPegawai = 200000;
		}else if(tingkatan.equals("middle")) {
			if(lamaKerja >=0 && lamaKerja <=2) {
				gapok = pgMiddle[0]* umk;
			}
			else if(lamaKerja >=3 && lamaKerja <=4) {
				gapok = pgMiddle[1]* umk;
			}
			else if(lamaKerja >4) {
				gapok = pgMiddle[2]* umk;
			}
			tunjanganPegawai = 300000;
		}else if(tingkatan.equals("senior")) {
			if(lamaKerja >=0 && lamaKerja <=2) {
				gapok = pgSenior[0]* umk;
			}
			else if(lamaKerja >=3 && lamaKerja <=4) {
				gapok = pgSenior[1]* umk;
			}
			else if(lamaKerja >4) {
				gapok = pgSenior[2]* umk;
			}
		tunjanganPegawai = 500000;
		}
		return gapok;
	}
	
	
	public double getGajiSebulan() {
		return gajiSebulan;
	}

	public double getTotalPenghasilan() {
		return totalPenghasilan;
	}

	public double getGapok() {
		return gapok;
	}


	@Override
	public double getGajiSebulan(double totalPenghasilan, double bonus) {
		
		gajiSebulan = totalPenghasilan + bonus;
		return gajiSebulan;
	}
	
	@Override
	public double getUangLembur(double gajiSebulan, double lamaLembur) {
	
		return lembur * lamaLembur * gajiSebulan;
	}

	@Override
	public double getTotalPenghasilan(double gapok, double tunjanganPegawai, double tunjanganTransport,double tunjanganKeluarga) {
		
		totalPenghasilan = gapok + tunjanganPegawai + tunjanganTransport + tunjanganKeluarga ;
		return 0;
	}

	public String toString() {
		return  super.toString()
				+"\nFixing Bug : " + getFixingBug() +
				 "\nBonus      : " + getBonus() +
				 "\nGapok      : " + getGapok() +
				 "\nTunjangan Pegawai  : " +  getTunjanganPegawai() +
				 "\nTunjangan Keluarga : " +  getTunjanganKeluarga(getMenikah(), gapok) + 
				 "\nTunjangan Transport: " +  getTunjanganTransport("jakarta") +
				 "\nTotal Penghasilan  : " +  getTotalPenghasilan() +
				 "\nPotongan BPJS Kesehatan       : " + getBpjsKesehatan(totalPenghasilan) +
				 "\nPotongan BPJS Ketenagakerjaan : " + getBPJSKetenagakerjaan(totalPenghasilan)+
				 "\nGaji Sebulan                  : " + getGajiSebulan(totalPenghasilan, bonus) +
				 "\nUang Lembur                   : " + getUangLembur(gajiSebulan, getLembur())
				 ;
		}

	@Override
	public double getPPh(String menikah, int anak, double tnjPegawai, double tnjTransport, double tnjKeluarga, double gapok) {
		if (menikah.equals("y"))
		{System.out.println("Ho");
			if(anak > 0 ) {
			System.out.println("HI");
			}
		}
		else
		{
			System.out.println("HE");
		}
		return 0;
	}

	public void getPPh2(String menikah, int anak, double tnjPegawai, double tnjTransport, double tnjKeluarga, double gapok) {
		if (menikah.equals("y"))
		{System.out.println("Ho");
			if(anak > 0 ) {
			System.out.println("HI");
			}
		}
		else
		{
			System.out.println("HE");
		}
		
		
	}
}

//System.out.println("" + menikah + anak + tnjPegawai + tnjKeluarga + tnjTransport + gapok);


/*
Created by : Hendra Kurniawan
Date 	   : 20 Juni 2018
Modified   :	
*/
package SistemGaji;

import java.util.*;

public class Programmer extends Karyawan implements Tunjangan , pengalamanKerja{
	Karyawan karyawan;
	private double tnjPegawai, bonus, gapok, tnjTransport, tnjKeluarga,totalPenghasilan, gajiSebulan, uangLembur;
	private int fixingBug, bonusFixing = 20000;
	int index=0;
	/*
	private double [] pgJunior = {1.0 , 1.2 , 1.5 };
	private double [] pgMiddle = {1.7 , 1.8 , 2.1 };
	private double [] pgSenior = {2.5 , 2.7 , 2.8  };
	*/
	
	
	public Programmer() {
		
	}
	
	public Programmer(Karyawan karyawan) {
		this.karyawan = karyawan;
	}
	
	public Programmer(String nama, String nik, String penempatanKerja) {
		super(nama, nik, penempatanKerja);
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTnjPegawai() {
		return tnjPegawai;
	}

	public double getGapok() {
		return gapok;
	}
	
	
	public int getFixingBug() {
		return fixingBug;
	}

	public void setFixingBug(int fixingBug) {
		this.fixingBug = fixingBug;
	}
	
	public double getTnjTransport() {
		return tnjTransport;
	}

	public double getTnjKeluarga() {
		return tnjKeluarga;
	}

	public double hitungGapok(double umk, String tingkatan, int lamaKerja) {
		
		if(tingkatan.equals("junior")){
			for (index = 0;index < pgJunior.size(); index++) {
				if(lamaKerja > 3) {
					gapok = pgJunior.get(pgJunior.size()-1)*umk;
				}
				else {
					gapok = pgJunior.get(lamaKerja)*umk;	
				}
			}
		}else if(tingkatan.equals("middle")) {
			for (index = 0;index < pgMiddle.size(); index++) {
				if(lamaKerja > 3) {
					gapok = pgMiddle.get(pgMiddle.size()-1)*umk;
				}
				else {
					gapok = pgMiddle.get(lamaKerja)*umk;	
				}
			}
		
		}else if(tingkatan.equals("senior")) {
			for (index = 0;index < pgSenior.size(); index++) {
				if(lamaKerja > 3) {
					gapok = pgSenior.get(pgSenior.size()-1)*umk;
				}
				else {
					gapok = pgSenior.get(lamaKerja)*umk;	
				}
			}
		}	
		return gapok;
	}
	
	/*
	public double hitungGapok(double umk, String tingkatan, int lamaKerja) {
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
		
		}
		return gapok;
	}
	*/
	
	public double hitungBonus(int fixingBug)
	{	
		bonus = fixingBug * bonusFixing;
		return bonus;
	}
	
	public void setGapok(double gapok) {
		this.gapok = gapok;
	}

	//method dari implement
	@Override
	public double getTunjanganTransport(String penempatan) {
		if(penempatan.equals("jakarta")) {
			tnjTransport = 1000000.0;
		}
		else
		{
			tnjTransport = 0.0;
		}
		return tnjTransport;
	}
	
	@Override
	public double getTunjanganKeluarga(String menikah) {
		// TODO Auto-generated method stub
		if(menikah.equals("y"))
		{
			tnjKeluarga = kettnjKeluarga * gapok;
		}
		else
		{
			tnjKeluarga = 0.0;
		}
		return tnjKeluarga;
	}
	

	@Override
	public double getBpjsKesehatan(double totalPenghasilan) {
		// TODO Auto-generated method stub
		return 0;
	}
    
	@Override
	public double getBpjsKetenagaKerjaan(double totalPenghasilan) {
		// TODO Auto-generated method stub
		return 0;
	}
	public double totalPenghasilan(double gapok, double tnjPegawai, double tnjTransport, double tnjKeluarga)
	{	totalPenghasilan = gapok + tnjPegawai + tnjTransport + tnjKeluarga;
		return totalPenghasilan;
	}
	
	public double gajiSebulan(double totalPenghasilan, double bonus) {
		gajiSebulan = totalPenghasilan + bonus;
		return gajiSebulan;
	}
	
	public double uangLembur(double gajiSebulan, double lembur) {
		uangLembur = gajiSebulan * ketLembur * lembur ;
		return uangLembur;
	}
	public String toString() {
		getTunjanganTransport(getPenempatanKerja());
		getTunjanganKeluarga(getMenikah());
		totalPenghasilan(gapok, tnjPegawai, tnjTransport, tnjKeluarga);
		gajiSebulan(totalPenghasilan, bonus);
		uangLembur(gajiSebulan, getLembur());
		
		return super.toString() 
				+"\nGaji Pokok : " + getGapok()
				+"\nBonus      : " + bonus
				+"\nTunjangan Transport : " + tnjTransport
				+"\nTunjangan Keluarga  : " + tnjKeluarga
				+"\nTotal Penghasilan   : " + totalPenghasilan
				+"\nGaji Sebulan        : " + gajiSebulan
				+"\nUang Lembur         : " + uangLembur
				;
	}

	

	
}


/*public String toString2() {
	return ""+ karyawan 
			 +"\nGaji Pokok : " + getGapok()
			 +"\nBonus      : " + bonus
			;
}*/



/*
public double hitungGapok(double umk, String tingkatan, int lamaKerja) {
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
	
	}
	return gapok;
}
*/
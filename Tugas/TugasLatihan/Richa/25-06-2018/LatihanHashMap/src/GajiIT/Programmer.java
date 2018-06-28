package GajiIT;
/* 
Created by  		: Richa Fitria, Rizaldi, Vikri
Date/hour			: 08 Juni 2018/ 08.00 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.*;

public class Programmer extends Karyawan implements Bonus {
	
	private int qtyBug;
	private double bonusPG;
	
	ArrayList<Double> pgJunior = new ArrayList<Double>(Arrays.asList(1.0, 1.0, 1.2, 1.2, 1.5));
	ArrayList<Double> pgMiddle = new ArrayList<Double>(Arrays.asList(1.7, 1.7, 1.7, 1.8, 1.8, 2.1));
	ArrayList<Double> pgSenior = new ArrayList<Double>(Arrays.asList(2.5, 2.5, 2.5, 2.7, 2.7, 2.8));
	
	
	public Programmer() {
		
	}
		
	public Programmer (String nama, String nik, String lvlKaryawan, String penempatanKerja, int masaKerja, boolean isMaried, int qtyBug) {
		super(nama, nik, lvlKaryawan, penempatanKerja, masaKerja, isMaried);
		this.qtyBug = qtyBug;
	}
	
	
	public double getLvlprog() {
		Double lvlProg = 0.0;
			if(getLvlKaryawan().equalsIgnoreCase("junior")) {
				for(int i=0; i<pgJunior.size(); i++) {
					if(getMasaKerja()==i) {
						lvlProg=pgJunior.get(i);
					}
					else if (getMasaKerja()>pgJunior.size()-1) {
						lvlProg = pgJunior.get(pgJunior.size()-1);
					}
				}

			}
			if(getLvlKaryawan().equalsIgnoreCase("middle")) {
				for(int i=0; i<pgMiddle.size(); i++) {
					if(getMasaKerja()==i) {
						lvlProg=pgMiddle.get(i);
					}
					else if (getMasaKerja()>pgMiddle.size()-1) {
						lvlProg = pgMiddle.get(pgMiddle.size()-1);
					}
				}

			}
			if(getLvlKaryawan().equalsIgnoreCase("senior")) {
				for(int i=0; i<pgSenior.size(); i++) {
					if(getMasaKerja()==i) {
						lvlProg=pgSenior.get(i);
					}
					else if (getMasaKerja()>pgSenior.size()-1) {
						lvlProg = pgSenior.get(pgSenior.size()-1);
					}
				}

			}

		return lvlProg;
	}
	
	
	@Override
	public Double calculateGapok(double umkLokasi) {
		// TODO Auto-generated method stub
		Double umk;
		if(super.getPenempatanKerja().equalsIgnoreCase("bandung")) {
			umk = umkLokasi*(getLvlprog());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			umk = umkLokasi*(getLvlprog());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("karawang")) {
			umk = umkLokasi*(getLvlprog());
		}
		else {
			umk=null;
			System.out.println("lokasi kerja tidak terdefinisi");
		}
		
		return umk;
	}
	
	@Override
	public Double calculateTunjTrans() {
		
		return super.calculateTunjTrans();
	}
	
	@Override
	public double bonus (int fixBug) {
		qtyBug = fixBug;
		if(fixBug*20000>500000) {
			bonusPG = 500000;
		} else {
			bonusPG = fixBug*20000;
		}
		return bonusPG;
	}

	
	
}


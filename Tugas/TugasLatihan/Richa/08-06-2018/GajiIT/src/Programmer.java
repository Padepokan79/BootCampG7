/* 
Created by  		: Richa Fitria, Rizaldi, Vikri
Date/hour			: 08 Juni 2018/ 08.00 AM
Updated by			:
Updated Date/hour	:
*/

public class Programmer extends Karyawan implements Bonus {
	
	private int qtyBug;
	private double bonusPG;
	
	private Double[]	pgJunior	= {1.0, 1.0, 1.2, 1.2, 1.5},
						pgMiddle	= {1.7, 1.7, 1.7, 1.8, 1.8, 2.1},
						pgSenior	= {2.5, 2.5, 2.5, 2.7, 2.7, 2.8};
	
	public Programmer() {
		
	}
	public Programmer (String nama, String nik, String lvlKaryawan, String penempatanKerja, int masaKerja, boolean isMaried, int qtyBug) {
		super(nama, nik, lvlKaryawan, penempatanKerja, masaKerja, isMaried);
		this.qtyBug = qtyBug;
	}
	
	public Double getLvlprog() {
		Double lvlProg = null;
			if(getLvlKaryawan().equalsIgnoreCase("junior")) {
				for(int i=0; i<pgJunior.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=pgJunior[i];
					}
				}
				
			}
			else if(getLvlKaryawan().equalsIgnoreCase("middle")) {
				for(int i=0; i<pgMiddle.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=pgMiddle[i];
					}
				}
			}
			else if(getLvlKaryawan().equalsIgnoreCase("senior")) {
				for(int i=0; i<pgSenior.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=pgSenior[i];
					}
				}
			}
			
		return lvlProg;
	}
	@Override
	public Double calculateGapok() {
		// TODO Auto-generated method stub
		Double umk;
		if(super.getPenempatanKerja().equalsIgnoreCase("bandung")) {
			umk = getUmkLocation()[0]*(getLvlprog());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			umk = getUmkLocation()[1]*(getLvlprog());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("karawang")) {
			umk = getUmkLocation()[2]*(getLvlprog());
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


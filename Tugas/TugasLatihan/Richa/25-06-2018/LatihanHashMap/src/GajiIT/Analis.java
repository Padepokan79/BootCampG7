package GajiIT;
/* 
Created by  		: Richa Fitria, Rizaldi, Vikri
Date/hour			: 08 Juni 2018/ 08.00 AM
Updated by			:
Updated Date/hour	:
*/

public class Analis extends Karyawan{
	
	private Double[]	saJunior	= {1.2, 1.2, 1.3, 1.3, 1.6},
						saMiddle	= {1.8, 1.8, 1.8, 1.9, 1.9, 2.2},
						saSenior	= {2.7, 2.7, 2.7, 2.9, 2.9, 3.0};
	public Analis() {
		
	}
	public Analis(String nama, String nik, String lvlKaryawan, String penempatanKerja, int masaKerja, boolean isMaried) {
		super(nama, nik, lvlKaryawan, penempatanKerja, masaKerja, isMaried);
		
	}
	
	public Double getLvlAnalis() {
		Double lvlProg = 0.0;
			if(getLvlKaryawan().equalsIgnoreCase("junior")) {
				for(int i=0; i<saJunior.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=saJunior[i];
					}
					else if (getMasaKerja()>saJunior.length-1) {
						lvlProg = saJunior[saJunior.length-1];
					}
				}
				
			}
			else if(getLvlKaryawan().equalsIgnoreCase("middle")) {
				for(int i=0; i<saMiddle.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=saMiddle[i];
					}
					else if (getMasaKerja()>saMiddle.length-1) {
						lvlProg = saMiddle[saMiddle.length-1];
					}
				}
			}
			else if(getLvlKaryawan().equalsIgnoreCase("senior")) {
				for(int i=0; i<saSenior.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=saSenior[i];
					}
					else if (getMasaKerja()>saSenior.length-1) {
						lvlProg = saSenior[saSenior.length-1];
					}
				}
			}else {
				lvlProg=null;
				System.out.println("level tidak terdefinisi");
			}
					return lvlProg;
	}
	@Override
	public Double calculateGapok(double umkLokasi) {
		// TODO Auto-generated method stub
		Double umk;
		if(super.getPenempatanKerja().equalsIgnoreCase("bandung")) {
			umk = umkLokasi*(getLvlAnalis());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			umk = umkLokasi*(getLvlAnalis());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("karawang")) {
			umk = umkLokasi*(getLvlAnalis());
		}
		else {
			umk=null;
			System.out.println("lokasi kerja tidak terdefinisi");
		}
		
		return umk;
	}
	@Override
	public Double calculateTunjTrans() {
		// TODO Auto-generated method stub
		return super.calculateTunjTrans();
	}
	
}
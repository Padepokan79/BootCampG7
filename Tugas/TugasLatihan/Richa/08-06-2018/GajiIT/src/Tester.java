/* 
Created by  		: Richa Fitria, Rizaldi, Vikri
Date/hour			: 08 Juni 2018/ 08.00 AM
Updated by			:
Updated Date/hour	:
*/

public class Tester extends Karyawan implements Bonus{
	private int qtyTestCase;
	private double bonusTS;
	private Double[]	tsJunior	= {1.1, 1.1, 1.2, 1.2, 1.5},
						tsMiddle	= {1.8, 1.8, 1.8, 1.9, 1.9, 2.1},
						tsSenior	= {2.6, 2.6, 2.6, 2.7, 2.7, 2.8}; 
	
	public Tester(String nama, String nik, String lvlKaryawan, String penempatanKerja, int masaKerja, boolean isMaried, int qtyTestCase) {
		super(nama, nik, lvlKaryawan, penempatanKerja, masaKerja, isMaried);
		this.qtyTestCase = qtyTestCase;
	}
	public Tester() {
		
	}
	public Double getLvlTest() {
		Double lvlProg = null;
		if(getLvlKaryawan().equalsIgnoreCase("junior")) {
			for(int i=0; i<tsJunior.length; i++) {
				if(getMasaKerja()==i) {
					lvlProg=tsJunior[i];
				}
			}
			
		}
		else if(getLvlKaryawan().equalsIgnoreCase("middle")) {
			for(int i=0; i<tsMiddle.length; i++) {
				if(getMasaKerja()==i) {
					lvlProg=tsMiddle[i];
				}
			}
		}
		else if(getLvlKaryawan().equalsIgnoreCase("senior")) {
			for(int i=0; i<tsSenior.length; i++) {
				if(getMasaKerja()==i) {
					lvlProg=tsSenior[i];
				}
			}
		}else {
			lvlProg=null;
			System.out.println("level tidak terdefinisi");
		}
		return lvlProg;
	}
	@Override
	public Double calculateGapok() {
		Double umk;
		if(super.getPenempatanKerja().equalsIgnoreCase("bandung")) {
			umk = getUmkLocation()[0]*(getLvlTest());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			umk = getUmkLocation()[1]*(getLvlTest());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("karawang")) {
			umk = getUmkLocation()[2]*(getLvlTest());
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
	
	public double bonus (int qtyTestCase) {
		qtyTestCase =  qtyTestCase;
		if(qtyTestCase*25000>500000) {
			bonusTS = 500000;
		} else {
			bonusTS = (qtyTestCase/100)*25000;
		}
		return bonusTS;
	}
	
}
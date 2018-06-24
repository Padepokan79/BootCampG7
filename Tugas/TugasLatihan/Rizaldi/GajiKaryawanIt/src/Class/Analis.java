package Class;

public class Analis extends Karyawan{
	
	private Double[]	saJunior	= {1.2, 1.2, 1.3, 1.3, 1.6},
						saMiddle	= {1.8, 1.8, 1.8, 1.9, 1.9, 2.2},
						saSenior	= {2.7, 2.7, 2.7, 2.9, 2.9, 3.0};
	public Analis() {
		
	}
	public Analis(String nama, String nik, String lvlKaryawan, String penempatanKerja, int masaKerja, String kawin, int qtyBug) {
		super(nama, nik, lvlKaryawan, penempatanKerja, masaKerja, kawin);
		
	}
	
	public Double getLvlAnalis() {
		Double lvlProg = null;
			if(getLvlKaryawan().equalsIgnoreCase("junior")) {
				for(int i=0; i<saJunior.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=saJunior[i];
					}
				}
				
			}
			else if(getLvlKaryawan().equalsIgnoreCase("middle")) {
				for(int i=0; i<saMiddle.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=saMiddle[i];
					}
				}
			}
			else if(getLvlKaryawan().equalsIgnoreCase("senior")) {
				for(int i=0; i<saSenior.length; i++) {
					if(getMasaKerja()==i) {
						lvlProg=saSenior[i];
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
			umk = getUmkLocation()[0]*(getLvlAnalis());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("jakarta")) {
			umk = getUmkLocation()[1]*(getLvlAnalis());
		}
		else if(super.getPenempatanKerja().equalsIgnoreCase("karawang")) {
			umk = getUmkLocation()[2]*(getLvlAnalis());
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

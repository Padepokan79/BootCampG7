package Class;

public class Programmer extends Karyawan{
	
	private int qtyBug;
	
	private Double[]	pgJunior	= {1.0, 1.0, 1.2, 1.2, 1.5},
						pgMiddle	= {1.7, 1.7, 1.7, 1.8, 1.8, 2.1},
						pgSenior	= {2.5, 2.5, 2.5, 2.7, 2.7, 2.8};
	public Programmer() {
		
	}
	public Programmer(String nama, String nik, String lvlKaryawan, String penempatanKerja, int masaKerja, String kawin, int qtyBug) {
		super(nama, nik, lvlKaryawan, penempatanKerja, masaKerja, kawin);
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
		// TODO Auto-generated method stub
		return super.calculateTunjTrans();
	}
	
}

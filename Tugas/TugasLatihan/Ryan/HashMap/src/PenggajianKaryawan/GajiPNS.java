package PenggajianKaryawan;

public class GajiPNS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer pg=new Programmer("Malik", "2342342", "Karawang", "Middle", 10, true, 3, 5);
		System.out.println(pg.toString());
		
		Tester ts=new Tester("Yana", "23423", "Karawang", "Senior", 3, true, 5000, 3);
		System.out.println("\n"+ts.toString());
		
		SistemAnalis sa=new SistemAnalis("Alifhar", "443523", "Karawang", "Senior", 0, 10);
		System.out.println("\n"+sa.toString());
	}

}

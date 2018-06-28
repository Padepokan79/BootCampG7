package AlifharMalikYana;

public class TesAtlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atlet at = new Atlet(170, 65, 25, "Budi", "Laki-laki", "12345");
		AtletSepakBola as = new AtletSepakBola(180, 66, 20, "Tono", "Laki-laki", "12346", "CB", 9, 9, 6, 6);
		
		System.out.println(at.toString());
		System.out.println();
		System.out.println(as.toString());
		System.out.println(as.latihTendang(10));
		System.out.println(as.latihLari(10));
		
		
	}

}

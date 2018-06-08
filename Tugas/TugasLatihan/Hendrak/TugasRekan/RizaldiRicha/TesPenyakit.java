package RizaldiRicha;

public class TesPenyakit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penyakit p = new Penyakit("jantung koroner", "sesak", "jantung", "kronis", 0.0, 'n');
		Flue f = new Flue("Flue", "meriang", "badan", "tidakbahaya", 0.0, 'y');
		Maag m = new Maag("Maag", "lambung perih", "lambung", "sedang", 0.0, 'y');
		Flue f2 = new Flue(p);
		
		System.out.println(p.toString());
		System.out.println(f.toStringg());
		System.out.println(m.toString());
		System.out.println();
		System.out.println(f2.toString());
		
		
		
	}

}

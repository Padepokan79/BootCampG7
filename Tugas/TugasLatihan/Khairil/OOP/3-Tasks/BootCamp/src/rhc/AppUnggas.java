package rhc;

class AppUnggas {

	public static void main(String[] args) {
		
		Unggas unggas = new Unggas("trakea", "cekitcekit", 7, 3);
		System.out.println( unggas.printUnggas() );
		
		Burung bur = new Burung(unggas, "tantina", "krem agak tuaan lah ya");
		System.out.println( bur.printBurung() );

	}

}

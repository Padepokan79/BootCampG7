package amy;

class AthleteApp {

	public static void main(String[] args) {
		Athlete athlete = new Athlete("Simon", "Laki laki", "SM", 174, 65, 28);
		AthleteFootball athfoo = new AthleteFootball(athlete, "Striker", 3, 3, 3, 3);
		
		System.out.println( athlete.printAthlette() );
		System.out.println( athfoo.latihanTendang(10) );
//		System.out.println( athfoo.latihanLari(10) );
	}

}

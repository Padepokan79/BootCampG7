package aak;

public class Buah {
	private String tipeBuah, bijiBuah;
	
	public Buah () {}
	public Buah (String tipeBuah, String bijiBuah) {
		this.tipeBuah = tipeBuah;
		this.bijiBuah = bijiBuah;
	}
	
	public String toString() {
		return "Tipe : "+tipeBuah+"\nBiji : "+bijiBuah;
	}

}

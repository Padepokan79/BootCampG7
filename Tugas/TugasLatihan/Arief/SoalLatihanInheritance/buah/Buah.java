package buah;

public class Buah {
	String tipe, biji;
	
	public Buah() {
		// TODO Auto-generated constructor stub
	}
	
	public Buah(String tipe, String biji) {
		 this.tipe = tipe;
		 this.biji = biji;
	}
	
	String printBuah(){
		return "Tipe " + tipe + " jenis biji " + biji;
	}

}

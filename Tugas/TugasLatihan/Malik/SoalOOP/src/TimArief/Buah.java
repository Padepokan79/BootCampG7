package TimArief;

public class Buah {
	private String tipe, biji;
	
	Buah(){
		
	}
	
	Buah(String tipe, String biji){
		this.tipe = tipe;
		this.biji = biji;
	}
	
	String toBuah() {
		return "Tipe\t: "+tipe+"\nBiji\t: "+biji;
	}
}

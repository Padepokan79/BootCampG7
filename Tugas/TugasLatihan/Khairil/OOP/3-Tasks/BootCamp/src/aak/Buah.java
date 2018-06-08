package aak;

class Buah {
	private String tipe, biji;
	
	public Buah(String tipe, String biji) {
		this.tipe = tipe;
		this.biji = biji;
	}
	
	public Buah() {
		
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}
	
	String getTipe() {
		return tipe;
	}
	
	public void setBiji(String biji) {
		this.biji = biji;
	}
	
	String getBiji() {
		return biji;
	}
	
	String printBiji() {
		return "Tipe buah : " + tipe + "\nJenis biji : " + biji;
	}
}

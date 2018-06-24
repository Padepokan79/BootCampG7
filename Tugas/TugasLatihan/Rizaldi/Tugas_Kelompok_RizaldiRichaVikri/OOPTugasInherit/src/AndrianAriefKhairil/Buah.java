package AndrianAriefKhairil;

public class Buah {
	private String tipe, biji;
	public Buah(){
		
	}
	public Buah(String tipe, String biji) {
		this.tipe = tipe;
		this.biji = biji;
	}
	
	// getter
	String  getTipe() {
		return tipe;
	}
	String getbiji() {
		return biji;
	}
	void setTipe(String tipe) {
		this.tipe = tipe;
	}
	void setBiji(String biji) {
		this.biji = biji;
	}
	
	
}

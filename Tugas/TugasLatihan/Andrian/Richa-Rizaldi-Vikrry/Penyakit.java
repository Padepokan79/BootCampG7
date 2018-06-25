package rrv;

public class Penyakit {
	
	private String namaPenyakit;
	
	
	public Penyakit() {}
	
	public Penyakit(String namaPenyakit) {
		this.namaPenyakit = namaPenyakit;
	}

	String getNamaPenyakit () {
		return namaPenyakit;
	}
	
	void setNamaPenyakit (String namaPenyakit) {
		this.namaPenyakit=namaPenyakit;
	}
	
	String printParent () {
		return namaPenyakit +". ";
	}
	
	
}

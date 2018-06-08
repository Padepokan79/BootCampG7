package KhairilAriefAndrian.Kanker;

public class Kanker {
	
	String klasifikasi,faktorResiko;
	
//	public Kanker() {
//		// TODO Auto-generated constructor stub
//	}
	public Kanker(String klasifikasi, String faktorResiko) {
		this.klasifikasi = klasifikasi;
		this.faktorResiko = faktorResiko;
	}
	
	public String toString() {
		return "Klasifikasi : "+klasifikasi+
				"\nFaktor Resiko : "+faktorResiko;
	}

}

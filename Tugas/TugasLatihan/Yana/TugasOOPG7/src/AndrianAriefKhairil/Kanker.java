package AndrianAriefKhairil;

public class Kanker {
	public String klasifikasi, faktorResiko;
	
	public Kanker() {
	}
	
	public Kanker(String klasifikasi, String faktorResiko) {
		this.klasifikasi	= klasifikasi;
		this.faktorResiko	= faktorResiko;
	}
	
	String tampilKanker() {
		return "Klasifikasi : "+klasifikasi+", Faktor Resiko : "+faktorResiko;
	}
}

package TimRizaldi;

public class Flue extends Penyakit{
	private String gejala, bagianYangDiserang;
	private Penyakit penyakit;
	Flue(){
		
	}
	
	Flue(Penyakit penyakit, String gej, String bag){
		this.penyakit = penyakit;
		gejala = gej;
		bagianYangDiserang = bag;
	}
	
	String toFlue() {
		return "Gejala\t\t: "+gejala+"\nBagian diserang\t: "+bagianYangDiserang+"\n"+penyakit.toPenyakit();
	}
}

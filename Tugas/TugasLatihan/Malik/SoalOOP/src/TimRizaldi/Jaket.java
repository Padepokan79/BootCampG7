package TimRizaldi;

public class Jaket extends Pakaian{
	private String ketebalan, kupluk;
	private Pakaian pakaian;
	Jaket(){
		
	}
	
	Jaket(Pakaian pakaian, String ketebalan, String kupluk){
		this.pakaian = pakaian;
		this.ketebalan  = ketebalan;
		this.kupluk 	= kupluk;
	}
	
	public String toTampil() {
		return pakaian.toTampil()+"\nKetebalan: "+ketebalan+"\nKupluk\t: "+kupluk;
	}
	
	Pakaian getPak() {
		return pakaian;
	}
	
	
}

package soal2;

public class VisaGold extends CreditCard {
	private static String nama="Visa Gold";
	
	public VisaGold(int terjual) {
		this.terjual=terjual;
	}
	
	int hitung() {
		int total=0;
		for(int bulan=0; bulan<12; bulan++) {
			if(bulan!=2)
				total+=terjual*insentifVisaGold;
			else
				total+=terjual*insentifVisaGold*0.8;
		}
		return total;
	}
	
	String getNama() {
		return nama;
	}
}

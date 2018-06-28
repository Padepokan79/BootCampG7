package soal2;

public class VisaPlatinum extends CreditCard {
	private static String nama="Visa Platinum";
	
	public VisaPlatinum(int terjual) {
		this.terjual=terjual;
	}
	
	int hitung() {
		int total=0;
		for(int bulan=0; bulan<12; bulan++) {
			if(bulan!=2)
				total+=terjual*insentifVisaPlatinum;
			else
				total+=terjual*insentifVisaPlatinum*0.8;
		}
		return total;
	}

	String getNama() {
		return nama;
	}
}

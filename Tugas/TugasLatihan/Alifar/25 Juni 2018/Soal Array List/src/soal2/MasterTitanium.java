package soal2;

public class MasterTitanium extends CreditCard {
	private static String nama="Master Titanium";
	
	public MasterTitanium(int terjual) {
		this.terjual=terjual;
	}
	
	int hitung() {
		int total=0;
		for(int bulan=0; bulan<12; bulan++) {
			if(bulan!=2)
				total+=terjual*insentifMasterTitanium;
			else
				total+=terjual*insentifMasterTitanium*0.8;
		}
		return total;
	}

	String getNama() {
		return nama;
	}
}

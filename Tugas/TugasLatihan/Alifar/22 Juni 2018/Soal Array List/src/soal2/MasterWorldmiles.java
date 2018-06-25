package soal2;

public class MasterWorldmiles extends CreditCard {
	private static String nama="Master Worldmiles";
	
	public MasterWorldmiles(int terjual) {
		this.terjual=terjual;
	}
	
	int hitung() {
		int total=0;
		for(int bulan=0; bulan<12; bulan++) {
			if(bulan!=2)
				total+=terjual*insentifMasterWorldmiles;
			else
				total+=terjual*insentifMasterWorldmiles*0.8;
		}
		return total;
	}

	String getNama() {
		return nama;
	}
}

package SoalHendraYN;

public class SoalKeduaCreditCard extends SoalKeduaAbstract implements SoalKeduaInterface{
	private int insentif;
	int terjualBulan;
	
	public SoalKeduaCreditCard() {
		
	}
	
	public SoalKeduaCreditCard(String namaCreditCard, int insentif, int terjualBulan) {
		this.namaCreditCard = namaCreditCard;
		this.insentif = insentif;
		this.terjualBulan = terjualBulan;
	}

	
	public int getInsentif() {
		return insentif;
	}

	public String toString() {
		
		return "";
	}
	
	
}

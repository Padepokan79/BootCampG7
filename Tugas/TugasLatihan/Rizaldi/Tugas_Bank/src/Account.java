
public class Account {
	int idNumber;
	Double saldo, tarik, setor, saldoTemp, money;
	String name;
	public Account() {
		
	}
	
	public Account(String nm, int id, Double sld) {
		name = nm;
		idNumber = id;
		saldo = sld;
	}
	
	public Account(Double sld) {
		saldo = sld;
	}
	
	public Account(Double sld, Double trk) {
		saldo = sld;
		tarik = trk;
	}
	
	public Account(Double sld, Double str, Double trk) {
		saldo = sld;
		setor = str;
		tarik = trk;
	}
	
	Double setorBank(Double saldo, Double setor) {
		saldo=saldo+setor;
		System.out.println("Anda setor sebesar :\t"+setor);
		return saldo;
	}
	
	void tarikBank() {
		if(saldo>=tarik) {
			saldo=saldo-tarik;
		}
		else {
			saldo=saldo;
		}
		
		System.out.println("Anda menarik uang sebesar :\t"+tarik);
	}
	
	void viewSaldo() {
		System.out.println("saldo anda sebesar :\t"+saldo);
	}
}

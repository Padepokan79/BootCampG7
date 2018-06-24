package customer;

public class TestCustomer {
	public static void main(String[] args) {
		String name, gender, usia;
		boolean member;
		int umur, hrgServ, hrgProd;
		
		Validasi valid = new Validasi();
		Visit cust = new Visit("", "", 0, true, "", 0, 0);
		
		valid.valHuruf(false, "Masukan Nama: ");
		cust.setName(valid.hasil);
	
		valid.valHuruf(false, "Jenis Kelamin: ");
		cust.setGender(valid.hasil);
		
		valid.valAngka(false, "umur: ");
		cust.setUsia(valid.hasilAngka);
		
		valid.valBoolean(false, "Apakah Anda member: ");
		cust.setMember(valid.hasilBool);
			
		if(cust.isMember() == true) {
			valid.valHuruf(false, "Masukan Member Type: ");
			cust.setMemberType(valid.hasil);
		}
		
		valid.valAngka(false, "Harga Service: ");
		cust.setServExp(valid.hasilAngka);
		
		
		System.out.println("======================================================");
		System.out.println(cust.toString());
	}
}

package RizaldiRicha;

public class Tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pakaian pk = new Pakaian("S", "pink", "nike", "katun", "cina", 10);
		Jaket jk = new Jaket("L", "Hitam", "nike", "parasit", "bandung", 40000);
		Kaos ks = new Kaos("M", "kuning", "adidas", "Katun", "ciparay", 10);
		
		System.out.println();
		
		System.out.println(pk.tampil());
		System.out.println(jk.tampil());
		System.out.println(ks.tampil());
		
		System.out.println();
		
		
		System.out.println(jk.tampil());
		System.out.println();
		
		System.out.println(ks.tampil());
		
	}

}

package Person;

public class TestPerson {

	public static void main(String[] args) {
		Person orangPertama = new Person();
		Person orangKedua = new Person(19, "Udin", "Nganga", "Perempuan", "Bobonekaan");
		Person orangKetiga = new Person();
		
		orangPertama.firstName = "Ryan";
		orangPertama.lastName = "Ahmad";
		orangPertama.age = 18;
		orangPertama.genders = "Laki laki";
		orangPertama.interest = "Sepak Bola";
		orangPertama.dataDiri();
		System.out.println();
		orangKedua.dataDiri();
		System.out.println();
		orangKetiga.Person(21, "Farah", "Quin", "Ganda", "Lari");
		orangKetiga.dataDiri();

	}

}

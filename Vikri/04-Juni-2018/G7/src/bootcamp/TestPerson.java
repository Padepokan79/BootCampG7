package bootcamp;

public class TestPerson {
	public static void main(String[] args) {
		Person orangPertama = new Person();
		Person orangKedua = new Person("Vikri", "Ramdhani", "Pria", "Music", 18, "Bandung");
		Person orangKetiga = new Person("Aceng", "Lakbeut", "Pria", "Berenang", 32, "Cimahi");
		
		orangPertama.firstname = "Vikri";
		orangPertama.lastName = "Ramdhani";
		orangPertama.gender = "Male";
		orangPertama.age = 18;
		orangPertama.interest = "Music, Reading";
		orangPertama.tLahir = "Bandung";
		
		orangPertama.biodata();
		orangPertama.greeting();
		System.out.println();
		
		orangKedua.biodata();
		orangKedua.greeting();
		System.out.println();
		
		orangKedua.gooday();
	}
}

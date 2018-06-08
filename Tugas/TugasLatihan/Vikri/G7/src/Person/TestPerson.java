package Person;

public class TestPerson {
	public static void main(String[] args) {
		Person orangPertama = new Person();
		Person orangKedua = new Person("Vikri", "Ramdhani", "Pria", "Music", 18);
		Person orangKetiga = new Person("Aceng", "Lakbeut", "Pria", "Berenang", 32);
		
		orangPertama.firstname = "Vikri";
		orangPertama.lastName = "Ramdhani";
		orangPertama.gender = "Male";
		orangPertama.age = 18;
		orangPertama.interest = "Music, Reading";
		
		orangPertama.biodata();
		orangPertama.greeting();
		System.out.println();
		
		orangKedua.biodata();
		orangKedua.greeting();
		System.out.println();
		
		orangKedua.gooday();
	}
}

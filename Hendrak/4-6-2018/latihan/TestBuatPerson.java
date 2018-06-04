package latihan;

public class TestBuatPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person orangPertama = new Person();
		Person orangKedua = new Person("Budi", "Doremi", "Male", "Jalan-jalan", 26, "Bandung");
		Person orangKetiga = new Person();
		Person orangKeempat = new Person("Zimbabwe");
		
		orangPertama.firstName = "Hendra";
		orangPertama.lastName = "Kurniawan";
		orangPertama.age = 25;
		orangPertama.gender = "Male";
		orangPertama.interest = "Makan,makan,makan";
		orangPertama.addres = "Bandung";
		
		orangPertama.biodata();
		orangPertama.greeting();
		
		orangKedua.biodata();
		orangKedua.greeting();
		
		orangKetiga.isiData("Anto", "Dodi", "Male", "bola", 23, "jakarta");
		orangKetiga.biodata();
		orangKetiga.greeting();
	
		orangKeempat.firstName = "Osas";
		orangKeempat.biodata();
		orangKeempat.greeting();
		
	}

}

package latihan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person orangPertama=new Person();
		Person orangKedua=new Person("Alifhar", "Juliansyah", "Male", "Coding", 21);
		Person orangKetiga=new Person();

		orangPertama.firstName="Deo";
		orangPertama.lastName="Bright";
		orangPertama.age=17;
		orangPertama.gender="Male";
		orangPertama.interest="Playing Games";
		System.out.println("\nOrang ke 1");
		orangPertama.biodata();
		orangPertama.greeting();
		
		System.out.println("\nOrang ke 2");
		orangKedua.biodata();
		orangKedua.greeting();
		
		orangKetiga.initial("ALI", "The Adventurer", "Male", "Walking", 20);
		System.out.println("\nOrang ke 3");
		orangKetiga.biodata();
		orangKetiga.greeting();		
	}

}
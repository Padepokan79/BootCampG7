//Created by : Hendra Kurniawan
//Date : 5 Juni 2018 Time : 2:32 PM
//Modified :
package latihan;

public class TestBuatPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Person orang1 = new Person("Hendra", "Kurniawan", "Male", "Game", 25);
	Teacher orang2 = new Teacher("Budi", "Setia", "Male", "Traveling", 35, "Matematika");
	Student orang3 = new Student("Tono", "kurnia", "Male", "renang", 10);
	
	System.out.println();
	System.out.println(orang1.bio());
	System.out.println(orang1.greeting());
	
	System.out.println();
	System.out.println(orang2.bio());
	System.out.println(orang2.greeting());
	
	System.out.println();
	System.out.println(orang3.bio());
	System.out.println(orang3.greeting());
	
	}

}

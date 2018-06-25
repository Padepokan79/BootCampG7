package Person;

public class TestPerson {

	public static void main(String[] args) {
		Teachers orangPertama = new Teachers(30, "Susi", "Susilawati", "Perempuan", "Mengajar", "Matematika");
		Person orangKedua = new Person(19, "Udin", "Nganga", "Perempuan", "Bobonekaan");
		Student orangKetiga = new Student(18, "Ryan", "Ahmad", "Laki Laki", "Tidur");

		System.out.println(orangKedua.bio());
		System.out.println(orangKedua.greeting());
		System.out.println();
		System.out.println(orangPertama.bio());
		System.out.println(orangPertama.greeting());
		System.out.println();
		System.out.println(orangKetiga.bio());
		System.out.println(orangKetiga.greeting());
		

	}

}

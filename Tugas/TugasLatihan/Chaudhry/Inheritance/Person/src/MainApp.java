
public class MainApp {
	public static void main(String[] args) {
		Person ps 	= new Person("Vikri", "Ramdani", 21, "Perempuan", "Shopping");
		Teacher tc	= new Teacher("Anom", "nugroho", 30, "Perempuan", "Mengajar", "Matematika");
		Student st	= new Student("nurdhiat", "malik", 18, "Laki-Laki", "Gamers"); 
		
		System.out.println("");
		System.out.println(ps.bio());
		System.out.println(ps.greeting());

		System.out.println("");
		System.out.println(tc.bio());
		System.out.println(tc.greeting());
		

		System.out.println("");
		System.out.println(st.bio());
		System.out.println(st.greeting());
	}
}

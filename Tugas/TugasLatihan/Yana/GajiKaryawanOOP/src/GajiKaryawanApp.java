
public class GajiKaryawanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer 	programmer 		= new Programmer("Yana Nuryana", "123456", "Karawang", "Programmer", "Middle", 10, 5, 3, true);
		Tester 		tester			= new Tester("Yana Nuryana", "123456", "Karawang", "Tester", "Senior", 3, 3, 5000, true);
		SistemAnalis sistemanalis	= new SistemAnalis("Yana Nuryana", "123456", "Karawang", "Sistem Analis", "Senior", 0, 10, false);
		System.out.println("\n"+programmer.toString());
		System.out.println("\n"+tester.toString());
		System.out.println("\n"+sistemanalis.toString());
	}
}

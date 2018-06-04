public class Drills2 {
/*
	public static void main(String[] args) {
		int def, debtAnto, credBaju, credDaftar, debtMenang, credBoneka, debtTotal, credTotal;

		def = 0;
		debtAnto = 100000;
		credBaju = 20000;
		credDaftar = 50000;
		debtMenang = 120000;
		credBoneka = 80000;

		System.out.println("Uang Anto     = " + debtAnto);
		System.out.println("Beli Baju     = \t\t" + credBaju);
		System.out.println("Daftar Lomba  = \t\t" + credDaftar);
		System.out.println("Menang Lomba  = " + debtMenang);
		System.out.println("Beli Boneka   = \t\t" + credBoneka);
		debtTotal = debtAnto + debtMenang;
		credTotal = credBaju + credDaftar + credBoneka;
		System.out.println("Subtotal Debt = " + debtTotal);
		System.out.println("Subtotal Cred = \t\t" + credTotal);
		def = debtTotal - credTotal;
		System.out.println("Total Sisa    = " + def);
	}
*/
	public static void main(String[] args) {
		int uang, kBaju, kDaftar, dMenang, kBoneka;

		uang = 100000;
		kBaju = 20000;
		kDaftar = 50000;
		dMenang = 120000;
		kBoneka = 80000;
		System.out.println("Uang Anto Awal                 = " + uang);
		uang = uang - kBaju;
		System.out.println("Sisa Uang Setelah beli baju    = " + uang);
		uang = uang - kDaftar;
		System.out.println("Sisa Uang Setelah daftar lomba = " + uang);
		uang = uang + dMenang;
		System.out.println("Sisa Uang Setelah menang lomba = " + uang);
		uang = uang - kBoneka;
		System.out.println("Sisa Uang Setelah beli boneka  = " + uang);
	}	
}

/*
Anto memiliki uang sebesar 100rb
Dia Membeli sebuah baju seharga 20rb
Mengikuti lomba dengan uang pendaftaran sebesar 50rb
dan menjadi juara kedua mendapatkan hadiah sebesar 120rb
dibelikan boneka sebesar 80rb
berapakah sisa uang anto
*/
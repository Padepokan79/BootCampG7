/*
	Nama : Malik Chaudhary
	time : 07-05-2018 2:10PM
*/
public class Ex6Drill4{
	public static void main(String[] args){
		int penghasilan, hargaBatagor, hargaBensin, hargaBuku, sisaUang;

		penghasilan  = 300000;
		hargaBatagor = 5000;
		hargaBensin  = 30000;
		hargaBuku    = 10000;

		sisaUang = penghasilan-(hargaBatagor+hargaBensin+hargaBuku);

		System.out.println("===================================================");
		System.out.println("RAJIN pangkal \"PANDAI\",\tHEMAT pangkal \"KAYU\bA\"");
		System.out.println("===================================================");
		System.out.println("Penghasilan\t\tRp. "+penghasilan);
		System.out.println("Pengeluaran");
		System.out.println("- Batagor\t\tRp. "+hargaBatagor);
		System.out.println("- Bensin\t\tRp. "+hargaBensin);
		System.out.println("- Buku\t\t\tRp. "+hargaBuku); 
		System.out.println("---------------------------------------------------");
		System.out.println("Sisa Uang\t\tRp. "+sisaUang);
		System.out.println("===================================================");
	}
}
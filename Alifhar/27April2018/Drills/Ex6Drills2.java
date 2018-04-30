/*
	* Created by:	Alifhar Juliansyah
	* 				27-04-2018	13:23
	* Updated by:
	*
*/
/*	Anto memiliki uang sebesar 100rb.
	kemudian membeli sebuah baju seharga 20rb,
	mengikuti lomba dengan uang pendaftaran sebesar 50rb, dan
	menjadi juara kedua mendaparkan hadiah sebesar 120rb.
	Kemudian dibelikan boneka harganya 80rb.
	Berapakah sisa uang Anto.
	*/

public class Ex6Drills2{
	public static void main(String[] args){
		int uang, baju, lomba, juara, boneka;
		uang=100000;
		baju=20000;
		lomba=50000;
		juara=120000;
		boneka=80000;
		System.out.println("Uang awal Anto: "+uang);
		
		uang=uang-baju;
		System.out.println("Setelah membeli baju menjadi "+uang);
		
		uang=uang-lomba;
		System.out.println("Kemudian mendaftar lomba menjadi "+uang);
		
		uang=uang+juara;
		System.out.println("Lalu mendapatkan hadiah dari juara dua menjadi "+uang);
		
		uang=uang-boneka;
		System.out.println("Kemudian membeli boneka menjadi "+uang);
	}
}

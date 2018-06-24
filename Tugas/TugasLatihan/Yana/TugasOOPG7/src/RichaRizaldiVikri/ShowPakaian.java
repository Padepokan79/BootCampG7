package RichaRizaldiVikri;

//import java.util.Scanner;
public class ShowPakaian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input 	= new Scanner(System.in);
//		
//		String 	ukuran, warna, merek, jenisBahan, madeIn, ketebalan, kupluk;
//		double 	harga;
		
//		System.out.println("INPUT PAKAIAN");
//		System.out.println("Ukuran: ");
//		ukuran = input.next();
//		System.out.println("Warna: ");
//		warna = input.next();
//		System.out.println("Merek: ");
//		merek = input.next();
//		System.out.println("Jenis Bahan: ");
//		jenisBahan = input.next();
//		System.out.println("Made In: ");
//		madeIn = input.next();
//		System.out.println("Harga: ");
//		harga = input.nextDouble();		
//		System.out.println("\nINPUT JAKET");
//		System.out.println("Ketebalan: ");
//		ketebalan = input.next();
//		System.out.println("Kupluk: ");
//		kupluk = input.next();
		
		
//		Pakaian pakaian = new Pakaian(ukuran, warna, merek, jenisBahan, madeIn, harga);
//		Jaket 	jaket 	= new Jaket(ketebalan, kupluk, pakaian);
		Pakaian pakaian = new Pakaian("M", "BIRU", "ASUS", "COTTON", "KOREA", 500000);
		Jaket 	jaket 	= new Jaket("TEBAL", "YA", pakaian);
		
		System.out.println("\nDATA APAKAIAN AWAL");
		System.out.println(pakaian.tampilPakaian());
		System.out.println("Kategori harga : "+pakaian.nominalHarga());
		System.out.println("Target warna   : "+pakaian.targetWarna());
		
		System.out.println("\nPAKAIAN");
		pakaian.targetMerek();
		pakaian.targetUkuran();
		System.out.println(pakaian.tampilPakaian());
		System.out.println("Kategori harga : "+pakaian.nominalHarga());
		System.out.println("Target warna   : "+pakaian.targetWarna());
				
		System.out.println("\nJAKET");
		System.out.println(jaket.tampilJaket());
		System.out.println("Kategori harga : "+pakaian.nominalHarga());
		System.out.println("Target warna   : "+pakaian.targetWarna());
	}
}

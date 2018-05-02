public class Arief2 {
	public static void main (String[] args) {

		int helmA, helmB, helmC, seminggu, sehari;
		
		helmA = 250000;
		helmB = 50000;
		helmC = 650000;

		sehari = 5* (helmA+helmB+helmC);
		seminggu = sehari*7;
		
		System.out.println("Ucup memiliki 5 buah toko helm, dalam sehari setiap toko helmnya berhasil menjual sebanyak 3 buah helm dengan masing-masing harga helmnya\nRp. 250.000 Helm A, Rp. 50.000 Helm B, Rp. 650.000 Helm C.\nBerapa hasil penjualan Helm dalam 1 minggu?");
		System.out.println("Ucup menerima uang hasil berjualan helm selama seminggu sebesar " + seminggu + " rupiah");

	}
}

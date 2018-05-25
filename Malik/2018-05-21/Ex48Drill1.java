/*
Created By 	: Malik Chaudhary
Time		: 21-05-2018 1:22PM
*/

public class Ex48Drill1{
	public static void main(String[] args){
		String[] hewanku = {"Hamster","Kelinci","Ayam","Kucing"};

		System.out.println(hewanku[1]);
		System.out.println();
		
		// menggunakan for each ( rec : untuk menampilkan semua data )
		for (String nama : hewanku ) {
			System.out.println(nama);
		}

		// menggunakan for biasa ( rec : bila menampilkan sebagian / beberapa data )
		System.out.println();
		for (int nama = 0; nama < hewanku.length; nama++ ) {
			System.out.println(hewanku[nama]);
		}
	}
}
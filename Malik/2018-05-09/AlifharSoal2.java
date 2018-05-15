/*
soal : 
Pak Ryu ingin menjual dua buah rumah yang harga beli nya sebesar 60 juta rupiah. 
Rumah pertama berhasil dijualnya dengan untung sebesar 30%. 
Namun rumah keduanya harus terpaksa dijual dengan harga 15% lebih murah dari harga belinya. 
Berapa total uang yang didapatkan oleh Pak Ryu?

create by : Malik Chaudhary
time : 08-05-2018 7:48PM

*/

public class AlifharSoal2{
	public static void main(String[] args){
		int hargaRumah;
		double untungRumahPertama, rugiRumahDua, totalUangPertama, totalUangDua, totalSemua;

		hargaRumah = 60000000;
		untungRumahPertama = 30.0/100;
		rugiRumahDua = 15.0/100;

		totalUangPertama = hargaRumah*untungRumahPertama;
		totalUangPertama = hargaRumah+totalUangPertama;

		totalUangDua = hargaRumah*rugiRumahDua;
		totalUangDua = hargaRumah-totalUangDua;

		totalSemua = totalUangPertama+totalUangDua;



		System.out.printf("total uang yang didapatkan oleh Pak Ryu : %.2f", totalSemua);

	}
}
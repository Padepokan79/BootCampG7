public class Ex6Drills3{
	public static void main(String[] args){
		int hargaAyamGoreng, hargaAyamBakar, hargaNasi, hargaTeh, hargaAir, opr1, opr2, hasil;

		hargaAir = 1000;
		hargaTeh = 2500;
		hargaNasi= 3500;
		hargaAyamBakar =9750;
		hargaAyamGoreng=9500;

		opr1 = (hargaAyamGoreng*2) + (hargaAyamBakar*3) + (hargaNasi*4) + (hargaTeh*2) + (hargaAir);
		opr2 = (opr1*15)/100;
		hasil = opr1 - opr2;
		System.out.println("Total harga yang dibayar Santi adalah sebesar " +hasil+ " rupiah");
	}
}

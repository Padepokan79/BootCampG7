public class LatihanSoalRizaldi2{
	public static void main(String[] args) {
		double gajian, mobil, kost, makan, keamanan, cicil, praTotal, total;
		
		gajian = 5000000;
		mobil = 60000000;
		kost = 500000;
		makan = 1000000;
		keamanan = 100000;

		gajian = gajian-(kost+makan);
		cicil = mobil/gajian;
		praTotal = cicil/6;
		keamanan = keamanan*praTotal;
		gajian = gajian*cicil-keamanan;
		total = cicil/12;

		System.out.println("bisa terbayar dalam : "+total+ " Tahun");
	}
}
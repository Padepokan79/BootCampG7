/* 	Date 		: 1/5/2018    
	Time 		: 08:25:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Khairil2 {
		public static void main(String[] args ) {
			int nilai1;
			double phi,luas;

			nilai1 = 15;
			phi = 3.14;			
			luas = phi*nilai1*nilai1;

			System.out.println( "Seorang guru sedang mengajarkan kepada muridnya untuk menghitung luas lingkaran.\nSetiap masing-masing lingkaran memiliki perhitungan yang berbeda.\nApabila jari-jari memiliki ukuran kelipatan 7 maka pergunakan konstanta phi = 22/7 dan apabila bukan kelipatan 7 maka pergunakan konstanta phi = 3,14." );
			System.out.println( "jika suatu lingkaran memiliki jari2 " + nilai1 + "  maka nilai phi adalah " + phi );
		}
	}
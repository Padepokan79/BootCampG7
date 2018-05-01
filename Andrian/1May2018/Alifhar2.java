/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Alifhar2 {
		public static void main( String [] args ) {
			double rumahsatu, rumahdua, untungrumahsatu, rugirumahdua, uangdarirumahsatu, uangdarirumahdua;

			rumahsatu = 60000000;
			untungrumahsatu =  rumahsatu * (30.0/100.0);
			uangdarirumahsatu = rumahsatu + untungrumahsatu;
			rumahdua = 60000000;
			rugirumahdua = rumahdua * (15.0/100.0);
			uangdarirumahdua = rumahdua - rugirumahdua;

			System.out.println("Pak Ryu ingin menjual dua buah rumah yang harga beli nya sebesar 60 juta rupiah.\nRumah pertama berhasil dijualnya dengan untung sebesar 30%.\nNamun rumah keduanya harus terpaksa dijual dengan harga 15% lebih murah dari harga belinya.\nBerapa total uang yang didapatkan oleh Pak Ryu?");
			System.out.printf("Uang pak ryu adalah %.0f\n",(uangdarirumahsatu+uangdarirumahdua));

		}
	}
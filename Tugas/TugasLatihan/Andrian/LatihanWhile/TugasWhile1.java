/* 	Date 		: 17/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
public class TugasWhile1 {
	public static void main(String[] args) {
		int angkaPertama = 1, angkaTerakhir = 1000;

		while  ( angkaPertama <= angkaTerakhir ) {
				if (angkaPertama%4==0 || angkaPertama%2==1 ){
					System.out.print(angkaPertama+" ");
				}
			angkaPertama = angkaPertama +1;
		}


/*		for (angka = 1 ; angka < 1000 ; angka ++) {
			if (angka%4==0 || angka%2==1) {
			System.out.print(angka);
			}
		}*/

	}
}
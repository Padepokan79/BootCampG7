/*
created by 	: Malik Chaudhary
time 		: 18-05-2018 12:57PM
soal :

Seorang Pedagang kue, setiap harinya membawa 200 potong kue untuk di jual.
Setiap 15 menit penjual tersebut berhasil menjual 3 potong kue.
Berapakah kue yang tersisa jika si penjual berjualan selama 8 jam 30 menit?
*/

public class DoWhileKue{
	public static void main(String[] args){
		int jmlKue, jual, perMenit, jam, menit, waktu, totalWaktu, nol = 0;

		jmlKue	 	= 200; 
		jual	 	= 3;
		perMenit 	= 15;
		jam		 	= 8;
		menit    	= 30;
		totalWaktu 	= (60*8)+30;

		do{
			jmlKue 		= jmlKue - jual;
			totalWaktu -= perMenit;
		}while( totalWaktu >= nol );


		System.out.println(jmlKue);
		
	}
}
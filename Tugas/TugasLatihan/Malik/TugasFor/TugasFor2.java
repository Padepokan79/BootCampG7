/*
created by 	: Malik Chaudhary
time 		: 16-05-2018 11:53AM
soal :

Seorang Pedagang kue, setiap harinya membawa 200 potong kue untuk di jual.
Setiap 15 menit penjual tersebut berhasil menjual 3 potong kue.
Berapakah kue yang tersisa jika si penjual berjualan selama 8 jam 30 menit?
*/

public class TugasFor2{
	public static void main(String[] args){
		int jmlKue, jual, perMenit, jam, menit, waktu, totalWaktu;

		jmlKue	 	= 200; 
		jual	 	= 3;
		perMenit 	= 15;
		jam		 	= 8;
		menit    	= 30;
		totalWaktu 	= (60*8)+30;

		for (waktu = totalWaktu; waktu >= 0; waktu -= perMenit) {
			jmlKue = jmlKue - jual;
		}
		System.out.println(jmlKue);
	}
}
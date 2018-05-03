/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 22:50 PM     
     Updated By  : 
     Update Date : 2 Mei 2018 09:55 AM
*/
class Rifan3 {
	public static void main(String[] args) {
		String soal;
		int totalX, totalY, jumApelX, jumJerukX, jumApelY, jumJerukY, 
			totalApel, totalJeruk, totalY2, jerukY2, totalYKurangHargaX, 
			jerukYKurangJerukX;

		soal = "Harga dua buah apel dan satu buah jeruk adalah Rp. 3.400, Harga satu apel dan dua jeruk adalah Rp. 4.100, Berapa total satu buah apel dan satu buah jeruk ?";

		totalX 				= 3400;
		totalY 				= 4100;
		jumApelX			= 2;
		jumApelY			= 1;
		jumJerukX			= 1;
		jumJerukY			= 2;

		jerukY2		= jumJerukY * 2;
		totalY2 		= totalY * 2;
		jerukYKurangJerukX	= jerukY2 - jumJerukX;
		totalJeruk			= (totalY2 - totalX) / jerukYKurangJerukX;

		totalApel			= (totalX - (jumJerukX * totalJeruk)) / jumApelX;


		System.out.println();
		System.out.println(" Harga 1 buah jeruk "+totalJeruk);

		System.out.println();
		System.out.println(" Harga 1 buah apel "+totalApel);
		System.out.println();		
	}
}

/*
Harga dua buah apel dan satu buah jeruk adalah Rp. 3.400, Harga satu apel dan dua jeruk adalah Rp. 4.100, Berapa total satu buah apel dan satu buah jeruk ?
*/
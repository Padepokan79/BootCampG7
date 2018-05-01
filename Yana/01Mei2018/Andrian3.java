/* 
Created by : Yana 
*/

/*
3. Harga dua buah apel dan satu buah jeruk adalah Rp. 3.400, 
Harga satu apel dan dua jeruk adalah Rp. 4.100, 
Berapa harga satu buah apel dan satu buah jeruk ?
x = kondisi 1
Y = kondisi 2
*/


public class Andrian3{
	public static void main(String[] args){

		int hargaX, hargaY, jumlahApelX, jumlahJerukX, jumlahApelY, jumlahJerukY, 
			hargaApel, hargaJeruk, hargaYKaliDua, jerukYKaliDua, hargaYKurangHargaX, 
			jerukYKurangJerukX;

		hargaX 				= 3400;
		hargaY 				= 4100;
		jumlahApelX			= 2;
		jumlahApelY			= 1;
		jumlahJerukX		= 1;
		jumlahJerukY		= 2;

		//MENGHITUNG HARGA 1 BUAH JERUK
		jerukYKaliDua		= jumlahJerukY * 2;
		hargaYKaliDua 		= hargaY * 2;
		jerukYKurangJerukX	= jerukYKaliDua - jumlahJerukX;
		hargaJeruk			= (hargaYKaliDua - hargaX) / jerukYKurangJerukX;

		//MENGHITUNG HARGA 1 BUAH APEL
		hargaApel			= (hargaX - (jumlahJerukX * hargaJeruk)) / jumlahApelX;


		System.out.println();
		// System.out.println(" Harga Y kali 2 "+hargaYKaliDua);
		// System.out.println(" Pengurangan "+jerukYKurangJerukX);
		System.out.println(" Harga 1 buah jeruk adalah Rp "+hargaJeruk);

		System.out.println();
		System.out.println(" Harga 1 buah apel adalah Rp "+hargaApel);
		System.out.println();




	}
}


/* 
Created by  		: Richa Fitria
Date/hour			: 21 Juni 2018/ 10.05 AM
Updated by			:
Updated Date/hour	:
*/

public class Buah {

	String namaBuah;
	private double harga;
	 int day1, day2, day3, day4, day5, day6, day7;
	
	public Buah (String namaBuah, double harga, int day1, int day2, int day3, int day4, int day5, int day6, int day7) {
		this.namaBuah = namaBuah;
		this.harga = harga;
		this.day1 = day1; 
		this.day2 = day2;
		this.day3 = day3;
		this.day4 = day4;
		this.day5 = day5;
		this.day6 = day6;
		this.day7 = day7;
	}

	public String getNamaBuah() {
		return namaBuah;
	}

	public void setNamaBuah(String namaBuah) {
		this.namaBuah = namaBuah;
	}

	public double getHarga() {
		return harga;
	}

	public int getDay1() {
		return day1;
	}

	public void setDay1(int day1) {
		this.day1 = day1;
	}

	public int getDay2() {
		return day2;
	}

	public void setDay2(int day2) {
		this.day2 = day2;
	}

	public int getDay3() {
		return day3;
	}

	public void setDay3(int day3) {
		this.day3 = day3;
	}

	public int getDay4() {
		return day4;
	}

	public void setDay4(int day4) {
		this.day4 = day4;
	}

	public int getDay5() {
		return day5;
	}

	public void setDay5(int day5) {
		this.day5 = day5;
	}

	public int getDay6() {
		return day6;
	}

	public void setDay6(int day6) {
		this.day6 = day6;
	}

	public int getDay7() {
		return day7;
	}

	public void setDay7(int day7) {
		this.day7 = day7;
	}
	
	
}

/*
Seorang Pedagang Buah, setiap harinya selalu menyediakan 20kg

Semangka dengan harga 18000/Kg 
Pisang dengan harga 15000/Kg 
mangga dengan harga 10000/Kg 

Setiap hari senin, pedagang tersebut berhasil menjual:
Semangka 12kg
Pisang 10kg
Mangga 13kg

Setiap hari Selasa, pedagang tersebut berhasil menjual:
Semangka 15kg
Pisang 14kg
Mangga 12kg

Setiap hari Rabu, pedagang tersebut berhasil menjual:
Semangka 11kg
Pisang 15kg
Mangga 9kg

Setiap hari Kamis, pedagang tersebut berhasil menjual:
Semangka 8kg
Pisang 7kg
Mangga 15kg

Setiap hari Sabtu, pedagang tersebut berhasil menjual:
Semangka 10kg
Pisang 13kg
Mangga 9kg

Setiap hari Minggu, pedagang tersebut berhasil menjual:
Semangka 14kg
Pisang 16kg
Mangga 13kg

Sedangkan setiap hari jumat semua buah laku terjual, 


1. Hitunglah Penghasilan Pedagang buah setiap harinya.
2. Hitunglah penghasilan pedagang selama seminggu.
3. Hitunglah penghasilan pedagang selama sebulan.
4. Pada hari apa pedagang mendapatkan penghasilan terbesar dan berapa jumlah  penghasilanya.
5. Pada hari apa pedagang mendapatkan penghasilan terkecil dan berapa jumlah  penghasilanya.
6. Berapakah perbandingan penghasilan pedagang pada hari minggu dan hari kamis.
7. Hitunglah buah yang paling banyak terjual selama seminggu.
8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu.
9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu.
10.Hitung Penghasilan Laba penjual selama sebulan, jika penjual mengambil untuk  sebanyak 20% dari harga jual.
=====================================================================

PEDAGANG BUAH

1. Penghasilan Perhari
2. Penghasilan Perminggu
3. Penghasilan Sebulan
4. Penghasilan terkecil
5. Penghasilan terbesar
6. Perbandingan Penghasilan
7. Buah yang paling banyak terjual selama seminggu.
8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu.
9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu.
10.Hitung Penghasilan Laba penjual selama sebulan.

Masukan Menu yang diinginkan 1 s.d 6:
2

Penghasilan Penjualan buah selama seminggu adalah ********

Mau menghitung yang lain? (Ya/Tidak)
ya


PEDAGANG BUAH

1. Penghasilan Perhari
2. Penghasilan Perminggu
3. Penghasilan Sebulan
4. Penghasilan terkecil
5. Penghasilan terbesar
6. Perbandingan Penghasilan
7. Buah yang paling banyak terjual selama seminggu.
8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu.
9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu.
10.Hitung Penghasilan Laba penjual selama sebulan.

Masukan Menu yang diinginkan 1 s.d 6:
a
Maaf yang anda input salah, Silahkan inputkan berupa angka dari 1 s.d 6.

Masukan Menu yang diinginkan 1 s.d 6:
6

Masukan Hari ke 1:
Selasa

Masukan Hari ke 2:
Minggu

Perbandingan antara Hari selasa dan minggu adalah *******, pendapatan hari minggu  lebih besar.

Mau menghitung yang lain? (Ya/Tidak)
1
Maaf yang anda input salah, Silahkan inputkan Ya atau Tidak.

Batasan:
-user input menu, tidak boleh lebih dari 6
-user input menu, tidak boleh kurang dari 1
-user input menu, hanya menerima angka saja
-user input untuk perbandingan hari, hanya boleh menginput hari senin s.d minggu.
-user input untuk perbandingan hari, hanya menerima String saja.

*petunjuk:
-Array
-If else
-Looping for
-While
-Do while

*/
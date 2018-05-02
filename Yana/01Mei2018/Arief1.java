/*
created by 	: Yana
time		: 1 Mei 2018

Udin pergi ke toko alat tulis membeli pulpen seharga Rp. 1.950 per buah nya. 
Udin membeli pulpen sebanyak satu lusin, jika Udin membayar menggunakan 
uang lembaran Rp.10.000 sebanyak tiga lembar, berapakah kembalian yang diterima Udin?
*/

public class Arief1{
	public static void main(String[] args){
		int haragPulpen, jumlahPulpen, nominalUang, jumlahUang, kembalian;

		haragPulpen		= 1950;
		jumlahPulpen	= 12;
		nominalUang		= 10000;
		jumlahUang		= 3;
		kembalian		= (nominalUang * jumlahUang) - (haragPulpen * jumlahPulpen);

		System.out.println("Jumlah kembalian uang Udin adalah Rp. "+kembalian);
	}
}
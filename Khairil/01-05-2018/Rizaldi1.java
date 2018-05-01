/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 08:25 AM     
     Updated By  : 
     Update Date : 
*/
class Rizaldi1 {
	public static void main(String[] args) {
		int roti, qtyroti, airMin, qtyairMin, kenyangRoti, totalKroti, lapar, sisaKroti;
		double kenyangAir, totalKair, sisaKair;
		String soal;

		soal = "Adi membeli 20 bungkus roti dan 20 botol air mineral, jika lapar adi memakan 1 bungkus roti dan 1/2 botol air mineral. berapa sisa roti dan air mineral jika adi merasa lapar 15 kali. ?";

		roti = 1;
		airMin = 1;
		qtyroti = 20;
		qtyairMin = 20;
		kenyangRoti = roti;
		kenyangAir  = 0.5 * airMin;
		lapar = 15;
		totalKroti = 15 * kenyangRoti;
		totalKair  = 15 * kenyangAir;

		System.out.println(soal);
		System.out.println();
		System.out.println("Jumlah roti yang tersedia : " + qtyroti + " roti");
		System.out.println("Jumlah air yang tersedia  : " + qtyairMin + " botol");
		System.out.println("Berapa kali lapar         : " + lapar + "x");
		System.out.println("Jumlah roti yang dimakan  : " + totalKroti + " roti");
		System.out.println("Jumlah air yang diminum   : " + totalKair + " botol");
		System.out.println();

		sisaKroti = qtyroti - totalKroti;
		sisaKair  = qtyairMin - totalKair;

		System.out.println("Jumlah roti yang tersisa  : " + sisaKroti + " roti");
		System.out.println("Jumlah air yang tersisa   : " + sisaKair + " roti");		
	}
}
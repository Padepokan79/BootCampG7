/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 09:20 AM     
     Updated By  : 
     Update Date : 
*/
class Rifan1 {
	public static void main(String[] args) {
		String soal;
		int tiangBendera, tono, ati, susi, posTono, posAti, posSusi, posTiang;
		soal = "Tono berada 20 meter disebelah kiri tiang bendera. Ati berada 4 meter disebelah kanan tono, sedangkan susi berada 8 meter disebelah kiri ati. jika posisi tiang bendera dianggap posisi awal atau titik nol, berapa meterkah susi dengan tiang bendera ?";
		tiangBendera = 0;
		tono = 20 + tiangBendera;
		ati  = 4 + tono;
		susi = 8 + ati;
		System.out.println(soal);
		System.out.println();
		System.out.println("Posisi Tiang Bendera = " + 0);
		System.out.println("Posisi Tono dari tiang bendera = " + tono + " meter dari tiang");
		System.out.println("Posisi Ati dari tiang bendera  = " + ati + " meter dari tiang");
		System.out.println("Posisi Susi dari tiang bendera = " + susi + " meter dari tiang");
	}
}
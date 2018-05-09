/*
	DATA CREATED 	: 08 Mei 2018
	AUTHOR 			: NURDHIAT CHAUDHARY MALIK
*/
/*
	1. Tono berada 20 meter disebelah kiri tiang bendera. Ati berada 4 meter disebelah kanan tono, sedangkan susi berada 8 meter disebelah kiri ati. jika posisi tiang bendera dianggap posisi awal atau titik nol, berapa meterkah susi dengan tiang bendera ?
*/
public class Andrian02{
	public static void main(String[] args){
		
		int tono, ati, susi, operasi;

		tono 	= 20; // sebelah kiri bendera
		ati 	= 4; // sebelah kanan tono
		susi 	= 8; // sebelah kiri ati

		operasi 	= (tono - ati) + susi;

		System.out.print("Jarak Susi dengan tiang bendera " + operasi + " Meter");
	}
}
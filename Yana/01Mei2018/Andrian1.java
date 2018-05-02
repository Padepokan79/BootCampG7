/* 
Created by 	: Yana 
time		: 1 Mei 2018

1. Tono berada 20 meter disebelah kiri tiang bendera. 
Ati berada 4 meter disebelah kanan tono, sedangkan susi berada 8 meter 
disebelah kiri ati. jika posisi tiang bendera dianggap posisi awal atau titik nol, 
berapa meterkah susi dengan tiang bendera ?
*/

public class Andrian1{
	public static void main(String[] args){

		int jarakTonoDanBendera, jarakAtiDanTono, jarakSusiDanAti, jarakAtiDanBendera, jarakSusiDanBendera;

		jarakTonoDanBendera		= 20;
		jarakAtiDanTono			= 4;
		jarakSusiDanAti			= 8;

		jarakAtiDanBendera		= jarakTonoDanBendera - jarakAtiDanTono;
		jarakSusiDanBendera		= jarakAtiDanBendera + jarakSusiDanAti;

		System.out.println();
		System.out.println("Jarak antara Susi dan Tiang Bendera adalah " +jarakSusiDanBendera+ " meter");
	}
}
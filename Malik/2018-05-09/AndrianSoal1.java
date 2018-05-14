/*
soal : 
Tono berada 20 meter disebelah kiri tiang bendera. 
Ati berada 4 meter disebelah kanan tono, sedangkan susi berada 8 meter disebelah kiri ati. 
jika posisi tiang bendera dianggap posisi awal atau titik nol, berapa meterkah susi dengan tiang bendera ?
create by : Malik Chaudhary
time : 08-05-2018 7:57PM

*/

public class AndrianSoal1{
	public static void main(String[] args){
		int jarakTono, jarakAti, jarakSusi, jarakSusiTiang;
		

		jarakTono = 20;
		jarakAti = 4;
		jarakSusi = 8;

		jarakSusiTiang = (jarakTono-jarakAti)+jarakSusi;




		System.out.print("Jarak susi dengan tiang bendera : "+jarakSusiTiang+ " meter");

	}
}
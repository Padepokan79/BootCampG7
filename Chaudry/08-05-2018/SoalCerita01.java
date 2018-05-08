/*
	Data Created 	= 07 Mei 2018
	Author			= Nurdhiat Chaudhary Malik
*/
public class SoalCerita01{
	public static void main(String[] args){
		int hargaPulpen, jmlPulpen, uang, jmlUang, kembalian;

		hargaPulpen = 1950;
		jmlPulpen 	= 12; // 1 lusin
		uang 		= 10000;
		jmlUang 	= 3;

		kembalian 	= (uang*jmlUang) - (hargaPulpen*jmlPulpen);
		System.out.println("Kembalian yang diterima Udin Rp" + kembalian);
	}
}
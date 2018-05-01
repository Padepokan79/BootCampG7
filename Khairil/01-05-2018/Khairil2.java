/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 13:15 AM     
     Updated By  : 
     Update Date : 
*/
class Khairil2 {
	public static void main(String[] args) {
		int rad;
		double phi, luas;

		phi = 22/7;
		rad = 7;
		luas = phi * rad;

		System.out.println("Phi       : " + phi);
		System.out.println("Jari-jari : " + rad);
		System.out.println("Luas      : " + luas);
		System.out.println();

		phi = 3.14;
		rad = 10;
		luas = phi * rad;

		System.out.println("Phi       : " + phi);
		System.out.println("Jari-jari : " + rad);
		System.out.printf("Luas       : %.2f", luas);
	}
}
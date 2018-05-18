/*
	Created By Vikri
	17/05/2018
	12:58
*/
public class SoaLatihan{
	public static void main(String[] args) {
		int angka = 1;
		while(angka <= 1000){
			if ((angka%2)==1) {
				System.out.println("Angka "+angka+" adalah ganjil");
				angka = angka + 4;
			}
		}
	}
}
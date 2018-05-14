/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 Mei 2018 09:20 
     * Updated By : 
     * Updated At : 
*/

//Umur anak perempuan 25

import  java.util.Scanner;

public class Ex18Drill2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int usiaAnak, umurPelamar, menyetujui=0;
		double penghasilan, batasPenghasilan, penampilan;

		batasPenghasilan = 5000000;
		usiaAnak = 25;

		System.out.print("Berapa Usia anda nak? ");
		umurPelamar = keyboard.nextInt();

		System.out.print("Dari skala 0.0 sampai 10.0 kira kira berapa nilai penampilan mu? ");
		penampilan = keyboard.nextDouble();

		System.out.print("Gaji mu berapa? ");
		penghasilan = keyboard.nextDouble();

		//Kakek
		if (umurPelamar >= 30 && penghasilan >= batasPenghasilan ) {
			menyetujui = menyetujui+1;
			System.out.println("Kakek : Menyetujui");
		}
		else {
			System.out.println("Kakek : Tidak Setuju");
		}

		//Ibu
		if (umurPelamar >= 17 && umurPelamar < 30 && penghasilan >= batasPenghasilan && penampilan >= 8) {
			menyetujui = menyetujui+1;
			System.out.println("Ibu : Menyetujui");
		}
		else {
			System.out.println("Ibu : Tidak menyetujui");
		}

		//Ayah
		if (umurPelamar <= usiaAnak+5 && umurPelamar >= usiaAnak-5 && penghasilan >= batasPenghasilan && penampilan >= 8) {
			menyetujui = menyetujui+1;
			System.out.println("Ayah : Menyetujui");
		}
		else {
			System.out.println("Ayah : Tidak Menyetujui");
		}

		//Nenek
		if (umurPelamar > 25 && umurPelamar < 40 && (penghasilan > batasPenghasilan || penampilan >= 8)) {
			menyetujui = menyetujui+1;
			System.out.println("Nenek : Menyetujui");
		}
		else {
			System.out.println("Nenek : Tidak Menyetujui");
		}

		//Kondisi
		if (menyetujui < 1) {
			System.out.println(" Anda tidak diperbolehkan menikahi anak saya!");
		}
	}
}
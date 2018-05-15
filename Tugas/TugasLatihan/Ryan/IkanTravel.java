/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 14 May 2018 13:56
     * Updated By : 
     * Updated At : 
*/
import java.util.Scanner;

public class IkanTravel {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int bis60, bis45, bis32, bis18, bis12, bisE6;
		float hBis60, hBis45, hBis32, hBis18, hBis12, hBisE6;
		double rekomendasi;
		
		bis60 = 60;
		bis45 = 45;
		bis32 = 32;
		bis18 = 18;
		bis12 = 12;
		bisE6 = 6;

		hBis60 = 2300000;
		hBis45 = 2000000;
		hBis32 = 1800000;
		hBis18 = 1500000;
		hBis12 = 1300000;
		hBisE6 = 2000000;

		System.out.println("===== Welcome To Ikan Travel =====");
		System.out.print("\nMasukan Jumlah Penumpang : ");
		int jmlPenumpang = keyboard.nextInt();
		System.out.println("Bis Yang tersedia :");
		System.out.println("----------------------------------------------");

		if (jmlPenumpang >= bis60) {
			System.out.println("Bis Dengan Kursi : "+bis60+"\tHarga : "+hBis60);
		}
		if (jmlPenumpang >= bis45){
			System.out.println("Bis Dengan Kursi : "+bis45+"\tHarga : "+hBis45);
		}
		if (jmlPenumpang >= bis32){
			System.out.println("Bis Dengan Kursi : "+bis32+"\tHarga : "+hBis45);
		}
		if (jmlPenumpang >= bis18){
			System.out.println("Bis Dengan Kursi : "+bis18+"\tHarga : "+hBis18);
		}
		if (jmlPenumpang >= bis12){
			System.out.println("Bis Dengan Kursi : "+bis12+"\tHarga : "+hBis12);
		}
		if (jmlPenumpang >= bisE6 || jmlPenumpang <= bisE6) {
			System.out.println("Bis Dengan Kursi : "+bisE6+"\tHarga : "+hBisE6);
		}

		System.out.println("\nRekomendasi Bis untuk anda");

		if (jmlPenumpang < 12) {
			rekomendasi = jmlPenumpang-bisE6;
			System.out.println(rekomendasi);
			if (rekomendasi >= 1) {
				System.out.println("\n2 bis dengan 6 kursi dengan harga harga Rp."+hBisE6*2);	
			}
			else if(rekomendasi <= 0 ){
				System.out.println("\n1 bis dengan 6 kursi dengan harga Rp."+hBisE6);
			}
		}

		else if(jmlPenumpang < 18 && jmlPenumpang >= 12){
			rekomendasi = jmlPenumpang%bis12;
			if (rekomendasi >= 1) {
				float harga = hBis12*2;
				System.out.println("\n2 bis dengan 12 kursi dengan harga Rp."+harga);
			}
			else{
				System.out.println("\n1 bis dengan 12 kursi dengan harga Rp."+hBis12);
			}
		}

		else if(jmlPenumpang < 32 && jmlPenumpang >= 18){
			rekomendasi = jmlPenumpang%bis18;
			if (rekomendasi <= 12 && rekomendasi > 6) {
				float harga = hBis12+hBis18;
				System.out.println("\n1 bis dengan 18 kursi dan 1 bis dengan 12 kursi dengan harga Rp."+harga);
			}
			else if (rekomendasi <= 6 && rekomendasi > 0) {
				float harga = hBis12*2;
				System.out.println("\n2 bis dengan 12 kursi dengan harga Rp."+harga);
			}
			else if(rekomendasi >= 13){
				float harga = hBis18*2;
				System.out.println("\n2 bis dengan 18 kursi dengan harga Rp."+harga);	
			}
			else if(rekomendasi == 0){
				System.out.println("\n1 bis dengan 18 kursi dengan harga Rp."+hBis18);
			}
		}

		else if(jmlPenumpang < 45 && jmlPenumpang >= 32){
			rekomendasi = jmlPenumpang%bis32;
			if (rekomendasi >= 1 && <= 4 ) {
				float harga = hBis18*2;
				System.out.println("\n2 bis dengan 18 kursi dengan harga Rp."+harga);
			}
			if (rekomendasi > 4 ) {
				float harga = hBis18+hBis32;
				System.out.println("\n1 bis dengan 32 kursi dan 1 bis dengan 12 kursi dengan harga Rp."+harga);
			}
			else{
				System.out.println("\n1 bis dengan 32 kursi dengan harga Rp."+hBis32);
			}
		}

		else if(jmlPenumpang < 60 && jmlPenumpang >= 45){
			rekomendasi = jmlPenumpang%bis45;
			if (rekomendasi >= 1 && < ) {
				float harga = hBis45+hBis12;
				System.out.println("\n1 bis dengan 45 kursi dan 1 bis dengan 12 kursi dengan harga Rp."+harga);
			}
			else{
				System.out.println("\n1 bis dengan 45 kursi dengan harga Rp."+hBis45);
			}
		}

		else if(jmlPenumpang <= 120 && jmlPenumpang >= 60){
			int totalbis = jmlPenumpang/bis60;
			rekomendasi = jmlPenumpang%bis60;
			
			if (rekomendasi >= 1 && rekomendasi <= 12) {
				float harga = hBis60+hBis12;
				System.out.println("\n1 bis dengan 60 kursi dan 1 bis dengan 12 kursi dengan harga Rp."+harga);
			}
			else if(rekomendasi > 12 && rekomendasi <= 18){
				float harga = hBis60+hBis18;
				System.out.println("\n1 bis dengan 60 kursi dan 1 bis dengan 18 kursi dengan harga Rp."+harga);	
			}
			else if (rekomendasi > 18 && rekomendasi <= 30) {
				float harga = hBis45*2;
				System.out.println("\n2 bis dengan 45 kursi Rp."+harga);
			}
			else if (rekomendasi > 30 && rekomendasi <= 32) {
				float harga = hBis45*2;
				System.out.println("\n1 bis dengan 60 kursi dan 1 bis dengan 32 kursi dengan harga Rp."+harga);	
			}
			else if (totalbis == 2) {
				float harga = hBis60*2;
				System.out.println("\n2 bis dengan 60 kursi dengan harga Rp."+harga);
			}
			else{
				System.out.println("\n1 bis dengan 45 kursi dengan harga Rp."+hBis45);
			}
		}		

	}
}
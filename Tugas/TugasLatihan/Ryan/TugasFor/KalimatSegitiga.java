/*
     * Display a listing of the resource.
     *
     * Programmer : Ryan Ahmad N
     * Created By :	Ryan Ahmad N
     * Created At : 17 May 2018 07:52
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class KalimatSegitiga{
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);


		int batas, panjangHuruf, barisAwal, huruf =0, spasi=0, hurufKe=0, kalimatKe=0;
		String kalimat;

		System.out.println("Menampilkan bilangan prima dengan batas yang ditentukan");
		System.out.println("========================================================");
		System.out.print("\nBatas Segitiga\t: ");
		batas = key.nextInt();
		System.out.print("Kalimat\t: ");
		kalimat = keyboard.nextLine();
		
		panjangHuruf = kalimat.length();


		for (barisAwal = 0;barisAwal < batas;barisAwal++) {
			for (spasi = 0; spasi < panjangHuruf-barisAwal ; spasi++) {
				System.out.print("-");
			}
			for (hurufKe = huruf; hurufKe <= barisAwal;hurufKe++ ) {
				if (kalimatKe < panjangHuruf) {
					System.out.print(kalimat.substring(kalimatKe,kalimatKe+1));
					System.out.print(" ");
					kalimatKe++;	
				}				
			}
			System.out.println();
		}
	}
}

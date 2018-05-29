/*
     * Tes1 Java.
     *
     * Programmer : Ryan Ahmad N
     * Created By :	Ryan Ahmad N
     * Created At : 29 May 2018 10:15 - 10:52
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Kuis1Ryan{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String urutan;
		int urutanMax=100, urutanMin=5, cek=1, urutanIn=0;
		double fibonacci=0, simpanan1=0, simpanan2=1;

		System.out.print("Jumlah urutan angka fibonanci yang akan ditampilkan : ");
		do{
			urutan = key.nextLine();
			if (urutan.matches("[0-9 ]+")) {
				urutanIn = Integer.parseInt(urutan);
				if (urutanIn < urutanMin) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari "+urutanMin+".\nSilahkan input kembali.");
					cek = 0;
				}
				else if (urutanIn > urutanMax) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari "+urutanMax+".\nSilahkan input kembali.");
					cek = 0;	
				}
				else{
					cek = 1;
				}
			}
			else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.\nSilahkan input kembali");
				cek = 0;
			}
		}while (cek == 0);

		System.out.println();
		System.out.print(1+" ");
		for (int deretFibonacci = 1; deretFibonacci < urutanIn;deretFibonacci++ ) {
			    fibonacci = simpanan1 + simpanan2;
			    simpanan1 = simpanan2;
			    simpanan2 = fibonacci;
		System.out.printf(" %.0f",fibonacci);
		}
	}
}
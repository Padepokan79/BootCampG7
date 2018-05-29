/*
     * Tes2 Java.
     *
     * Programmer : Ryan Ahmad N
     * Created By :	Ryan Ahmad N
     * Created At : 29 May 2018 10:52 - 11:20
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Kuis2Ryan{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		String baris;
		int barisMax=20, barisMin=2, cek=1, barisIn=0, angkaPascal=0;

		System.out.print("Jumlah baris untuk segitiga Paskal yang akan ditampilkan : ");
		do{
			baris = key.nextLine();
			if (baris.matches("[0-9 ]+")) {
				barisIn = Integer.parseInt(baris);
				if (barisIn < barisMin) {
					System.out.println("Maaf, jumlah baris tidak boleh kurang dari "+barisMin+".\nSilahkan input kembali.");
					cek = 0;
				}
				else if (barisIn > barisMax) {
					System.out.println("Maaf, jumlah baris tidak boleh lebih dari "+barisMax+"\nSilahkan input kembali.");
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

		for (int deretBaris = 0; deretBaris < barisIn ; deretBaris++){
			for (int penyaring = 0; penyaring <= deretBaris;penyaring++ ) {
				if (penyaring == 0 || deretBaris == penyaring) {
					angkaPascal = 1;
				}
				else{
					angkaPascal = angkaPascal*(deretBaris + 1 - penyaring)/penyaring;
				}
			System.out.print(angkaPascal+" ");
			}
		System.out.println();
		}
	}
}


//  for (int i=0; i<=nilai; i++){
//         for (int j=0; j<=i; j++){
//             if (j==0||i==j){
//                 a=1;
//             }else{
//                 a=a*(i+1-j)/j;
//             }
//             cout<<a;
//         }
//             cout<<" ";
//         cout<<endl<<endl;
// }
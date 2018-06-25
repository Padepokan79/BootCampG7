/*
     * Tes4 Java.
     *
     * Programmer : Ryan Ahmad N
     * Created By :	Ryan Ahmad N
     * Created At : 29 May 2018 09:30 - 09:57
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class Kuis4Ryan{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int cek = 1, jmlShiftIn=0, pengurut, shiftMax=10, shiftMin=1;
		String jmlShift;

			//Batasan:
			//-User input shift n kali, tidak boleh lebih dari 10.
			//-User input shift n kali, tidak boleh kurang dari 1.
			//-User input hanya menerima angka saja.

		System.out.print("\nHasil yang diinginkan adalah : \n{ ");
		for (int d : deretAngka) {
			System.out.print(d+" ");
		}
		System.out.println("}");

		System.out.println();
		System.out.print("Shift kiri Sebanyak : ");
		do{
			jmlShift = key.nextLine();
			if (jmlShift.matches("[0-9 ]+")) {
				jmlShiftIn = Integer.parseInt(jmlShift);
				if (jmlShiftIn > shiftMax) {
					System.out.println("Maaf, Pergeseran tidak boleh lebih dari "+shiftMax+".\nSilahkan input kembali.");
					cek = 0;
				}
				else if (jmlShiftIn < shiftMin) {
					System.out.println("Maaf, Pergeseran tidak boleh kurang dari "+shiftMin+".\nSilahkan input kembali.");
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

		System.out.print("\n{ ");
		pengurut = deretAngka.length - jmlShiftIn;
		while (pengurut < deretAngka.length) {
			System.out.print(deretAngka[pengurut]+" ");
			pengurut++;
		}
		pengurut = 0;
		while (pengurut < deretAngka.length - (jmlShiftIn)) {
			System.out.print(deretAngka[pengurut]+" ");
			pengurut++;
		}
		System.out.print("}");
	}
}
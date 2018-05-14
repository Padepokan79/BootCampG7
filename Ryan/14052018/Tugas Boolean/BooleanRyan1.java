/*
     * Masuk SD
     *
     * Programmer : Ryan Ahmad N
     * Created By : Ryan Ahmad N
     * Created At : 09 May 2018 15:07
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class BooleanRyan1{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String name, riwayatPendidikan;
		int age;
		double reading;
		boolean accept;

		System.out.println("==============================");
		System.out.println("=====PENDAFTARAN MASUK SD=====");
		System.out.println("==============================");
		System.out.print("\n Nama\t: ");
		name = keyboard.next();
		System.out.print("\n Usia\t: ");
		age = keyboard.nextInt();
		System.out.print("\nSkor Membaca Skala 0.0 sampai 10.0 : ");
		reading = keyboard.nextDouble();
		System.out.print("\nApakah ditaman kanak kanak sebelumnya (Y/T) :");
		riwayatPendidikan = keyboard.next();

		accept = (age >= 7 && (reading > 7 && riwayatPendidikan.equals("Y")) || (reading == 10));
		System.out.println("===============================");
		System.out.println("Hasilnya, Anak bernama "+name+": "+accept);

	}
}
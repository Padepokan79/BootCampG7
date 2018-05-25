//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 8:54 PM
//Modified by :
import java.util.Scanner;

public class Yanaif2{
	public static void main(String[] args) {
		int kode,semester;
		String algo,basdat,strukdat,jar,rakitan;
		double ipk;
		Scanner keyboard = new Scanner(System.in);


		System.out.println("========================");
		System.out.print("Masukan Kode ");
		kode=keyboard.nextInt();
		if(kode == 345 || kode == 321)
		{
			System.out.print("Semester :");
			semester = keyboard.nextInt();
			System.out.print("IPK :");
			ipk = keyboard.nextDouble();
			System.out.print("Nilai prak. Algoritma : ");
			algo = keyboard.next();
			System.out.print("Nilai prak. Basis Data :");
			basdat = keyboard.next();
			System.out.print("Nilai prak. Struktur Data :");
			strukdat = keyboard.next();

			if(semester >=3 && semester <=5 && ipk >= 3 && ipk <=4&&algo.equals("A")&&(basdat.equals("A")||strukdat.equals("A")))
			{
				System.out.println("Anda memenuhi syarat untuk mendaftar measiswa jurusan teknik komputer.");
			}
			else
				{System.out.println("Anda tidak memenuhi syarat!!");}
		}
		else if(kode == 531)
		{
			System.out.print("Semester :");
			semester = keyboard.nextInt();
			System.out.print("IPK :");
			ipk = keyboard.nextDouble();
			System.out.print("Nilai prak. Jaringan : ");
			jar = keyboard.next();
			System.out.print("Nilai prak. Rakitan  : ");
			rakitan = keyboard.next();

			if(semester >=3 && semester <=5 && ipk >= 3.25 && ipk <=4&&jar.equals("A")&&(rakitan.equals("A")||rakitan.equals("B")))
			{
				System.out.println("Anda memenuhi syarat untuk mendaftar measiswa jurusan teknik komputer.");
			}
			else
				{System.out.println("Anda tidak memenuhi syarat!!");}
		}
	}
}
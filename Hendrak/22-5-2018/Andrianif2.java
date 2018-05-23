//Created by : Hendra Kurniawan
//Date : 21 Mei 2018 Time : 4:14 PM
//Modified by :
import java.util.Scanner;

public class Andrianif2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double gPokok2A = 1000000,gPokok2B=1500000,gPokok3A=2000000,gPokok3B=2000000,gPokok4A=3000000,gPokok4B=3500000;
		double tunj2A = 100000, tunj2B =200000, tunj3A = 300000, tunj3B = 400000, tunj4A = 500000,tunj4B = 600000;
		double pajak2A, pajak2B, pajak3A,pajak3B,pajak4A,pajak4B;
		double totGaji2A, totGaji2B,totGaji3A,totGaji3B,totGaji4A,totGaji4B;
		String nama,nik;
		int noGol;

		pajak2A = (gPokok2A + tunj2A)*0.02;
		pajak2B = (gPokok2B + tunj2B)*0.02;
		pajak3A = (gPokok3A + tunj3A)*0.02;
		pajak3B = (gPokok3B + tunj3B)*0.02;
		pajak4A = (gPokok4A + tunj4A)*0.02;
		pajak4B = (gPokok4B + tunj4B)*0.02;

		totGaji2A = gPokok2A + tunj2A - pajak2A;
		totGaji2B = gPokok2B + tunj2B - pajak2B;
		totGaji3A = gPokok3A + tunj3A - pajak3A;
		totGaji3B = gPokok3B + tunj3B - pajak3B;
		totGaji4A = gPokok4A + tunj4A - pajak4A;
		totGaji4B = gPokok4B + tunj4B - pajak4B;

		System.out.println("=============================");
		System.out.print("Masukan Nama :");
		nama = keyboard.next();
		System.out.print("Masukan NIK  :");
		nik = keyboard.next();
		System.out.println("=============================");
		System.out.println("List Golongan :");
		System.out.println("1. Golongan 2A");
		System.out.println("2. Golongan 2B");
		System.out.println("3. Golongan 3A");
		System.out.println("4. Golongan 3B");
		System.out.println("5. Golongan 4A");
		System.out.println("6. Golongan 4B");
		System.out.print("Masukan nomor golongan anda(1-6):");
		noGol = keyboard.nextInt();
		System.out.println("===================================");
		
		if(noGol == 1)
		{
			System.out.println("Gaji Pokok :Rp."+gPokok2A);
			System.out.println("Tunjangan  :Rp."+tunj2A);
			System.out.println("Pajak      :Rp."+pajak2A);
			System.out.println("Gaji diterima :Rp."+totGaji2A);
		}
			if(noGol == 2)
		{
			System.out.println("Gaji Pokok :Rp."+gPokok2B);
			System.out.println("Tunjangan  :Rp."+tunj2B);
			System.out.println("Pajak      :Rp."+pajak2B);
			System.out.println("Gaji diterima :Rp."+totGaji2B);
		}
			if(noGol == 3)
		{
			System.out.println("Gaji Pokok :Rp."+gPokok3A);
			System.out.println("Tunjangan  :Rp."+tunj3A);
			System.out.println("Pajak      :Rp."+pajak3A);
			System.out.println("Gaji diterima :Rp."+totGaji3A);
		}
			if(noGol == 4)
		{
			System.out.println("Gaji Pokok :Rp."+gPokok3B);
			System.out.println("Tunjangan  :Rp."+tunj3B);
			System.out.println("Pajak      :Rp."+pajak3B);
			System.out.println("Gaji diterima :Rp."+totGaji3B);
		}
			if(noGol == 5)
		{
			System.out.println("Gaji Pokok :Rp."+gPokok4A);
			System.out.println("Tunjangan  :Rp."+tunj4A);
			System.out.println("Pajak      :Rp."+pajak4A);
			System.out.println("Gaji diterima :Rp."+totGaji4A);
		}
			if(noGol == 6)
		{
			System.out.println("Gaji Pokok :Rp."+gPokok4B);
			System.out.println("Tunjangan  :Rp."+tunj4B);
			System.out.println("Pajak      :Rp."+pajak4B);
			System.out.println("Gaji diterima :Rp."+totGaji4B);
		}
	
	}
}
/*
Created by	: Yana
Time		: 16 Mei 2018 10.32
*/

import java.util.Scanner;

public class RizaldiIf1{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int nilaiIPA, nilaiIPB, nilaiIPC, nilaiIPD, nilaiIPE, nilaiIPF, nilaiIPG, nilaiIPH;
		boolean totalA, totalB, totalC, totalD, ipaA, ipbA, ipcA, ipdA, ipeA, ipfA, ipgA, iphA,
				ipaB, ipbB, ipcB, ipdB, ipeB;

		System.out.println();
		System.out.print("Nilai IPA: ");
		nilaiIPA = keyboard.nextInt();
		System.out.print("Nilai IPB: ");
		nilaiIPB = keyboard.nextInt();
		System.out.print("Nilai IPC: ");
		nilaiIPC = keyboard.nextInt();
		System.out.print("Nilai IPD: ");
		nilaiIPD = keyboard.nextInt();
		System.out.print("Nilai IPE: ");
		nilaiIPE = keyboard.nextInt();
		System.out.print("Nilai IPF: ");
		nilaiIPF = keyboard.nextInt();
		System.out.print("Nilai IPG: ");
		nilaiIPG = keyboard.nextInt();
		System.out.print("Nilai IPH: ");
		nilaiIPH = keyboard.nextInt();
		System.out.println();



	}
}

/*
bobot nilai:
A = 9 sd 10
B = 8 sd 9
C = 7 sd 8
D = 6 sd 7
E = kurang dari 6

- ada 8 mata pelajaran : IPA, IPB, IPC, IPD, IPE, IPF, IPG, IPH
- untuk dapat lulus minimal harus lulus 6 mata pelajaran. 
- jika bobot nilai pelajaran D ke bawah, maka dinyatakan tidak lulus mata pelajaran
- untuk dapat lulus sekolah, nilai rata-rata dari gabungan pelajaran harus berbobot "B"
- meski nilai rata-rata gabungan nya berbobot "B" ke atas, namun jika terdapat satu pelajaran bernilai E maka di anggap tidak lulus
- dinyatakan DO apabila semua nilai mata pelajaran berbobot "E" dengan keterangan Genius
- dan dinyatakan DO apabila semua nilai mata pelajaran berbobot "A" dengan keterangan musthail.

inputan ========================================
nilai IPA :
nilai IPB :
nilai IPC :
nilai IPD :
nilai IPE :
nilai IPF :
nilai IPG :
nilai IPH :
=================================================
keterangan  : lulus/tidak lulus/Drop Out(genius/mustahil)
bobot nilai : A s/d E
*/
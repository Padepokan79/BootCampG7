/*
Date Created	: 15 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Alifhar02 {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);

		int angka, nol, ganjil, genap, ribuan, ratusan, puluhan, satuan,
			defRibuan, defRatusan, defPuluhan, defSatuan, nol;
		boolean bulat;

		defSatuan	= 1000;
		defPuluhan	= 100;
		defRatusan	= 10;
		defRibuan	= 1;
		nol			= 0;

		System.out.println("=====================================");
		System.out.print("Masukan bilangan: ");
		angka = inputKey.nextInt();
		System.out.println("=====================================");

		if (angka > 9999) {
			System.out.println("Kelebihan Angka 9999");
		}else{
			ribuan = angka / defRibuan;
            ratusan = (angka - ribuan * defRibuan)/defRatusan;
            puluhan = (angka - (ribuan * defRibuan) - (ratusan * defRatusan))/defPuluhan;
            satuan = (angka - (ribuan * defRibuan) - (ratusan * defRatusan) - (puluhan * defPuluhan))/defSatuan;

            /*
            ribuan = angka / 1000;
            ratusan = (angka - ribuan * 1000)/100;
            puluhan = (angka - (ribuan * 1000) - (ratusan * 100))/10;
            satuan = (angka - (ribuan * 1000) - (ratusan * 100) - (puluhan * 10))/1;
            */
			
			System.out.print("angka terdepan: ");
			if (ribuan != nol) {
				System.out.println(ribuan + " dengan nilai ribuan");
			}else if (ratusan != nol) {
				System.out.println(ratusan + " dengan nilai ratusan");
			}else if (puluhan != nol) {
				System.out.println(puluhan + " dengan nilai puluhan");
			}else {
				System.out.println(satuan + " dengan nilai satuan");
			}

			System.out.print("angka paling belakang: ");
			if (satuan != nol) {
				System.out.println(satuan + " dengan nilai satuan");
			}else if (puluhan != nol) {
				System.out.println(puluhan + " dengan nilai puluhan");
			}else if (ratusan != nol) {
				System.out.println(ratusan + " dengan nilai ratusan");
			}else {
				System.out.println(ribuan + " dengan nilai ribuan");
			}

		System.out.println("=====================================");
			
			/*
			*
			* printing per angka
			*
			*/

			/*if (ribuan == 0) {
                System.out.println(0 + " ribuan");
            } else {
                System.out.println(ribuan + " ribuan");
            }
			if (ratusan == 0) {
            	System.out.println(0 + " ratusan");
            } else {
                System.out.println(ratusan + " ratusan");
            }
			if (puluhan == 0) {
            	System.out.println(0 + " puluhan");
            } else {
                System.out.println(puluhan + " puluhan");
            }
			if (satuan == 0) {
            	System.out.println(0 + " satuan");
            } else {
                System.out.println(satuan + " satuan");
            }*/
        }
		
	}
}
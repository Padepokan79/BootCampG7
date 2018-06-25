import java.util.Scanner;

public class AlifharIF2 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);
	String jenisDepan ="y";
	int angkaDepan =0, angkaBelakang =0, bilangan, ribuan,ratusan,puluhan,satuan;

	System.out.println("===========================");
	System.out.print ("Masukkan bilangan: ");
	bilangan = keyboard.nextInt ();

	ribuan = bilangan/1000;
	ratusan = (bilangan - ribuan*1000) /100;
	puluhan = (bilangan - (ribuan*1000) - (ratusan*100)) /10;
	satuan = (bilangan - (ribuan*1000) - (ratusan*100) - (puluhan*10));

	if(bilangan > 9999) {
		System.out.println ("Error! masukkan angka antara 1-9999");
	}
	else if (bilangan >= 1000) {
		jenisDepan = "ribuan";
		angkaDepan = bilangan/1000;
		angkaBelakang = satuan;

		System.out.println("===============================");
		System.out.println ("Angka terdepan: " + angkaDepan + " dengan nilai " + jenisDepan);
		System.out.println ("Angka paling belakang: " + angkaBelakang + " dengan nilai satuan");
		System.out.println("===============================");
		}
	else if (bilangan >= 100) {
		jenisDepan = "ratusan";
		angkaDepan = bilangan/100;
		angkaBelakang = (bilangan -  (ratusan*100) - (puluhan*10));
		System.out.println("===============================");
		System.out.println ("Angka terdepan: " + angkaDepan + " dengan nilai " + jenisDepan);
		System.out.println ("Angka paling belakang: " + angkaBelakang + " dengan nilai satuan");
		System.out.println("===============================");
	}
	else if (bilangan >= 10) {
		jenisDepan = "puluhan";
		angkaDepan = bilangan/10;
		angkaBelakang = (bilangan - (puluhan*10));
		System.out.println("===============================");
		System.out.println ("Angka terdepan: " + angkaDepan + " dengan nilai " + jenisDepan);
		System.out.println ("Angka paling belakang: " + angkaBelakang + " dengan nilai satuan");
		System.out.println("===============================");
	}
	else if (bilangan >=1) {
		jenisDepan = "satuan";
		angkaDepan = bilangan;
		angkaBelakang = bilangan;
		System.out.println("===============================");
		System.out.println ("Angka terdepan: " + angkaDepan + " dengan nilai " + jenisDepan);
		System.out.println ("Angka paling belakang: " + angkaBelakang + " dengan nilai satuan");
		System.out.println("===============================");
	}
	

	angkaBelakang = bilangan - (1000*angkaDepan) + (1000-angkaDepan);


	}
}

/*
2. Buatlah program untuk mencari angka terdepan dan angka paling belakang dalam sebuah bilangan. Lalu tentukan nilai dari angka tersebut didalam bilangan. 
*Bilangan harus bernilai antara 1 sampai 9999.
*Jika bilangan hanya bernilai satuan, maka angka terdepan dan paling belakang akan bernilai sama
=============================================
Masukkan bilangan: 1996
=============================================
angka terdepan: 1 dengan nilai ribuan
angka paling belakang: 6 dengan nilai satuan
============================================= */
/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian & Ryan Ahmad
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class LatihanBuah {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Scanner line = new Scanner(System.in);
			String pilihHari, pilihHari1, pilihHari2, pilihan, namaBuahPenjualanTerkecil="", mmenu;
			int hargaSemangka=18000, hargaPisang=15000, hargaMangga=10000, cek,i=0, totalPerminggu=0, totalPerbulan=0, hargaTerkecil=0, hargaTerbesar=0,
				hargaHari1=0, hargaHari2=0, perbandingan=0, totalBuahTerbesar=0, pernjulanTerbesar=0, menu;
			double laba;

			String [] hari = {"senin","selasa","rabu","kamis","jumat","sabtu","minggu"};
			int [] semangka = {12, 15, 11, 8, 20, 10, 14};
			int [] pisang = {10, 14, 15, 7, 20, 13, 16};
			int [] mangga = {13, 12, 9, 15, 20, 9, 13};
			int [] totalharga = new int [hari.length];
			int [] totalBuah = new int [3];
			int [] totalHargaPerBuah = new int [totalBuah.length];
			String [] namaBuah = {"semangka","pisang","mangga"};

			for ( i = 0 ; i <hari.length ; i++) {
				totalharga[i] = semangka[i]*hargaSemangka + pisang[i]*hargaPisang + mangga[i]*hargaMangga;
				totalPerminggu = totalPerminggu + totalharga[i];
				for (int j = 0;j<4 ; j++) {
					totalPerbulan = totalPerbulan + totalharga[i];
				}
			}

			// for (int j : totalharga) {
			// 	System.out.println(j);
			// }

			System.out.println("\t\tPEDAGANG BUAH\t\t");
			System.out.println("1. Penghasilan Perhari");
			System.out.println("2. Penghasilan Perminggu");
			System.out.println("3. Penghasilan Sebulan");
			System.out.println("4. Penghasilan Terkecil");
			System.out.println("5. Penghasilan Terbesar");
			System.out.println("6. Perbandingan Penghasilan");
			System.out.println("7. Buah yang paling banyak terjual selama seminggu");
			System.out.println("8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu");
			System.out.println("9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu");
			System.out.println("10.Hitung Penghasilan Laba penjual selama sebulan");
			System.out.println();
			
			do{
				System.out.print("Masukan Menu yang diiginkan 1 s.d 10 : ");
				mmenu = line.nextLine();
				
				if (mmenu.matches("[0-9 ]+")) {
					menu = Integer.parseInt(mmenu);
					if (menu == 1) {
						do{
							System.out.print("Hari : ");
							pilihHari = line.nextLine();
							if (pilihHari.equals("senin") || pilihHari.equals("selasa") || pilihHari.equals("rabu") || pilihHari.equals("kamis") || pilihHari.equals("jumat")  || pilihHari.equals("sabtu") || pilihHari.equals("minggu")) {
								for ( i = 0 ; i <hari.length ; i++) {
									if (pilihHari.equals(hari[i])) {
										System.out.println("Penghasilan Hari "+hari[i]+" = "+totalharga[i]);
									}
								}	
								cek = 1;
							}
							else {
								System.out.println("input invalid");
								cek = 0;
							}
						}while(cek == 0);
					}
					else if (menu == 2) {
						for ( i = 0 ; i <hari.length ; i++) {
							System.out.println("Penghasilan "+hari[i]+"\t: "+totalharga[i]);
						}
						System.out.println("Total Penghasilan seminggu\t: "+totalPerminggu);
					}
					else if (menu == 3) {
						for (i=1; i<=4; i++) {
							System.out.println("Pengahasilan Minggu "+ i +" : "+totalPerminggu);
						}
						System.out.println("Total Penghasilan Perbulan\t: "+totalPerbulan);
					}
					else if (menu == 4) {
						hargaTerkecil = totalharga[0];

						for(i = 0 ; i < totalharga.length ; i++){
							if (totalharga[i] < hargaTerkecil) {
								hargaTerkecil = totalharga[i];
							}
						}
						System.out.println("Penghasilan terkecil dalam 1 minggu "+hargaTerkecil);
					}
					else if (menu == 5) {
						hargaTerbesar = totalharga[0];

						for(i = 0 ; i < totalharga.length ; i++){
							if (totalharga[i] > hargaTerbesar) {
								hargaTerbesar = totalharga[i];
							}
						}
						System.out.println("Penghasilan terbesar dalam 1 minggu "+hargaTerbesar);
					}
					else if (menu == 6) {
						do{
							System.out.print("Hari Ke 1: ");
							pilihHari1 = key.nextLine();
							if (pilihHari1.equals("senin") || pilihHari1.equals("selasa") || pilihHari1.equals("rabu") || pilihHari1.equals("kamis") || pilihHari1.equals("jumat")  || pilihHari1.equals("sabtu") || pilihHari1.equals("minggu")) {
								for ( i = 0 ; i <hari.length ; i++) {
									if (pilihHari1.equals(hari[i])) {
									hargaHari1 = totalharga[i];
									}
								}	
								System.out.println(hargaHari1);
								cek = 1;
							}
							else {
								System.out.println("input invalid");
								cek = 0;
							}
						}while(cek == 0);

						do{
							System.out.print("Hari Ke 1: ");
							pilihHari2 = key.nextLine();
							if (pilihHari2.equals("senin") || pilihHari2.equals("selasa") || pilihHari2.equals("rabu") || pilihHari2.equals("kamis") || pilihHari2.equals("jumat")  || pilihHari2.equals("sabtu") || pilihHari2.equals("minggu")) {
								for ( i = 0 ; i <hari.length ; i++) {
									if (pilihHari2.equals(hari[i])) {
									hargaHari2 = totalharga[i];	
									}
								}	
								System.out.println(hargaHari2);
								cek = 1;
							}
							else {
								System.out.println("input invalid");
								cek = 0;
							}
						}while(cek == 0);

						if (hargaHari1<hargaHari2) {
							perbandingan = hargaHari2 - hargaHari1;
							System.out.println("Perbandingan antara Hari "+pilihHari1+" dan "+pilihHari2+" adalah "+perbandingan+", pendapatan hari "+pilihHari2+"  lebih besar");
						}
						else if (hargaHari1>hargaHari2) {
							perbandingan = hargaHari1 - hargaHari2;
							System.out.println("Perbandingan antara Hari "+pilihHari1+" dan "+pilihHari2+" adalah "+perbandingan+", pendapatan hari "+pilihHari1+"  lebih besar");
						}
					}
					else if (menu == 7) {
						for (int s : semangka) {
							totalBuah[0] += s;
						}
						for (int p : pisang) {
							totalBuah[1] += p;
						}
						for (int m : mangga) {
							totalBuah[2] += m;
						}

						totalBuahTerbesar = totalBuah[0];
						for (int buah = 0 ; buah < totalBuah.length ; buah++) {
							if (totalBuah[buah]>totalBuahTerbesar) {
								totalBuahTerbesar = totalBuah[buah];
								System.out.println("Buah dengan total penjualan tebanyak selama 1 minggu adalah "+namaBuah[buah]+" sebanyak "+totalBuahTerbesar);
							}
						}
					}
					else if (menu == 8) {
						totalHargaPerBuah[0] = totalBuah[0] * hargaSemangka ;
						totalHargaPerBuah[1] = totalBuah[1] * hargaPisang ;
						totalHargaPerBuah[2] = totalBuah[2] * hargaMangga ;

						// for (int bb : totalHargaPerBuah) {
						// 	System.out.println(bb);				
						// }

						pernjulanTerbesar = totalHargaPerBuah[0];

						for (int penjualan = 0 ; penjualan < totalHargaPerBuah.length ; penjualan++) {
							if (totalHargaPerBuah[penjualan] >= pernjulanTerbesar) {
								pernjulanTerbesar = totalHargaPerBuah[penjualan];
								System.out.println("Buah yang memiliki penghasilan penjualan terbesar selama seminggu, adalah "+namaBuah[penjualan]+" sebanyak "+pernjulanTerbesar);
							}
						}
					}
					else if (menu == 9) {
						pernjulanTerbesar = totalHargaPerBuah[0];

						for (int penjualan = 0 ; penjualan < totalHargaPerBuah.length ; penjualan++) {
							if (totalHargaPerBuah[penjualan] < pernjulanTerbesar) {
								pernjulanTerbesar = totalHargaPerBuah[penjualan];
								namaBuahPenjualanTerkecil = namaBuah[penjualan];
							}
						} 		
								System.out.println("Buah yang memiliki penghasilan penjualan terkecil selama seminggu, adalah "+namaBuahPenjualanTerkecil+" sebanyak "+pernjulanTerbesar);
					}
					else if (menu == 10) {
						laba = totalPerbulan/100*20;
						System.out.println("Laba Selama sebulan adalah"+laba);	
					}
					System.out.print("Mau Menghitung yang lain ? (Ya/Tidak) ");
					pilihan = key.next();
					if (pilihan.equals("Ya")) {
						cek = 0;
					}
					else{
						cek = 1;
					}	
				}
				else{
					System.out.println("Maaf yang anda inputkan salah, Silahkan inputkan berupa angka dari 1 s.d 10.");
					cek = 0;
				}
				System.out.println();
			}while(cek == 0);

//1			
					
		}
	}
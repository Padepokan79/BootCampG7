/*
Date Created	: 25 May 2018
Author			: Arief Pinasti Nugraha, Vikri Ramdhani
Date Modified	:
Modified By		:
*/

import java.util.Scanner;

public class PedagangBuah {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[]	namaBuah = {"Semangka", "Pisang", "Mangga"},
		 			arrHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu","Minggu"};
		int[]		hargaBuah = {18000, 15000, 10000},
					totalSemangka = {12, 15, 11, 8, 20, 10, 14},
					totalPisan = {10, 14, 15, 7, 20, 13, 16},
					totalMangga = {13, 12, 9, 15, 20, 9, 13},
		 			temp1 = new int[arrHari.length],
		 			temp2 = new int[arrHari.length],
		 			temp3 = new int[arrHari.length];

		int semangka, pisang, mangga, index, indexLain, valid, sem = 0, pis = 0, mgg = 0, tsem = 0, tpis = 0, tmgg = 0,
			maxSem = 0, maxPis = 0, maxMgg = 0, minSem = 0, minPis = 0, minMgg = 0, sem2 = 0, pis2 = 0, mgg2 = 0, totalHasil = 0;
		String menu, hari1, hari2, menuLain;
		double totalHarga;

		index = 0;
		valid = 1;

		while (index < valid) {
			do{
				System.out.println("Masukan Menu Yang diinginkan");
				menu = keyboard.nextLine();
				if (menu.matches("[0-9]+")) {
					if (Integer.parseInt(menu) < 1 || Integer.parseInt(menu) > 10) {
						System.out.println("Silahkan inputkan angka dari 1 s.d 10.");
						index=0;
					}else {
						index++;
					}
				}else {
					System.out.println("Maaf yang anda input salah, Silahkan inputkan berupa angka dari 1 s.d 10.");
					index=0;
				}
			}while (index < valid);
			// START KALKULASI
			if (menu.equals("1")) {
				System.out.println("1. Penghasilan Perhari");
				System.out.println("Masukan Hari");
				hari1 = keyboard.nextLine();
				if (hari1.matches("[A-Za-z]+")) {
					for (int h = 0 ; h < arrHari.length ; h++) {
						if (hari1.equals(arrHari[h])) {
							sem = totalSemangka[h] * hargaBuah[0];
							pis = totalPisan[h] * hargaBuah[1];
							mgg = totalMangga[h] * hargaBuah[2];
							System.out.println("Semangka: "+sem);
							System.out.println("Pisang: "+pis);
							System.out.println("Mangga: "+mgg);
							totalHasil = sem + minPis + mgg;
							System.out.println("  - Total hari ini: " + totalHasil);
						}
					}
				} 
			} else if (menu.equals("2")) {
				System.out.println("2. Penghasilan Perminggu");
				for (int h = 0; h<arrHari.length; h++) {
					sem = totalSemangka[h] * hargaBuah[0];
					pis = totalPisan[h] * hargaBuah[1];
					mgg = totalMangga[h] * hargaBuah[2];

					tsem += sem;
					tpis += pis;
					tmgg += mgg;

					System.out.println("Hari "+arrHari[h]);
					System.out.println("  - Semangka : "+sem);
					System.out.println("  - Pisang : "+pis);
					System.out.println("  - Mangga : "+mgg);
				}
				System.out.println("Total");
				System.out.println("  - Semangka "+tsem);
				System.out.println("  - Pisang "+tpis);
				System.out.println("  - Mangga "+tmgg);
				totalHasil = tsem + tpis + tmgg;
				System.out.println("  - Total minggu ini: " + totalHasil);
				System.out.println();
			} else if (menu.equals("3")) {
				System.out.println("3. Penghasilan Sebulan");
				for (int h = 0; h<arrHari.length; h++) {
					sem = totalSemangka[h] * hargaBuah[0];
					pis = totalPisan[h] * hargaBuah[1];
					mgg = totalMangga[h] * hargaBuah[2];

					tsem += sem;
					tpis += pis;
					tmgg += mgg;

					System.out.println("Hari "+arrHari[h]);
					System.out.println("  - Semangka : "+sem);
					System.out.println("  - Pisang : "+pis);
					System.out.println("  - Mangga : "+mgg);
				}
				System.out.println("Total Sebulan");
				System.out.println("  - Semangka "+(tsem*4));
				System.out.println("  - Pisang "+(tpis*4));
				System.out.println("  - Mangga "+(tmgg*4));
				totalHasil = (tsem*4) + (tpis*4) + (tmgg*4);
				System.out.println("  - Total bulan ini: " + totalHasil);
			} else if (menu.equals("4")) {
				System.out.println("4. Penghasilan terkecil");
				for (int h = 0; h<arrHari.length; h++) {
					sem = totalSemangka[h] * hargaBuah[0];
					pis = totalPisan[h] * hargaBuah[1];
					mgg = totalMangga[h] * hargaBuah[2];
					totalHasil = sem + pis + mgg;

					System.out.println("Hari "+arrHari[h]);
					System.out.println("  - Semangka : "+sem);
					System.out.println("  - Pisang : "+pis);
					System.out.println("  - Mangga : "+mgg);
					System.out.println("  - Total hari " + arrHari[h] + ": " + totalHasil);
					temp1[h] = totalHasil;
				}
				int minhasil = temp1[0];
				int days1 = 0;
				for (int i = 0; i < temp1.length; i++) {
			        if (temp1[i] < minhasil) {
			            minhasil = temp1[i];
			            days1 = i;
			        }
				}
			    System.out.println("Total Penghasilan terkecil adalah hari " + arrHari[days1] + " dengan " + minhasil);
			} else if (menu.equals("5")) {
				System.out.println("5. Penghasilan terbesar");
				for (int h = 0; h<arrHari.length; h++) {
					sem = totalSemangka[h] * hargaBuah[0];
					pis = totalPisan[h] * hargaBuah[1];
					mgg = totalMangga[h] * hargaBuah[2];
					totalHasil = sem + pis + mgg;

					System.out.println("Hari "+arrHari[h]);
					System.out.println("  - Semangka : "+sem);
					System.out.println("  - Pisang : "+pis);
					System.out.println("  - Mangga : "+mgg);
					System.out.println("  - Total hari ini: " + totalHasil);
					temp1[h] = totalHasil;
				}

				int maxhasil = temp1[0];
				int days1 = 0;
				for (int i = 0; i < temp1.length; i++) {
			        if (temp1[i] > maxhasil) {
			            maxhasil = temp1[i];
			            days1 = i;
			        }
				}
			    System.out.println("Total Penghasilan terbesar adalah hari " + arrHari[days1] + " dengan " + maxhasil);
			} else if (menu.equals("6")) {
				System.out.println("6. Perbandingan Penghasilan");
				System.out.println("Masukan Hari ke 1");
				hari1 = keyboard.nextLine();
				System.out.println("Masukan Hari ke 2");
				hari2 = keyboard.nextLine();
				if (hari1.matches("[A-Za-z]+")) {
					for (int h = 0 ; h < arrHari.length ; h++) {
						if (hari1.equals(arrHari[h])) {
							sem = totalSemangka[h] * hargaBuah[0];
							pis = totalPisan[h] * hargaBuah[1];
							mgg = totalMangga[h] * hargaBuah[2];
							System.out.println("Semangka: "+sem);
							System.out.println("Pisang: "+pis);
							System.out.println("Mangga: "+mgg);
						}
					}
				}
				if (hari2.matches("[A-Za-z]+")) {
					for (int h = 0 ; h < arrHari.length ; h++) {
						if (hari2.equals(arrHari[h])) {
							sem2 = totalSemangka[h] * hargaBuah[0];
							pis2 = totalPisan[h] * hargaBuah[1];
							mgg2 = totalMangga[h] * hargaBuah[2];
							System.out.println("Semangka: "+sem2);
							System.out.println("Pisang: "+pis2);
							System.out.println("Mangga: "+mgg2);
						}
					}
				}
				if ((sem-sem2)==0) {
					System.out.println("Harga Sama");
				}else if ((sem-sem2)<0) {
					System.out.println("Buah Semangka " + hari1 + ", Lebih Besar dari " + hari2);
				}else {
					System.out.println("Buah Semangka " + hari2 + ", Lebih Besar dari " + hari1);
				}

				if ((pis-pis2)==0) {
					System.out.println("Harga Sama");
				}else if ((pis-pis2)<0) {
					System.out.println("Buah Pisang " + hari1 + ", Lebih Besar dari " + hari2);
				}else {
					System.out.println("Buah Pisang " + hari2 + ", Lebih Besar dari " + hari1);
				}

				if ((mgg-mgg2)==0) {
					System.out.println("Harga Sama");
				}else if ((mgg-mgg2)<0) {
					System.out.println("Buah Mangga " + hari1 + ", Lebih Besar dari " + hari2);
				}else {
					System.out.println("Buah Mangga " + hari2 + ", Lebih Besar dari " + hari1);
				}
			} else if (menu.equals("7")) {
				System.out.println("7. Buah yang paling banyak terjual selama seminggu.");
				int jual = totalSemangka[0], jual2 = totalPisan[0], jual3 = totalMangga[0], jualMax = 0, nmBuah = 0;
				for (int b = 0; b<totalSemangka.length; b++) {
					if (jual < totalSemangka[b]) {
						jual = totalSemangka[b];
						nmBuah = 0;
					}
					if (jual2 < totalPisan[b]) {
						jual2 = totalPisan[b];
						nmBuah = 1;
					}
					if (jual3 < totalMangga[b]) {
						jual3 = totalMangga[b];
						nmBuah = 2;
					}
				}
				for (int i = 0; i < 3; i++) {
					if (jual<jual2) {
						jualMax = jual2;
					} else {
						if (jual<jual3) {
							jualMax = jual3;
						} else {
							jualMax = jual;
						}
					}
				}
				System.out.println("Penjualan Terbesar Adalah "+jualMax+" "+namaBuah[nmBuah]);
			} else if (menu.equals("8")) {
				System.out.println("8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu.");
				int jualMax = 0, nmBuah = 0;
				for (int h = 0; h<arrHari.length; h++) {
					sem = totalSemangka[h] * hargaBuah[0];
					pis = totalPisan[h] * hargaBuah[1];
					mgg = totalMangga[h] * hargaBuah[2];

					for (int z = 0; z < temp1.length; z++) {
						temp1[z] = totalSemangka[z] * hargaBuah[0];
						temp2[z] = totalPisan[z] * hargaBuah[1];
						temp3[z] = totalMangga[z] * hargaBuah[2];
					}

					System.out.println("Hari "+arrHari[h]);
					System.out.println("  - Semangka : "+sem);
					System.out.println("  - Pisang : "+pis);
					System.out.println("  - Mangga : "+mgg);
				}
				maxSem = temp1[0];
				maxPis = temp2[0];
				maxMgg = temp3[0];
				int days1 = 0, days2 = 0, days3 = 0;
			    for (int i = 0; i < temp1.length; i++) {
			        if (temp1[i] > maxSem) {
			            maxSem = temp1[i];
			            days1 = i;
			        }
			        if (temp2[i] > maxPis) {
			            maxPis = temp2[i];
			            days2 = i;
			        }
			        if (temp3[i] > maxMgg) {
			            maxMgg = temp3[i];
			            days3 = i;
			        }
			    }
				System.out.println("Penghasilan terbesar Semangka hari " + arrHari[days1] + " " + maxSem);
				System.out.println("Penghasilan terbesar Pisang hari " + arrHari[days2] + " " + maxPis);
				System.out.println("Penghasilan terbesar Mangga hari " + arrHari[days3] + " " + maxMgg);

					if (maxSem<maxPis) {
						jualMax = maxPis;
						nmBuah = 1;
					} else {
						if (maxSem<maxMgg) {
							jualMax = maxMgg;
							nmBuah = 2;
						} else {
							jualMax = maxSem;
							nmBuah = 0;
						}
					}
				System.out.println("Buah dengan Penjualan Terbesar Seminggu Adalah "+jualMax+" "+namaBuah[nmBuah]);
			}else if (menu.equals("9")) {
				System.out.println("9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu.");
				int jualMin = 0, nmBuah = 0;
				for (int h = 0; h<arrHari.length; h++) {
					sem = totalSemangka[h] * hargaBuah[0];
					pis = totalPisan[h] * hargaBuah[1];
					mgg = totalMangga[h] * hargaBuah[2];

					for (int z = 0; z < temp1.length; z++) {
						temp1[z] = totalSemangka[z] * hargaBuah[0];
						temp2[z] = totalPisan[z] * hargaBuah[1];
						temp3[z] = totalMangga[z] * hargaBuah[2];
					}

					System.out.println("Hari "+arrHari[h]);
					System.out.println("  - Semangka : "+sem);
					System.out.println("  - Pisang : "+pis);
					System.out.println("  - Mangga : "+mgg);
				}
				minSem = temp1[0];
				minPis = temp2[0];
				minMgg = temp3[0];
				int days1 = 0, days2 = 0, days3 = 0;
			    for (int i = 0; i < temp1.length; i++) {
			        if (temp1[i] < minSem) {
			            minSem = temp1[i];
			            days1 = i;
			        }
			        if (temp2[i] < minPis) {
			            minPis = temp2[i];
			            days2 = i;
			        }
			        if (temp3[i] < minMgg) {
			            minMgg = temp3[i];
			            days3 = i;
			        }
			    }
				System.out.println("Penghasilan terkecil Semangka hari " + arrHari[days1] + " " + minSem);
				System.out.println("Penghasilan terkecil Pisang hari " + arrHari[days2] + " " + minPis);
				System.out.println("Penghasilan terkecil Mangga hari " + arrHari[days3] + " " + minMgg);

				if (minSem>minPis) {
					if (minSem>minMgg) {
						jualMin=minMgg;
						nmBuah=2;
					}else {
						jualMin=minPis;
						nmBuah=1;
					}
				}else {
					jualMin=minSem;
					nmBuah=0;
				}
				System.out.println("Buah dengan Penjualan terkecil Seminggu Adalah "+jualMin+" "+namaBuah[nmBuah]);
				
			}else if (menu.equals("10")) {
				System.out.println("3. Penghasilan Sebulan");
				for (int h = 0; h<arrHari.length; h++) {
					sem = totalSemangka[h] * hargaBuah[0];
					pis = totalPisan[h] * hargaBuah[1];
					mgg = totalMangga[h] * hargaBuah[2];

					tsem += sem;
					tpis += pis;
					tmgg += mgg;
				}
				System.out.println("Total Sebulan");
				System.out.println("  - Semangka "+(tsem*4));
				System.out.println("  - Pisang "+(tpis*4));
				System.out.println("  - Mangga "+(tmgg*4));
				totalHasil = (tsem*4) + (tpis*4) + (tmgg*4);
				System.out.println("  - Total bulan ini: " + totalHasil);
				System.out.println("  - Dengan Laba: " + totalHasil * 20 / 100);
			}

			// End KALKULASI
			indexLain=0;
			while (indexLain < valid) {
				System.out.println("Mau Menghitung yang lain? (Y/T): ");
				menuLain = keyboard.nextLine();
				if (menuLain.matches("[YT]+")) {
					if (menuLain.equals("Y")) {
						index=0;
						indexLain++;
					}else if (menuLain.equals("T")) {
						indexLain++;
						index++;
					}
				}else {
					System.out.println("Maaf yang anda input salah, Silahkan inputkan berupa angka dari 1 s.d 10.");
					indexLain=0;
				}
			}

		}

		System.out.println("Program Berakhir");

	}
}
/*
Created By 	: Malik & Rizaldi
Time Create : 2018-05-25 8:24AM
*/
import java.util.Arrays;
import java.util.Scanner;
public class PedagangBuah{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int stokBuah;
		boolean pilihMenu, ulang, ulangTanya, hariBool;
		String menu, namaHari;
		double hargaSemangka, hargaPisang, hargaMangga, totalProfitSenin, totalProfitSelasa, totalProfitRabu, totalProfitKamis, 
			   totalProfitJumat, totalProfitSabtu, totalProfitMinggu, totalProfitMingguan;

		hargaSemangka 	= 18000;
		hargaPisang		= 15000;
		hargaMangga		= 10000;

		int[] arraySemangka = { 12,15,11,8,20,10,14 };
		int[] arrayPisang 	= { 10,14,15,7,20,13,16 };
		int[] arrayMangga   = { 13,12,9,15,20,9,13  };
		String[] arrayhari  = { "senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};

		stokBuah = 20;

		System.out.println("1. Penghasilan Perhari");
		System.out.println("2. Penghasilan Perminggu");
		System.out.println("3. Penghasilan Sebulan");
		System.out.println("4. Penghasilan terkecil");
		System.out.println("5. Penghasilan terbesar");
		System.out.println("6. Perbandingan Penghasilan");
		System.out.println("7. Buah yang paling banyak terjual selama seminggu.");
		System.out.println("8. Buah yang memiliki penghasilan penjualan terbesar selama seminggu.");
		System.out.println("9. Buah yang memiliki penghasilan penjualan terkecil selama seminggu.");
		System.out.println("10.Hitung Penghasilan Laba penjual selama sebulan.");
		System.out.println();
		pilihMenu	= false;
		do{
			System.out.print("Masukan menu yang diinginkan 1 s.d 10 : ");
			menu = scan.nextLine();
			int menuInt = Integer.parseInt(menu);

			if ( menuInt <= 10 && menuInt >= 1 ) {
				pilihMenu = true;
				if ( menu.equals("1") ) {         //// Penghitungan untuk menu pertama (Penghasilan Perhari)
					hariBool = false;
					do{
						System.out.print("Masukan nama hari : ");
						namaHari = scan.nextLine();

						if ( namaHari.equals(arrayhari[0]) ) {
							hariBool = true;
							double profitSemangka, profitPisang, profitMangga;
							profitSemangka 	= arraySemangka[0]*hargaSemangka;
							profitPisang	= arrayPisang[0]*hargaPisang;
							profitMangga	= arrayMangga[0]*hargaMangga;
							totalProfitSenin= profitSemangka+profitPisang+profitMangga;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[0]+" adalah Rp. "+totalProfitSenin);
						}else if ( namaHari.equals(arrayhari[1]) ) {
							hariBool = true;
							double profitSemangka, profitPisang, profitMangga;
							profitSemangka 	 = arraySemangka[1]*hargaSemangka;
							profitPisang	 = arrayPisang[1]*hargaPisang;
							profitMangga	 = arrayMangga[1]*hargaMangga;
							totalProfitSelasa= profitSemangka+profitPisang+profitMangga;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[1]+" adalah Rp. "+totalProfitSelasa);
						}else if ( namaHari.equals(arrayhari[2]) ) {
							hariBool = true;
							double profitSemangka, profitPisang, profitMangga;
							profitSemangka 	= arraySemangka[2]*hargaSemangka;
							profitPisang	= arrayPisang[2]*hargaPisang;
							profitMangga	= arrayMangga[2]*hargaMangga;
							totalProfitRabu = profitSemangka+profitPisang+profitMangga;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[2]+" adalah Rp. "+totalProfitRabu);
						}else if ( namaHari.equals(arrayhari[3]) ) {
							hariBool = true;
							double profitSemangka, profitPisang, profitMangga;
							profitSemangka 	= arraySemangka[3]*hargaSemangka;
							profitPisang	= arrayPisang[3]*hargaPisang;
							profitMangga	= arrayMangga[3]*hargaMangga;
							totalProfitKamis= profitSemangka+profitPisang+profitMangga;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[3]+" adalah Rp. "+totalProfitKamis);
						}else if ( namaHari.equals(arrayhari[4]) ) {
							hariBool = true;
							double profitSemangka, profitPisang, profitMangga;
							profitSemangka 	= arraySemangka[4]*hargaSemangka;
							profitPisang	= arrayPisang[4]*hargaPisang;
							profitMangga	= arrayMangga[4]*hargaMangga;
							totalProfitJumat= profitSemangka+profitPisang+profitMangga;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[4]+" adalah Rp. "+totalProfitJumat);
						}else if ( namaHari.equals(arrayhari[5]) ) {
							hariBool = true;
							double profitSemangka, profitPisang, profitMangga;
							profitSemangka 	= arraySemangka[5]*hargaSemangka;
							profitPisang	= arrayPisang[5]*hargaPisang;
							profitMangga	= arrayMangga[5]*hargaMangga;
							totalProfitSabtu= profitSemangka+profitPisang+profitMangga;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[5]+" adalah Rp. "+totalProfitSabtu);
						}else if ( namaHari.equals(arrayhari[6]) ) {
							hariBool = true;
							double profitSemangka, profitPisang, profitMangga;
							profitSemangka 	 = arraySemangka[6]*hargaSemangka;
							profitPisang	 = arrayPisang[6]*hargaPisang;
							profitMangga	 = arrayMangga[6]*hargaMangga;
							totalProfitMinggu= profitSemangka+profitPisang+profitMangga;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[6]+" adalah Rp. "+totalProfitMinggu);
						}

						if ( !hariBool ) {
							System.out.println();
							System.out.println("Hari yang anda masukan salah\nSilahkan masukan kembali dengan benar");
							System.out.println();
						}

					}while( !hariBool );

				}else if ( menu.equals("2") ) {   //// Perhitungan untuk menu dua (Penghasilan Perminggu)
					double profitWeekSemangka=0, profitWeekPisang=0, profitWeekMangga=0, totalProfitWeek=0;
					for ( int indexSemangka = 0; indexSemangka < arraySemangka.length; indexSemangka++ ) {
						profitWeekSemangka += arraySemangka[indexSemangka];
					}for ( int indexPisang = 0; indexPisang < arrayPisang.length; indexPisang++ ) {
						profitWeekPisang += arrayPisang[indexPisang];
					}for ( int indexMangga = 0; indexMangga < arrayMangga.length; indexMangga++ ) {
						profitWeekMangga += arrayMangga[indexMangga];
					}
					totalProfitWeek 	= (profitWeekSemangka*hargaSemangka)+(profitWeekMangga*hargaPisang)+(profitWeekPisang*hargaMangga);
					System.out.println("Total penghasilan seminggu adalah Rp. "+totalProfitWeek);

				}else if ( menu.equals("3") ) {   //// Perhitungan untuk menu tiga (Penghasilan Sebulan)
					double profitWeekSemangka=0, profitWeekPisang=0, profitWeekMangga=0, totalProfitWeek=0, totalProfitMounth=0, empat=4;
					for ( int indexSemangka = 0; indexSemangka < arraySemangka.length; indexSemangka++ ) {
						profitWeekSemangka += arraySemangka[indexSemangka];
					}for ( int indexPisang = 0; indexPisang < arrayPisang.length; indexPisang++ ) {
						profitWeekPisang += arrayPisang[indexPisang];
					}for ( int indexMangga = 0; indexMangga < arrayMangga.length; indexMangga++ ) {
						profitWeekMangga += arrayMangga[indexMangga];
					}
					totalProfitWeek 	= (profitWeekSemangka*hargaSemangka)+(profitWeekMangga*hargaPisang)+(profitWeekPisang*hargaMangga);
					totalProfitMounth	= totalProfitWeek*empat;
					System.out.printf("Total penghasilan Sebulan adalah Rp. %.2f",totalProfitMounth);

				}else if ( menu.equals("4") ) {   //// Perhitungan untuk menu empat (Penghasilan terkecil)
					double profitSemangka, profitPisang, profitMangga;

					/// hari senin
					profitSemangka 	= arraySemangka[0]*hargaSemangka;
					profitPisang	= arrayPisang[0]*hargaPisang;
					profitMangga	= arrayMangga[0]*hargaMangga;
					totalProfitSenin= profitSemangka+profitPisang+profitMangga;

					//hari selasa
					profitSemangka 	 = arraySemangka[1]*hargaSemangka;
					profitPisang	 = arrayPisang[1]*hargaPisang;
					profitMangga	 = arrayMangga[1]*hargaMangga;
					totalProfitSelasa= profitSemangka+profitPisang+profitMangga;

					//hari rabu
					profitSemangka 	= arraySemangka[2]*hargaSemangka;
					profitPisang	= arrayPisang[2]*hargaPisang;
					profitMangga	= arrayMangga[2]*hargaMangga;
					totalProfitRabu = profitSemangka+profitPisang+profitMangga;
 					 	

					//hari kamis
					profitSemangka 	= arraySemangka[3]*hargaSemangka;
					profitPisang	= arrayPisang[3]*hargaPisang;
					profitMangga	= arrayMangga[3]*hargaMangga;
					totalProfitKamis= profitSemangka+profitPisang+profitMangga;

					//hari jumat
					profitSemangka 	= arraySemangka[4]*hargaSemangka;
					profitPisang	= arrayPisang[4]*hargaPisang;
					profitMangga	= arrayMangga[4]*hargaMangga;
					totalProfitJumat= profitSemangka+profitPisang+profitMangga;

					//hari sabtu
					profitSemangka 	= arraySemangka[5]*hargaSemangka;
					profitPisang	= arrayPisang[5]*hargaPisang;
					profitMangga	= arrayMangga[5]*hargaMangga;
					totalProfitSabtu= profitSemangka+profitPisang+profitMangga;

					//hari minggu
					profitSemangka 	= arraySemangka[6]*hargaSemangka;
					profitPisang	= arrayPisang[6]*hargaPisang;
					profitMangga	= arrayMangga[6]*hargaMangga;
					totalProfitMinggu= profitSemangka+profitPisang+profitMangga;

					double[] arrayPrice = {totalProfitSenin, totalProfitSelasa, totalProfitRabu, totalProfitKamis, totalProfitJumat, 
										   totalProfitSabtu, totalProfitMinggu};
                    Arrays.sort(arrayPrice);
					double min, max;
					min = arrayPrice[0];

					if(arrayPrice[0]==totalProfitSenin){
						System.out.printf("Penghasilan terkecil berada pada hari "+arrayhari[0]+" sebesar Rp. "+min);
					}else if(arrayPrice[0]==totalProfitSelasa){
						System.out.printf("Penghasilan terkecil berada pada hari "+arrayhari[1]+" sebesar Rp. "+min);
					}
					else if(arrayPrice[0]==totalProfitRabu){
						System.out.printf("Penghasilan terkecil berada pada hari "+arrayhari[2]+" sebesar Rp. "+min);
					}
					else if(arrayPrice[0]==totalProfitKamis){
						System.out.printf("Penghasilan terkecil berada pada hari "+arrayhari[3]+" sebesar Rp. "+min);
					}
					else if(arrayPrice[0]==totalProfitJumat){
						System.out.printf("Penghasilan terkecil berada pada hari "+arrayhari[4]+" sebesar Rp. "+min);
					}
					else if(arrayPrice[0]==totalProfitSabtu){
						System.out.printf("Penghasilan terkecil berada pada hari "+arrayhari[5]+" sebesar Rp. "+min);
					}
					else if(arrayPrice[0]==totalProfitMinggu){
						System.out.printf("Penghasilan terkecil berada pada hari "+arrayhari[6]+" sebesar Rp. "+min);
					}
        		
				}else if ( menu.equals("5") ) {   //// Perhitungan untuk menua lima (Penghasilan terbesar)
					double profitSemangka, profitPisang, profitMangga;

					/// hari senin
					profitSemangka 	= arraySemangka[0]*hargaSemangka;
					profitPisang	= arrayPisang[0]*hargaPisang;
					profitMangga	= arrayMangga[0]*hargaMangga;
					totalProfitSenin= profitSemangka+profitPisang+profitMangga;

					//hari selasa
					profitSemangka 	 = arraySemangka[1]*hargaSemangka;
					profitPisang	 = arrayPisang[1]*hargaPisang;
					profitMangga	 = arrayMangga[1]*hargaMangga;
					totalProfitSelasa= profitSemangka+profitPisang+profitMangga;

					//hari rabu
					profitSemangka 	= arraySemangka[2]*hargaSemangka;
					profitPisang	= arrayPisang[2]*hargaPisang;
					profitMangga	= arrayMangga[2]*hargaMangga;
					totalProfitRabu = profitSemangka+profitPisang+profitMangga;
 					 	

					//hari kamis
					profitSemangka 	= arraySemangka[3]*hargaSemangka;
					profitPisang	= arrayPisang[3]*hargaPisang;
					profitMangga	= arrayMangga[3]*hargaMangga;
					totalProfitKamis= profitSemangka+profitPisang+profitMangga;

					//hari jumat
					profitSemangka 	= arraySemangka[4]*hargaSemangka;
					profitPisang	= arrayPisang[4]*hargaPisang;
					profitMangga	= arrayMangga[4]*hargaMangga;
					totalProfitJumat= profitSemangka+profitPisang+profitMangga;

					//hari sabtu
					profitSemangka 	= arraySemangka[5]*hargaSemangka;
					profitPisang	= arrayPisang[5]*hargaPisang;
					profitMangga	= arrayMangga[5]*hargaMangga;
					totalProfitSabtu= profitSemangka+profitPisang+profitMangga;

					//hari minggu
					profitSemangka 	= arraySemangka[6]*hargaSemangka;
					profitPisang	= arrayPisang[6]*hargaPisang;
					profitMangga	= arrayMangga[6]*hargaMangga;
					totalProfitMinggu= profitSemangka+profitPisang+profitMangga;

					double[] arrayPrice = {totalProfitSenin, totalProfitSelasa, totalProfitRabu, totalProfitKamis, totalProfitJumat, 
										   totalProfitSabtu, totalProfitMinggu};
                    Arrays.sort(arrayPrice);
					double min, max;
					max = arrayPrice[6];

					if(arrayPrice[6]==totalProfitSenin){
						System.out.printf("Penghasilan terbesar berada pada hari "+arrayhari[0]+" sebesar Rp. "+max);
					}else if(arrayPrice[6]==totalProfitSelasa){
						System.out.printf("Penghasilan terbesar berada pada hari "+arrayhari[1]+" sebesar Rp. "+max);
					}
					else if(arrayPrice[6]==totalProfitRabu){
						System.out.printf("Penghasilan terbesar berada pada hari "+arrayhari[2]+" sebesar Rp. "+max);
					}
					else if(arrayPrice[6]==totalProfitKamis){
						System.out.printf("Penghasilan terbesar berada pada hari "+arrayhari[3]+" sebesar Rp. "+max);
					}
					else if(arrayPrice[6]==totalProfitJumat){
						System.out.printf("Penghasilan terbesar berada pada hari "+arrayhari[4]+" sebesar Rp. "+max);
					}
					else if(arrayPrice[6]==totalProfitSabtu){
						System.out.printf("Penghasilan terbesar berada pada hari "+arrayhari[5]+" sebesar Rp. "+max);
					}
					else if(arrayPrice[6]==totalProfitMinggu){
						System.out.printf("Penghasilan terbesar berada pada hari "+arrayhari[6]+" sebesar Rp. "+max);
					}
        			
				}else if ( menu.equals("6") ) {   //// Perhitungan untuk menu enam (Perbandingan Penghasilan)
					double div1Semangka, div1Pisang, div1Mangga, div2Semangka, div2Pisang, div2Mangga, total1=0, total2=0, selisih=0;
					String inHari1, inHari2;

					Scanner scan1 = new Scanner(System.in);

					System.out.println("Masukkan hari ke 1 : ");
					inHari1 = scan1.nextLine();
					System.out.println("Masukkan hari ke 2 : ");
					inHari2 = scan.nextLine();

					for(int i=0; i<7; i++){
						if(inHari1.equals(arrayhari[i])){
							div1Semangka	=arraySemangka[i]*hargaSemangka;
							div1Pisang 		=arraySemangka[i]*hargaSemangka;
							div1Mangga 		=arraySemangka[i]*hargaSemangka;
							total1=div1Semangka+div1Pisang+div1Mangga;
							i=7;
						}

					}
					

					for(int i=0; i<7; i++){
						if(inHari2.equals(arrayhari[i])){
							div2Semangka	=arraySemangka[i]*hargaSemangka;
							div2Pisang 		=arraySemangka[i]*hargaSemangka;
							div2Mangga 		=arraySemangka[i]*hargaSemangka;
							total2=div2Semangka+div2Pisang+div2Mangga;
							i=7;
						}

					}					

					if(total1 < total2){
						selisih=total2-total1;
						System.out.println("Perbandingan antara Hari "+inHari1+" dan "+inHari2+" adalah "+selisih+" pendapatan hari "+inHari2+" lebih besar.");						
					}else if(total2 < total1){
						selisih=total1-total2;
						System.out.println("Perbandingan antara Hari "+inHari1+" dan "+inHari2+" adalah "+selisih+" pendapatan hari "+inHari1+" lebih besar.");
					}
				
				}else if ( menu.equals("7") ) {   //// Perhitungan untuk menu tujuh (Buah yang paling banyak terjual selama seminggu)
					int qtySemangka=0,qtyMangga=0,qtyPisang=0;

					for (int indexSemangka=0; indexSemangka<arraySemangka.length; indexSemangka++ ) {
						qtySemangka += arraySemangka[indexSemangka];
					}
					for (int indexPisang=0; indexPisang<arrayPisang.length; indexPisang++ ) {
						qtyPisang += arrayPisang[indexPisang];
					}
					for (int indexMangga=0; indexMangga<arrayMangga.length; indexMangga++ ) {
						qtyMangga += arrayMangga[indexMangga];
					}
					System.out.println("semangka "+qtySemangka);
					System.out.println("Pisang : "+qtyPisang);
					System.out.println("Mangga : "+qtyMangga);

					if ( qtySemangka > qtyPisang && qtySemangka > qtyMangga ) {
						System.out.println("Buah yang paling terbanyak terjual selama \nseminggu adalah buah semangka sebanyak "+qtySemangka);
					}else if ( qtyPisang > qtySemangka && qtyPisang > qtyMangga ) {
						System.out.println("Buah yang paling terbanyak terjual selama \nseminggu adalah buah pisang sebanyak "+qtyPisang);
					}else if ( qtyMangga > qtySemangka && qtyMangga > qtyPisang ) {
						System.out.println("Buah yang paling terbanyak terjual selama \nseminggu adalah buah mangga sebanyak "+qtyMangga);
					}

				}else if ( menu.equals("8") ) {   //// Perhitungan untuk menu delapan (Buah yang memiliki penghasilan penjualan terbesar selama seminggu.)
					double qtySemangka=0,qtyMangga=0,qtyPisang=0, priceWeekSemangka=0,priceWeekPisang=0,priceWeekMangga=0;

					for (int indexSemangka=0; indexSemangka<arraySemangka.length; indexSemangka++ ) {
						qtySemangka += arraySemangka[indexSemangka];
					}
					for (int indexPisang=0; indexPisang<arrayPisang.length; indexPisang++ ) {
						qtyPisang += arrayPisang[indexPisang];
					}
					for (int indexMangga=0; indexMangga<arrayMangga.length; indexMangga++ ) {
						qtyMangga += arrayMangga[indexMangga];
					}
					System.out.println("semangka "+qtySemangka*hargaSemangka);
					System.out.println("Pisang : "+qtyPisang*hargaPisang);
					System.out.println("Mangga : "+qtyMangga*hargaMangga);

					priceWeekSemangka = qtySemangka*hargaSemangka;
					priceWeekPisang = qtyPisang*hargaPisang;
					priceWeekMangga = qtyMangga*hargaMangga;

					if ( priceWeekSemangka > priceWeekPisang && priceWeekSemangka > priceWeekMangga ) {
						System.out.println("Buah yang memiliki penghasilan penjualan terbesar \nselama seminggu adalah buah semangka, sebesar Rp. "+priceWeekSemangka);
					}else if ( priceWeekPisang > priceWeekSemangka && priceWeekPisang > priceWeekMangga ) {
						System.out.println("Buah yang memiliki penghasilan penjualan terbesar \nselama seminggu adalah buah pisang, sebesar Rp. "+priceWeekPisang);
					}else if ( priceWeekMangga > priceWeekSemangka && priceWeekMangga > priceWeekPisang ) {
						System.out.println("Buah yang memiliki penghasilan penjualan terbesar \nselama seminggu adalah buah mangga, sebesar Rp."+priceWeekMangga);
					}

				}else if ( menu.equals("9") ) {   //// Perhitungan untuk menu sembilan (Buah yang memiliki penghasilan penjualan terkecil selama seminggu.)
					double qtySemangka=0,qtyMangga=0,qtyPisang=0, priceWeekSemangka=0,priceWeekPisang=0,priceWeekMangga=0;

					for (int indexSemangka=0; indexSemangka<arraySemangka.length; indexSemangka++ ) {
						qtySemangka += arraySemangka[indexSemangka];
					}
					for (int indexPisang=0; indexPisang<arrayPisang.length; indexPisang++ ) {
						qtyPisang += arrayPisang[indexPisang];
					}
					for (int indexMangga=0; indexMangga<arrayMangga.length; indexMangga++ ) {
						qtyMangga += arrayMangga[indexMangga];
					}
					System.out.println("semangka "+qtySemangka*hargaSemangka);
					System.out.println("Pisang : "+qtyPisang*hargaPisang);
					System.out.println("Mangga : "+qtyMangga*hargaMangga);

					priceWeekSemangka = qtySemangka*hargaSemangka;
					priceWeekPisang = qtyPisang*hargaPisang;
					priceWeekMangga = qtyMangga*hargaMangga;

					if ( priceWeekSemangka < priceWeekPisang && priceWeekSemangka < priceWeekMangga ) {
						System.out.println("Buah yang memiliki penghasilan penjualan terkecil \nselama seminggu adalah buah semangka, sebesar Rp. "+priceWeekSemangka);
					}else if ( priceWeekPisang < priceWeekSemangka && priceWeekPisang < priceWeekMangga ) {
						System.out.println("Buah yang memiliki penghasilan penjualan terkecil \nselama seminggu adalah buah pisang, sebesar Rp. "+priceWeekPisang);
					}else if ( priceWeekMangga < priceWeekSemangka && priceWeekMangga < priceWeekPisang ) {
						System.out.println("Buah yang memiliki penghasilan penjualan terkecil \nselama seminggu adalah buah mangga, sebesar Rp."+priceWeekMangga);
					}

				}else if ( menu.equals("10") ) {   //// Perhitungan untuk menu sepuluh (Hitung Penghasilan Laba penjual selama sebulan.)

							double weeklyProfit=0, monthlyProfit=0;
							double profitSemangkaSenin, profitPisangSenin, profitManggaSenin;
							profitSemangkaSenin = (arraySemangka[0]*hargaSemangka)*20/100;
							profitPisangSenin	= (arrayPisang[0]*hargaPisang)*20/100;
							profitManggaSenin	= (arrayMangga[0]*hargaMangga)*20/100;
							totalProfitSenin	= profitSemangkaSenin+profitPisangSenin+profitManggaSenin;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[0]+" adalah Rp. "+totalProfitSenin);
					
							// senin
							double profitSemangkaSelasa, profitPisangSelasa, profitManggaSelasa;
							profitSemangkaSelasa = (arraySemangka[1]*hargaSemangka)*20/100;
							profitPisangSelasa	 = (arrayPisang[1]*hargaPisang)*20/100;
							profitManggaSelasa	 = (arrayMangga[1]*hargaMangga)*20/100;
							totalProfitSelasa	 = profitSemangkaSelasa+profitPisangSelasa+profitManggaSelasa;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[1]+" adalah Rp. "+totalProfitSelasa);
					
							
							double profitSemangkaRabu, profitPisangRabu, profitManggaRabu;
							profitSemangkaRabu 	= (arraySemangka[2]*hargaSemangka)*20/100;
							profitPisangRabu	= (arrayPisang[2]*hargaPisang)*20/100;
							profitManggaRabu	= (arrayMangga[2]*hargaMangga)*20/100;
							totalProfitRabu 	= profitSemangkaRabu+profitPisangRabu+profitManggaRabu;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[2]+" adalah Rp. "+totalProfitRabu);
					
							
							double profitSemangkaKamis, profitPisangKamis, profitManggaKamis;
							profitSemangkaKamis 	= (arraySemangka[3]*hargaSemangka)*20/100;
							profitPisangKamis	= (arrayPisang[3]*hargaPisang)*20/100;
							profitManggaKamis	= (arrayMangga[3]*hargaMangga)*20/100;
							totalProfitKamis= profitSemangkaKamis+profitPisangKamis+profitManggaKamis;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[3]+" adalah Rp. "+totalProfitKamis);
					
							
							double profitSemangkaJumat, profitPisangJumat, profitManggaJumat;
							profitSemangkaJumat = (arraySemangka[4]*hargaSemangka)*20/100;
							profitPisangJumat	= (arrayPisang[4]*hargaPisang)*20/100;
							profitManggaJumat	= (arrayMangga[4]*hargaMangga)*20/100;
							totalProfitJumat	= profitSemangkaJumat+profitPisangJumat+profitManggaJumat;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[4]+" adalah Rp. "+totalProfitJumat);
					
							
							double profitSemangkaSabtu, profitPisangSabtu, profitManggaSabtu;
							profitSemangkaSabtu = (arraySemangka[5]*hargaSemangka)*20/100;
							profitPisangSabtu	= (arrayPisang[5]*hargaPisang)*20/100;
							profitManggaSabtu	= (arrayMangga[5]*hargaMangga)*20/100;
							totalProfitSabtu	= profitSemangkaSabtu+profitPisangSabtu+profitManggaSabtu;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[5]+" adalah Rp. "+totalProfitSabtu);
					
							
							double profitSemangkaMinggu, profitPisangMinggu, profitManggaMinggu;
							profitSemangkaMinggu = (arraySemangka[6]*hargaSemangka)*20/100;
							profitPisangMinggu	 = (arrayPisang[6]*hargaPisang)*20/100;
							profitManggaMinggu	 = (arrayMangga[6]*hargaMangga)*20/100;
							totalProfitMinggu    = profitSemangkaMinggu+profitPisangMinggu+profitManggaMinggu;
							System.out.println();
							System.out.println("Penghasilan penjualan buah pada hari "+arrayhari[6]+" adalah Rp. "+totalProfitMinggu);

							weeklyProfit=(totalProfitSenin+totalProfitSelasa+totalProfitRabu+totalProfitKamis+totalProfitJumat+totalProfitSabtu+totalProfitMinggu);
							monthlyProfit=weeklyProfit*4;
							System.out.println("Penghasilan Laba penjual selama sebulan sebanyak : "+monthlyProfit);
				}

			}else{
			
					pilihMenu = false;
					System.out.println(pilihMenu);
					System.out.println();
			}


		 }while( !pilihMenu );



	}
}
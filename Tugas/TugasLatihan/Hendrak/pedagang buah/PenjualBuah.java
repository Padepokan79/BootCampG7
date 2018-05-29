//Created ny : Hendra Kurniawan dan Alifhar Juliansah
//Date : 25 Mei 2018 Time : 8:21 AM
//Modified :

import java.util.Scanner;

public class PenjualBuah{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int stok=20, hasilPerminggu=0, hasilPerbulan, hasilTerkecil, hasilTerbesar, bandingHasil, totalSemangka=0, totalPisang=0, totalMangga=0, semangkaPerminggu=0, pisangPerminggu=0, manggaPerminggu=0, hariTerbesar=0, hariTerkecil=0, pengSemangkaperminggu, pengPisangperminggu, pengManggaperminggu, bandingHari1=0, bandingHari2=0;
		double laba;
		int [] semangka = {12 , 15, 11, 8, stok, 10, 14}, pisang = {10, 14, 15, 7, stok, 13, 16}, mangga = {13, 12, 9, 15, stok, 9, 13}, semangkaPerhari = new int[7], pisangPerhari = new int[7], manggaPerhari = new int[7];
		int hargaSemangka = 18000, hargaPisang = 15000, hargaMangga = 10000;
		String pilih, hari1, hari2;
		String[] namaHari={"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
		int [] hasilPerhari = new int[7];
		boolean check=false,check2=false;

		//pengulangan array untuk mencari penghasilan menjual buah dalam sehari
		for(int hari=0; hari<semangkaPerhari.length; hari++){
		semangkaPerhari[hari]=semangka[hari]*hargaSemangka;
		pisangPerhari[hari]=pisang[hari]*hargaPisang;
		manggaPerhari[hari]=mangga[hari]*hargaMangga;

		//mencari hasil penjualan dalam 1 hari
		hasilPerhari[hari]=semangkaPerhari[hari]+pisangPerhari[hari]+manggaPerhari[hari];

		//mencari hasil penjualan perminggu
		hasilPerminggu+=hasilPerhari[hari];

		//banyak buah yang terjual dalam seminggu
		semangkaPerminggu+=semangka[hari];
		pisangPerminggu+=pisang[hari];
		manggaPerminggu+=mangga[hari];
		}

		//mencari penghasilan perbulan
		hasilPerbulan=hasilPerminggu*4;

		//mencari penghasilan perminggu SETIAP BUAH
		pengSemangkaperminggu = semangkaPerminggu * hargaSemangka;
		pengPisangperminggu = pisangPerminggu * hargaPisang;
		pengManggaperminggu = manggaPerminggu * hargaMangga;

		laba = 0.2 * hasilPerbulan;// mencari laba

		hasilTerbesar=hasilPerhari[0];
		hasilTerkecil=hasilPerhari[0];
		
		//mencari buah berpenghasilan terbesar dan terkecil (2)
		int index=1;
		while(index<hasilPerhari.length){
			if(hasilPerhari[index]>hasilTerbesar){
				hasilTerbesar=hasilPerhari[index];
				hariTerbesar=index;
			}
			if(hasilPerhari[index]<hasilTerkecil){
				hasilTerkecil=hasilPerhari[index];
				hariTerkecil=index;
			}
			index++;
		}


		do{
			System.out.println("PEDAGANG BUAH");
			System.out.println("==================");
			System.out.println("1.Penghasilan Perhari");
			System.out.println("2.Penghasilan Perminggu");
			System.out.println("3.Penghasilan Perbulan");
			System.out.println("4.Penghasilan Terkecil");
			System.out.println("5.Penghasilan Terbesar");
			System.out.println("6.Perbandingan Penghasilan");
			System.out.println("7.Buah yang paling banyak terjual selama seminggu.");
			System.out.println("8.Buah yang memiliki penghasilan terbesar selama seminggu");
			System.out.println("9.Buah yang memiliki penghasilan terkecil selama seminggu");
			System.out.println("10.Hitung penghasilan laba penjual selama sebulan");

			do{
				System.out.print("\nMasukan menu yang diinginkan 1 s.d 10 : ");
				pilih = keyboard.nextLine();
				if(pilih.matches("[0-9]+")){
					if(Integer.parseInt(pilih)>0 && Integer.parseInt(pilih)<11){
						check=true;
					} else {
						System.out.println("Silahkan inputkan berupa angka dari 1 s.d 10.");
					}
				} else {
					System.out.println("Maaf, inputan harus angka");
				}
			}while(!check);

			check=false;
			System.out.println("\n=================================================================");
			if(pilih.equals("1")){
				do{
					System.out.print("Pilih hari : ");
					pilih=keyboard.nextLine();
					for(int hari=0; hari<namaHari.length; hari++){
						if(pilih.equals(namaHari[hari])){
							System.out.println("Penghasilan hari "+namaHari[hari]+" adalah "+hasilPerhari[hari]);
							check=true;
						}
					}
					if(check==false)
						System.out.println("Masukkan antara senin sampai minggu");
				}while(!check);
			} else if(pilih.equals("2")){
				for (int hari=0; hari<namaHari.length; hari++){
					System.out.println("Penghasilan Hari "+namaHari[hari]+"\t\t\t"+hasilPerhari[hari]);
				}
				System.out.println("-----------------------------------------------");
				System.out.println("Total Penghasilan Perminggu adalah\t"+hasilPerminggu);
			} else if(pilih.equals("3")){
				System.out.println("Total Penghasilan Perbulan adalah\t"+hasilPerbulan);
			} else if(pilih.equals("4")){
				System.out.println("Penghasilan Terkecil adalah pada hari " + namaHari[hariTerkecil]+" dengan total "+hasilTerkecil);
			} else if(pilih.equals("5")){
				System.out.println("Penghasilan Terbesar adalah pada hari " + namaHari[hariTerbesar]+" dengan total "+hasilTerbesar);
			} else if(pilih.equals("6")){
				do{
					System.out.print("Masukkan hari ke 1 : ");
					hari1=keyboard.nextLine();
					System.out.print("Masukkan hari ke 2 : ");
					hari2=keyboard.nextLine();
					for(int hari=0; hari<namaHari.length; hari++){
						if(hari1.equals(namaHari[hari])){
							bandingHari1=hasilPerhari[hari];
							check=true;
						}
						if(hari2.equals(namaHari[hari])){
							bandingHari2=hasilPerhari[hari];
							check=true;
						}
					}
					if(check){
						if(bandingHari1>bandingHari2)
							System.out.println("Perbandingan hari "+hari1+" dan "+hari2+" adalah "+(bandingHari1-bandingHari2)+", penghasilan hari "+hari1+" lebih besar");
						else
							System.out.println("Perbandingan hari "+hari1+" dan "+hari2+" adalah "+(bandingHari2-bandingHari1)+", penghasilan hari "+hari2+" lebih besar");
					}
				}while(!check);
			} else if(pilih.equals("7")){
				if(semangkaPerminggu > pisangPerminggu && semangkaPerminggu > manggaPerminggu)
					System.out.println("Buah yang paling banyak terjual selama seminggu adalah semangka \ndengan total " + semangkaPerminggu + " buah");
				else if(pisangPerminggu > semangkaPerminggu && pisangPerminggu > manggaPerminggu)
					System.out.println("Buah yang paling banyak terjual selama seminggu adalah pisang \ndengan total " + pisangPerminggu + " buah");
				else if(manggaPerminggu > semangkaPerminggu && manggaPerminggu > pisangPerminggu)
					System.out.println("Buah yang paling banyak terjual selama seminggu adalah mangga \ndengan total " + manggaPerminggu + " buah");
			} else if(pilih.equals("8")){
				if(pengSemangkaperminggu>pengPisangperminggu && pengSemangkaperminggu>pengManggaperminggu){
					System.out.println("Buah yang paling banyak terjual semangka \ndengan total penghasilan " + pengSemangkaperminggu);	
				} else if (pengPisangperminggu>pengSemangkaperminggu && pengPisangperminggu > pengManggaperminggu){
					System.out.println("Buah yang paling banyak terjual pisang \ndengan total penghasilan " + pengPisangperminggu);
				} else
					System.out.println("Buah yang paling banyak terjual mangga \ndengan total penghasilan " + pengManggaperminggu);
			} else if(pilih.equals("9")){
				if(pengSemangkaperminggu<pengPisangperminggu && pengSemangkaperminggu<pengManggaperminggu){
					System.out.println("Buah yang paling sedikit terjual semangka \ndengan total penghasilan " + pengSemangkaperminggu);	
				} else if (pengPisangperminggu<pengSemangkaperminggu && pengPisangperminggu < pengManggaperminggu){
					System.out.println("Buah yang paling sedikit terjual pisang \ndengan total penghasilan " + pengPisangperminggu);
				} else
					System.out.println("Buah yang paling sedikit terjual mangga \ndengan total penghasilan " + pengManggaperminggu);
			} else if(pilih.equals("10")){
				System.out.printf("Laba yang didapat selama sebulan adalah %.0f\n", laba);
			}
			System.out.println("=================================================================");

			do{

				System.out.print("\nMau menghitung yang lain (ya/tidak) ");
				pilih = keyboard.nextLine();
				
				if(pilih.equals("ya")){
					check = false;
					check2=false;
				}
				else if(pilih.equals("tidak")){
					check = true;
					check2=false;
				}
				else{
					System.out.println("Masukkan salah");
					check2=true;
				}
			}while(check2);

		}while(!check);

	}
}
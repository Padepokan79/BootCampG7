/*
	 Program     : Soal 1 - Richa
     Creator     : Khairil
     Created At  : 16 Mei 2018 20:00 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class RichaIfElse1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nama, option, optional, destination;
		int jumlahOrang, jumlahHari, jumlahBudget, pesawatLombok, pesawatBangkok, pesawatSingapura, pesawatTokyo, hotelLombok, hotelBangkok, hotelSingapura, hotelTokyo, makanLombok, makanBangkok, makanSingapura, makanTokyo, hargasnorkeling, hargabelanja, hargaunivstudio, hargaskii, purchaseLombok, purchaseBangkok, purchaseSingapura, purchaseTokyo, tarifHotelLombok, tarifHotelBangkok, tarifHotelSingapura, tarifHotelTokyo, ticketLombok, ticketBangkok, ticketSingapura, ticketTokyo, totalPurchaseLombok, totalPurchaseBangkok, totalPurchaseSingapura, totalPurchaseTokyo, total;

		destination = "";
		optional = "";

		pesawatLombok = 2170000;
		pesawatBangkok = 3780000;
		pesawatSingapura = 1200000;
		pesawatTokyo = 4760000;

		hotelLombok = 255000;
		hotelBangkok = 305000;
		hotelSingapura = 335000;
		hotelTokyo = 355000;

		makanLombok = 75000;
		makanBangkok = 55000;
		makanSingapura = 85000;
		makanTokyo = 105000;

		hargasnorkeling = 250000;
		hargabelanja = 300000;
		hargaunivstudio = 360000;
		hargaskii = 325000;

		tarifHotelLombok = 0;
		tarifHotelBangkok = 0;
		tarifHotelSingapura = 0;
		tarifHotelTokyo = 0;

		total = 0;

		System.out.println("		========WELCOME TO TRAVEL 79.com==========");
		System.out.println();
		System.out.println("Tentukan dengan mudah destinasi terbaikmu!");
		System.out.print("Nama : ");
		nama = keyboard.next();
		System.out.println();
		System.out.print("Berapa orang yang ikut travel bersamamu? ");
		jumlahOrang = keyboard.nextInt();
		System.out.println();
		System.out.print("Berapa hari kamu akan pergi ? ");
		jumlahHari = keyboard.nextInt();
		System.out.println();
		System.out.print("Budget kamu berapa, " + nama + " ? ");
		jumlahBudget = keyboard.nextInt();
		System.out.println();

		if(jumlahOrang % 2 == 0) {
			tarifHotelLombok = hotelLombok * (jumlahOrang / 2);
			tarifHotelBangkok = hotelBangkok * (jumlahOrang / 2);
			tarifHotelSingapura = hotelSingapura * (jumlahOrang / 2);
			tarifHotelTokyo = hotelTokyo * (jumlahOrang /2);
		}
		else if(jumlahOrang % 2 == 1) {
			tarifHotelLombok = hotelLombok * (jumlahOrang-1 / 2) + hotelLombok;
			tarifHotelBangkok = hotelBangkok * (jumlahOrang-1 / 2) + hotelBangkok;
			tarifHotelSingapura = hotelSingapura * (jumlahOrang-1 / 2) + hotelSingapura;
			tarifHotelTokyo = hotelTokyo * (jumlahOrang-1 / 2) + hotelTokyo;
		}

		ticketLombok = pesawatLombok * jumlahOrang; 
		ticketBangkok = pesawatBangkok * jumlahOrang;
		ticketSingapura = pesawatSingapura * jumlahOrang;
		ticketTokyo = pesawatTokyo * jumlahOrang;

		purchaseLombok =  tarifHotelLombok + (makanLombok * jumlahOrang);
		purchaseBangkok = tarifHotelBangkok + (makanBangkok * jumlahOrang);
		purchaseSingapura = tarifHotelSingapura + (makanSingapura * jumlahOrang);
		purchaseTokyo = tarifHotelTokyo + (makanTokyo* jumlahOrang);

		totalPurchaseLombok = (purchaseLombok * jumlahHari) + ticketLombok;
		totalPurchaseBangkok = (purchaseBangkok * jumlahHari) + ticketBangkok;
		totalPurchaseSingapura = (purchaseSingapura * jumlahHari) + ticketSingapura;
		totalPurchaseTokyo = (purchaseTokyo * jumlahHari) + ticketTokyo;

		System.out.println("Lombok : " + totalPurchaseLombok);
		System.out.println("Bangkok : " + totalPurchaseBangkok);
		System.out.println("Singapura : " + totalPurchaseSingapura);
		System.out.println("Tokyo : " + totalPurchaseTokyo);

		if(jumlahBudget < totalPurchaseLombok && jumlahBudget < totalPurchaseBangkok && jumlahBudget < totalPurchaseSingapura && jumlahBudget < totalPurchaseTokyo) {
			System.out.println("Gagal: (Mohon maaf kami tidak menemukan pilihan destinasi yang sesuai)");
		}
		else {
			if(jumlahBudget > totalPurchaseSingapura && jumlahBudget < totalPurchaseLombok) {
				destination = "Singapura";
			}
			else if(jumlahBudget > totalPurchaseLombok && jumlahBudget < totalPurchaseBangkok) {
				destination = "Lombok";
			}			
			else if(jumlahBudget > totalPurchaseBangkok && jumlahBudget < totalPurchaseTokyo) {
				destination = "Bangkok";
			}
			else if(jumlahBudget > totalPurchaseTokyo) {
				destination = "Tokyo";
			}
			System.out.println("Destinasi rekomendasi kami untuk " + nama + " adalah " + destination);				
			if(destination.equals("Lombok")) {
				optional = "snorkling";
			}
			else if(destination.equals("Bangkok")) {
				optional = "belanja";
			}
			else if(destination.equals("Singapura")) {
				optional = "Universal Studio";				
			}
			else if(destination.equals("Tokyo")) {
				optional = "Skii";				
			}						

			System.out.println();
			System.out.println("Apakah kamu ingin " + optional + " ? (Y/N) : ");
			option = keyboard.next();
			if(option.equals("Y")) {
				if(destination.equals("Lombok")) {
					total = totalPurchaseLombok + (hargasnorkeling * jumlahOrang);					
				}
				else if(destination.equals("Bangkok")) {
					total = totalPurchaseBangkok + (hargabelanja * jumlahOrang);					
				}
				else if(destination.equals("Singapura")) {
					total = totalPurchaseSingapura + (hargaunivstudio * jumlahOrang);
				}
				else if(destination.equals("Tokyo")) {
					total = totalPurchaseTokyo + (hargaskii * jumlahOrang);
				}
			}
			else {
				if(destination.equals("Lombok")) {
					total = totalPurchaseLombok;					
				}
				else if(destination.equals("Bangkok")) {
					total = totalPurchaseBangkok;					
				}
				else if(destination.equals("Singapura")) {
					total = totalPurchaseSingapura;
				}
				else if(destination.equals("Tokyo")) {
					total = totalPurchaseTokyo;
				}
			}
			System.out.println();
			System.out.println("Total yang harus kamu bayar untuk ke " + destination + " adalah " + total);
		}
	}
}
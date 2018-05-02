/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 22:30 PM     
     Updated By  : 
     Update Date : 
*/
class Rifan2 {
	public static void main(String[] args) {
		String soal;
		int karungBeras, beratKarung, totalKarung, terjualKemaren, terjualHariIni, sisaBeras;
		soal = "Di toko Bu Poniem tersedia 12 karung beras. Setiap karung beratnya 50 kg. Jika hari ini dan kemarin masing-masing terjual 175 kg dan 120 kg, berapa kg sisa beras di warung Bu Poniem sekarang ?";
		karungBeras = 12;
		beratKarung = 50;
		terjualKemaren = 120;
		terjualHariIni = 175;
		totalKarung = karungBeras * beratKarung;
		totalKarung = totalKarung - terjualKemaren;
		totalKarung = totalKarung - terjualHariIni;
		System.out.println(soal);
		System.out.println();
		System.out.println("Jumlah Karung Beras        = " + karungBeras);
		System.out.println("Berat Karung masing-masing = " + beratKarung + " kg");
		System.out.println("Terjual Hari ini           = " + terjualHariIni + " kg");
		System.out.println("Terjual Kemaren            = " + terjualKemaren + " kg");
		System.out.println("Sisa Beras di warung       = " + totalKarung + " kg");
	}
}

/*
Di toko Bu Poniem tersedia 12 karung beras. Setiap karung beratnya 50 kg. Jika hari ini dan kemarin masing-masing terjual 175 kg dan 120 kg, berapa kg sisa beras di warung Bu Poniem sekarang ?
*/
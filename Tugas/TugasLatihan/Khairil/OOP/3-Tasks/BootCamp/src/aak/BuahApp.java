package aak;

class BuahApp {

	public static void main(String[] args) {
		Buah buah = new Buah("Buah Ganda", "Buah berbiji banyak");
		System.out.println( buah.printBiji() );
		System.out.println();
		BuahNaga buna = new BuahNaga(buah, "Naga Merah", 14000, "tawar ke manis", "merah delima", "kasar seperti nanas", "vitamin B1, B3, B12, vitamin C, air, protein, kalori, serat, mineral, antioksidan, kalsium, zat besi dan karbohidrat", "Buah naga rendah kalori, sebanding dengan buah kiwi, mengandung sekitar 50 kalori per 100 g. Meskipun demikian, ia menyimpan banyak antioksidan, mineral, vitamin, dan serat yang bermanfaat bagi kesehatan.\r\n" + 
				"Biji naga hitam yang renyah mengandung senyawa phytochemical antioksidan fitokimia. Phytoalbumin berpikir untuk memperbaiki nafsu makan, bekerja sebagai pencahar, dan bagus untuk kesehatan kulit dan rambut.\r\n" + 
				"Buah ini merupakan sumber antioksidan vitamin C yang sangat baik; menyediakan sekitar 8-9 mg per 100 g atau sekitar 12-15% dari DRI (asupan yang direkomendasikan setiap hari). Konsumsi makanan kaya vitamin C membantu tubuh mengembangkan ketahanan untuk melawan agen infeksius dan mengais radikal bebas berbahaya.\r\n" + 
				"Tipe daging merah buah mengandung kadar vitamin-A yang sangat sehat, dan karoten. Bersama; Senyawa ini telah diketahui memiliki sifat antioksidan dan sangat penting untuk penglihatan. Vitamin-A juga dibutuhkan untuk menjaga kesehatan mukosa dan kulit. Konsumsi buah alami yang kaya akan karoten diketahui dapat melindungi dari kanker rongga mulut dan rongga mulut.\r\n" + 
				"Buah naga juga mengandung mineral dalam jumlah baik seperti fosfor, mangan, besi, dan magnesium. Mangan yang digunakan oleh tubuh manusia sebagai co-factor untuk antioksidan kuat enzim, superoksida dismutase. Magnesium adalah mineral penguat tulang yang penting seperti kalsium.");
		System.out.println( buna.printBuahNaga() );
	}

}

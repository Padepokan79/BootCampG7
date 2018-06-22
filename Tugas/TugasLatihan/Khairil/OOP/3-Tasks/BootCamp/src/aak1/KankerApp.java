package aak1;

class KankerApp {

	public static void main(String[] args) {
		Kanker kanker = new Kanker("Karsinoma, merupakan kanker yang terjadi pada jaringan epitel, seperti kulit atau jaringan yang menyelubungi organ tubuh, misalnya organ pada sistem pencernaan atau kelenjar. Contoh meliputi kanker kulit, karsinoma serviks, karsinoma anal, kanker esofageal, karsinoma hepatoselular, kanker laringeal, hipernefroma, kanker lambung, kanker testiskular dan kanker tiroid.\n" + 
				"Sarkoma, merupakan kanker yang terjadi pada tulang seperti osteosarkoma, tulang rawan seperti kondrosarkoma, jaringan otot seperti rabdomiosarcoma, jaringan adiposa, pembuluh darah dan jaringan penghantar atau pendukung lainnya.\nLeukemia, merupakan kanker yang terjadi akibat tidak matangnya sel darah yang berkembang di dalam sumsum tulang dan memiliki kecenderungan untuk berakumulasi di dalam sirkulasi darah\nLimfoma, merupakan kanker yang timbul dari nodus limfa dan jaringan dalam sistem kekebalan tubuh\nCentral Nervous Systems Cancers, merupakan kanker yang dimulai di jaringan otak dan sumsum tulang belakang", "Kanker adalah penyakit yang 90-95% kasusnya disebabkan faktor lingkungan dan 5-10% karena faktor genetik. Faktor lingkungan yang biasanya mengarahkan kepada kematian akibat kanker adalah tembakau (25-30%), diet dan obesitas (30-35 %), infeksi (15-20%), radiasi, stres, kurangnya aktivitas fisik, polutan lingkungan.");
		System.out.println( kanker.printKanker() );
		System.out.println();
		KankerPankreas kanpa = new KankerPankreas(kanker, "Kanker Pankreas", "Kanker pankreas dapat diobati dengan menggunakan beberapa metode. Kanker pankreas pada tahap dini umumnya dapat diobati dan disembuhkan melalui pembedahan. Setelah pembedahan, pengobatan lanjutan, atau adjuvant therapy, sangat umum direkomendasikan. Terapi ini meliputi kemoterapi dan radioterapi.", "Diabetes\r\n" + 
						"Demam dan menggigil\r\n" + 
						"Gatal\r\n" + 
						"Darah mudah menggumpal\r\n" + 
						"Mual dan muntah\r\n" + 
						"Gangguan pencernaan\r\n" + 
						"Perubahan pola buang air besar\r\n" + 
						"Hilangnya selera makan\r\n" + 
						"Demam", "Menyebabkan kematian");
		System.out.println( kanpa.printKankerPank() );
	}

}

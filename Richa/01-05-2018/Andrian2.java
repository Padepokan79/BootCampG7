public class Andrian2 {
	public static void main (String[] args) {

		int karung, stok, today, kemarin, sisa;
		karung = 50; //dalam kg
		stok = 12*karung; //dalam kg
		today = 175;
		kemarin = 120;
		sisa = stok - (today+kemarin);


		System.out.println("Di toko Bu Poniem tersedia 12 karung beras. Setiap karung beratnya 50 kg.\nJika hari ini dan kemarin masing-masing terjual 175 kg dan 120 kg,\nberapa kg sisa beras di warung Bu Poniem sekarang ?");
		System.out.println("jadi sisa beras di warung Bu Poniem sebesar " + sisa + " kg");

	}
}
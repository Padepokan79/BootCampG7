package TimRizaldi;

public class PenyakitApp {

	public static void main(String[] args) {
		Penyakit penyakit = new Penyakit("Flue", "sedang", "jamsostek");
		Flue flue = new Flue(penyakit, "Panas", "hidung");
		
		System.out.println();
		System.out.println("==================");
		System.out.println("   STRUK DOKTER");
		System.out.println("==================");
		System.out.println();
		penyakit.tingkatKeparahan();
		penyakit.asuransi();
		System.out.println(flue.toFlue());
		System.out.println("==================");
		System.out.println("Diskon\t\t: "+penyakit.asuransi()*100+"%");
		System.out.println("Sebesar\t\t: Rp. "+penyakit.asuransi()*penyakit.biaya());

	}

}

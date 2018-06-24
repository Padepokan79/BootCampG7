package AndrianAriefKhairil;

public class RunBuah {
	public static void main(String[] args) {
	
		Buah buah = new Buah("buah tunggal", "monokotil");
		System.out.println("Jenis buah\t: "+buah.getTipe()+" dan "+buah.getbiji());
		
		BuahPisang pisang = new BuahPisang("buah nikmat", "dikotil", "pisang mentah", 1000.0, "pahit", "hijau", "keras", "vitamin Z");
		
		System.out.println(pisang.toString());
		System.out.println("Manfaat\t\t: ");
		pisang.manfaatKenyang();
		pisang.manfaatLuka();
		pisang.manfaatTekanan();
	}
}

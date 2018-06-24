/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 3.03 PM
Updated by			:
Updated Date/hour	:
*/

package AndrianAriefKhairil;

public class MainBuah {

	public static void main(String[] args) {
		
		Buah buah = new Buah("berdaging", "monokotil");
		BuahNaga bn = new BuahNaga(buah.getTipe(), buah.getBiji(), "Buah Naga", "Asem", "Hijau", "kasar", "Vitamin c", 20000);
		BuahPisang bp = new BuahPisang(buah.getTipe(), buah.getBiji(), "Pisang", "Manis", "Kuning", "Lembut", "Vitamin A", 15000);
		
		System.out.println("Buah ke-1");
		System.out.println(buah.printBuah());
		System.out.println(bn.printBuah()+ " " +  bn.kenyang());
		bn.setHarga(9000);
		bn.setTeksturKulit("lembut");
		bn.setWarnaKulit("Kuning");
		System.out.println(bn.printBuah()+ " " +  bn.kenyang());
		
		System.out.println();
		
		System.out.println("Buah ke-2");
		System.out.println(buah.printBuah());
		System.out.println(bp.printBuah()+ " " +  bp.kenyang());
		bp.setHarga(13000);
		bp.setTeksturKulit("kasar");
		bp.setWarnaKulit("hijau");
		System.out.println(bp.printBuah()+ " " +  bp.kenyang());

	}

}

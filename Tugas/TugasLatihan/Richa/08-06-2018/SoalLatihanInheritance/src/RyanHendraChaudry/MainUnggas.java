/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 10.00 AM
Updated by			:
Updated Date/hour	:
*/

package RyanHendraChaudry;

public class MainUnggas {

	public static void main(String[] args) {
		
		Bebek bebek = new Bebek ("Bebek", "Coklat", "paru-paru", 3, 5, 3, "kwekwekwek", 'Y');
		BurungKenari bk = new BurungKenari("Burung Kenari", "Biru", "trakea", 18, 1, 2, "krrrrkreek", 'N');
		
		System.out.println(bebek.getNama() + " warna " + bebek.getWarnaBulu() + " bernafas dengan " +  bebek.getAlatPernafasan() + " apakah bisa terbang? " + bebek.getTerbang() + " suaranya... " + bebek.getSuara());	
		bebek.setLamaBertelur(3);
		bebek.setLamaHidup(4);
		bebek.setWarnaBulu("Abu-abu");
		System.out.println(bebek.getNama() + " warna " + bebek.getWarnaBulu() + " bernafas dengan " +  bebek.getAlatPernafasan() + " apakah bisa terbang? " + bebek.getTerbang() + " suaranya... " + bebek.getSuara());	
		
		System.out.println(bk.getNama() + " warna " + bk.getWarnaBulu() + " bernafas dengan " +  bk.getAlatPernafasan() + " apakah bisa terbang? " + bk.getTerbang() + " suaranya... " + bk.getSuara());
		bk.setLamaBertelur(2);
		bk.setLamaHidup(6);
		bk.setWarnaBulu("hitam");
		System.out.println(bk.getNama() + " warna " + bk.getWarnaBulu() + " bernafas dengan " +  bk.getAlatPernafasan() + " apakah bisa terbang? " + bk.getTerbang() + " suaranya... " + bk.getSuara());	
}
}

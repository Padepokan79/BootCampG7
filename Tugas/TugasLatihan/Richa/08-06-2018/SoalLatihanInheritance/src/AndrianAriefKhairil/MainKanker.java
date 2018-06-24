/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 06.30 PM
Updated by			:
Updated Date/hour	:
*/
package AndrianAriefKhairil;

public class MainKanker {

	public static void main(String[] args) {
		
		Kanker kanker = new Kanker("Limfoma", "Ketidakstabilan Metabolisme");
		KankerPankreas kp = new KankerPankreas(kanker.getKlasifikasi(), kanker.getFaktorResiko(), "Kanker Pankreas", "Rokok", "Kemoterapi, Operasi pancreatectomy total");
		KankerKulit kk = new KankerKulit("Karsinoma Sel Basal", "kanker sel basal", "kanker kulit", " sistem imun tubuh yang lemah", "h pembedahan atau pengangkatan jaringan kulit (kanker)");
		
		System.out.println(kanker.printKanker());
		System.out.println(kp.printKanker());
		kp.setPenanggulangan("kemoterapi");
		System.out.println(kp.printKanker());
		System.out.println(kk.printKanker());
		kk.setPenanggulangan("laser");
		System.out.println(kk.printKanker());
		
		
	}
}

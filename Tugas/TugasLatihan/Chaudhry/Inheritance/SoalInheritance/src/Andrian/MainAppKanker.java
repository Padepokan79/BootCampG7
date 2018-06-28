package Andrian;

public class MainAppKanker {
	public static void main(String[] args) {
		Kanker kanker = new Kanker("Limfoma", "Ketidakstabilan Metabolisme");
		KankerPankreas kp = new KankerPankreas(kanker, "Kanker Pankreas", "Rokok", "Kemoterapi");
		
		System.out.println("");
		System.out.println(kp.toString());
		System.out.println("");
		kp.gejala();
		kp.resiko();
	}
}

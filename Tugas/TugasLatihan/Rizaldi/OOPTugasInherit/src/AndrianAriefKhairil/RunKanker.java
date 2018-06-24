package AndrianAriefKhairil;

public class RunKanker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kanker kanker = new Kanker("toumor", "kurang moyan");
		System.out.println(kanker.toString());
		
		System.out.println("\n");
		
		KankerPankreas kp = new KankerPankreas("Limfa", "kurang karing", "Kanker Pankreas", "Banyak tidur", "banyak makan");
		System.out.println(kp.toString());
		System.out.print("gejala\t\t\t: ");
		kp.gejala();
		System.out.print("akibat\t\t\t: ");
		kp.risiko();
	}

}

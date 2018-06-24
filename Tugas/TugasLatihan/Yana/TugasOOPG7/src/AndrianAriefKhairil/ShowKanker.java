package AndrianAriefKhairil;

public class ShowKanker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kanker kanker = new Kanker("Lifoma", "Ganhuan Metabolisme");
		KankerPankreas kankerPankreas = new KankerPankreas("Kanker Pankreas", "Rokok", "Operasi", kanker);
		
		System.out.println("\nKANKER");
		System.out.println(kanker.tampilKanker());
		System.out.println("\nKANKER PANKREAS");
		System.out.println(kankerPankreas.tampilKankerPankreas());
		System.out.println("Behavior : "+kankerPankreas.gejala()+" dan "+kankerPankreas.resiko());
	}

}

package cancer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kanker knk = new Kanker("Limfoma", "Metabolisme tidak stabil");
		Pankreas pnk = new Pankreas(knk, "Pancreas Cancer", "Merokok", "Operasi");
		
		System.out.println(pnk.printKanker());
		
		knk.gejala();
		knk.risiko();

	}

}

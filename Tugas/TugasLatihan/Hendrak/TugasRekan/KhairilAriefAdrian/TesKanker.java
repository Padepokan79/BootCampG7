package KhairilAriefAdrian;

public class TesKanker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KankerPankreas kp = new KankerPankreas("kanker pankreas", "belum diketahui", "belum diketahui", "Gaya hidup yang tidak sehat", "Kemoterapi");
		KankerOtak ko = new KankerOtak("Kanker Otak", "Brain damage", "Rahasia" , "Jarang Berpikir", "Kemoterapi");
		
		System.out.println(kp.toString());
		kp.gejala();
		kp.resiko();
		System.out.println();
		
		System.out.println(ko.toString());
		ko.gejala();
		ko.resiko();
	}

}

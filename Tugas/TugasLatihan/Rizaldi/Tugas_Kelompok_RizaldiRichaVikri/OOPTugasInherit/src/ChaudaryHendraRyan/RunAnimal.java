package ChaudaryHendraRyan;
import java.util.*;
public class RunAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bebek b1 = new Bebek();
		String terbang;
		
		Scanner kb = new Scanner(System.in);
		
		Unggas unggas = new Unggas("Bebek", "putih", "trakea", "WKWKWKWKW", 2, 12, 1);
		System.out.println("Nama Unggas\t: "+unggas.getName()+"\nwarna bulu\t: "+unggas.getWarnaBulu()+
				"\nalat pernafasan\t: "+unggas.getAlatPernafasan()+"\nberbunyi\t: "+unggas.getSuara()+
				"\nlama hidup\t: "+unggas.getLamaHidup()+"\nlama bertelur\t: "+unggas.getLamaBertelur()+"\n"); 
				
		
		Bebek bebek = new Bebek("ayam", "hitam", "trakea", "WKWKWKWKW", 3, 12, 1, "terbang");
		bebek.terbang();
		
		System.out.println("Nama Unggas\t: "+bebek.getName()+"\nwarna bulu\t: "+bebek.getWarnaBulu()+
				"\nalat pernafasan\t: "+bebek.getAlatPernafasan()+"\nberbunyi\t: "+bebek.getSuara()+
				"\nlama hidup\t: "+bebek.getLamaHidup()+"\nlama bertelur\t: "+bebek.getLamaBertelur()+"\nterbang\t\t: "+bebek.getTerbang());
		
	}

}

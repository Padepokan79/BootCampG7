package yma;
import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner (System.in);
		String jenisHewan, gerakHewan, namaHewan, memangsa;
		Athlete atlet = new Athlete("asdas", "asda", "asdad", 180, 57, 23);
		AthleteFootball bola = new AthleteFootball(atlet, "striker", 3, 3, 3, 3);
		
		
		System.out.println(bola.toString());
		System.out.println();
		System.out.println("Tendangan yang masuk : "+bola.jmlhTendang(10));
		
//		
//		Animal hewan = new Animal("default", "default");
//		Carnivora harimau = new Carnivora(hewan, "default", "default");
//		
//		System.out.println("Masukan nama jenis hewan :");
//		jenisHewan = key.next();
//		hewan.setNamaJenisHewan(jenisHewan);
//		System.out.println("Masukan cara gerak hewan :");
//		gerakHewan = key.next();
//		hewan.setCaraGerak(gerakHewan);
//		System.out.println("Masukan nama hewan :");
//		namaHewan = key.next();
//		harimau.setNamaHewan(namaHewan);
//		System.out.println("Masukan cara hewan memangsa :");
//		memangsa = key.next();
//		harimau.setCaraMemangsa(memangsa);
//		
//		System.out.println(harimau.toString());
//		
	}

}

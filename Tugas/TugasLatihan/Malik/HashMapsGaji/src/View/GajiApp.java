package View;

import java.util.HashMap;
import java.util.Map.Entry;

import Controller.AnalisSistem;
import Controller.Programmer;
import Controller.Tester;

public class GajiApp {

	public static void main(String[] args) {
		
		int indexKaryawan = 1, indexJabatan;
		
		Programmer programmer  = new Programmer("Malik", "98236523632", "Bandung", "Middle", 3, true, 4, 5);
		Programmer programmer2 = new Programmer("Chandr", "236262232", "Karawang", "Senior", 10, true, 4, 2);
		Programmer programmer3 = new Programmer("Rizal", "1215153135", "Jakarta", "Junior", 1, false, 10, 8);
		
		AnalisSistem analis  = new AnalisSistem("Rivan", "1525235232", "Bandung", "Middle", 3, false, 10);
		AnalisSistem analis2 = new AnalisSistem("Chandra", "30463698364", "Karawang", "Junior", 10, true, 2);
		AnalisSistem analis3 = new AnalisSistem("Ilham", "1538239687", "Jakarta", "Senior", 1, false, 8);
		
		Tester tester  = new Tester("Vikri", "237263582", "Jakarta", "Senior", 20, true, 200, 5);
		Tester tester2 = new Tester("Yana", "2098272", "Bandung", "Middle", 5, true, 200, 5);
		Tester tester3 = new Tester("Arief", "14121421", "Bandung", "Junior", 2, false, 200, 5);
		
		HashMap<Integer, Programmer> mapProgrammer = new HashMap<>();
		HashMap<Integer, AnalisSistem> mapAnalis= new HashMap<>();
		HashMap<Integer, Tester> mapTester= new HashMap<>();
		HashMap<Integer, String> mapJabatan= new HashMap<>();
		
//		ArrayList<Programmer> arrProgrammer = new ArrayList<Programmer>();
//		ArrayList<String> arrJabatan = new ArrayList<String>();
		
//		arrProgrammer.add(programmer);
//		arrProgrammer.add(programmer2);
//		arrProgrammer.add(programmer3);
//		arrJabatan.add("Programmer");
//		arrJabatan.add("Sistem Analis");
//		arrJabatan.add("Tester");
		
		mapProgrammer.put(1, programmer);
		mapProgrammer.put(2, programmer2);
		mapProgrammer.put(3, programmer3);
		
		mapAnalis.put(1, analis);
		mapAnalis.put(2, analis2);
		mapAnalis.put(3, analis3);
		
		mapTester.put(1, tester);
		mapTester.put(2, tester2);
		mapTester.put(3, tester3);
		
		mapJabatan.put(1, "Programmer");
		mapJabatan.put(2, "Sistem Analis");
		mapJabatan.put(3, "Tester");
		
		System.out.println();
		for (int index = 1; index <= mapJabatan.size(); index++) {
			
			System.out.println(mapProgrammer.get(index));
			System.out.println(mapAnalis.get(index));
			System.out.println(mapTester.get(index));
			
			
		}
	}

}

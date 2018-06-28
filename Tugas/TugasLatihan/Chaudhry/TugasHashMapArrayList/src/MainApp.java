import java.util.HashMap;
import java.util.Map;

import Sistem.Programmer;
import Sistem.SistemAnalis;
import Sistem.Tester;

/*
 * DATE CREATED : 25 Juni 2018
 * AUTHOR       : NURDHIAT CHAUDHARY MALIK
 * */

public class MainApp {

	public static void main(String[] args) {
		Programmer pg = new Programmer("Nurdhiat Malik", "199922120001", "Jakarta", "Programmer", "Junior", 0, 10, 1, true);
		SistemAnalis sa = new SistemAnalis("Vikri Ramdani", "20000112", "Bandung", "Sistem Analis", "Senior", 3, 5, false);
		Tester ts = new Tester("Irfan Hanafi", "19940313", "Karawang", "Tester", "Middle", 8, 155, 0, false);
		
		HashMap<Integer, Programmer> program = new HashMap<Integer, Programmer>();
		program.put(1, pg);
		HashMap<Integer, SistemAnalis> sistem = new HashMap<Integer, SistemAnalis>();
		sistem.put(1, sa);
		HashMap<Integer, Tester> tester = new HashMap<Integer, Tester>();
		tester.put(1, ts);
		
		for (Map.Entry<Integer, Programmer> prog : program.entrySet()) {
			Programmer data = prog.getValue();
			data.tampilData();
		}
			System.out.println("==============================================");
		for (Map.Entry<Integer, SistemAnalis> sis : sistem.entrySet()) {
			SistemAnalis data = sis.getValue();
			data.tampilData();
		}
			System.out.println("==============================================");
		for (Map.Entry<Integer, Tester> tes : tester.entrySet()) {
			Tester data = tes.getValue();
			data.tampilData();
		}
	}

}

package karyawan;

import java.util.*;

public class GajiKaryawan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer pg=new Programmer("Malik", "2342342", "Karawang", "Middle", 10, true, 3, 5);		
		Tester ts=new Tester("Yana", "23423", "Karawang", "Senior", 3, true, 5000, 3);
		SistemAnalis sa=new SistemAnalis("Alifhar", "443523", "Karawang", "Senior", 0, 10);
		
		HashMap<String, Karyawan> karyawan=new LinkedHashMap<String, Karyawan>();
		karyawan.put("Karyawan 1", pg);
		karyawan.put("Karyawan 2", ts);
		karyawan.put("Karyawan 3", sa);
		
		for(Map.Entry<String, Karyawan> orang1:karyawan.entrySet()) {
			Karyawan obj=orang1.getValue();
			System.out.println(orang1.getKey()+"\n"+obj.toString());
			System.out.println();
		}
	}

}

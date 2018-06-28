package example2;

import java.util.HashMap;

public class Ex4 {
	public static void main(String[] args) {
	       
        HashMap<Integer, String> days = new HashMap<Integer,String>();
        
        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");
        
        days.replace(1, "Sabtu");
        
        System.out.println("Isi objek days: " + days);
        System.out.println("Hari kedua: " + days.get(2));
    }
}

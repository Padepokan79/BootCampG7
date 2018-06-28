//Created by vikri
//08/06/2018

package gajiIt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import kereta.Kereta;

import java.util.Set;

public class TestKaryawan {
	public static void main(String[] args) {
		Programmer vikri = new Programmer("Vikri", "13123123", "Bandung", "Programmer", "Junior", 10, 5, 100, false);

		ArrayList<Programmer> al = new ArrayList<Programmer>();
		al.add(vikri);
		
//		HashMap<Integer, Programmer> hm = new HashMap<Integer, Programmer>();
//		hm.put(1, vikri);
//		
//		Set set = hm.entrySet();
//		Iterator<Programmer> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Map.Entry<Integer, Kereta> map = (Map.Entry) it.next();
//			System.out.println();
//		}
		for(Programmer view:al){
			System.out.println(view.toString());
			System.out.println();
		}
	}
}

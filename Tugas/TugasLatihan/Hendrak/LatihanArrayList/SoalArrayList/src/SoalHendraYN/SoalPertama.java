package SoalHendraYN;

import java.util.ArrayList;

public class SoalPertama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jarakBedu=0, jarakBudi=0, kecBedu=60, kecBudi=80, kecBeduper15menit, kecBudiper15menit;
		int waktuAwal=6, jam, menit;
		
		kecBeduper15menit = kecBedu/4;
		kecBudiper15menit = kecBudi/4;
		ArrayList<Integer> jarak = new ArrayList<>();
		ArrayList<Integer> jarak2 = new ArrayList<>();
		Integer jarakTotal = 350;
		jarak.add(0);
		jarak2.add(350);
		
		for(int index = 0; index < jarakTotal; index++) {
			jarak.add(jarak.get(index)+ kecBeduper15menit);
			jarak2.add(jarak2.get(index)- kecBudiper15menit);
		}
		
		for (int index =0 ; index <= 10; index ++) {
			jarakBedu = jarak.get(index);
			jarakBudi = jarak2.get(index);
			if(jarakBedu == jarakBudi)
			{	jam = jarakBedu/kecBedu;
				menit = jarakBedu%kecBedu;
				System.out.println("=============");
				System.out.println("Output Hasil");
				System.out.println("=============");
				System.out.println("Waktu Bedu dan Budi berpapasan pada jam " + (waktuAwal + jam) + "."+menit + "");
				System.out.println("Pada Kilometer "+ jarakBedu +" dari arah yogya ke malang" );
			}
		}

	}

}

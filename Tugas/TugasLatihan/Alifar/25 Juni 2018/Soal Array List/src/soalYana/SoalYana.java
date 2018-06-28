package soalYana;

import java.util.ArrayList;
import java.util.Arrays;
import inputValidation.Input;

public class SoalYana {
	public static void main(String[] args) {
		Input inp=new Input();
		int pilih, total, weekPermonth=4;
		String kata;
		boolean check=false;
		Object roti=new Object("Sari Roti Cheese", 4500, "Senin");
		Object coklat=new Object("Silver Queen", 11200, "Senin", "Selasa", "Rabu", "Sabtu");
		Object sabun=new Object("Lifebuoy Lemonfresh", 6500, "Senin", "Rabu");
		Object tisu=new Object("Paseo 200 pl", 11500, "Senin", "Rabu", "Sabtu");
		Object susu=new Object("Ultramilk Coklat", 4500, "Selasa", "Kamis", "Jumat", "Minggu");
		Object oats=new Object("Quacker Oats", 9500, "Selasa", "Kamis", "Jumat");
		Object minuman=new Object("Mogu mogu", 7800, "Rabu");
		Object susu2=new Object("Bear Brand", 8500, "Kamis");
		Object minuman2=new Object("Teh Kotak", 11200, "Jumat");
		Object coklat2=new Object("Cadbury", 12500, "Sabtu");
		Object minuman3=new Object("AQUA", 2500, "Sabtu");
		Object minuman4=new Object("Floridina", 3200, "Minggu");
		Object snack=new Object("Tic Tac", 9500, "Minggu");
		
		ArrayList<Object> listBarang=new ArrayList<Object>(Arrays.asList(roti, coklat, sabun, tisu, susu, oats, minuman, susu2, minuman2, coklat2, minuman3, minuman4, snack));
		
		System.out.println("===========================");
		System.out.println("         MINIMARKET");
		System.out.println("===========================");
		System.out.println("Menu :");
		System.out.println("1. Penghasilan setiap hari");
		System.out.println("2. Penghasilan seminggu");
		System.out.println("3. Penghasilan perbulan");
		do {
			pilih=inp.integer("\nMasukkan pilihan anda : ", 1, 3);
			total=0;
			if(pilih==1) {
				kata=inp.string("Masukkkan hari : ");
				for(Object list:listBarang)
					for(String nama:list.namaHari)
						if(kata.equalsIgnoreCase(nama))
							total+=list.getHargaBarang();
				System.out.println("Penghasilan hari "+kata+" adalah Rp. "+total);
			}
			else if(pilih==2) {
				for(Object list:listBarang)
					for(int muncul=0; muncul<list.namaHari.size(); muncul++)
						total+=list.getHargaBarang();
				System.out.println("Penghasilan selama satu minggu adalah Rp. "+total);
			}
			else if(pilih==3) {
				for(Object list:listBarang)
					for(int muncul=0; muncul<list.namaHari.size(); muncul++)
						total+=list.getHargaBarang();
				total*=weekPermonth;
				System.out.println("Penghasilan selama satu minggu adalah Rp. "+total);
			}
			kata=inp.string("Ketik \"n\" untuk keluar : ");
			if(kata.equalsIgnoreCase("n"))
				check=true;
		}while (!check);
		
	}
}

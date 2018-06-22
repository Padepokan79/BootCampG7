import java.util.ArrayList;

public class RunKereta {

	public static void main(String[] args) {
		Double totalPenjHari1 = 0.0;
		Double totalPenjHari2 = 0.0;
		Double totalPenjHari3 = 0.0;
		Double totalPenjHari4 = 0.0;
		Double totalPenjHari5 = 0.0;
		Double totalPenjHari6 = 0.0;
		Double totalPenjHari7 = 0.0;
		Kereta keretaEkonomi	= new Kereta("Ekonomi", 18000.0, 120, 100, 50, 30, 20, 150, 110);
		Kereta keretaBisnis		= new Kereta("Bisnis", 35000.0, 50, 15, 13, 10, 20, 55, 60);
		Kereta keretaEksekutif	= new Kereta("Eksekutif", 80000.0, 40, 21, 11, 16, 12, 35, 40);
		
		
		ArrayList<Kereta> listKereta =new ArrayList<Kereta>();
			listKereta.add(keretaEkonomi);
			listKereta.add(keretaBisnis);
			listKereta.add(keretaEksekutif);
			
			 
		System.out.println("======================================================= hari ke 1");
		for(Kereta krt:listKereta) {
			if(!krt.gerbong.equalsIgnoreCase("ekonomi")) {
				System.out.println("Nama gerbong\t: "+krt.gerbong+"\tTotal Pemasukan\t: "+krt.getHarga()*krt.getQtyPass1());
				totalPenjHari1 = totalPenjHari1+krt.getHarga()*krt.getQtyPass1();
			}
			
		}
		System.out.println("Total Pemasukan hari 1 : "+totalPenjHari1);
		System.out.println("======================================================= hari ke 2");
		for(Kereta krt:listKereta) {
			System.out.println("Nama gerbong\t: "+krt.gerbong+"\tTotal Pemasukan\t: "+krt.getHarga()*krt.getQtyPass2());
			totalPenjHari2 = totalPenjHari2+krt.getHarga()*krt.getQtyPass2();
		}
		System.out.println("Total Pemasukan hari 2 : "+totalPenjHari2);
		System.out.println("======================================================= hari ke 3");
		for(Kereta krt:listKereta) {
			System.out.println("Nama gerbong\t: "+krt.gerbong+"\tTotal Pemasukan\t: "+krt.getHarga()*krt.getQtyPass3());
			totalPenjHari3 = totalPenjHari3+krt.getHarga()*krt.getQtyPass3();
		}
		System.out.println("Total Pemasukan hari 3 : "+totalPenjHari3);
		System.out.println("======================================================= hari ke 4");
		for(Kereta krt:listKereta) {
			System.out.println("Nama gerbong\t: "+krt.gerbong+"\tTotal Pemasukan\t: "+krt.getHarga()*krt.getQtyPass4());
			totalPenjHari4 = totalPenjHari4+krt.getHarga()*krt.getQtyPass4();
		}
		System.out.println("Total Pemasukan hari 4 : "+totalPenjHari4);
		System.out.println("======================================================= hari ke 5");
		for(Kereta krt:listKereta) {
			System.out.println("Nama gerbong\t: "+krt.gerbong+"\tTotal Pemasukan\t: "+krt.getHarga()*krt.getQtyPass5());
			totalPenjHari5 = totalPenjHari5+krt.getHarga()*krt.getQtyPass5();
		}
		System.out.println("Total Pemasukan hari 5 : "+totalPenjHari5);
		System.out.println("======================================================= hari ke 6");
		for(Kereta krt:listKereta) {
			System.out.println("Nama gerbong\t: "+krt.gerbong+"\tTotal Pemasukan\t: "+krt.getHarga()*krt.getQtyPass6());
			totalPenjHari6 = totalPenjHari6+krt.getHarga()*krt.getQtyPass6();
		}
		System.out.println("Total Pemasukan hari 6 : "+totalPenjHari6);
		System.out.println("======================================================= hari ke 7");
		for(Kereta krt:listKereta) {
			System.out.println("Nama gerbong\t: "+krt.gerbong+"\tTotal Pemasukan\t: "+krt.getHarga()*krt.getQtyPass7());
			totalPenjHari7 = totalPenjHari7+krt.getHarga()*krt.getQtyPass7();
		}
		System.out.println("Total Pemasukan hari 7 : "+totalPenjHari7);

	}

}

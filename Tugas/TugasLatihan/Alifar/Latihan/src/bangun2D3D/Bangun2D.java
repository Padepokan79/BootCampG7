package bangun2D3D;
import java.util.Scanner;

public class Bangun2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String pilih;
		int number;
		boolean check=false;
		
		System.out.println("Perhitungan Bangun Datar");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Lingkaran");
		System.out.println("4. Segitiga");
		
		do {
			System.out.print("\nMasukkan Pilihan : ");
			pilih=scan.nextLine();
			check=Validation.angkaBatas(pilih, 1, 4);
		}while(!check);
		check=false;
		number=Integer.parseInt(pilih);
		
		if(number==1) {  //Persegi

			do {
				System.out.print("Masukkan sisi persegi : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1);
			}while(!check);
			check=false;
			double sisi=Integer.parseInt(pilih);

			SegiEmpat bangun=new SegiEmpat(sisi);
			
			bangun.persegi();
			System.out.println("\nPersegi dengan sisi "+bangun.sisi+" satuan memiliki");
			System.out.printf("Luas = %.2f satuan kuadrat\n",bangun.luasPersegi);
			System.out.printf("Keliling = %.2f satuan\n",bangun.kelilingPersegi);
		}
		else if(number==2) {  //Persegi Panjang
		
			do {
				System.out.print("Masukkan panjang persegi panjang : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double panjang=Integer.parseInt(pilih);
			
			do {
				System.out.print("Masukkan lebar persegi panjang : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double lebar=Integer.parseInt(pilih);

			SegiEmpat bangun=new SegiEmpat(panjang, lebar);

			bangun.persegiPanjang();
			System.out.println("\nPersegi Panjang dengan panjang "+bangun.panjang+" satuan dan lebar "+bangun.lebar+" satuan memiliki");
			System.out.printf("Luas = %.2f satuan kuadrat\n",bangun.luasPersegiPanjang);
			System.out.printf("Keliling = %.2f satuan\n",bangun.kelilingPersegiPanjang);
		}
		else if(number==3) { //Lingkaran
			
			do {
				System.out.print("Masukkan jari-jari lingkaran : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double r=Integer.parseInt(pilih);
			
			Lingkaran bangun=new Lingkaran(r);
			bangun.lingkar();
			System.out.println("\nLingkaran dengan jari-jari "+bangun.r+" memiliki");
			System.out.printf("Luas = %.2f satuan kuadrat\n",bangun.luasLingkaran);
			System.out.printf("Keliling = %.2f satuan\n",bangun.kelilingLingkaran);
		}
		else if(number==4) {  //Segitiga
			
			do {
				System.out.print("Masukkan sisi 1 : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double sisi1=Integer.parseInt(pilih);

			do {
				System.out.print("Masukkan sisi 2 : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double sisi2=Integer.parseInt(pilih);

			do {
				System.out.print("Masukkan sisi 3 : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double sisi3=Integer.parseInt(pilih);

			Segitiga bangun=new Segitiga(sisi1, sisi2, sisi3);
			bangun.segi3();
			System.out.println("\nSegitiga dengan sisi-sisi "+bangun.sisi1+", "+bangun.sisi2+", "+bangun.sisi3+" memiliki");
			System.out.printf("Luas = %.2f satuan kuadrat\n",bangun.luasSegitiga);
			System.out.printf("Keliling = %.2f satuan\n",bangun.kelilingSegitiga);
		}
		
		scan.close();
	}

}

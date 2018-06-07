package bangun2D3D;
import java.util.Scanner;

public class Bangun3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String pilih;
		int number;
		boolean check=false;
		
		System.out.println("Perhitungan Bangun Ruang");
		System.out.println("1. Balok");
		System.out.println("2. Kubus");
		System.out.println("3. Bola");
		System.out.println("4. Tabung");
		
		do {
			System.out.print("\nMasukkan Pilihan : ");
			pilih=scan.nextLine();
			check=Validation.angkaBatas(pilih, 1, 4);
		}while(!check);
		check=false;
		number=Integer.parseInt(pilih);

		if(number==1) { //Balok

			do {
				System.out.print("Masukkan panjang balok : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double panjang=Integer.parseInt(pilih);

			do {
				System.out.print("Masukkan lebar balok : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double lebar=Integer.parseInt(pilih);

			do {
				System.out.print("Masukkan tinggi balok : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double tinggi=Integer.parseInt(pilih);

			SegiEmpat bangun=new SegiEmpat(panjang, lebar, tinggi);
			bangun.balok();
			System.out.println("\nBalok dengan panjang "+bangun.panjang+", lebar"+bangun.lebar+" dan tinggi "+bangun.tinggi+" memiliki");
			System.out.printf("Volume = %.2f satuan kuadrat\n",bangun.volumeBalok);
		}
		else if(number==2) {  //Kubus
		
			do {
				System.out.print("Masukkan sisi kubus : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double sisi=Integer.parseInt(pilih);
						
			SegiEmpat bangun=new SegiEmpat(sisi);
			bangun.kubus();
			System.out.println("\nKubus dengan sisi "+bangun.sisi+" satuan memiliki");
			System.out.printf("Volume = %.2f satuan kubik\n",bangun.volumeKubus);
		}
		else if(number==3) {  //Bola
			
			do {
				System.out.print("Masukkan jari-jari bola : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double r=Integer.parseInt(pilih);
			
			Lingkaran bangun=new Lingkaran(r);
			bangun.bola();
			System.out.println("\nBola dengan jari-jari "+bangun.r+" memiliki");
			System.out.printf("Volume = %.2f satuan kubik\n",bangun.volumeBola);
		}
		else if(number==4) {  //Tabung
			
			do {
				System.out.print("Masukkan jari-jari : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double r=Integer.parseInt(pilih);

			do {
				System.out.print("Masukkan tinggi : ");
				pilih=scan.nextLine();
				check=Validation.angkaBawah(pilih, 1); 
			}while(!check);
			check=false;
			double tinggi=Integer.parseInt(pilih);

			Lingkaran bangun=new Lingkaran(r, tinggi);
			bangun.tabung();
			System.out.println("\nTabung dengan jari-jari "+bangun.r+" dan tinggi "+bangun.tinggi+" memiliki");
			System.out.printf("Volume = %.2f satuan kubik\n",bangun.volumeTabung);
		}
		
		scan.close();
	}
	

}

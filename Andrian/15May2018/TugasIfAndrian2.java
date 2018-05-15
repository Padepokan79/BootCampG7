/* 	Date 		: 14/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfAndrian2 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			Scanner key1 = new Scanner(System.in);
			int gajiPokok=0, totalGaji=0, tunjangan=0, pajak=0, pilih, nik;
			String nama;

			System.out.println();
			System.out.print("Masukan nama: ");
			nama = key.nextLine();
			System.out.print("Masukan NIK: ");
			nik = key1.nextInt();

			System.out.println();			
			System.out.println("1  golongan 2A");
			System.out.println("2. golongan 2B");
			System.out.println("3. golongan 3A");
			System.out.println("4. golongan 3B");
			System.out.println("5. golongan 4A");
			System.out.println("6. golongan 4B");
			System.out.print("Masukan pilihan golongan : ");
			pilih = key1.nextInt();


			if (pilih==1) {
				gajiPokok=1000000;
				tunjangan=100000;
			}
			else if (pilih==2) {
				gajiPokok=1500000;
				tunjangan=200000;
			}
			else if (pilih==3) {
				gajiPokok=2000000;
				tunjangan=300000;
			}
			else if (pilih==4) {
				gajiPokok=2500000;
				tunjangan=400000;
			}
			else if (pilih==5) {
				gajiPokok=3000000;
				tunjangan=500000;
			}
			else if (pilih==6) {
				gajiPokok=3500000;
				tunjangan=600000;
			}
			else {
				System.out.println("input tidak valid !");
			}

			pajak = ( ((2)*(gajiPokok+tunjangan))/100 );
			totalGaji = ( (gajiPokok+tunjangan)-pajak ) ;


			System.out.println("Gaji Pokok :\t\t"+gajiPokok);
			System.out.println("Tunjangan :\t\t"+tunjangan);
			System.out.println("Pajak :\t\t\t"+pajak);
			System.out.println("Gaji yang diterima :\t"+totalGaji);
		}
	}
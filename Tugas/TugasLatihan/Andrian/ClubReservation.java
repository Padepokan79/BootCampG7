/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class ClubReservation {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int usia;
			double cantik;
			String hari,gender;
			boolean selasa, kamis, jumat, sabtu;

			System.out.println("===========================================================");
			System.out.print("Sebutkan hari apa ini? ");
			hari = key.next();

			System.out.print("Sebutkan gender anda(cewek/cowok)? ");
			gender = key.next();

			System.out.print("Berapa usia anda? ");
			usia = key.nextInt();

			System.out.print("Seberapa cantik anda dari skala 0.0 hingga 10.0 ?");
			cantik = key.nextDouble();

			selasa = (gender.equals("cewek") && (usia >= 30 && usia <= 40 ) && cantik >= 8.0 ) || (gender.equals("cowok") && (usia >= 20 && usia <= 25 ) && cantik < 8.0) ;
			kamis = gender.equals("cewek") && (usia >= 21 && usia <= 30 ) && cantik >= 8.0 ;
			jumat = (gender.equals("cewek")|| gender.equals("cowok")) && usia >= 40 ;
			sabtu = gender.equals("cewek") && (usia >= 21 && usia <= 30 ) && cantik >= 8.0;


			System.out.println("===========================================================");
			if (hari.equals("selasa")&&selasa) {
				System.out.println("Selamat datang di Brondong Night");
			}
			else if (hari.equals("kamis")&&kamis) {
				System.out.println("Selamat datang di Ladies night");
			}
			else if (hari.equals("jumat")&&jumat){
				System.out.println("Selamat datang di Melodies Memories");
			}
			else if (hari.equals("sabtu")&&sabtu) {
				System.out.println("Selamat datang di Jomblo Night");
			}
			else if (hari.equals("senin")) {
				System.out.println("Reservasi Sukses Selamat datang");
			}
			else if (hari.equals("rabu")) {
				System.out.println("Reservasi Sukses Selamat datang");
			}
			else if (hari.equals("minggu")) {
				System.out.println("Reservasi Sukses Selamat datang");
			}
			else 
				System.out.println("Anda dilarang memasuki club");
			System.out.println("===========================================================");


		}
	}
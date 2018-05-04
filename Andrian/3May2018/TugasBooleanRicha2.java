/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanRicha2 {
		public static void main(String [] args){
			Scanner key = new Scanner(System.in);
			String nama,senyum;
			int pelanggaran,batasPelanggaran,teman,minimalteman;
			boolean hasil;
			

			batasPelanggaran = 7;
			minimalteman = 13;

			System.out.println("Hai kamu ingin tahu kan bagaimana orang menilaimu?");
			System.out.println("Isi penilaian di bawah ini ya :)");
			System.out.println();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println();

			System.out.println("Nama :");
			nama = key.next();

			System.out.println("Berapa teman baik yang kamu punya, "+nama+ " ?");
			teman = key.nextInt();

			System.out.println("Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? kalo iya, berapa kali?");
			pelanggaran = key.nextInt();

			System.out.println("Menurutmu kamu murah senyum atau tidak? (Ya/Tidak)");
			senyum = key.next();

			hasil = pelanggaran<=batasPelanggaran && senyum.equals("Ya") && teman >= minimalteman;

			System.out.println("Baiklah, ");
			System.out.println("Apakah "+nama+" adalah orang yang baik? " + hasil);
			System.out.println("Terimakasih! teruslah menjadi orang yang baik yaa");
		}
	}
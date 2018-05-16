/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfChaudary1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int indonesia, math, inggris;
			double rataRata;
			String nama, keterangan;


			System.out.println("+++++++++++++++++++++++++++++++");
			System.out.println("Nama\t\t: ");
			nama = key.next();
			System.out.println("Nilai Math\t\t: ");
			math = key.nextInt();
			System.out.println("Nilai Indonesia\t\t: ");
			indonesia = key.nextInt();
			System.out.println("Nilai inggris\t\t: ");
			inggris = key.nextInt();
			System.out.println();


			rataRata = (math+indonesia+inggris)/3;
			System.out.println("Rata-rata nilai\t\t: "+rataRata);

			if (rataRata==75) {
				keterangan = "Ada tawaran untuk ramedial";
			}
			else if (rataRata>75 && rataRata<85){
				keterangan = "nilai cukup";
			}
			else if (rataRata>84 && rataRata<=90) {
				keterangan = "nilai baik";
			}
			else if (rataRata>90 && rataRata<=100) {
				keterangan = "sangat baik";
			}
			else {
				keterangan = "Wajib mengikuti ramedial";
			}

			System.out.println("Keterangan nilai\t\t:"+keterangan);

		}
	}
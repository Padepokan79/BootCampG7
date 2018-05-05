/* 	Date 		: 3/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasBooleanAlifhar3 {
		public static void main(String [] args){
		Scanner key = new Scanner(System.in);
		int nilailulus, hasilnilai, benar, salah, kosong, sconebenar, scoresalah, scorekosong, nilaibenar, nilaisalah,niailaikosong;
		double rapi, standarRapi;
		String pensil,rambut;
		boolean hasil, kedisiplinan;
		
		sconebenar = 4;
		scoresalah = -1;
		scorekosong = 0;
		standarRapi = 8;
		nilailulus = 130;



		System.out.println("jawaban benar :  ");
		benar = key.nextInt();

		System.out.println("jawaban salah :  ");
		salah = key.nextInt();

		System.out.println("jawaban kosong :  ");
		kosong = key.nextInt();

		System.out.println("Pensil yang digunakan (HB/2B/3B/4B/5B/6B): ");
		pensil = key.next();

		System.out.println("Skala kerapian (0 sampai 10): ");
		rapi = key.nextDouble();

		System.out.println("Rambut (pendek/panjang): ");
		rambut = key.next();

		nilaibenar = benar*sconebenar;
		nilaisalah = salah* scoresalah;
		niailaikosong = kosong*scorekosong;

		hasilnilai = nilaibenar+nilaisalah+niailaikosong;
		kedisiplinan = pensil.equals("2B") && (rapi>=standarRapi || rambut.equals("pendek"));
		hasil = (hasilnilai>=nilailulus) && pensil.equals("2B") && rapi>=standarRapi && rambut.equals("pendek");

		System.out.println("+----------------------------------------------+");
		System.out.println("|Total nilai:                       " + hasilnilai +" |");
		System.out.println("|Kedisplinan:                       " + kedisiplinan +" |");
		System.out.println("|Anda lulus:                        " + hasil +" |");
		System.out.println("+----------------------------------------------+");
		} 
		
	}
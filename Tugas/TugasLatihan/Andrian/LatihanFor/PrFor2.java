/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class PrFor2 {
		public static void main(String[] args) {
			Scanner key = new Scanner (System.in);
			Scanner key1 = new Scanner (System.in);
			int kata, barisAwal, batas, endWord, panjangKalimat=0;
			String word;

			System.out.print("Masuan banyak baris \t: ");
			batas = key.nextInt();
			System.out.print("Masukan kata \t: ");
			word = key1.nextLine();
			endWord = word.length();

			for( barisAwal=0; barisAwal<=batas; barisAwal++) {
				int spasi=0;
				for( spasi=0; spasi<=batas-barisAwal; spasi++) {
					System.out.print(" ");
				}
				for( kata=0; kata<=barisAwal; kata++) {
					if (panjangKalimat < endWord) {
						System.out.print(word.substring(panjangKalimat,panjangKalimat+1));
						System.out.print(" ");
						panjangKalimat++;
					}
				}
				System.out.println();
			}
		}
	}

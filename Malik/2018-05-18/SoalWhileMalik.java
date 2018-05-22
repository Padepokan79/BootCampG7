/*
Created By 	: Malik Chaudhary
Time		: 19-05-2018 8:42AM

Soal :

Rangga menginputkan jumlah pensilnya sendiri
rangga akan menebak jumlah pensilnya sendiri yang diacak oleh komputer

- pertama bermain player memiliki 5 kesempatan yang diberikan *
- bila tebakan player benar, maka player mendapatkan satu kesempatan dan menambahkan 10 poin untuk skor *
- kesempatan berlaku bila ia salah menebak, maka kesempatan yang dimiliki berkurang
- bila player sudah tidak memiliki kesempatan, maka permainan berakhir atau GAME OVER
- terkecuali bila player memiliki poin min 10 dan kesempatan sudah habis maka program akan bertanya, apakah ingin menukar 10
  poin untuk 1 kesempatan.
*/
 
import java.util.Scanner;
import java.util.Random;
public class SoalWhileMalik{ 
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		String pertanyaan;
		int pensil, randomPemain, tebakanPemain, kesempatanDilalui, kesempatan, skor, poin, penukaran, satu, nol, sepuluh;
			System.out.println();
			System.out.print("Masukan jumlah pensil anda : ");
			pensil = scan.nextInt();
			System.out.println();
			System.out.println("==============================");
			kesempatanDilalui 	= 1; 	satu	= 1;
			kesempatan 			= 5;	nol 	= 0;
			skor 				= 0;	sepuluh = 10;
		while(kesempatanDilalui <= kesempatan){
					while( kesempatanDilalui <= kesempatan ){
						tebakanPemain 	= satu;
						randomPemain 	= nol;
						while( tebakanPemain != randomPemain && kesempatanDilalui <= kesempatan ){
						System.out.println();
						//System.out.println("kesempatanDilalui : "+kesempatanDilalui);
						System.out.println("kesempatan : "+kesempatan);
						System.out.println("Poin : "+skor);
							randomPemain = random.nextInt(pensil)+satu;
							System.out.println("Angka Random : "+randomPemain);
							System.out.print("Tebakan anda : ");
							tebakanPemain = scan.nextInt();
							if ( tebakanPemain == randomPemain ) {
								kesempatan += satu;
								skor += sepuluh;	
							}else{
								kesempatan -= satu;
							}
							//kesempatanDilalui++;
						}
					}
			if ( kesempatanDilalui > kesempatan && skor >= sepuluh ) {
				System.out.println();
				System.out.println("Anda memiliki poin = "+skor);
				System.out.print("Apakah anda ingin menukar poin anda menjadi kesempatan ? (Y/N) : ");
				pertanyaan = scan.next();
				if ( pertanyaan.equals("Y") ) {
					System.out.print("Berapa poin yang ingin anda tukar ? (10 poin = 1 kesempatan) : ");
					poin = scan.nextInt();
					if ( poin <= skor ) {
						kesempatan = poin/sepuluh; 
						if ( poin%sepuluh == nol ) {
							skor = skor-poin; 
						}else{
							skor = (skor-poin)+(poin%sepuluh); 
						}
						
						System.out.println("Anda memiliki poin = "+skor);
						System.out.println("Anda memiliki kesempatan = "+kesempatan);
						kesempatanDilalui = satu;
					}else{
						System.out.println("Skor yang anda masukan "+poin+" melebihi batas poin anda "+skor);
						System.out.println("Berapa poin yang ingin anda tukar ? (10 poin = 1 kesempatan) : ");
						poin = scan.nextInt();
						kesempatan = poin/sepuluh;
						skor 	   = skor-poin;
						System.out.println("Anda memiliki poin = "+skor);
						System.out.println("Anda memiliki kesempatan = "+kesempatan);
						kesempatanDilalui = satu;
					}
				}else{
					System.out.println("GAME OVER");
					System.out.println("POIN : "+skor);
				}
			}else{
				System.out.println();
				System.out.println("GAME OVER");
				System.out.println("POIN : "+skor);
			}	
		}
	}
}
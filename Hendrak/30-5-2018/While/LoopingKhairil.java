//Created by : Hendra Kurniawan
//Date : 30 Mei 2018 Time : 1:38 AM
//Modified :
import java.util.Scanner;
import java.util.Random;

public class LoopingKhairil{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int bil1=0,bil2=0,level,soal=0,jumlahSoal=0,jumlahBenar=0, jawab,jawabBenar,presentase;
		String ulang;
		do{
		jumlahBenar=0;
		presentase=0;
		soal =0;
		jumlahSoal=0;
		System.out.println("Berhitung Ceria");
		System.out.println("=========================================");
		System.out.println("1.Level 1 Hitungan angka 1-10");
		System.out.println("2.Level 2 Hitungan angka 10-100");
		System.out.println("3.Level 3 Hitungan angka 100-1000");
		System.out.println("4.Level 4 Hitungan angka 1000-10000");
		System.out.println("5.Level 5 Hitungan angka 10000-100000");
		System.out.println("6.Level 6 Hitungan angka 100000-1000000");
		System.out.println("=========================================");
		System.out.print("Pilih Level : ");
		level = keyboard.nextInt();
		System.out.print("Masukan Jumlah Soal : ");
		jumlahSoal = keyboard.nextInt();
		do{
			soal++;
			if(level == 1){
				bil1 = rand.nextInt(10)+1;
				bil2 = rand.nextInt(10)+1;
			}
			else if(level == 2){
				bil1 = rand.nextInt(90)+11;
				bil2 = rand.nextInt(90)+11;
			}
			else if(level == 3){
				bil1 = rand.nextInt(900)+101;
				bil2 = rand.nextInt(900)+101;
			}
			else if(level == 4){
				bil1 = rand.nextInt(9000)+1001;
				bil2 = rand.nextInt(9000)+1001;
			}
			else if(level == 5){
				bil1 = rand.nextInt(90000)+10001;
				bil2 = rand.nextInt(90000)+10001;
			}
			else if(level == 6){
				bil1 = rand.nextInt(900000)+100001;
				bil2 = rand.nextInt(900000)+100001;
			}

			System.out.println("Soal ke-"+soal);
			System.out.print(bil1 +" + " + bil2 + " = ");
			jawab = keyboard.nextInt();
			jawabBenar = bil1 + bil2;
			if(jawab == jawabBenar){
				jumlahBenar +=1;
			}
		}while(soal < jumlahSoal);
		System.out.println("================");
		presentase = (jumlahBenar/jumlahSoal) * 100;

		if(presentase == 100)
		{
			System.out.println("PERRFECTT!!!");
		} 
		else if(presentase >= 75 && presentase <= 99){
			System.out.println("Anda benar-benar matematika wan!!");
		}
		else if(presentase >=50 && presentase <75){
			System.out.println("Sip lah masih diatas Standar.");
		}
		else if(presentase >=25 && presentase < 50){
			System.out.println("Oke lah masih mending.");
		}
		else if(presentase < 25){
			System.out.println("Coba lagi ya, atau ngulang SD nya!!");
		}
	System.out.print("mau di Ulang (y/n)??? ");
	ulang = keyboard.next();
	}while(ulang.equals("y"));
	}
}
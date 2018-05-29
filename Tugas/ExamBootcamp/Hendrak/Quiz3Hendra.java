//Created by : Hendra Kurniawan
//Date : 29 Mei 2018 Time : 10.17 AM - 1.05 PM
//Modified :
import java.util.Scanner;

public class Quiz3Hendra{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean validasi= false, validasiKeluarga=false, validasiTabung=false;
		int keluarga,lamaTabungan,maxKeluarga=6,minKeluarga=2,minLamanabung=1,maxLamanabung=12;
		int index, bayar31=31000,bayar30=30000,bayar28=28000,jumlahBayar31=0, jumlahBayar30=0, jumlahBayar28=0,penurunanTiaphari=1000,totalTabungan=0;

		int [] bulan31hari = new int[31];
		int [] bulan30hari = new int[30];
		int [] bulan28hari = new int[28];
		//bulan dengan 31hari
		for(index = 0; index < bulan31hari.length; index++){
			bulan31hari[index] = bayar31;
			bayar31 = bayar31 - penurunanTiaphari;
		}

		for(index = 0; index < bulan31hari.length; index++){
			jumlahBayar31 += bulan31hari[index];
		}

		//bulan dengan 30 hari
		for(index = 0; index < bulan30hari.length; index++){
			bulan30hari[index] = bayar30;
			bayar30 = bayar30 - penurunanTiaphari;
		}

		for(index = 0; index < bulan30hari.length; index++){
			jumlahBayar30 += bulan30hari[index];
		}

		//bulan dengan 28 hari
		for(index = 0; index < bulan28hari.length; index++){
			bulan28hari[index] = bayar28;
			bayar28 = bayar28 - penurunanTiaphari;
		}

		for(index = 0; index < bulan28hari.length; index++){
			jumlahBayar28 += bulan28hari[index];
		}

		do{
		validasiTabung = false; 
		validasiKeluarga = false;
		System.out.print("Masukan Jumlah Keluarga :");
		keluarga = keyboard.nextInt();
		System.out.print("Masukan Lama Tabungan : ");
		lamaTabungan = keyboard.nextInt();
		
		if(keluarga>=minKeluarga && keluarga <=maxKeluarga){
			validasiKeluarga =true;
		}
		else if(keluarga<minKeluarga){
			System.out.println("Anggota keluarga tidak boleh kurang dari 2");
		}
		else if(keluarga>maxKeluarga){
			System.out.println("Anggota keluarga tidak boleh lebih dari 6");
		}
		if(lamaTabungan>=minLamanabung && lamaTabungan <=maxLamanabung){
			validasiTabung = true;
		}
		else if(lamaTabungan<minLamanabung){
			System.out.println("Lama tabungan tidak boleh kurang dari 1");
		}
		else if(lamaTabungan>maxLamanabung){
			System.out.println("Lama tabungan tidak boleh lebih dari 12");
		}
		if(validasiTabung && validasiKeluarga){
			validasi=true;
		}

		}while(!validasi);


		if(lamaTabungan == 1){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			totalTabungan = jumlahBayar31*keluarga;
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 2){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			totalTabungan = (jumlahBayar31 + jumlahBayar28) * keluarga;
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 3){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar  " + jumlahBayar31*keluarga);
			totalTabungan = (jumlahBayar31*2)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 4){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar" + jumlahBayar30*keluarga);
			totalTabungan = (jumlahBayar31*2)*keluarga +(jumlahBayar30)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 5){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar" + jumlahBayar30*keluarga);
			System.out.println("Tabungan Pada Bulan kelima sebesar" + jumlahBayar31*keluarga);	
			totalTabungan = (jumlahBayar31*3)*keluarga +(jumlahBayar31)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 6){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar" + jumlahBayar30*keluarga);
			System.out.println("Tabungan Pada Bulan kelima sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan keenam sebesar" + jumlahBayar30*keluarga);	
			
			totalTabungan = (jumlahBayar31*3)*keluarga +(jumlahBayar30*2)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 7){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar" + jumlahBayar30*keluarga);
			System.out.println("Tabungan Pada Bulan kelima sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan keenam sebesar" + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan ketujuh sebesar" + jumlahBayar31*keluarga);	
			
			totalTabungan = (jumlahBayar31*4)*keluarga +(jumlahBayar30*2)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 8){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar" + jumlahBayar30*keluarga);
			System.out.println("Tabungan Pada Bulan kelima sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan keenam sebesar" + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan ketujuh sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan kedelapan sebesar" + jumlahBayar30*keluarga);	
			
			totalTabungan = (jumlahBayar31*4)*keluarga +(jumlahBayar30*3)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 9){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar" + jumlahBayar30*keluarga);
			System.out.println("Tabungan Pada Bulan kelima sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan keenam sebesar" + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan ketujuh sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan kedelapan sebesar" + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan kesembilan sebesar" + jumlahBayar31*keluarga);	
			
			totalTabungan = (jumlahBayar31*5)*keluarga +(jumlahBayar30*3)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 10){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar" + jumlahBayar30*keluarga);
			System.out.println("Tabungan Pada Bulan kelima sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan keenam sebesar" + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan ketujuh sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan kedelapan sebesar" + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan kesembilan sebesar" + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan kesepuluh sebesar" + jumlahBayar30*keluarga);	
			
			totalTabungan = (jumlahBayar31*5)*keluarga +(jumlahBayar30*4)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 11){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar " + jumlahBayar30*keluarga);
			System.out.println("Tabungan Pada Bulan kelima sebesar " + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan keenam sebesar " + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan ketujuh sebesar " + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan kedelapan sebesar " + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan kesembilan sebesar " + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan kesepuluh sebesar " + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan kesebelas sebesar " + jumlahBayar31*keluarga);	
			
			totalTabungan = (jumlahBayar31*6)*keluarga +(jumlahBayar30*4)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
		else if(lamaTabungan == 12){
			System.out.println("Tabungan Pada Bulan petama sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan kedua sebesar  " + jumlahBayar28*keluarga);
			System.out.println("Tabungan Pada Bulan ketiga sebesar " + jumlahBayar31*keluarga);
			System.out.println("Tabungan Pada Bulan keempat sebesar " + jumlahBayar30*keluarga);
			System.out.println("Tabungan Pada Bulan kelima sebesar " + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan keenam sebesar " + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan ketujuh sebesar " + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan kedelapan sebesar " + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan kesembilan sebesar " + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan kesepuluh sebesar " + jumlahBayar30*keluarga);	
			System.out.println("Tabungan Pada Bulan kesebelas sebesar " + jumlahBayar31*keluarga);	
			System.out.println("Tabungan Pada Bulan keduabelas sebesar " + jumlahBayar30*keluarga);	
			

			totalTabungan = (jumlahBayar31*6)*keluarga +(jumlahBayar30*5)*keluarga + (jumlahBayar28 * keluarga);
			System.out.print("Total tabungan selama "+lamaTabungan+" Bulan dengan " + keluarga + " anggota keluarga adalah " + totalTabungan);
		}
	}
}

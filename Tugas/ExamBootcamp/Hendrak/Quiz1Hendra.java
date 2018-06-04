//Created by : Hendra Kurniawan
//Date : 29 Mei 2018 Time : 9.30 AM - 11.00 AM
//Modified :
import java.util.Scanner;

public class Quiz1Hendra{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int index=0,batas, nilaiSebelum=1, nilai2Sebelum=2;
		boolean validasi=false;
		double [] bilFibonacci = new double[100];
		bilFibonacci [0] = 0;
		bilFibonacci [1] = 1;
		
		for(index=2; index < 100; index++){
		bilFibonacci[index] = bilFibonacci[index- nilaiSebelum]+bilFibonacci[index- nilai2Sebelum];
		}

		do{
			System.out.print("\nJumlah urutan angka Fibonacci yang akan ditampilkan : ");
			batas = keyboard.nextInt();

			if(batas>=5 && batas <=100){
			validasi = true;
			}
			else if(batas > 100){
				System.out.println("Maaf, jumlah urutan angka tidak boleh dari 100.");
			}
			else if(batas < 5){
				System.out.println("Maaf, jumlah urutan tidak boleh kurang dari satu.");
			}else{
				System.out.println("Maaf, Input yang diterima hanya berupa angka.");
			}
		}while(!validasi);

		for(index = 1; index < batas; index++){
			System.out.printf("%.0f ",bilFibonacci[index]);
		}

	}
}
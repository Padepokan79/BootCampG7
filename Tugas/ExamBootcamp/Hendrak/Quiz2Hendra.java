//Created by : Hendra Kurniawan
//Date : 29 Mei 2018 Time : 9.37 AM - 11.20 AM
//Modified :
import java.util.Scanner;

public class Quiz2Hendra{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int i, j, baris=0;
		boolean validasi=true;
		
		do{
			System.out.print("\nJumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
			baris = keyboard.nextInt();
			if(baris>=2 && baris <=20){
			validasi = true;
			}
			else if(baris > 20){
				System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20.");
			}
			else if(baris <= 1){
				System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2.");
			}else{
				System.out.println("Maaf, Input yang diterima hanya berupa angka.");
			}
			
		}while(!validasi);
		baris +=1;
		int nilaiPaskal[][] = new int[baris][baris];

		for(i=1 ; i < baris ; i++){
			for(j=0 ; j < i; j++){
				if(i>=1){
					if(j==0){
					nilaiPaskal[i][j]=1;	
					}
					else {
					nilaiPaskal[i][j] = nilaiPaskal[i-1][j-1] + nilaiPaskal[i-1][j];
					}
				}	
			System.out.print(nilaiPaskal[i][j]);
			}
		System.out.println();
		}

	}
}
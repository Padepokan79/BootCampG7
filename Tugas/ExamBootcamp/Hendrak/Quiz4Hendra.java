//Created by : Hendra Kurniawan
//Date : 29 Mei 2018 Time : 8:28 AM - 8:49 AM
//Modified :
import java.util.Scanner;

public class Quiz4Hendra{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] temp = new int[10];
		int shift, i,j=0;
		boolean validasi=false;

		System.out.println("Deret Angka ");
		for(int d : deretAngka){
			System.out.print(d + " ");
		}
		do{
			System.out.print("\nMasukan shift kiri sebanyak : ");
			shift = keyboard.nextInt();
			if(shift>=1 && shift <=10){
			validasi = true;
			}
			else if(shift > 10){
				System.out.println("Maaf, Pergeseran tidak boleh dari sepuluh.");
			}
			else if(shift <= 0){
				System.out.println("Maaf, Pergeseran tidak boleh kurang dari satu.");
			}else{
				System.out.println("Maaf, Input yang diterima hanya berupa angka.");
			}
		}while(!validasi);

		for(i = 0; i < shift;i++){
			temp[i]=deretAngka[i];
		}
		for(i = 0; i < deretAngka.length - shift; i++){
			deretAngka[i]= deretAngka[i+shift];
		}
		for(i=deretAngka.length - shift; i < deretAngka.length; i++){
			deretAngka[i] = temp[j];
			j++;
		}
		for(int d : deretAngka){
			System.out.print(d + " ");
		}
	}
}
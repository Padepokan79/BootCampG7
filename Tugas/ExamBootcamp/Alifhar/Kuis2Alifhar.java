/*
	* created by Alifhar Juliansyah
	* 	29 May 2018		08.42
*/
import java.util.Scanner;

public class Kuis2Alifhar{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int jumlah=0, minInput=2, maxInput=20;
		String input;
		boolean check=false;

		do{
			System.out.print("\nJumlah baris untuk Segitiga Paskal yang akan ditampilkan : ");
			input=scan.nextLine();
			if(input.matches("[0-9]+")){
				jumlah=Integer.parseInt(input);
				if(jumlah<minInput){
					System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2");
					System.out.println("Silahkan input kembali");
				}
				else if(jumlah>maxInput){
					System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20");
					System.out.println("Silahkan input kembali");
				}
				else
					check=true;
			} else{
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				System.out.println("Silahkan input kembali");
			}
		}while(!check);
		int[] curr=new int[jumlah], prev=new int[jumlah];

		for(int index=0; index<jumlah; index++){
			curr[0]=curr[index]=1;
			for(int index2=0; index2<=index; index2++){
				if(index2!=0 && index2!=index)
					curr[index2]=prev[index2]+prev[index2-1];
				System.out.print(curr[index2]+" ");
			}
			System.out.println();
			for(int index3=0; index3<=index; index3++)
				prev[index3]=curr[index3];
		}
	}
}

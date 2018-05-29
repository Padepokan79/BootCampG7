/*
	* created by Alifhar Juliansyah
	* 	29 May 2018		08.28
*/
import java.util.Scanner;

public class Kuis1Alifhar{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int jumlah=0, minInput=5, maxInput=100;
		String input;
		boolean check=false;

		do{
			System.out.print("\nJumlah urutan angka fibonacci yang akan ditampilkan : ");
			input=scan.nextLine();
			if(input.matches("[0-9]+")){
				jumlah=Integer.parseInt(input);
				if(jumlah<minInput)
					System.out.println("Maaf, jumlah angka tidak boleh kurang dari 5");
				else if(jumlah>maxInput)
					System.out.println("Maaf, jumlah angka tidak boleh lebih dari 100");
				else
					check=true;
			} else
				System.out.println("Maaf, input yang diterima hanya berupa angka");
		}while(!check);
		double[] fibonacci=new double[jumlah];

		fibonacci[0]=fibonacci[1]=1;
		for(int index=2; index<jumlah; index++)
			fibonacci[index]=fibonacci[index-1]+fibonacci[index-2];

		for(int index=0; index<fibonacci.length; index++){
			System.out.printf("%.0f",fibonacci[index]);
			if(index!=fibonacci.length-1)
				System.out.print(", ");
		}
		System.out.println();
	}
}
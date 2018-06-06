/*
	* created by Alifhar Juliansyah
	* 	29 May 2018		09.34
*/
import java.util.Scanner;

public class Kuis5Alifhar{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] number1={2, 39, 47, 14, 36, 56, 57, 49, 43, 79}, number2=new int[number1.length+1];
		String input;
		int position=0, minPosition=1, maxPosition=10, add=0, temp=0;
		boolean check=false;

		System.out.println("\nDeretan number :");
		for(int print : number1)
			System.out.print(print+" ");
		System.out.println();

		do{
			System.out.print("\nMasukan Angka yang mau disisipkan : ");
			input=scan.nextLine();
			if(input.matches("[0-9]+")){
				add=Integer.parseInt(input);
				check=true;
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				System.out.println("Silahkan input kembali");
			}
		}while(!check);

		check=false;
		do{
			System.out.print("Sisipkan pada posisi ke : ");
			input=scan.nextLine();
			if(input.matches("[0-9]+")){
				position=Integer.parseInt(input);
				if(position<minPosition){
					System.out.println("Maaf, input posisi tidak boleh kurang dari 1");
					System.out.println("Silahkan input kembali");
				}
				else if(position>maxPosition){
					System.out.println("Maaf, input posisi tidak boleh lebih dari 10");
					System.out.println("Silahkan input kembali");
				}
				else
					check=true;
			} else{
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				System.out.println("Silahkan input kembali");
			}
		}while(!check);

		for(int index=0; index<number2.length; index++){
			if(index!=position-1){
				number2[index]=number1[temp];
				temp++;
			} else
				number2[index]=add;
		}

		System.out.println();
		for(int print : number2)
			System.out.print(print+" ");
		System.out.println();
	}
}
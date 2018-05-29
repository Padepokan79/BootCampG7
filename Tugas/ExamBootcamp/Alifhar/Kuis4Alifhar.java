/*
	* created by Alifhar Juliansyah
	* 	29 May 2018		09.18
*/
import java.util.Scanner;

public class Kuis4Alifhar{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input;
		int[] deretAngka={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int shift=0, minShift=1, maxShift=10, temp, start=0, end=deretAngka.length-1;
		boolean check=false;

		System.out.print("\nDeret angka awal\n{");
		for(int index=0; index<deretAngka.length; index++){
			System.out.print(deretAngka[index]);
			if(index!=end)
				System.out.print(", ");
		}
		System.out.println("}");

		do{
			System.out.print("\nShift ke kiri Sebanyak : ");
			input=scan.nextLine();
			if(input.matches("[0-9]+")){
				shift=Integer.parseInt(input);
				if(shift<minShift){
					System.out.println("Maaf, pergeseran tidak boleh kurang dari 1");
					System.out.println("Silahkan input kembali");
				}
				else if(shift>maxShift){
					System.out.println("Maaf, pergeseran tidak boleh lebih dari 10");
					System.out.println("Silahkan input kembali");
				}
				else
					check=true;
			} else{
				System.out.println("Maaf, input yang diterima hanya berupa angka");
				System.out.println("Silahkan input kembali");
			}
		}while(!check);

		for(int index=0; index<shift; index++){
			temp=deretAngka[start];
			for(int index2=0; index2<deretAngka.length-1; index2++){
				deretAngka[index2]=deretAngka[index2+1];
			}
			deretAngka[end]=temp;
		}

		System.out.print("{");
		for(int index=0; index<deretAngka.length; index++){
			System.out.print(deretAngka[index]);
			if(index!=end)
				System.out.print(", ");
		}
		System.out.println("}");
	}
}
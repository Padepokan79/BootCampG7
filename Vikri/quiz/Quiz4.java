/*
	Created By Vikri
	29/05/2018
	Start : 10:31
	End   : 12:30
*/
import java.util.Scanner;
public class Quiz4{
	public static void main(String[] args) {
		int deretAngka[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] deretAngkaShift = new int[deretAngka.length];
		Scanner scan = new Scanner(System.in);
		int batas = 1000, minBatas = 0, convertShift = 0;
		String shift;
		do{
			System.out.print("Shift ke kiri sebanyak: ");
			shift = scan.next();

			if (shift.matches("[0-9]*")) {
				convertShift = Integer.parseInt(shift);
				if (convertShift>=1&&convertShift<=10) {
					batas = 0;
				} else if(convertShift<1){
					System.out.println("Maaf, Pergeseran tidak boleh kurang dari 1");
				} else {
					System.out.println("Maaf, Pergeseran tidak boleh Lebih dari 10");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka");
			}
			batas--;

		}while(batas > minBatas);

		for (int geser = 0; geser < convertShift; geser++) {
			    for (int index = 0; index < deretAngka.length - 1; index++) {
			        int temp = deretAngka[index];
			        deretAngka[index] = deretAngka[index + 1];
			        deretAngka[index + 1] = temp;
			    }
		}

		for (int index2=0;index2 <= deretAngka.length - 1;  index2++) {
			System.out.print(deretAngka[index2]+" ");
		}		
	}
}
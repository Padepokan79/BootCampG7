package MencariAngka;

import java.util.*;

class ListAngka {

	private static Scanner inputs;
	//{ 4, 3, 2, 4, 2, 6, 2, 5, 5, 7, 5, 3, 5, 3, 3, 23, 4, 6, 4, 3, 4, 4, 2, 2 }
	
	public static void main(String[] args) {
		inputs = new Scanner(System.in);
		int cariAngka, counter = 0, index = 0, mine = 0;

		System.out.print("Silahkan Masukkan Angka yang ingin dicari : ");
		cariAngka = inputs.nextInt();
		
		ArrayList<Integer> deretAngka = new ArrayList<Integer>(Arrays.asList(4, 3, 2, 4, 2, 6, 2, 5, 5, 7, 5, 3, 5, 3, 3, 23, 4, 6, 4, 3, 4, 4, 2, 2));
		
		for(int angkaDeret : deretAngka) {
			
			if(cariAngka == angkaDeret) {
				counter+=1;	
			}
		}
		
		
		System.out.println("Angka " + cariAngka + " ada " + counter + ", ditemukan pada posisi");

		for(int angkaDeret : deretAngka) {
			index+=1;
			
			if(cariAngka == angkaDeret) {
				ArrayList<Integer> listOfIndex = new ArrayList<Integer>();
				listOfIndex.add(index);

				for(int counting : listOfIndex) {
					mine = counting;
					System.out.print(mine + ", ");
				}
			}
		}		
	}
}

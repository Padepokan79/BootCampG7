package soal3;

import java.util.ArrayList;
import java.util.Arrays;
import inputValidation.Input;

/**
 * Created by : Alifhar Juliansyah
 * Jun 22, 2018
 * 1:28:54 PM
 */
public class Soal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(4, 3, 2, 4, 2, 6, 2, 5, 5, 7, 5, 3, 5, 3, 3, 23, 4, 6, 4, 3, 4, 4, 2, 2));
		Input inp=new Input();
		
		int num=inp.integer("Masukan angka : ");
		for(int posisi=1; posisi<=arr.size(); posisi++)
			if(arr.get(posisi-1)==num)
				System.out.print(posisi+" ");
	}

}

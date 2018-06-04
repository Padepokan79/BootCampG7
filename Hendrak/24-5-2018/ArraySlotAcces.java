//Created by :Hendra Kurniawan
//Date : 23 Mei 2018 Time : 3:09 PM
//Modified :
public class ArraySlotAcces
{
	public static void main(String[] args) {
		int[] arr = new int[3];

		//we almost always use a for loop to acces each slot of an array
		for(int i=0 ; i < arr.length ; i++)
		{
			arr[i] = 1 + (int)(Math.random()*100);
		}


		System.out.print("Values: ");
		for(int i = 0; i < arr.length; i ++)
		{
			System.out.print(arr[i] + " ");
		}


		///////////////////////////////////////////
		////Break Step By Step
		////put a number into each

		arr[0] = 6;
		arr[1] = 7;
		arr[2] = 8;

		// then display the value
		System.out.println("\nValues: " + arr[0] + " " +arr[1] + " " + arr[2]);

		//put random
		arr[0] = 1 + (int)(Math.random()*100);
		arr[1] = 1 + (int)(Math.random()*100);
		arr[2] = 1 + (int)(Math.random()*100);


		// then display the value
		System.out.println("Values: " + arr[0] + " " +arr[1] + " " + arr[2]);

		/////////////////////////////////////////
		/////////This is a bit silly

		int m = 0;
		arr[m] = 1 + (int)(Math.random()*100);
		m = 1;
		arr[m] = 1 + (int)(Math.random()*100);
		m = 2;
		arr[m] = 1 + (int)(Math.random()*100);

		//Display them again
		System.out.print("Values: ");
		m=0;
		System.out.print(arr[m] + " ");
		m=1;	
		System.out.print(arr[m] + " ");
		m=2;
		System.out.print(arr[m] + " ");
		
		System.out.println();

		/////////////////////////////////////
		///this is even more silly
		int n =0;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		arr[n] = 1 + (int)(Math.random()*100);
		n++;
		arr[n] = 1 + (int)(Math.random()*100);


		//Display them again
		System.out.print("Values: ");
		n = 0 ;
		System.out.print(arr[n] + " ");
		n++;
		System.out.print(arr[n] + " ");
		n++;
		System.out.print(arr[n] + " ");
		n++;
		System.out.println();

		///////////////////////
		//Now does using a loop ake more sense?
		for (int q =0 ; q < arr.length ; q ++)
		{
			arr[q] =1 + (int)(Math.random()*100);
		}

		// I hope so
		System.out.print("Values: ");
		for(int q=0 ; q < arr.length; q ++)
		{
			System.out.print(arr[q] + " ");
		}
		System.out.println();


	}

}
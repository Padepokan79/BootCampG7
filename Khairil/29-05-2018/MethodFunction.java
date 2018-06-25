/*
	 Program     : Method Function
     Creator     : Khairil
     Created At  : 00 Mei 2018 03:18 PM     
     Updated By  : 
     Update Date : 
*/
import java.util.Scanner;

public class MethodFunction {
	public static void main(String[] args) {

		String [] negara = {"indonesia", "malaysia", "brunei", "jepang", "arab saudi"};
		int [] bilSial = {3,4,5,7,8,9,12,13};
		String [] kucing = {"anggora","persia","russian blue","kampung","siam"};
		int [] angkaGanjil = {1,3,5,7,9,11,13};
		String [] hutan = {"hutan tropis","hutan belantara","hutan galau","hutan lindung"};
		int [] angkaGenap = {2,4,6,8,10,12,14};
		String [] kue = {"tart","brownies","basah","bolu"};
		int [] bilRenta = {10,20,30,40,50,60};
		String [] kota = {"bandung","jakarta","medan","surabaya","semarang"};
		int [] dadu = {1,2,3,4,5,6};

		printString(negara);
		printInt(bilSial);
		printString(kucing);
		printInt(angkaGanjil);
		printString(hutan);
		printInt(angkaGenap);
		printString(kue);
		printInt(bilRenta);
		printString(kota);
		printInt(dadu);
	}

	public static void printString(String[] arrMode) {
		for(String printArr : arrMode) {
			System.out.print(printArr + " ");
		}
		System.out.println();
	}

	public static void printInt(int[] arrMode) {
		for(int printArr1 : arrMode) {
			System.out.print(printArr1 + " ");
		}
		System.out.println();		
	}
}
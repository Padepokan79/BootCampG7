package Class;
import java.lang.reflect.GenericArrayType;
import java.util.*;
public class RunGaji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Karyawan k1 = new Karyawan("rio", "123123", "senpai", "oop", 5);
//		
//		System.out.println("hasil : "+k1.getNama());
//		System.out.println("hasil : "+k1.getNik());
//		System.out.println("hasil : "+k1.getLvlKaryawan());
//		System.out.println("hasil : "+k1.getPenempatanKerja());
//		System.out.println("hasil : "+k1.getMasaKerja());
		
		Programmer p1 = new Programmer("rio", "13212", "junior", "jakarta", 4, "y", 2);
		System.out.println("umk 	  : "+p1.calculateGapok());
		System.out.println("level : "+p1.getLvlprog());
		System.out.println("total gapok : "+p1.calculateGapok());

	}

}

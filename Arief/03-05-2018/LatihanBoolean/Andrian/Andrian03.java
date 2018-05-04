/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Andrian03{
	public static void main( String[] args ){
		Scanner inputKey = new Scanner(System.in);
		
		double luasTanah, minLuasTanah, minLuasTanah2;
		int lantai, minLantai, garasi, minGarasi, pool, minPool, flora, minFlora, minFlora2;
		boolean allowed1, allowed2, allowed3, goal;

		minLuasTanah = 0.3;
		minLuasTanah2 = 0.7;
		minLantai = 3;
		minGarasi = 3;
		minPool = 2;
		minFlora = 5;
		minFlora2 = 8;


		System.out.println( "Property Finder" );
		System.out.println();

		System.out.print( "Luas Tanah: " );
		luasTanah = inputKey.nextDouble();

		System.out.print( "Jumlah Lantai: " );
		lantai = inputKey.nextInt();

		System.out.print( "Jumlah kendaraan di dalam Garasi: " );
		garasi = inputKey.nextInt();

		System.out.print( "Jumlah Kolam Renang: " );
		pool = inputKey.nextInt();

		System.out.print( "Jumlah Flora: " );
		flora = inputKey.nextInt();

		allowed1 = (luasTanah > minLuasTanah && lantai > minLantai && garasi > minGarasi && pool >= minPool && flora >= minFlora);
        allowed2 = (luasTanah > minLuasTanah && lantai > minLantai && garasi > minGarasi && pool < minPool && flora >= minFlora2);
        allowed3 = (luasTanah > minLuasTanah2 && lantai < minLantai && garasi >minGarasi && pool >= minPool && flora >= minFlora);

        goal = (allowed1 || allowed2 || allowed3);

		System.out.println( "Rumah Impian? " + goal);

	}
}
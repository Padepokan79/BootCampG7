/*
	* Created by:	Alifhar Juliansyah
	* 				01-05-2018	14.31
	* Updated by:
	*
*/

public class Yana3{
	public static void main(String[] args){
		System.out.println("Perjalanan dari kosan Arief ke persimpangan 1 berjarak 300 meter");
		System.out.println("persimpangan ke-1 ke persimpangan ke-2 berjarak 200 meter,");
		System.out.println("dari persimpangan ke-2 ke kantor 79 berjarak 250 meter");
		System.out.println("Setiap 100 meter ditempuh 120 detik dengan jalan kaki dan 60 detik menggunakan motor.");
		System.out.println("Jika Arief pergi dari kosan ke persimpangan ke-2 dengan berjalan kaki, dan diambung motor,");
		System.out.println("berapa waktu tempuh perjalan Arief dari kosan ke kantor 79?");

		double simpang1, simpang2, kantor, jalan, motor, waktu;
		simpang1=300; simpang2=200; kantor=250;
		jalan=100.0/120.0; motor=100.0/60.0;

		waktu=(simpang1+simpang2)/jalan+kantor/motor;
		System.out.println("\nWaktu tempuh Arief adalah "+waktu+" detik");
	}
}
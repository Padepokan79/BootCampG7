/*
created by : Malik chaudhary
time : 10-05-2018 3:51AM 
soal :

Kamu ingin tau bagaimana orang menilai kamu. Apakah kamu orang yang baik atau tidak.
Parameter orang yang baik adalah
1. Kamu memiliki teman baik lebih dari 13
2. Kamu memiliki pelanggaran kriminal tidak lebih dari 7 kali namun masih dianggap baik apabila hanya melanggar 2 kali saja
3. Kamu murah senyum atau tidak

apabila 2 dari 3 syarat tersebut dipenuhi maka kamu layak menjadi orang yang baik!

*/
import java.util.Scanner;
public class RichaBoolean2{
	public static void main(String[] args){

		Scanner nilai = new Scanner(System.in);

		String nama, smile;
		int teman, kriminal, minTeman, maxKriminal;
		boolean hasil, senyum, tidak;

		System.out.print("Hai kamu ingin tahu kan bagaimana orang menilaimu?");
		System.out.print("Isi penilaian di bawah ini ya :)\n");
		System.out.print("++++++++++++++++++++++++++++++++++++++++++++++++++\n");

		System.out.print("Nama : ");
 		nama = nilai.next();

 		System.out.print("Berapa teman baik yang kamu punya, Richa : ");
 		teman = nilai.nextInt();

 		System.out.print("Apakah kamu pernah melakukan pelanggaran kriminal sebelumnya? kalo iya, berapa kali : ");
 		kriminal = nilai.nextInt();

 		System.out.print("Menurutmu kamu murah senyum atau tidak : ");
 		smile = nilai.next();

 		minTeman = 13;
 		maxKriminal = 7;

 		senyum = smile.equals("senyum");
 		tidak = smile.equals("tidak"); 

 		hasil = ( ( teman > minTeman || kriminal <= maxKriminal ) || senyum );
		System.out.print("Apakah " + nama + " adalah orang yang baik?" +hasil);
		System.out.print("\nTerimakasih! teruslah menjadi orang yang baik yaa");

	}
}
/*
created by : Malik Chaudhary
time : 15-05-2018 2:28PM
Soal :
seorang nene akan memberikan hadiah mobil apabila cucunya yang laki-laki mempunyai istri 1 dan anak lebih dari 2, 
atau istri lebih dari 2 & anak 1

*/
import java.util.Scanner;
public class VikriIf1{
	public static void main(String[] args){
		Scanner nene = new Scanner(System.in);

		String kelamin;
		int istri, anak;
		boolean cowo;

		System.out.print("jenis kelamin (pria/wanita) : ");
		kelamin = nene.next();

		System.out.print("berapa istri : ");
		istri = nene.nextInt();
		System.out.print("berapa anak : ");
		anak = nene.nextInt();

		cowo = kelamin.equals("pria");

		if ( (cowo && istri == 1 && anak > 2) || ( cowo && istri > 2 && anak == 1 ) ) {
			System.out.print("Selamat kamu dapat mobil");
		}else{
			System.out.print("Maaf kamu kurang beruntung");
		}

	}
}
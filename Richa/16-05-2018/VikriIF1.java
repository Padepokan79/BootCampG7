import java.util.Scanner;

public class VikriIF1 {
	public static void main (String [] args) {
	Scanner keyboard = new Scanner (System.in);

	int jmlIstri, jmlAnak;

	System.out.println("============================");
	System.out.print("Jumlah istri : ");
	jmlIstri= keyboard.nextInt ();
	System.out.print("Jumlah anak : ");
	jmlAnak = keyboard.nextInt ();

	if ((jmlIstri == 1 && jmlAnak > 2) || (jmlIstri >2 && jmlAnak ==1)) {
		System.out.println("Selamat kamu mendaptkan hadiah! :)");
	}
	else {
		System.out.println("Maaf kamu tidak akan mendaptkan hadiah :(");
	}

}
}


/*
1. seorang nene akan memberikan hadiah mobil apabila cucunya yang laki-laki mempunyai istri 1 dan anak lebih dari 2, atau istri lebih dari 2 & anak 1*/

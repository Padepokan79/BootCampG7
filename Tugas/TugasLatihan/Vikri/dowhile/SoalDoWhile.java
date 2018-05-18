/*
	Created By vikri
	18/05/2018
	12:54
*/
public class SoalDoWhile{
	public static void main(String[] args) {
		int angka = 1;
		do{
			if ((angka%2)==1) {
				System.out.println("Angka "+angka+" adalah ganjil");
				angka = angka + 4;
			}
		}while(angka <= 1000);
	}
}

/*
public class SoaLatihan{
	public static void main(String[] args) {
		int angka = 1;
		while(angka <= 1000){
			if ((angka%2)==1) {
				System.out.println("Angka "+angka+" adalah ganjil");
				angka = angka + 4;
			}
		}
	}
}
*/
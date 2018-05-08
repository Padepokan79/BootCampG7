public class Ex6Drills2{
	public static void main(String[] args){
		int uangAsal, uangCendol, uangUndian, uangHadiah, uangHutang, hasil;

		uangAsal   = 100;
		uangCendol = 5;
		uangUndian = 20;
		uangHadiah = 250;
		uangHutang = 85;

		hasil = uangAsal - uangCendol - uangUndian + uangHadiah - uangHutang;
		System.out.print("Uang uus sekarang Rp. " + hasil + " ribu");
	}
}
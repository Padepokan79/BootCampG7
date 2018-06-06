package bangun2D3D;

public class Validation {

	public static boolean angka(String str) {
		if(str.matches("-?[0-9]+"))
			return true;
		else {
			System.out.println("Inputan tidak boleh huruf");
			return false;
		}
	}

	public static boolean angkaBawah(String str, int batas) {
		if(str.matches("-?[0-9]+")) {
			int number=Integer.parseInt(str);
			if(number<batas) {
				System.out.println("Angka tidak boleh kurang dari "+batas);
				return false;
			}
			else
				return true;
		}
		else {
			System.out.println("Inputan tidak boleh huruf");
			return false;
		}
	}
	
	public static boolean angkaAtas(String str, int batas) {
		if(str.matches("-?[0-9]+")) {
			int number=Integer.parseInt(str);
			if(number>batas) {
				System.out.println("Angka tidak boleh lebih dari "+batas);
				return false;
			}
			else
				return true;
		}
		else {
			System.out.println("Inputan tidak boleh huruf");
			return false;
		}
	}

	public static boolean angkaBatas(String str, int batasBawah, int batasAtas) {
		if(str.matches("-?[0-9]+")) {
			int number=Integer.parseInt(str);
			if(number<batasBawah) {
				System.out.println("Angka tidak boleh kurang dari "+batasBawah);
				return false;
			}
			else if(number>batasAtas) {
				System.out.println("Angka tidak boleh lebih dari "+batasAtas);
				return false;
			}
			else
				return true;
		}
		else {
			System.out.println("Inputan tidak boleh huruf");
			return false;
		}
	}

}

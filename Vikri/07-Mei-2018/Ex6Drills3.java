public class Ex6Drills3{
	public static void main(String[] args) {
		int detik, menit, menit2, jam, jam2, java, c;
		
		java = 6500;
		c = 3320;
		detik = java + c;

		jam = detik/3600;
		jam2 = detik%3600;

		menit = jam2/60;
		menit2 = jam2%60;

		detik = menit2;

		System.out.println("Lama Deo Belajar adalah "+jam+" Jam "+menit+" Menit "+detik+" Detik");
	}
}
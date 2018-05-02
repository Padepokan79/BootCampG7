public class Yana3 {
	public static void main (String[] args) {

		double simpang1, simpang2, end, jalan, motor, waktu;

		simpang1 = 300; // dalam meter
		simpang2 = 200;// dalam meter
		end = 250; // dalam meter
		jalan = 120; //kecepatan dalam detik per 100 meter
		motor = 60; // kecepatan dalam detik per 100 meter

		waktu = (((simpang1+simpang2)/100)*jalan) + ((end/100)*motor); // dalam detik

		System.out.println ("Perjalanan dari kosan Arief ke kantor 79 melewati 2 persimpangan, dari kosan ke\npersimpangan ke-1 berjarak 300 meter, dari persimpangan ke-1 ke persimpangan\nke-2 berjarak 200 meter, dari persimpangan ke-2 ke kantor 79 berjarak 250\nmeter. Setiap 100 meter dapat ditempuh selama 120 detik dengan jalan kaki dan\n60 detik menggunakan motor. Jika Arief pergi dari kosan ke persimpangan ke-2 dengan\nberjalan kaki, kemudian dari persimpangan ke-2 ke kantor 79 menggunakan motor,\nberapa waktu tempuh perjalan Arief dari kosan ke kantor 79?");
		System.out.println ("Waktu total yang ditempuh oleh Arief adalah " + waktu + "detik");
	}
}
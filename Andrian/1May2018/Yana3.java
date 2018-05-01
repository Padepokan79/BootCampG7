/* 	Date 		: 1/5/2018    
	Time 		: 11:12:45
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	public class Yana3 {
		public static void main( String[] args) {
			double persimpangan1, persimpangan2,kantor79,jalankaki,motor,perjalanan1,perjalanan2;

			persimpangan1 = 300; 
			persimpangan2 = 200;
			kantor79 = 250;
			jalankaki = 100.0/120.0;
			motor = 100.0/60.0;

			perjalanan1 = (persimpangan1 + persimpangan2)/jalankaki;
			perjalanan2 = (kantor79)/motor;

			System.out.println("Perjalanan dari kosan Arief ke kantor 79 melewati 2 persimpangan, dari kosan ke\npersimpangan ke-1 berjarak 300 meter, dari persimpangan ke-1 ke persimpangan\nke-2 berjarak 200 meter, dari persimpangan ke-2 ke kantor 79 berjarak 250\nmeter. Setiap 100 meter dapat ditempuh selama 120 detik dengan jalan kaki dan\n60 detik menggunakan motor. Jika Arief pergi dari kosan ke persimpangan ke-2 dengan\nberjalan kaki, kemudian dari persimpangan ke-2 ke kantor 79 menggunakan motor,\nberapa waktu tempuh perjalan Arief dari kosan ke kantor 79?");
			System.out.println("berapa waktu tempuh arif " +(perjalanan1 + perjalanan2));

		}
	}
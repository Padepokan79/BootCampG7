/*
     Creator     : Khairil
     Created At  : 1 Mei 2018 15:25 PM     
     Updated By  : 
     Update Date : 
*/
class Yana3 {
	public static void main(String[] args) {
		double kosanKeSimpang1, simpang1KeSimpang2, simpang2KeTujuh, tempuhJalan, waktuTempuh, waktuTempuhMotor, waktuTempuhJalan;

		kosanKeSimpang1 = 300;
		simpang1KeSimpang2 = 200;
		simpang2KeTujuh = 250;
		waktuTempuhJalan = 1.2;
		waktuTempuhMotor = 6;
		tempuhJalan = kosanKeSimpang1 + simpang1KeSimpang2;
		waktuTempuh = (tempuhJalan / waktuTempuhJalan) + (simpang2KeTujuh / waktuTempuhMotor);
		System.out.println("Jarak Kosan ke Simpang 1   : " + kosanKeSimpang1 + " m");
		System.out.println("Jarak simpang1 Ke Simpang2 : " + simpang1KeSimpang2 + " m");
		System.out.println("Jarak simpang2 ke 79       : " + simpang2KeTujuh + "m");
		System.out.printf("Waktu Tempuh                : %.2f", waktuTempuh);
	}
}

/*
Perjalanan dari kosan Arief ke kantor 79 melewati 2 persimpangan, dari kosan ke 
persimpangan ke-1 berjarak 300 meter, dari persimpangan ke-1 ke persimpangan 
ke-2 berjarak 200 meter, dari persimpangan ke-2 ke kantor 79 berjarak 250 
meter. Setiap 100 meter dapat ditempuh selama 120 detik dengan jalan kaki dan 
60 detik menggunakan motor. Jika Arief pergi dari kosan ke persimpangan ke-2 dengan 
berjalan kaki, kemudian dari persimpangan ke-2 ke kantor 79 menggunakan motor, 
berapa waktu tempuh perjalan Arief dari kosa	n ke kantor 79?
*/
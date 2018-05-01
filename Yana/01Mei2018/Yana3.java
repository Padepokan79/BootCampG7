/*
created by 	: Yana
time		: 1 Mei 2018

3. Perjalanan dari kosan Arief ke kantor 79 melewati 2 persimpangan, dari kosan ke 
persimpangan ke-1 berjarak 300 meter, dari persimpangan ke-1 ke persimpangan 
ke-2 berjarak 200 meter, dari persimpangan ke-2 ke kantor 79 berjarak 250 
meter. Setiap 100 meter dapat ditempuh selama 120 detik dengan jalan kaki dan 
60 detik menggunakan motor. Jika Arief pergi dari kosan ke persimpangan ke-2 dengan 
berjalan kaki, kemudian dari persimpangan ke-2 ke kantor 79 menggunakan motor, 
berapa waktu tempuh perjalan Arief dari kosan ke kantor 79?
*/

public class Yana3{
	public static void main(String[] args){

		double jarakKosanP1, jarakP1P2, jarakP2Kantor, jarakTempuh, waktuTempuhJalan, waktuTempuhMotor, totalWaktuTempuh;

		jarakKosanP1			= 300.0;
		jarakP1P2				= 200.0;
		jarakP2Kantor			= 250.0;
		jarakTempuh				= 100.0;
		waktuTempuhJalan		= 120.0;
		waktuTempuhMotor		= 60.0;
		totalWaktuTempuh		= ((jarakKosanP1 + jarakP1P2) / jarakTempuh * waktuTempuhJalan) + (jarakP2Kantor / jarakTempuh * waktuTempuhMotor);

		System.out.println("Total waktu tempuh dari kosan ke kantor adalah "+totalWaktuTempuh+ " detik");
	}
}
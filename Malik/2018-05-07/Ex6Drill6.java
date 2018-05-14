/*
nama : Malik Chaudhary
time : 07-05-2018 2:52PM

*/
public class Ex6Drill6{
	public static void main(String[] args){
		int bonus, bonusApril, bonusJuni, projectApril, projectJuni, lemburApril, lemburMei, lemburJuni, umkb, umkj, tunjanganTransportasi;
		double gajiPokok, tunjanganKesehatan, uangLembur, uangLemburApril, uangLemburMei, uangLemburJuni, pph, takeHomePayApril, takeHomePayMei, takeHomePayJuni, totalTakeHomePay, takeHomePayTigaBulan, gajiBulanan;

		umkj = 3648035;


		// wilayah bandung bulan april
		umkb = 3091446;

		projectApril = 2;

		lemburApril  = 10;

		gajiPokok = 1.2*umkb;
		tunjanganKesehatan    = 0.02*gajiPokok; 
		bonus                 = 500000; // bonus untuk setiap projek
		bonusApril            = bonus*projectApril;
		uangLembur            = 1.5*1/173*gajiPokok; // per jam
		uangLemburApril       = uangLembur*lemburApril;
		tunjanganTransportasi = 750000; //mendapat tunjangan bila di luar kota bandung
		gajiBulanan           = gajiPokok+bonusApril+uangLemburApril+tunjanganKesehatan;

		pph                   = 0.5*gajiBulanan;
		takeHomePayApril      = gajiBulanan-pph;

		System.out.println("Salary Bulan April");
		System.out.println("*********************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*********************************");
		System.out.println("Gaji Pokok : "+gajiPokok);
		System.out.println("T. Kesehatan :"+tunjanganKesehatan);
		System.out.println("Bonus : "+bonusApril);
		System.out.println("Lembur : "+uangLemburApril);
		System.out.println();
		System.out.println("PPH : "+pph);
		System.out.println("=================================");
		System.out.println("Take Home Pay : "+takeHomePayApril);
		System.out.println("=================================");


		System.out.println();
		System.out.println();

		// wilayah bandung bulan Mei
		umkb = 3091446;

		lemburMei  = 5;

		gajiPokok = 1.2*umkb;
		tunjanganKesehatan    = 0.02*gajiPokok; 
		
		uangLembur            = 1.5*1/173*gajiPokok; // per jam
		uangLemburMei         = uangLembur*lemburMei;
		gajiBulanan           = gajiPokok+uangLemburMei+tunjanganKesehatan;

		pph                   = 0.5*gajiBulanan;
		takeHomePayMei        = gajiBulanan-pph;

		System.out.println("Salary Bulan Mei");
		System.out.println("*********************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*********************************");
		System.out.println("Gaji Pokok : "+gajiPokok);
		System.out.println("T. Kesehatan :"+tunjanganKesehatan);
		System.out.println("Bonus : ");
		System.out.println("Lembur : "+uangLemburMei);
		System.out.println();
		System.out.println("PPH : "+pph);
		System.out.println("=================================");
		System.out.println("Take Home Pay : "+takeHomePayMei);
		System.out.println("=================================");


		System.out.println();
		System.out.println();

		// wilayah bandung bulan april
		umkj = 3648035;

		projectJuni = 1;

		lemburJuni  = 12;

		gajiPokok = 1.2*umkj;
		tunjanganKesehatan    = 0.02*gajiPokok; 
		bonus                 = 500000; // bonus untuk setiap projek
		bonusJuni             = bonus*projectJuni;
		uangLembur            = 1.5*1/173*gajiPokok; // per jam
		uangLemburJuni        = uangLembur*lemburJuni;
		tunjanganTransportasi = 750000; //mendapat tunjangan bila di luar kota bandung
		gajiBulanan           = gajiPokok+bonusJuni+uangLemburJuni+tunjanganKesehatan+tunjanganTransportasi;
		pph                   = 0.5*gajiBulanan;
		takeHomePayJuni       = gajiBulanan-pph;

		System.out.println("Salary Bulan Juni");
		System.out.println("*********************************");
		System.out.println("Nama : Nurwan");
		System.out.println("Posisi : Programmer");
		System.out.println("*********************************");
		System.out.println("Gaji Pokok : "+gajiPokok);
		System.out.println("T. Kesehatan :"+tunjanganKesehatan);
		System.out.println("Bonus : "+bonusJuni);
		System.out.println("Lembur : "+uangLemburJuni);
		System.out.println();
		System.out.println("PPH : "+pph);
		System.out.println("=================================");
		System.out.println("Take Home Pay : "+takeHomePayJuni);
		System.out.println("=================================");

		System.out.println();
		System.out.println();

		totalTakeHomePay = takeHomePayApril+takeHomePayJuni+takeHomePayMei;
		System.out.println("Take Home Pay selama 3 bulan : "+totalTakeHomePay);



	}
}
//createby:Hendra Kurniawan 
//Date:17 Mei 2018 Time:13:31
//Modified by :
public class ProgrammerNurwan{
	public static void main(String[] args) {
	double umkBandung, umkJakarta,bonusProject, tunjanganKesehatanBulan, bonusProjectBulan;
	double gajiPokok, tunjanganKesehatan, bonusProjectApril, uangLembur, gajiPerbulan;
	double gajiPokokMei, tunjanganKesehatanMei, bonusProjectMei, uangLemburMei;
	double gajiPokokJuni, tunjanganKesehatanJuni, bonusProjectJuni, uangLemburJuni, tunjanganTransportasiJuni;

	bonusProject = 500000;
	umkBandung = 3091446;
	umkJakarta = 3648035;

	//salary bulan april
	gajiPokok = umkBandung + umkBandung * 0.2;
	tunjanganKesehatan = gajiPokok * 0.02;
	bonusProjectApril= 2 * bonusProject;
	uangLembur = 1.5 * 1/173 * gajiPokok * 10;

	//salary bulan Mei
	gajiPokokMei = umkBandung + umkBandung * 0.2;
	tunjanganKesehatanMei = gajiPokokMei * 0.02;
	bonusProjectMei = 0;
	uangLemburMei = 1.5 * 1/173 * gajiPokokMei * 5;

	//salary bulan Juni
	gajiPokokJuni = umkJakarta + umkJakarta * 0.2;
	tunjanganKesehatanJuni = gajiPokokJuni * 0.02;
	bonusProjectJuni = 1 * bonusProject;
	uangLemburJuni = 1.5 * 1/173 * gajiPokokJuni * 12;


	gajiPerbulan = gajiPokok + gajiPokokMei + gajiPokokJuni;
	tunjanganKesehatanBulan = tunjanganKesehatan + tunjanganKesehatanMei + tunjanganKesehatanJuni;
	bonusProjectBulan = bonusProjectApril + bonusProjectJuni;
	//salary bulan april
	System.out.println("Salary Bulan April");
	System.out.println("*************************");
	System.out.println("Nama   : Nurwan     ");
	System.out.println("Posisi : Programmer ");
	System.out.println("*************************");
	System.out.printf("Gaji Pokok    :Rp %.0f", gajiPokok);
	System.out.printf("\nT.Kesehatan   :Rp %.0f", tunjanganKesehatan);
	System.out.printf("\nBonus         :Rp %.0f", bonusProjectApril);	

	//salary bulan mei
	System.out.println("\n\nSalary Bulan Mei");
	System.out.println("*************************");
	System.out.println("Nama   : Nurwan     ");
	System.out.println("Posisi : Programmer ");
	System.out.println("*************************");
	System.out.printf("Gaji Pokok    :Rp %.0f", gajiPokokMei);
	System.out.printf("\nT.Kesehatan   :Rp %.0f", tunjanganKesehatanMei);
	System.out.printf("\nBonus         :Rp %.0f", bonusProjectMei);

	//salary bulan juni
	System.out.println("\n\nSalary Bulan Juni");
	System.out.println("*************************");
	System.out.println("Nama   : Nurwan     ");
	System.out.println("Posisi : Programmer ");
	System.out.println("*************************");
	System.out.printf("Gaji Pokok    :Rp %.0f", gajiPokokJuni);
	System.out.printf("\nT.Kesehatan   :Rp %.0f", tunjanganKesehatanJuni);
	System.out.printf("\nBonus         :Rp %.0f", bonusProjectJuni);	
	

	}


}

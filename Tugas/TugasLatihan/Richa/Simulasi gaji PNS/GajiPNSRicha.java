/* 
Created by  		: Richa Fitria
Date/hour			: 23 Mei 2018/ 11.11 AM
Updated by			:
Updated Date/hour	:

*/

import java.util.Scanner;
import java.util.Random;

public class GajiPNSRicha {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);

		String bulan="Mei", tahun="2018", nip = " ", masaKerja = " ", jmlAnak = " ", namaLengkap, golonganInput, jabatan, eselonInput="a", nikahInput, pendidikanInput, inputPapua, inputRumah, tunjLain;
		String keahlian =" ", tunjTransport = " ", tunjSeminar = " ", tunjListrik = " ", besarTunjLain = " ";
		int index, jmlAnakInt, hargaBeras = 14000, beratBeras=10, hargaRumahDinas = 450000, masaKerjaInt;
		double tunjNikah = 0, tunjAnak=0, tunjStruk=0, tunjFung=0, tunjUmum=0, tunjBeras=0, tunjPapua=0, taperum=0, tunjPajak, tunjTransportInt=0, tunjSeminarInt=0, tunjListrikInt=0, besarTunjLainInt=0;
		double gapok=0, penghasilanKotor=0, penghasilanBersih, rumahDinas=0, iwp, penghasilanFix;
		double ptkp=0, pkp, pph, pph1=0.05, pph2=0.15, pph3=0.25, pph4 =0.3, pphSetaun, pphSetaun1=0, pphSetaun2=0, pphSetaun3=0, pphSetaun4=0;
		int panjangMaksNama = 32, panjangMinNama = 1, jumlahMaksNIP = 18, jumlahMinNIP = 12;
		int validName = 1, validNIP=1, validGol =1, validMasaKerja = 1, validPendidikan=1, validJabatan =1, validNikah=1, validRumah =1, validPapua = 1;
		int validJmlAnak=1, validEselon = 0, validKeahlian =0, validTrans = 0, validSeminar =0, validListrik =0, validLain = 0;

		String [] jenisGolongan = {"IA", "IB", "IC", "ID", "IIA", "IIB", "IIC", "IID", "IIIA", "IIIB", "IIIC", "IIID", "IVA", "IVB", "IVC", "IVD", "IVD", "IVE"};
		String [] jenisPendidikan = {"SD", "SMP", "SMA", "SMK", "S1", "S2", "S3"};
		String [] jenisEselon = {"Ia", "Ib", "IIa","IIb","IIIa","IIIb","IVa","IVb","Va"};

		//golongan 1
		int [] gapokIA = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600};
		int [] gapokIB = {1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2355200};
		int [] gapokIC = {1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800};
		int [] gapokID = {1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700};
		//golongan 2
		int [] gapokIIA = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
		int [] gapokIIB = {2103300,2103300,2169500,2169500,2237900,2237900,2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900};
		int [] gapokIIC = {2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600}; 
		int [] gapokIID = {2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200, 3638200};
		//golongan 3
		int [] gapokIIIA = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800};
		int [] gapokIIIB = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400};
		int [] gapokIIIC = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300};
		int [] gapokIIID = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800};
		//golongon 4
		int [] gapokIVA = {2899500,2899500,2990800,2990800,3085000,3085000,3182100,3182100,3282400,3282400,3385700,3385700,3492400,3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3953600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000};
		int [] gapokIVB = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3528900, 3528900, 3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400};
		int [] gapokIVC = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400};
		int [] gapokIVD = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4913200, 5068000, 5068000, 5227600, 5227600, 5392200};
		int [] gapokIVE = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};
		//golongan eselonInput
		int [] arrEselon = {5500000, 4375000, 3250000, 2025000, 1260000, 980000, 540000, 490000};
		//tunjangan umum
		int [] arrTunjUmum = {175000, 180000, 185000, 190000};
		//tunjangan fungsional
		int [] arrTunjFung1 = {300000, 400000, 500000, 60000};
		int [] arrTunjFung2 = {700000, 800000, 900000, 100000};
		//tunjangan papua 
		int [] arrTunjPapua = {200000, 225000, 250000, 275000, 300000, 325000, 350000, 375000, 425000, 450000, 475000, 500000, 525000, 550000, 575000, 600000, 625000};
		//taperum
		int [] arrTaperum = {3000, 5000, 7000, 10000};


		System.out.println("=========================================================");
		System.out.println("                        GAJI PNS                         ");
		System.out.println("=========================================================");
		System.out.println();
	
		do {
			System.out.print("Nama Lengkap: ");
			namaLengkap = keyboard2.nextLine ();
			System.out.println(namaLengkap.length());
			if (namaLengkap.matches ("[A-Z,. a-z]+") && namaLengkap.length() <= panjangMaksNama && namaLengkap.length() >= panjangMinNama) {
				validName=1;
			}
			else {
				System.out.println("Maaf input Nama salah. Mohon ulangi lagi!");
				System.out.println();
				validName=0;
			}
		} while (validName==0);
		
		do {	
			System.out.print("NIP: ");
			nip = keyboard.next ();
			System.out.println(nip.length());
			if (nip.matches ("[0-9]+") && nip.length() <= jumlahMaksNIP && nip.length() >= jumlahMinNIP) {
				validNIP=1;
			}
			else {
				System.out.println("Maaf input NIP salah. Mohon ulangi lagi!");
				System.out.println();
				validNIP=0;
			}
		} while (validNIP==0);



		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Selamat datang, " + namaLengkap+ " !");
		System.out.println("NIP: " + nip);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("---------------------------------------------------------");
		System.out.println("                       PENGGOLONGAN                      ");
		System.out.println("---------------------------------------------------------");

 		do {
 			System.out.print ("Golongan: ");
 			golonganInput= keyboard.next ();
 			boolean ValidGolInput = false;
 			for (String golongan : jenisGolongan) {
 				if (golonganInput.equals(golongan)) {
 					validGol=1;
 					ValidGolInput = true;
 				}
 			} 

 			if (ValidGolInput==false) {
 				System.out.println("Golongan " + golonganInput+ " tidak ada. Mohon ulangi!");
 				System.out.println();
 				validGol = 0;
 			}
 		} while (validGol==0);
 			
 		do{
 			System.out.print("Berapa lama masa kerja Anda dalam golongan " + golonganInput + " ? ");
 			masaKerja = keyboard.next ();
 			if (masaKerja.matches ("[0-9]+") && Integer.parseInt(masaKerja)>3) {
 				validMasaKerja=1;
 			}
 			else if ((golonganInput.equals("IB") || golonganInput.equals ("IC") || golonganInput.equals ("ID") || golonganInput.equals ("IIB") || golonganInput.equals ("IIC") || golonganInput.equals ("IID")) && Integer.parseInt(masaKerja)<=3) {
 				validMasaKerja =0;
 			}
 			else if ((!golonganInput.equals("IB") || !golonganInput.equals ("IC") || !golonganInput.equals ("ID") || !golonganInput.equals ("IIB") || !golonganInput.equals ("IIC") || !golonganInput.equals ("IID")) && Integer.parseInt(masaKerja)<=3) {
 				validMasaKerja =1;
 			}
 			else {
 				System.out.println("Maaf input masa kerja salah. Mohon ulangi lagi!");
 				System.out.println();
 				validMasaKerja=0;
 			}
 		} while (validMasaKerja==0);
 		masaKerjaInt = Integer.parseInt (masaKerja);
 		

 		if (golonganInput.equals("IA")) {
			if (masaKerjaInt>gapokIA.length) {
				gapok =  gapokIA [gapokIA.length-1];
			}
			else {
				gapok = gapokIA[masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IB")) {
			if (masaKerjaInt>gapokIB.length) {
				gapok =  gapokIB [gapokIB.length-1];
			}
			else {
				gapok = gapokIB [masaKerjaInt-3];
			}	
 		}
 		if (golonganInput.equals("IC")) {
			if (masaKerjaInt>gapokIC.length) {
				gapok =  gapokIC [gapokIC.length-1];
			}
			else {
				gapok = gapokIC [masaKerjaInt-3];
			}
 		}
 		if (golonganInput.equals("ID")) {
			if (masaKerjaInt>gapokID.length) {
				gapok =  gapokID [gapokID.length-1];
			}
			else {
				gapok = gapokID [masaKerjaInt-3];
			}
 		}
 		if (golonganInput.equals("IIA")) {
			if (masaKerjaInt>gapokIIA.length) {
				gapok =  gapokIIA [gapokIIA.length-1];
			}
			else {
				gapok = gapokIIA [masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IIB")) {
			if (masaKerjaInt>gapokIIB.length) {
				gapok =  gapokIIB [gapokIIB.length-1];
			}
			else {
				gapok = gapokIIB [masaKerjaInt-3];
			}
 		}
 		if (golonganInput.equals("IIC")) {
			if (masaKerjaInt>gapokIIC.length) {
				gapok =  gapokIIC [gapokIIC.length-1];
			}
		 	else {
				gapok = gapokIIC [masaKerjaInt-3];
			}
 		}
 		if (golonganInput.equals("IID")) {
			if (masaKerjaInt>gapokIID.length) {
				gapok =  gapokIID [gapokIID.length-1];
			}
			else {
				gapok = gapokIID [masaKerjaInt-3];
			}
 		}
 		if (golonganInput.equals("IIIA")) {
			if (masaKerjaInt>gapokIIIA.length) {
				gapok =  gapokIIIA [gapokIIIA.length-1];
			}
			else {
				gapok = gapokIIIA [masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IIIB")) {
			if (masaKerjaInt>gapokIIIB.length) {
				gapok =  gapokIIIB [gapokIIIB.length-1];
			}
			else {
				gapok = gapokIIIB [masaKerjaInt];
			}
 		} 		
 		if (golonganInput.equals("IIIC")) {
			if (masaKerjaInt>gapokIIIC.length) {
				gapok =  gapokIIIC [gapokIIIC.length-1];
			}
		    else {
				gapok = gapokIIIC [masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IIID")) {
			if (masaKerjaInt>gapokIIID.length) {
				gapok =  gapokIIID [gapokIIID.length-1];
			}
			else {
				gapok = gapokIIID [masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IVA")) {
			if (masaKerjaInt>gapokIVA.length) {
				gapok =  gapokIVA [gapokIVA.length-1];
			}
			else {
				gapok = gapokIVA [masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IVB")) {
			if (masaKerjaInt>gapokIVB.length) {
				gapok =  gapokIVB [gapokIVB.length-1];
			}
			else {
				gapok = gapokIVB [masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IVC")) {
			if (masaKerjaInt>gapokIA.length) {
				gapok =  gapokIA [gapokIA.length-1];
			}
			else {
				gapok = gapokIVC [masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IVD")) {
			if (masaKerjaInt>gapokIVD.length) {
				gapok =  gapokIVD [gapokIVD.length-1];
			}
			else  {
				gapok = gapokIVD [masaKerjaInt];
			}
 		}
 		if (golonganInput.equals("IVE")) {
			if (masaKerjaInt>gapokIVE.length) {
				gapok =  gapokIVE [gapokIVE.length-1];
			}
			else {
				gapok = gapokIVE [masaKerjaInt];
			}
		}


 		System.out.println("Gaji pokok Anda sebesar Rp " + gapok + ",-");
		System.out.println();

 		do {
		System.out.println("Pendidikan terakhir: ");
		pendidikanInput = keyboard.next ();
 		boolean validPendidikanInput = false;
 			for (String pendidikan : jenisPendidikan) {
 				if (pendidikanInput.equals(pendidikan)) {
 					validPendidikan=1;
 					validPendidikanInput = true;
 				}
 			} 

 			if (validPendidikanInput ==false) {
 				System.out.println("Pendidikan " + pendidikanInput+ " tidak ada. Mohon ulangi!");
 				System.out.println();
 				validPendidikan = 0;
 			}
 		} while (validPendidikan==0);


		do {
			System.out.println("Apakah Anda memiliki jabatan? (ya/tidak)");
			jabatan = keyboard.next ();

			if (jabatan.equals ("ya")) {
				do {
					System.out.print("Golongan eselon: ");
					eselonInput = keyboard.next();
					boolean ValidEselonInput = false;
						for (String eselon : jenisEselon) {
							validEselon=1;//
							if (eselonInput.equals(eselon)) {
		 					ValidEselonInput = true;
 							}
 						}
			 			if (ValidEselonInput==false) {
			 				validEselon = 0;
			 				System.out.println("Golongan eselon " + eselonInput+ " tidak ada. Mohon ulangi!");
			 				System.out.println();
			 			}
				} while (validEselon==0);
				validJabatan=1;
			}
			else if (jabatan.equals ("tidak")) {
				validJabatan =1;
			}
			else {
				validJabatan=0;
			}
		} while (validJabatan == 0);


		if (jabatan.equals("tidak")) {
			do {
				System.out.println("Apakah Anda memiliki keterampilan/keahlian? (ya/tidak)");
				keahlian = keyboard.next ();
				if (keahlian.equals ("ya")) {
					validKeahlian=1;
				}
				else if (keahlian.equals ("tidak")) {
					validKeahlian =1;
				}
				else {
					validKeahlian=0;
				}
			} while (validKeahlian == 0);
		}




		System.out.println("---------------------------------------------------------");
		System.out.println("                    STATUS KELUARGA                      ");
		System.out.println("---------------------------------------------------------");

		do {
			System.out.println("Apakah Anda mempunyai istri/suami? (ya/tidak)");
			nikahInput = keyboard.next ();
			if (nikahInput.equals ("ya")) {
				validNikah=1;
			}
			else if (nikahInput.equals ("tidak")) {
				validNikah =1;
			}
			else {
				validNikah=0;
			}
		} while (validNikah == 0);


		do{
			System.out.print("Saat ini berapa anak yang Anda miliki? ");
			jmlAnak = keyboard.next ();
 			if (jmlAnak.matches ("[0-9]+")) {
 				validJmlAnak=1;
 			}
 			else {
 				System.out.println("Maaf input jumlah anak salah. Mohon ulangi lagi!");
 				System.out.println();
 				validJmlAnak=0;
 			}
 		} while (validJmlAnak==0);

 		jmlAnakInt = Integer.parseInt (jmlAnak);

		System.out.println("---------------------------------------------------------");
		System.out.println("                        TUNJANGAN                        ");
		System.out.println("---------------------------------------------------------");

		do {
		System.out.println("Apakah Anda sedang dinas di Papua? (ya/tidak) ");
		inputPapua = keyboard.next ();
			if (inputPapua.equals ("ya")) {
				validPapua=1;
			}
			else if (inputPapua.equals ("tidak")) {
				validPapua =1;
			}
			else {
				validPapua=0;
			}
		} while (validPapua == 0);

		do {
		System.out.println("Apakah Anda memiliki rumah dinas?(ya/tidak) ");
		inputRumah = keyboard.next ();
			if (inputRumah.equals ("ya")) {
				validRumah=1;
			}
			else if (inputRumah.equals ("tidak")) {
				validRumah =1;
			}
			else {
				validRumah=0;
			}
		} while (validRumah == 0);


		System.out.println("Tunjangan khusus");
		System.out.println("Jika tidak ada isi dengan 0");

		do {
			System.out.print("Tunjangan transport: ");
			tunjTransport = keyboard.next ();
			if (tunjTransport.matches ("[0-9]+")) {
				validTrans =1;
			}
			else {
				validTrans = 0;
			}
		}	while (validTrans == 0);

		tunjTransportInt = Integer.parseInt (tunjTransport);


		do {
			System.out.print("Tunjangan seminar: ");
			tunjSeminar = keyboard.next ();
			if (tunjSeminar.matches ("[0-9]+")) {
				validSeminar =1;
			}
			else {
				validSeminar = 0;
			}
		}	while (validSeminar == 0);

		tunjSeminarInt = Integer.parseInt (tunjSeminar);

		do {
			System.out.print("Tunjangan listrik: ");
			tunjListrik = keyboard.next ();
			if (tunjListrik.matches ("[0-9]+")) {
				validListrik =1;
			}
			else {
				validListrik = 0;
			}
		}	while (validListrik == 0);
		tunjListrikInt = Integer.parseInt (tunjListrik);


		System.out.println("Tunjangan lain-lain (cth: kosan) ");
		tunjLain = keyboard2.nextLine ();

		do {
			System.out.print("Besar tunjangan lain-lain: ");
			besarTunjLain= keyboard.next ();
			if (besarTunjLain.matches ("[0-9]+")) {
				validLain =1;
			}
			else {
				validLain = 0;
			}
		}	while (validLain == 0);
		besarTunjLainInt = Integer.parseInt (besarTunjLain);

		System.out.println("---------------------------------------------------------");
		System.out.println("                        SLIP GAJI                   	 ");
		System.out.println("---------------------------------------------------------");
		System.out.println("                                           Karyawan PNS  ");
		System.out.println("                                           Golongan " + golonganInput);
		System.out.println(bulan + "/" + tahun);
		System.out.println("Nama: " +namaLengkap);
		System.out.println("NIP: "+ nip);
		System.out.println("_________________________________________________________");
		System.out.println("Rincian Gaji");
		System.out.println("Gaji pokok:\tRp. " + gapok + ",-");

		if (nikahInput.equals("ya")) {
			tunjNikah = 0.1*gapok;
		}
		else if (nikahInput.equals("tidak")) {
			tunjNikah = 0;
		}
		System.out.println("T. Istri/Suami:\tRp. " + tunjNikah + ",-");
		
		if (jmlAnakInt <=2 && jmlAnakInt >= 0) {
			tunjAnak = (0.02*gapok)*jmlAnakInt;
		}
		else if (jmlAnakInt > 2) {
			tunjAnak = (0.02*gapok)*2;
		}
		
		System.out.println("T. Anak:\tRp. " + tunjAnak + ",-");

		if (jabatan.equals("tidak") || keahlian.equals ("tidak")) {
			if (golonganInput.equals("IA") || golonganInput.equals("IB") || golonganInput.equals("IC") || golonganInput.equals("ID")){
				tunjUmum = arrTunjUmum [0];
			}
			else if (golonganInput.equals("IIA") || golonganInput.equals("IIB") || golonganInput.equals("IIC") || golonganInput.equals("IID")){
				tunjUmum = arrTunjUmum [1];
			}
			if (golonganInput.equals("IIIA") || golonganInput.equals("IIIB") || golonganInput.equals("IIIC") || golonganInput.equals("IIID")){
				tunjUmum = arrTunjUmum [2];
			}
			if (golonganInput.equals("IVA") || golonganInput.equals("IVB") || golonganInput.equals("IVC") || golonganInput.equals("IVD") || golonganInput.equals ("IVE")){
				tunjUmum = arrTunjUmum [3];
			}
		}
			
		System.out.println("T. Umum:\tRp. " + tunjUmum + ",-");

		if (eselonInput.equals("Ia")) {
				tunjStruk = arrEselon [0];
		}
		else if (eselonInput.equals("Ib")) {
				tunjStruk = arrEselon [1];
		}
		else if (eselonInput.equals("IIa")) {
				tunjStruk = arrEselon [2];
		}
		else if (eselonInput.equals("IIb")) {
				tunjStruk = arrEselon [2];
		}
		else if (eselonInput.equals("IIIa")) {
				tunjStruk = arrEselon [3];
		}
		else if (eselonInput.equals("IIIb")) {
				tunjStruk = arrEselon [4];
		}
		else if (eselonInput.equals("IVa")) {
				tunjStruk = arrEselon [5];
		}
		else if (eselonInput.equals("IVb")) {
				tunjStruk = arrEselon [6];
		}
		else if (eselonInput.equals("Va")) {
				tunjStruk = arrEselon [7];
		}

		System.out.println("T. Struktural:\tRp. " + tunjStruk + ",-");

		if (jabatan.equals("tidak") && keahlian.equals ("ya")) {
			if (pendidikanInput.equals("D3")||pendidikanInput.equals ("SMA") || pendidikanInput.equals ("SMK")) {
				if (golonganInput.equals("IIA") || golonganInput.equals ("IIB")) {
					tunjFung = arrTunjFung1 [0];
				}
				else if (golonganInput.equals("IIC") || golonganInput.equals ("IID")) {
					tunjFung = arrTunjFung1 [1];
				}
				else if (golonganInput.equals("IIIA") || golonganInput.equals ("IIIB")) {
					tunjFung = arrTunjFung1 [2];
				}
				else if (golonganInput.equals("IIIC") || golonganInput.equals ("IIID")) {
					tunjFung = arrTunjFung1 [3];
				}
			}

			else if (pendidikanInput.equals("S1")|| pendidikanInput.equals ("S2") || pendidikanInput.equals ("S3")) {
				if (golonganInput.equals("IIIA") || golonganInput.equals ("IIIB")) {
					tunjFung = arrTunjFung2 [0];
				}
				else if (golonganInput.equals("IIIC") || golonganInput.equals ("IIID")) {
					tunjFung = arrTunjFung2 [1];
				}
				else if (golonganInput.equals("IVA") || golonganInput.equals ("IVB") || golonganInput.equals("IVC")) {
					tunjFung = arrTunjFung2 [2];
				}
				else if (golonganInput.equals ("IVD")|| golonganInput.equals("IVE")) {
					tunjFung = arrTunjFung2 [3];
				}
			}
		}

		System.out.println("T. Fungsional:\tRp. " + tunjFung+ ",-");

		if (nikahInput.equals("tidak")) {
			tunjBeras = hargaBeras*beratBeras*(jmlAnakInt+1); //untuk diri sendiri
		}
		else if (nikahInput.equals("ya")) {
			tunjBeras = hargaBeras*beratBeras*(jmlAnakInt+2); //untuk diri sendiri dan istri
		}

		System.out.println("T. Beras:\tRp. " + tunjBeras+ ",-");

		if (inputPapua.equals("ya")) {
			if (golonganInput.equals("IA")) {
				tunjPapua = arrTunjPapua [0];
			}
			else if (golonganInput.equals("IB")) {
				tunjPapua = arrTunjPapua [1];
			}
			else if (golonganInput.equals("IC")) {
				tunjPapua = arrTunjPapua [2];
			}
			else if (golonganInput.equals("ID")) {
				tunjPapua = arrTunjPapua [3];
			}
			else if (golonganInput.equals("IIA")) {
				tunjPapua = arrTunjPapua [4];
			}
			else if (golonganInput.equals("IIB")) {
				tunjPapua = arrTunjPapua [5];
			}
			else if (golonganInput.equals("IIC")) {
				tunjPapua = arrTunjPapua [6];
			}
			else if (golonganInput.equals("IID")) {
				tunjPapua = arrTunjPapua [7];
			}
			else if (golonganInput.equals("IIIA")) {
				tunjPapua = arrTunjPapua [8];
			}
			else if (golonganInput.equals("IIIB")) {
				tunjPapua = arrTunjPapua [9];
			}
			else if (golonganInput.equals("IIIC")) {
				tunjPapua = arrTunjPapua [10];
			}
			else if (golonganInput.equals("IIID")) {
				tunjPapua = arrTunjPapua [11];
			}
			else if (arrTunjPapua.equals("IVA")) {
				tunjPapua = arrTunjPapua [12];
			}
			else if (golonganInput.equals("IVB")) {
				tunjPapua = arrTunjPapua [13];
			}
			else if (golonganInput.equals("IVC")) {
				tunjPapua = arrTunjPapua [14];
			}
			else if (golonganInput.equals("IVD")) {
				tunjPapua = arrTunjPapua [15];
			}
			else if (golonganInput.equals("IVE")) {
				tunjPapua = arrTunjPapua [16];
			}
		}
		else if (inputPapua.equals("tidak")) {
			tunjPapua = 0;
		}

		System.out.println("T. Papua:\tRp. " + tunjPapua+ ",-");
		System.out.println("T. Transport:\tRp. " + tunjTransportInt+ ",-");
		System.out.println("T. Seminar:\tRp. " + tunjSeminarInt+ ",-");
		System.out.println("T. Listrik:\tRp. " + tunjListrikInt+ ",-");
		System.out.println("T. lain-lain:\tRp. " + besarTunjLain+ ",-");


		//perhitungan pemotongan

		if (golonganInput.equals("IA") || golonganInput.equals("IB") || golonganInput.equals("IC") || golonganInput.equals("ID")){
			taperum = arrTaperum [0];
		}
		else if (golonganInput.equals("IIA") || golonganInput.equals("IIB") || golonganInput.equals("IIC") || golonganInput.equals("IID")){
			taperum = arrTaperum [1];
		}
		if (golonganInput.equals("IIIA") || golonganInput.equals("IIIB") || golonganInput.equals("IIIC") || golonganInput.equals("IIID")){
			taperum = arrTaperum [2];
		}
		if (golonganInput.equals("IVA") || golonganInput.equals("IVB") || golonganInput.equals("IVC") || golonganInput.equals("IVD") || golonganInput.equals ("IVE")){
			taperum = arrTaperum [3];
		}
		

		iwp = 0.1* (gapok + tunjNikah + tunjAnak);

		if (inputRumah.equals("ya")) {
			rumahDinas = hargaRumahDinas;
		}


		//menghitung PPH
		if (nikahInput.equals("tidak")) {
			if (jmlAnakInt>=0 && jmlAnakInt <= 3) {
				ptkp = 36000000 + (3000000*jmlAnakInt);
			}
			else if (jmlAnakInt>3) {
				ptkp = 36000000 + (3000000*3);
			}
		}
		else if (nikahInput.equals("ya") && jmlAnakInt <= 3 && jmlAnakInt >=0) {
			if (jmlAnakInt>=0 && jmlAnakInt <= 3) {
				ptkp = 39000000 + (3000000*jmlAnakInt);
			}
			else if (jmlAnakInt>3) {
				ptkp = 39000000 + (3000000*3);
			}
		}

		penghasilanKotor = gapok + tunjNikah + tunjAnak + tunjUmum +tunjStruk+ tunjFung+ tunjBeras+ tunjPapua + tunjTransportInt+tunjSeminarInt+tunjListrikInt+ besarTunjLainInt;
		penghasilanBersih = penghasilanKotor-(iwp+taperum+rumahDinas);

		pkp = (penghasilanBersih*12) - ptkp;

		if (pkp<=0) {
			pkp=0;
		}
		

		if (pkp > 500000000) {
			pphSetaun4 = (pkp - 500000000)*pph4;
			pphSetaun4 = pphSetaun4 + (250000000*pph3) + (200000000*pph2) + (50000000*pph1);
		}
		else if (pkp> 250000000 && pkp <= 500000000) {
			pphSetaun3 = (pkp - 250000000)*pph3;
			pphSetaun3 = pphSetaun3 + (200000000*pph2) + (50000000*pph1);
		}
		else if (pkp> 50000000 && pkp <= 250000000 ) {
			pphSetaun2 = (pkp - 50000000)*pph2;
			pphSetaun2 = pphSetaun2 + 500000000*pph1;
		}
		else if (pkp > 0 && pkp <= 50000000) {
			pphSetaun1 = pkp*pph1;
		}

		else if (pkp <=0) {
			pph=0;
		}

		pphSetaun = pphSetaun1 + pphSetaun2 + pphSetaun3 + pphSetaun4;
		pph = pphSetaun/12;

		System.out.println("T. Pajak*:\tRp. " + pph + ",-");

		
		System.out.println();
		System.out.println("Penghasilan kotor: Rp. "+ penghasilanKotor+ ",-");
		System.out.println("*tidak termasuk T.pajak");
		//print pemotongan	
		System.out.println("_________________________________________________________");
		System.out.println("Rincian pemotongan");
		System.out.println("IWP:\t\tRp. " + iwp+ ",-");
		System.out.println("Taperum:\tRp. " + taperum+ ",-");
		System.out.println("Rumah Dinas:\tRp. " + rumahDinas + ",-");
		System.out.println("Penghasilan netto: Rp. " + penghasilanBersih + ",-");
		System.out.println();
		System.out.println("PTKP:\t\tRp. " + ptkp + ",-");
		System.out.println("PKP:\t\tRp. "+ pkp + ",-");
		System.out.println("Pph Setahun:\tRp. " + pphSetaun+ ",-");
		System.out.println("Pph :\t\tRp. " + pph+ ",-");
		penghasilanFix = penghasilanBersih - (pph);
		System.out.println("Penghasilan yang diterima: Rp. " + penghasilanFix + ",-");

	}
}
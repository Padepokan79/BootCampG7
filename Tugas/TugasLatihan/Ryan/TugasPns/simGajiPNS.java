/*
     * Simulasi Gaji PNS
     *
     * Programmer : Ryan Ahmaad N
     * Created By : Ryan Ahmad N
     * Created At : 24 May
     * Updated By : 
     * Updated At : 
*/

import java.util.Scanner;

public class simGajiPNS{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Scanner line = new Scanner(System.in);

		String nama, status, golongan, lokasi, jabatan="", pilihan, pilihanJabatan, eselon="", tingkatPendidikan="";
		int nip, masaKerja, tunjanganLain, hutang=0, tunggakan=0, sewaRumah=0, jumlahAnak=0, tunjanganBeras=10, iwp, jmlKotor=0, taperum=0,
		gajiPokok=0, tunjanganPasangan=0, tunjanganAnak=0, tunjanganUmum=0, tunjanganTaUmum=0, tunjanganPapua=0, tunjanganStruktur=0, tunjanganFungsi=0;

		int[] satuA = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600 };
		int[] satuB = {1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2355200 };
		int[] satuC = {1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800 };
		int[] satuD = {1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700 };

		int[] duaA = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100 };
		int[] duaB = {2103300,2103300,2169500,2169500,2237900,2237900,2308300,2308300,2381100,2381100,2456000,2456000,2533400,2533400,2613200,2613200,2695500,2695500,2780400,2780400,2867900,2867900,2958300,2958300,3051400,3051400,3147600,3147600,3246700,3246700,3348900};
		int[] duaC = {2192300,2192300,2261300,2261300,2332500,2332500,2406000,2406000,2481800,2481800,2559900,2559900,2640600,2640600,2723700,2723700,2809500,2809500,2898000,2898000,2989300,2989300,3083400,3083400,3180500,3180500,3280700,3280700,3384000,3384000,3490600};
		int[] duaD = {2285000,2285000,2357000,2357000,2431200,2431200,2507800,2507800,2586700,2586700,2668200,2668200,2752300,2752300,2838900,2838900,2928300,2928300,3020600,3020600,3115700,3115700,3213800,3213800,3315100,3315100,3419500,3419500,3527200,3527200,3638200};

		int[] tigaA = {2456700,2456700,2534000,2534000,2613800,2613800,2696200,2696200,2781100,2781100,2868700,2868700,2959000,2959000,3052200,3052200,3148300,3148300,3247500,3247500,3349800,3349800,3455300,3455300,3564100,3564100,3676400,3676400,3792100,3792100,3911600,3911600,4034800};
		int[] tigaB = {2560600,2560600,2641200,2641200,2724400,2724400,2810200,2810200,2898700,2898700,2990000,2990000,3084200,3084200,3181300,3181300,3281500,3281500,3384900,3384900,3491500,3491500,3601400,3601400,3714900,3714900,3831900,3831900,3952600,3952600,4007000,4007000,4205400};
		int[] tigaC = {2668900,2668900,2752900,2752900,2839700,2839700,2929100,2929100,3021300,3021300,3116500,3116500,3214700,3214700,3315900,3315900,3420300,3420300,3528100,3528100,3639200,3639200,3753800,3753800,3872000,3872000,3994200,3994200,4119700,4119700,4249500,4249500,4383300};
		int[] tigaD = {2781800,2781800,2869400,2869400,2959800,2959800,3053000,3053000,3149100,3149100,3248300,3248300,3350600,3350600,3456200,3456200,3565000,3565000,3677300,3677300,3912600,3912600,3912600,3912600,4035800,4035800,4162900,4162900,4294000,4294000,4429300,4429300,4568800};

		int[] empatA = {2899500,2899500,2990800,2990800,3085000,3085000,3182100,3182100,3282400,3282400,3385700,3385700,3492400,3492400,3602400,3602400,3715800,3715800,3832800,3832800,3953600,3953600,4078100,4078100,4206500,4206500,4339000,4339000,4475700,4475700,4616600,4616600,4762000};
		int[] empatB = {3022100,3022100,3117300,3117300,3215500,3215500,3316700,3316700,3421200,3421200,3528900,3528900,3640100,3640100,3754700,3754700,3873000,3873000,3995000,3995000,4120800,4120800,4250600,4250600,4384400,4384400,4522500,4522500,4665000,4665000,4811900,4811900,4963400};
		int[] empatC = {3149900,3149900,3249100,3249100,3351500,3351500,3457000,3457000,3565900,3565900,3678200,3678200,3794100,3794100,3913600,3913600,4036800,4036800,4164000,4164000,4295100,4295100,4430400,4430400,4569900,4569900,4713800,4713800,4862300,4862300,5015400,5015400,5173400};
		int[] empatD = {3283200,3283200,3386600,3386600,3493200,3493200,3603300,3603300,3716700,3716700,3833800,3833800,3954600,3954600,4079100,4079100,4207600,4207600,4340100,4340100,4476800,4476800,4617800,4617800,4763200,4763200,4913200,4913200,5068000,5068000,5227600,5227600,5392200};		
		int[] empatE = {3422100,3422100,3529800,3529800,3641000,3641000,3755700,3755700,3874000,3874000,3996000,3996000,4121800,4121800,4251600,4251600,4385600,4385600,4523700,4523700,4666100,4666100,4813100,4813100,4964700,4964700,5121100,5121100,5282300,5282300,5448700,5448700,5620300};


		System.out.println();
		System.out.println("\t\tSLIP GAJI PNS\t\t");
		System.out.println("=======================================");
		System.out.println();
		System.out.print("NIP\t\t\t: ");
		nip = key.nextInt();
		System.out.print("Nama\t\t\t: ");
		nama = line.nextLine();
		System.out.print("Status\t\t\t: ");
		status = line.nextLine();
		System.out.print("Mempunyai anak\t\t: ");
		pilihan = key.next();
			if (pilihan.equals("ya")) {
				System.out.print("Jumlah anak\t\t: ");
				jumlahAnak = key.nextInt();
			}
		System.out.print("Golongan Anda\t\t: ");
		golongan = key.next();
		System.out.print("MKG anda\t\t: ");
		masaKerja = key.nextInt();
		System.out.print("Lokasi anda\t\t: ");
		lokasi = key.next();
		System.out.print("Menduduki suatu Jabatan\t: ");
		pilihanJabatan = key.next();
			if (pilihanJabatan.equals("ya")) {
				System.out.print("Jabatan anda apa (struktural/fungsional) : ");
				jabatan = key.next();
				if (jabatan.equals("struktural")) {
					System.out.print("Eselon\t\t: ");
					eselon = key.next();
				}
				else if (jabatan.equals("fungsional")) {
					System.out.print("Tingkatan pendidikan\t: ");
					tingkatPendidikan = key.next();
				}
			}
		System.out.print("Tunjangan Lain\t\t: ");
		pilihan = key.next();
		System.out.print("Memiliki utang\t\t: ");
		pilihan = key.next();
			if (pilihan.equals("ya")) {
				System.out.print("Besaran hutang\t: ");
				hutang = key.nextInt();
			}
		System.out.print("Memiliki tunggakan\t: ");
		pilihan = key.next();
			if (pilihan.equals("ya")) {
				System.out.print("Besaran tunggakan\t: ");
				tunggakan = key.nextInt();
			}
		System.out.print("Menggunakan rumah dinas\t: ");
		pilihan = key.next();
			if (pilihan.equals("ya")) {
				sewaRumah = 450000;
			}

		System.out.println("==========================================");

//Gaji Pokok+Tunjangan Papua
		if (golongan.equals("IA")) {
			gajiPokok = satuA[masaKerja];
			tunjanganPapua = 200000;
			taperum = 3000;
		}
		else if (golongan.equals("IB")) {
			gajiPokok = satuB[masaKerja-3];
			tunjanganPapua = 225000;
			taperum = 3000;
		}
		else if (golongan.equals("IC")) {
			gajiPokok = satuC[masaKerja-3];
			tunjanganPapua = 250000;
			taperum = 3000;
		}
		else if (golongan.equals("ID")) {
			gajiPokok = satuD[masaKerja-3];
			tunjanganPapua = 275000;
			taperum = 3000;
		}
		//////
		else if (golongan.equals("IIA")) {
			gajiPokok = duaA[masaKerja];
			tunjanganPapua = 300000;
			taperum = 5000;
		}
		else if (golongan.equals("IIB")) {
			gajiPokok = duaB[masaKerja-3];
			tunjanganPapua = 325000;
			taperum = 5000;
		}
		else if (golongan.equals("IIC")) {
			gajiPokok = duaC[masaKerja-3];
			tunjanganPapua = 350000;
			taperum = 5000;
		}
		else if (golongan.equals("IID")) {
			gajiPokok = duaD[masaKerja-3];
			tunjanganPapua = 375000;
			taperum = 5000;
		}
		////
		else if (golongan.equals("IIIA")) {
			gajiPokok = tigaA[masaKerja];
			tunjanganPapua = 425000;
			taperum = 7000;
		}
		else if (golongan.equals("IIIB")) {
			gajiPokok = tigaB[masaKerja];
			tunjanganPapua = 450000;
			taperum = 7000;
		}
		else if (golongan.equals("IIIC")) {
			gajiPokok = tigaC[masaKerja];
			tunjanganPapua = 475000;
			taperum = 7000;
		}
		else if (golongan.equals("IIID")) {
			gajiPokok = tigaD[masaKerja];
			tunjanganPapua = 500000;
			taperum = 7000;
		}
		////
		else if (golongan.equals("IVA")) {
			gajiPokok = empatA[masaKerja];
			tunjanganPapua = 525000;
			taperum = 10000;
		}
		else if (golongan.equals("IVB")) {
			gajiPokok = empatB[masaKerja];
			tunjanganPapua = 550000;
			taperum = 10000;
		}
		else if (golongan.equals("IVC")) {
			gajiPokok = empatC[masaKerja];
			tunjanganPapua = 575000;
			taperum = 10000;
		}
		else if (golongan.equals("IVD")) {
			gajiPokok = empatD[masaKerja];
			tunjanganPapua = 600000;
			taperum = 10000;
		}
		else if (golongan.equals("IVE")) {
			gajiPokok = empatE[masaKerja];
			tunjanganPapua = 625000;
			taperum = 10000;
		}

//Tunjangan Pasangan
		if (status.equals("kawin")) {
			tunjanganPasangan = gajiPokok/100*10;
		}
//Tunjangan Anak
		if (jumlahAnak >= 2) {
			tunjanganAnak = gajiPokok/100*4;
		}
		else if (jumlahAnak == 1) {
			tunjanganAnak = gajiPokok/100*2;
		}
//Tunjangan Umum+struktur+fungsional
		if (pilihanJabatan.equals("ya")) {
			if (jabatan.equals("struktural")) {
				if (golongan.equals("IVD") || golongan.equals("IVE") && eselon.equals("IA")) {
					tunjanganStruktur = 5500000;
				}
				else if (golongan.equals("IVD") || golongan.equals("IVE") && eselon.equals("IB")) {
					tunjanganStruktur = 4375000;
				}
				else if (golongan.equals("IVD") || golongan.equals("IVC") && eselon.equals("IIA")) {
					tunjanganStruktur = 3250000;
				}
				else if (golongan.equals("IVC") || golongan.equals("IVB") && eselon.equals("IIB")) {
					tunjanganStruktur = 2025000;
				}
				else if (golongan.equals("IVB") || golongan.equals("IVA") && eselon.equals("IIIA")) {
					tunjanganStruktur = 1260000;
				}
				else if (golongan.equals("IVA") || golongan.equals("IIID") && eselon.equals("IIIB")) {
					tunjanganStruktur = 980000;
				}
				else if (golongan.equals("IIID") || golongan.equals("IIIC") && eselon.equals("IVA")) {
					tunjanganStruktur = 540000;
				}
				else if (golongan.equals("IIIC") || golongan.equals("IIIB") && eselon.equals("IVB")) {
					tunjanganStruktur = 490000;
				}
				else if (golongan.equals("IIIB") || golongan.equals("IIIA") && eselon.equals("VA")) {
					tunjanganStruktur = 360000;
				}
			}
			else if (jabatan.equals("fungsional")) {
				if (tingkatPendidikan.equals("S1")) {
					if (golongan.equals("IVD") || golongan.equals("IVE")) {
						tunjanganFungsi = 1000000;
					}
					else if (golongan.equals("IVA") || golongan.equals("IVC") || golongan.equals("IVB")) {
						tunjanganFungsi = 900000;
					}
					else if (golongan.equals("IIID") || golongan.equals("IIIC")) {
						tunjanganFungsi = 800000;
					}
					else if (golongan.equals("IIIA") || golongan.equals("IIIB")) {
						tunjanganFungsi = 700000;
					}
				}
				else if (tingkatPendidikan.equals("SMK") || tingkatPendidikan.equals("SMA") || tingkatPendidikan.equals("MA")) {
					if (golongan.equals("IIA")) {
						tunjanganFungsi = 300000;
					}
					else if (golongan.equals("IID") || golongan.equals("IIC") || golongan.equals("IIB")) {
						tunjanganFungsi = 400000;
					}
					else if (golongan.equals("IIID") || golongan.equals("IIIC")) {
						tunjanganFungsi = 600000;
					}
					else if (golongan.equals("IIIA") || golongan.equals("IIIB")) {
						tunjanganFungsi = 500000;
					}	
				}
			}
		}
		else if(!(pilihanJabatan.equals("ya"))){
			if (golongan.equals("IA") || golongan.equals("IB") || golongan.equals("IC") || golongan.equals("ID")) {
				tunjanganUmum = 175000;
			}
			else if (golongan.equals("IIA") || golongan.equals("IIB") || golongan.equals("IIC") || golongan.equals("IID")) {
				tunjanganUmum = 180000;
			}
			else if (golongan.equals("IIIA") || golongan.equals("IIIB") || golongan.equals("IIIC") || golongan.equals("IIID")) {
				tunjanganUmum = 185000;
			}
			else if (golongan.equals("IVA") || golongan.equals("IVB") || golongan.equals("IVC") || golongan.equals("IVD") || golongan.equals("IVE")) {
				tunjanganUmum = 190000;
			}
		}
			
//Tunjangan Papua
		if (!(lokasi.equals("papua"))) {
			tunjanganPapua = 0;
		}
//Tunjangan Beras
		if (jumlahAnak > 2) {
				jumlahAnak = 2;
			}
		if (status.equals("kawin")) {	
			tunjanganBeras = tunjanganBeras*14000*(2+jumlahAnak);
		}
		else {
			tunjanganBeras = tunjanganBeras*14000*(1+jumlahAnak);
		}
//IWP
		iwp = (gajiPokok/100*10)+tunjanganPasangan+tunjanganAnak;
//Jumlah Kotor
		jmlKotor = gajiPokok+tunjanganPasangan+tunjanganAnak+tunjanganUmum+tunjanganPapua+tunjanganStruktur+tunjanganFungsi+tunjanganBeras;
//pph
		double biayajabatan = jmlKotor/100*5;
		if (biayajabatan > 500000) {
			biayajabatan = 500000;
		}
		double iuranPensiun = iwp/100*4.75;
		double nettoBulan = jmlKotor - (biayajabatan+iuranPensiun);
		double nettoTahun = nettoBulan*12;

		double ptkp=0, pph=0;
		//ptkp
		if (jumlahAnak > 3) {
				jumlahAnak = 3;
			}
		if (status.equals("kawin")) {	
			ptkp = 24000000+(3000000*(1+jumlahAnak));
		}
		else {
			ptkp = 24000000+(3000000*jumlahAnak);
		}

		pkp = nettoTahun - ptkp;

		if (pkp <= 50000000) {
			pph = pkp/100*5;
		}
		else if (pkp <= 250000000) {
			pph = (50000000/100*5)+((pkp-50000000)/100*5);
		}

//Outputt

		System.out.println();
		System.out.println();
		System.out.println("\t\tSlip Gaji\t\t");
		System.out.println("Nama\t\t\t: Rp."+nama);
		System.out.println("NIP\t\t\t: Rp."+nip);
		System.out.println("Gaji Pokok\t\t: Rp."+gajiPokok);
		System.out.println("T.Istri/Suami\t\t: Rp."+tunjanganPasangan);
		System.out.println("T.Anak\t\t\t: Rp."+tunjanganAnak);
		System.out.println("T.Umum\t\t\t: Rp."+tunjanganUmum);
		System.out.println("T.Ta.Umum\t\t: Rp."+tunjanganTaUmum);
		System.out.println("T.Papua\t\t\t: Rp."+tunjanganPapua);
		System.out.println("T.Terpencil\t\t: Rp."+0);
		System.out.println("T.Struktur\t\t: Rp."+tunjanganStruktur);
		System.out.println("T.Fungsi\t\t: Rp."+tunjanganFungsi);
		System.out.println("T.Lain\t\t\t: Rp."+0);
		System.out.println("T.Bulat\t\t\t: Rp."+0);
		System.out.println("T.Beras\t\t\t: Rp."+tunjanganBeras);
		System.out.println("T.Pajak\t\t\t: Rp."+0);
		System.out.println("===============================================");
		System.out.println("Jumlah Kotor\t\t: Rp."+jmlKotor);
		System.out.println("Pot. Beras\t\t: Rp."+0);
		System.out.println("IWP\t\t\t: Rp."+iwp);
		System.out.println("Pot.PPh\t\t\t: Rp.");
		System.out.println("Sewa Rumah\t\t: Rp."+sewaRumah);
		System.out.println("Tunggakan\t\t: Rp."+tunggakan);
		System.out.println("Utang\t\t\t: Rp."+hutang);
		System.out.println("Pot. Lain\t\t: Rp.");
		System.out.println("Taperum\t\t\t: Rp."+taperum);
		System.out.println("================================================");
		System.out.println("Jumlah Pot.\t\t: Rp.");
		System.out.println("================================================");
		System.out.println("Jumlah Bersih\t\t: Rp.");
		System.out.println("------------------------------------------------");

	}
}
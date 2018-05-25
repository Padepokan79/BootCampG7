/*
Date Created	: 23 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;
import java.util.Random;

public class PenggajianPNS {
	public static void main(String[] args) {
		Scanner inputKey = new Scanner(System.in);
		Random rand = new Random();

		int[] 	satuA = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600},
				satuB = {0, 0, 0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2355200},
				satuC = {0, 0, 0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800},
				satuD = {0, 0, 0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700},

				duaA = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100},
				duaB = {0, 0, 0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900},
				duaC = {0, 0, 0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600},
				duaD = {0, 0, 0, 2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200, 3638200},

				tigaA = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800},
				tigaB = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400},
				tigaC = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300},
				tigaD = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800},

				empatA = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3953600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000},
				empatB = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3528900, 3528900, 3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400},
				empatC = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400},
				empatD = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4913200, 5068000, 5068000, 5227600, 5227600, 5392200},
				empatE = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};

		int valid, noSlip, index, jlhKeluarga, num, jlhAnak, add;
		double 	tIstri, tAnak, tStruktur, tFungsi, tUmum, tPapua, tBeras, tPajak, taperum, gapok, iwp, bpjs, tht, pensiun,
				kotorBulanan, nettoBulanan, nettoTahunan, ptkp, pkp, pph, pph5, pph15, pph25, pph30, totPph, totPotongan, totBersih;
		String 	nama, hal, nip, gol, msKerja, jbtStruktur, eselon, jbtFungsi, golFungsi, lokasi, status, anak, utang,
				namaTLain, nomTLain, tlain, tlainChoice, sewaRmh, namaPotLain, nomPotLain, potLainChoice, potLain;
		boolean menikah;

		potLain = sewaRmh = nomTLain = tlain = utang = lokasi = eselon = hal = nama = status = msKerja = golFungsi = gol = anak = jbtFungsi = jbtStruktur = "";
		jlhAnak = jlhKeluarga = num = 0; // integer
		taperum = tBeras = tStruktur = tFungsi = tUmum = tPapua = totPph = gapok = tFungsi = 0; // double
		valid = 1;
		/*
		*
		*
		*
		INPUT PROGRAM
		*
		*
		*
		*/

		System.out.println();
		System.out.println("\t __   __    __    _  _     __   __    _    ___");
		System.out.println("\t|__  |  |  |__|  | \\/ |   | _  |__|    |    | ");
		System.out.println("\t|    |__|  | \\   |    |   |__| |  |  __|   _|_");
		System.out.println("");
		System.out.println(" SEKERTARIAT UTAMA");
		System.out.println();
		System.out.println(" ____________________________________________________________");
		System.out.println();

		

		/*
		*
		*
		*
		START
		BLOCK OF CODE
		Coding dibuat dan dikerjakan di area ini
			{
		*/
		index = 0;
		while (index < valid) {
			System.out.print(" Nama Lengkap\t\t\t: ");
			nama = inputKey.nextLine();
			if (nama.matches("[A-Za-z., ]+")) {
				if (nama.length() > 32) {
					System.out.println("\t\t\t Inputan Melebihi batas 32 Karakter");
				    index=0;
				}else {
			    	index++;
				}
			} else {
			    System.out.println("\t\t\t Inputan Tidak Sesuai");
			    index=0;
			}
		}

		index = 0;
		while (index < valid) {
			System.out.print(" NIP\t\t\t\t: ");
			nip = inputKey.nextLine();
			if (nip.matches("[0-9]+")) {
			    if (nip.length() < 12) {
					System.out.println("\t\t\t Inputan kurang dari 12 Karakter");
				    index=0;
				}else if (nip.length() > 18) {
					System.out.println("\t\t\t Inputan Melebihi batas 18 Karakter");
				    index=0;
				}else {
			    	index++;
				}
			} else {
			    System.out.println("\t\t\t Inputan Harus Angka!");
			    index=0;
			}
		}

		index = 0;
		while (index < valid) {
			System.out.print(" Golongan\t\t\t: ");
			gol = inputKey.nextLine();
			if (gol.matches("([A-Ea-e1-5])+")) {
				if (gol.matches("([1-4Ee])+")) {
					System.out.println("Tidak Ada Golongan Tersebut");
			    	index=0;
				}else {
			    	index++;
				}
			} else {
			    System.out.println("\t\t\t Tidak Ada Golongan Tersebut!");
			    index=0;
			}
		}
		
		if (gol.substring(0,1).equals("1")) {
			taperum = 3000;
			if (gol.substring(1,2).equals("A")||gol.substring(1,2).equals("a")) {
				num = satuA.length-1;
			}else if (gol.substring(1,2).equals("B")||gol.substring(1,2).equals("b")) {
				num = satuB.length-1;
			}else if (gol.substring(1,2).equals("C")||gol.substring(1,2).equals("c")) {
				num = satuC.length-1;
			}else if (gol.substring(1,2).equals("D")||gol.substring(1,2).equals("d")) {
				num = satuD.length-1;
			}
		} else if (gol.substring(0,1).equals("2")) {
			taperum = 5000;
			if (gol.substring(1,2).equals("A")||gol.substring(1,2).equals("a")) {
				num = duaA.length-1;
			}else if (gol.substring(1,2).equals("B")||gol.substring(1,2).equals("b")) {
				num = duaB.length-1;
			}else if (gol.substring(1,2).equals("C")||gol.substring(1,2).equals("c")) {
				num = duaC.length-1;
			}else if (gol.substring(1,2).equals("D")||gol.substring(1,2).equals("d")) {
				num = duaD.length-1;
			}
		} else if (gol.substring(0,1).equals("3")) {
			taperum = 7000;
			if (gol.substring(1,2).equals("A")||gol.substring(1,2).equals("a")) {
				num = tigaA.length-1;
			}else if (gol.substring(1,2).equals("B")||gol.substring(1,2).equals("b")) {
				num = tigaB.length-1;
			}else if (gol.substring(1,2).equals("C")||gol.substring(1,2).equals("c")) {
				num = tigaC.length-1;
			}else if (gol.substring(1,2).equals("D")||gol.substring(1,2).equals("d")) {
				num = tigaD.length-1;
			}
		} else if (gol.substring(0,1).equals("4")) {
			taperum = 10000;
			if (gol.substring(1,2).equals("A")||gol.substring(1,2).equals("a")) {
				num = empatA.length-1;
			}else if (gol.substring(1,2).equals("B")||gol.substring(1,2).equals("b")) {
				num = empatB.length-1;
			}else if (gol.substring(1,2).equals("C")||gol.substring(1,2).equals("c")) {
				num = empatC.length-1;
			}else if (gol.substring(1,2).equals("D")||gol.substring(1,2).equals("d")) {
				num = empatD.length-1;
			}else if (gol.substring(1,2).equals("E")||gol.substring(1,2).equals("e")) {
				num = empatE.length-1;
			}
		}

		index = 0;
		while (index < valid) {
			System.out.print(" Masa Kerja\t\t\t: ");
			msKerja = inputKey.nextLine();
			if (msKerja.matches("[0-9]*")) {
				if (Integer.parseInt(msKerja)>num) {
					System.out.println("Maksimal masa kerja, " + num + " tahun");
					System.out.println("gapok disesuaikan dengan maksimal masa kerja");
					msKerja=Integer.toString(num);
				}
			    index++;
			} else {
			    System.out.println("\t\t\t Inputan Harus Angka!");
			    index=0;
			}
		}

		if (gol.substring(0,1).equals("1")) {
			if (gol.substring(1,2).equals("A")||gol.substring(1,2).equals("a")) {
				gapok = satuA[Integer.parseInt(msKerja)];
				tPapua = 200000;
			}else if (gol.substring(1,2).equals("B")||gol.substring(1,2).equals("b")) {
				gapok = satuB[Integer.parseInt(msKerja)];
				tPapua = 225000;
			}else if (gol.substring(1,2).equals("C")||gol.substring(1,2).equals("c")) {
				gapok = satuC[Integer.parseInt(msKerja)];
				tPapua = 250000;
			}else if (gol.substring(1,2).equals("D")||gol.substring(1,2).equals("d")) {
				gapok = satuD[Integer.parseInt(msKerja)];
				tPapua = 275000;
			}
		} else if (gol.substring(0,1).equals("2")) {
			if (gol.substring(1,2).equals("A")||gol.substring(1,2).equals("a")) {
				gapok = duaA[Integer.parseInt(msKerja)];
				tPapua = 300000;
			}else if (gol.substring(1,2).equals("B")||gol.substring(1,2).equals("b")) {
				gapok = duaB[Integer.parseInt(msKerja)];
				tPapua = 325000;
			}else if (gol.substring(1,2).equals("C")||gol.substring(1,2).equals("c")) {
				gapok = duaC[Integer.parseInt(msKerja)];
				tPapua = 350000;
			}else if (gol.substring(1,2).equals("D")||gol.substring(1,2).equals("d")) {
				gapok = duaD[Integer.parseInt(msKerja)];
				tPapua = 375000;
			}
		} else if (gol.substring(0,1).equals("3")) {
			if (gol.substring(1,2).equals("A")||gol.substring(1,2).equals("a")) {
				gapok = tigaA[Integer.parseInt(msKerja)];
				tPapua = 425000;
			}else if (gol.substring(1,2).equals("B")||gol.substring(1,2).equals("b")) {
				gapok = tigaB[Integer.parseInt(msKerja)];
				tPapua = 450000;
			}else if (gol.substring(1,2).equals("C")||gol.substring(1,2).equals("c")) {
				gapok = tigaC[Integer.parseInt(msKerja)];
				tPapua = 475000;
			}else if (gol.substring(1,2).equals("D")||gol.substring(1,2).equals("d")) {
				gapok = tigaD[Integer.parseInt(msKerja)];
				tPapua = 500000;
			}
		} else if (gol.substring(0,1).equals("4")) {
			if (gol.substring(1,2).equals("A")||gol.substring(1,2).equals("a")) {
				gapok = empatA[Integer.parseInt(msKerja)];
				tPapua = 525000;
			}else if (gol.substring(1,2).equals("B")||gol.substring(1,2).equals("b")) {
				gapok = empatB[Integer.parseInt(msKerja)];
				tPapua = 550000;
			}else if (gol.substring(1,2).equals("C")||gol.substring(1,2).equals("c")) {
				gapok = empatC[Integer.parseInt(msKerja)];
				tPapua = 575000;
			}else if (gol.substring(1,2).equals("D")||gol.substring(1,2).equals("d")) {
				gapok = empatD[Integer.parseInt(msKerja)];
				tPapua = 600000;
			}else if (gol.substring(1,2).equals("E")||gol.substring(1,2).equals("e")) {
				gapok = empatE[Integer.parseInt(msKerja)];
				tPapua = 625000;
			}
		}

		index = 0;
		while (index < valid) {
			System.out.print(" Status perkawinan (Bujang/Menikah/Bercerai)\t: ");
			status = inputKey.nextLine();
			if (status.matches("[A-Za-z]*")) {
				if (status.equals("Bujang")||status.equals("Menikah")||status.equals("Bercerai")) {
			    	index++;
				}else{
				    System.out.println("\t\t\t Inputan Tidak Sesuai");
				    index=0;
				}
			} else {
			    System.out.println("\t\t\t Inputan Tidak Sesuai");
			    index=0;
			}
		}

		if (status.equals("Menikah")) {
			index = 0;
			while (index < valid) {
				System.out.print(" Jumlah anak \t\t\t: ");
				anak = inputKey.nextLine();
				if (anak.matches("[0-9]+")) {
					if (Integer.parseInt(anak)>2) {
						System.out.println("Maksimal tunjangan anak, 2 anak");
						System.out.println("Tunjangan disesuaikan dengan maksimal jumlah anak");
						anak=Integer.toString(2);
					}
					// jlhAnak+=Integer.parseInt(anak);
				    index++;
				} else {
				    System.out.println("\t\t\t Inputan Tidak Sesuai lah");
				    index=0;
				}
			}
		}else if (status.equals("Bercerai")) {
			index = 0;
			while (index < valid) {
				System.out.print(" Jumlah anak \t: ");
				anak = inputKey.nextLine();
				if (anak.matches("[0-9]+")) {
					if (Integer.parseInt(anak)>2) {
						System.out.println("Maksimal tunjangan anak, 2 anak");
						System.out.println("Tunjangan disesuaikan dengan maksimal jumlah anak");
						anak=Integer.toString(2);
					}
					// jlhAnak+=Integer.parseInt(anak);
				    index++;
				} else {
				    System.out.println("\t\t\t Inputan Tidak Sesuai");
				    index=0;
				}
			}
		}

		if (status.equals("Belum")) {
			jlhKeluarga = 1;
		}else if (status.equals("Menikah")) {
			jlhKeluarga = 2;
			jlhAnak += Integer.parseInt(anak);
		}else if (status.equals("Bercerai")) {
			jlhKeluarga = 2;
			jlhAnak += Integer.parseInt(anak);
		}

		index = 0;
		while (index < valid) {
			System.out.print(" Jabatan Struktural (Y/T)\t: ");
			jbtStruktur = inputKey.nextLine();
			if (jbtStruktur.matches("[A-Z]*")) {
				if (jbtStruktur.equals("Y") || jbtStruktur.equals("T")) {
			    	index++;
				}else {
				    System.out.println("\t\t\t Inputan Tidak Sesuai");
				    index=0;	
				}
			} else {
			    System.out.println("\t\t\t Inputan Tidak Sesuai");
			    index=0;
			}
		}

		if (jbtStruktur.equals("T")) {
			index = 0;
			while (index < valid) {
				System.out.print(" Jabatan Fungsional (Y/T)\t: ");
				jbtFungsi = inputKey.nextLine();
				if (jbtFungsi.matches("[YT]+")) {
					index++;
				} else {
				    System.out.println("\t\t\t Inputan Tidak Sesuai");
				    index=0;
				}
			}
		}else if (jbtStruktur.equals("Y")) {
			index = 0;
			while (index < valid) {
				System.out.print(" Eselon\t\t\t\t: ");
				eselon = inputKey.nextLine();
				if (eselon.matches("([ABab1-5])*")) {
				    index++;
				} else {
				    System.out.println("\t\t\t Inputan Tidak Sesuai!");
				    index=0;
				}
			}
		}

		if (eselon.substring(0,1).equals("1")) {
			if (eselon.substring(1,2).equals("A")||eselon.substring(1,2).equals("a")) {
				tStruktur = 5500000;
			}else if (eselon.substring(1,2).equals("B")||eselon.substring(1,2).equals("b")) {
				tStruktur = 4375000;
			}
		} else if (eselon.substring(0,1).equals("2")) {
			if (eselon.substring(1,2).equals("A")||eselon.substring(1,2).equals("a")) {
				tStruktur = 3250000;
			}else if (eselon.substring(1,2).equals("B")||eselon.substring(1,2).equals("b")) {
				tStruktur = 2025000;
			}
		} else if (eselon.substring(0,1).equals("3")) {
			if (eselon.substring(1,2).equals("A")||eselon.substring(1,2).equals("a")) {
				tStruktur = 1260000;
			}else if (eselon.substring(1,2).equals("B")||eselon.substring(1,2).equals("b")) {
				tStruktur = 980000;
			}
		} else if (eselon.substring(0,1).equals("4")) {
			if (eselon.substring(1,2).equals("A")||eselon.substring(1,2).equals("a")) {
				tStruktur = 540000;
			}else if (eselon.substring(1,2).equals("B")||eselon.substring(1,2).equals("b")) {
				tStruktur = 490000;
			}
		} else if (eselon.substring(0,1).equals("5")) {
			if (eselon.substring(1,2).equals("A")||eselon.substring(1,2).equals("a")) {
				tStruktur = 360000;
			}
		}

		if (jbtFungsi.equals("Y")) {
			index = 0;
			while (index < valid) {
				System.out.print(" Golongan Fungsional (Keahlian/Keterampilan)\t: ");
				golFungsi = inputKey.nextLine();
				if (golFungsi.matches("[A-Za-z]*")) {
					if (golFungsi.equals("Keahlian")||golFungsi.equals("Keterampilan")) {
				    	index++;
					}else{
					    System.out.println("\t\t\t Inputan Tidak Sesuai");
					    index=0;
					}
				} else {
				    System.out.println("\t\t\t Inputan Tidak Sesuai");
				    index=0;
				}
			}
		}

		if (golFungsi.equals("Keahlian")) {
			if ((gol.equals("4D") || gol.equals("4d"))||(gol.equals("4E") || gol.equals("4e"))) {
				tFungsi = 1000000;
			}else if ((gol.equals("4A") || gol.equals("4a"))||(gol.equals("4B") || gol.equals("4B"))||(gol.equals("4C") || gol.equals("4c"))) {
				tFungsi = 900000;
			}else if ((gol.equals("3C") || gol.equals("3c"))||(gol.equals("3D") || gol.equals("3d"))) {
				tFungsi = 800000;
			}else if ((gol.equals("3A") || gol.equals("3a"))||(gol.equals("3B") || gol.equals("3b"))) {
				tFungsi = 700000;
			}else {
				tFungsi = 0;
			}
		}else if (golFungsi.equals("Keterampilan")) {
			if ((gol.equals("3C") || gol.equals("3c"))||(gol.equals("3D") || gol.equals("3d"))) {
				tFungsi = 600000;
			}else if ((gol.equals("3A") || gol.equals("3a"))||(gol.equals("3B") || gol.equals("3b"))) {
				tFungsi = 500000;
			}else if ((gol.equals("2B") || gol.equals("2b"))||(gol.equals("2D") || gol.equals("2d"))) {
				tFungsi = 4000000;
			}else if (gol.equals("4A") || gol.equals("4a")) {
				tFungsi = 300000;
			}else {
				tFungsi = 0;
			}
		}

		index = 0;
		while (index < valid) {
			System.out.print(" Lokasi Penempatan Kerja\t\t: ");
			lokasi = inputKey.nextLine();
			if (lokasi.matches("[A-Za-z., ]+")) {
				if (lokasi.length() > 32) {
					System.out.println("\t\t\t Inputan Melebihi batas 32 Karakter");
				    index=0;
				}else {
			    	index++;
				}
			} else {
			    System.out.println("\t\t\t Inputan Tidak Sesuai");
			    index=0;
			}
		}

		if (lokasi.equals("Papua")||lokasi.equals("papua")) {
			tPapua = tPapua;
		}else {
			tPapua = 0;
		}

		double sewaRmhDbl = 0;
		index = 0;
		while (index < valid) {
			System.out.print(" Sewa Rumah (Y/T)\t\t: ");
			sewaRmh = inputKey.nextLine();
			if (sewaRmh.matches("[YT]+")) {
				// sewaRmhDbl = Double.parseDouble(sewaRmh);
				if (sewaRmh.equals("Y")) {
					sewaRmhDbl = 450000;
				} else if (sewaRmh.equals("T")) {
					sewaRmhDbl = 0;
				}
				index++;
			} else {
			    System.out.println("\t\t\t Inputan Tidak Sesuai");
			    index=0;
			}
		}

		double totalTLain = 0;
		double nomTLainDbl = 0;
		index = 0;
		while (index < valid) {
			System.out.print(" Memiliki tunjangan lain? (Y/T)\t: ");
			tlain = inputKey.nextLine();
			if (tlain.matches("[YT]+")) {
				if (tlain.equals("Y")) {
					add = 0;
					do{
						index = 0;
						while (index < valid) {
							System.out.print(" Masukan Nama Tunjangan\t\t: ");
							namaTLain = inputKey.nextLine();
							if (namaTLain.matches("[A-Za-z., ]+")) {
							    index++;
							} else {
							    System.out.println("\t\t\t Inputan Tidak Sesuai");
							    index=0;
							}
						}
						index = 0;
						while (index < valid) {
							System.out.print(" Jumlah Nominal\t\t\t: ");
							nomTLain = inputKey.nextLine();
							if (nomTLain.matches("[0-9]+")) {
								nomTLainDbl = Double.parseDouble(nomTLain);
								totalTLain+=nomTLainDbl;
							    index++;
							}else {
							    System.out.println("\t\t\t Inputan Harus Angka!");
							    index=0;
							}
						}
						System.out.print(" Ada tunjangan lain lagi? (Y/T)\t: ");
						tlainChoice = inputKey.nextLine();
						if (tlainChoice.matches("[YT]+")) {
							if (tlainChoice.equals("Y")) {
								add = 0;
							}else {
								add ++;
							}
						} else {
						    System.out.println("\t\t\t Inputan Tidak Sesuai");
						    index=0;
						}
					} while (add < valid);
				}
				index++;
			} else {
			    System.out.println("\t\t\t Inputan Tidak Sesuai");
			    index=0;
			}
		}

		// POTONGAN
		double totPotLain = 0;
		double potLainDbl = 0;
		index = 0;
		while (index < valid) {
			System.out.print(" Memiliki potongan lain? (Y/T)\t: ");
			potLain = inputKey.nextLine();
			if (potLain.matches("[YT]+")) {
				if (potLain.equals("Y")) {
					add = 0;
					do{
						index = 0;
						while (index < valid) {
							System.out.print(" Masukan Nama potongan\t\t: ");
							namaPotLain = inputKey.nextLine();
							if (namaPotLain.matches("[A-Za-z., ]+")) {
							    index++;
							} else {
							    System.out.println("\t\t\t Inputan Tidak Sesuai");
							    index=0;
							}
						}
						index = 0;
						while (index < valid) {
							System.out.print(" Jumlah Nominal\t\t\t: ");
							nomPotLain = inputKey.nextLine();
							if (nomPotLain.matches("[0-9]+")) {
								potLainDbl = Double.parseDouble(nomPotLain);
								totPotLain+=potLainDbl;
							    index++;
							}else {
							    System.out.println("\t\t\t Inputan Harus Angka!");
							    index=0;
							}
						}
						System.out.print(" Ada potongan lain lagi? (Y/T)\t: ");
						potLainChoice = inputKey.nextLine();
						if (potLainChoice.matches("[YT]+")) {
							if (potLainChoice.equals("Y")) {
								add = 0;
							}else {
								add ++;
							}
						} else {
						    System.out.println("\t\t\t Inputan Tidak Sesuai");
						    index=0;
						}
					} while (add < valid);
				}
				index++;
			} else {
			    System.out.println("\t\t\t Inputan Tidak Sesuai");
			    index=0;
			}
		}

		double utangDbl = 0;
		index = 0;
		while (index < valid) {
			System.out.print(" Jumlah Utang\t\t\t: ");
			utang = inputKey.nextLine();
			if (utang.matches("[0-9]+")) {
				utangDbl = Double.parseDouble(utang);
			    index++;
			}else {
			    System.out.println("\t\t\t Inputan Harus Angka!");
			    index=0;
			}
		}

		/*
		*
		START
		KALKULASI
		*/
		tIstri = 10.0/100 * gapok;
		
		if (jlhAnak == 0) {
			tAnak = 0;
		}else if (jlhAnak <= 2) {
			tAnak = jlhAnak * ((2.0/100) * gapok);
		}else {
			jlhAnak = 2;
			tAnak = jlhAnak * ((2.0/100) * gapok);
		}

		if (jlhAnak > 2) {
			jlhAnak = 2;
			tBeras = 10 * jlhKeluarga * 14000;
		}

		if (jlhAnak == 0) {
			tAnak = 0;
			tBeras = 10 * jlhKeluarga * 14000;
		}else if (jlhAnak <= 2) {
			tBeras = 10 * (jlhKeluarga + jlhAnak) * 14000;
		}else {
			jlhAnak = 2;
			tBeras = 10 * (jlhKeluarga + jlhAnak) * 14000;
		}

		iwp = (10.0/100) * (gapok + tIstri + tAnak);
		bpjs = (20.0/100) * iwp;
		tht = (32.5/100) * iwp;
		pensiun = (47.5/100) * iwp;

		
		totPotongan = iwp + utangDbl + taperum + sewaRmhDbl + totPotLain;

		// Kalkulasi PPH
		kotorBulanan = gapok + tIstri + tAnak + tUmum + tStruktur + tFungsi + tPapua + totalTLain + tBeras;
		nettoBulanan = kotorBulanan - pensiun;
		nettoTahunan = nettoBulanan * 12;
		ptkp = 36000000;
		if (status.equals("Belum")) {
			ptkp +=0;
		}else if (status.equals("Menikah")) {
			ptkp += 3000000;
			if (jlhAnak==0) {
				ptkp += 0;
			}else if (jlhAnak<=3) {
				ptkp += jlhAnak * 3000000;;
			}else {
				jlhAnak = 3;
				ptkp += jlhAnak * 3000000;;
			}
		}
		pkp = nettoTahunan - ptkp;
		pph = 0;
		if (pkp<0) {
			pph = 0;
		}else {
			if (pkp > 0 && pkp <= 50000000) {
				pph = (5.0/100) * pkp;
			}else if (pkp > 50000000 && pkp <= 250000000) {
				pph5 = (5.0/100) * 50000000;
				pph15 = (15.0/100) * (pkp - pph5);
				pph = pph5 + pph15;
			}else if (pkp > 250000000 && pkp <= 500000000) {
				pph5 = (5.0/100) * 50000000;
				pph15 = (15.0/100) * 250000000;
				pph25 = (25.0/100) * (pkp - (pph5 + pph15));
				pph = pph5 + pph15 + pph25;
			}else if (pkp > 500000000) {
				pph5 = (5.0/100) * 50000000;
				pph15 = (15.0/100) * 250000000;
				pph25 = (25.0/100) * 500000000;
				pph30 = (30.0/100) * (pkp - pph25);
				pph = pph5 + pph15 + pph25 + pph30;
			}
			totPph+=pph;
		}
		totPph /= 12;

		tPajak = totPph;
		totBersih = kotorBulanan - totPotongan;
		/*
		KALKULASI
		END
		*
		*/


		/*
			}
		BLOCK OF CODE
		Coding dibuat dan dikerjakan di area ini
		END
		*
		*
		*
		*/

		/*
		*
		*
		*
		OUTPUT PROGRAM
		*
		*
		*
		*/

		System.out.println(" ____________________________________________________________");
		noSlip = rand.nextInt(1000)+1;

		System.out.println();
		System.out.print(" No: " + noSlip);
		System.out.println();
		System.out.println(" \t  __        ___    __     __   __    _    ___");
		System.out.println(" \t |__   |     |    |__|   | _  |__|    |    | ");
		System.out.println(" \t  __|  |__  _|_   |      |__| |  |  __|   _|_");
		System.out.println("");
		System.out.println(" SEKERTARIAT UTAMA");
		System.out.println();
		// System.out.println(" Pembayaran \t: " + hal);
		System.out.println(" Pegawai \t: " + nama);
		System.out.println(" _______________________________________");
		System.out.println("|                                       |");
		System.out.println("|\t\tPenghasilan\t\t|");
		System.out.println("|_______________________________________|");
		System.out.println("| Gaji Pokok\t: " + gapok);
		System.out.println("| T.Istri/Suami\t: " + tIstri);
		System.out.println("| T.Anak\t: " + tAnak);
		System.out.println("| T.Umum\t: " + tUmum);
		System.out.println("| T.Papua\t: " + tPapua);
		System.out.println("| T.Terpencil\t: 0");
		System.out.println("| T.Struktural\t: " + tStruktur);
		System.out.println("| T.Fungsional\t: " + tFungsi);
		System.out.println("| T.Lain-lain\t: " + totalTLain);
		System.out.println("| T.Beras\t: " + tBeras);
		System.out.println("| T.Pajak\t: " + tPajak);
		System.out.println("\t\t _______________________");
		System.out.println(" Total Kotor\t: " + kotorBulanan);

		System.out.println(" _______________________________________");
		System.out.println("|                                       |");
		System.out.println("|\t\tPotongan\t\t|");
		System.out.println("|_______________________________________|");
		System.out.println("| IWP\t\t: " + iwp);
		System.out.println("| Pot. PPH\t: " + totPph);
		System.out.println("| Sewa Rumah\t: " + sewaRmhDbl);
		// System.out.println("| Tunggakan\t: 0");
		System.out.println("| Utang\t\t: " + utangDbl);
		System.out.println("| Pot. Lain\t: " + totPotLain);
		System.out.println("| Taperum\t: " + taperum);
		System.out.println("|\t\t _______________________");
		System.out.println("| Tot. Potongan\t: " + totPotongan);
		System.out.println("|\t\t _______________________");
		System.out.println("| ");
		//					|	|	|	|	|	|	|	|	|	|	|	|	|	|	|	|	|
		System.out.println("| Tot. Bersih\t: " + totBersih);
		System.out.println("|");
		System.out.println("|_______________________________________");
		System.out.println("Catatan*");
		System.out.println();
		System.out.println("|_______________________________________|");
/**/

	}
}
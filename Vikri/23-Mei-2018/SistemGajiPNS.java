/*
	Created By Vikri
	23/05/2018
	10:56
*/
import java.util.*;
public class SistemGajiPNS{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		int gol1A[] = {1486500, 1533400, 1581700, 1631500, 1682900, 1735900, 1790500, 1846900, 1905100, 1965100, 2027000, 2090800, 2156700, 2224600};
		int gol1B[] = {1623400, 1674500, 1727300, 1781700, 1837800, 1895700, 1955400, 2016900, 2080500, 2146000, 2213600, 2283300, 2355200};
		int gol1C[] = {1692100, 1745400, 1800300, 1857000, 1915500, 1975800, 2038100, 2102300, 2168500, 2236800, 2307200, 2379900, 2454800};
		int gol1D[] = {1763600, 1819200, 1819200, 1935600, 1996500, 2059400, 2124300, 2191200, 2260200, 2331400, 2404800, 2480500, 2558700};

		int gol2A[] = {1926000, 1956300, 2017900, 2081500, 2147000, 2214700, 2284400, 2356400, 2430600, 2507100, 2586100, 2667500, 2751600, 2838200, 2927600, 3019800, 3114900, 3213100}; 
		int gol2B[] = {2103300, 2169500, 2237900, 2308300, 2381100, 2456000, 2533400, 2613200, 2695500, 2780400, 2867900, 2958300, 3051400, 3147600, 3246700, 3348900};
		int gol2C[] = {2192300, 2261300, 2332500, 2406000, 2481800, 2559900, 2640600, 2723700, 2809500, 2898000, 2989300, 3083400, 3180500, 3280700, 3384000, 3490600};
		int gol2D[] = {2285000, 2357000, 2431200, 2507800, 2586700, 2668200, 2752300, 2838900, 2928300, 3020600, 3115700, 3213800, 3315100, 3419500, 3527200, 3638200};

		int gol3A[] = {2456700, 2534000, 2613800, 2696200, 2781100, 2868700,2959000, 3052200, 3148300, 3247500, 3349800, 3455300, 3564100,3676400, 3792100, 3911600, 4034800};
		int gol3B[] = {2560600, 2641200, 2724400, 2810200, 2898700, 2990000, 3084200, 3181300, 3281500, 3384900, 3491500, 3601400, 3714900, 3831900, 3952600, 4007000, 4205400};
		int gol3C[] = {2668900, 2752900, 2839700, 2929100, 3021300, 3116500, 3214700, 3315900, 3420300, 3528100, 3639200, 3753800, 3872000, 3994200, 4119700, 4249500, 4383300};
		int gol3D[] = {2781800, 2869400, 2959800, 3053000, 3149100, 3248300, 3350600, 3456200, 3565000, 3677300, 3912600, 3912600, 4035800, 4162900, 4294000, 4429300, 4568800};

		int gol4A[] = {2899500, 2990800, 3085000, 3182100, 3282400, 3385700, 3492400, 3602400, 3715800, 3832800, 3953600, 4078100, 4206500, 4339000, 4475700, 4616600, 4762000};
		int gol4B[] = {3022100, 3117300, 3215500, 3316700, 3421200, 3528900, 3640100, 3754700, 3873000, 3995000, 4120800, 4250600, 4384400, 4522500, 4665000, 4811900, 4963400};
		int gol4C[] = {3149900, 3249100, 3351500, 3457000, 3565900, 3678200, 3794100, 3913600, 4036800, 4164000, 4295100, 4430400, 4569900, 4713800, 4862300, 5015400, 5173400};
		int gol4D[] = {3283200, 3386600, 3493200, 3603300, 3716700, 3833800, 3954600, 4079100, 4207600, 4340100, 4476800, 4617800, 4763200, 4913200, 5068000, 5227600, 5392200};
		int gol4E[] = {3422100, 3529800, 3641000, 3755700, 3874000, 3996000, 4121800, 4251600, 4385600, 4523700, 4666100, 4813100, 4964700, 5121100, 5282300, 5448700, 5620300};

		int golUmum[] = {175000, 180000, 185000, 190000};
		String golEselon[] = {"1A", "1B", "2A", "2B", "3A", "3B", "4A", "4B", "5A"};
		int golEselonTunjangan[] = {5500000, 4375000, 3250000, 2025000, 1260000, 980000, 540000, 490000, 360000};

		String golPapua[] = {"1A", "1B", "1C", "1D", "2A", "2B", "2C", "2D", "3A", "3B", "3C", "3D", "4A", "4B", "4C", "4D", "5A", "5B", "5C", "5D"};
		int golPapuaTunjangan[] = {200000, 225000, 250000, 275000, 300000, 325000, 350000, 375000, 425000, 450000, 475000, 500000, 525000, 550000, 575000, 600000, 625000};

		String golJenjang[] = {"Pelaksana Pemula","Pelaksana","Pelaksana Lanjutan","Penyelia","Pertama","Muda","Madya","Utama"};
		int golJenjangTunjangan[] = {300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000};

		int validPotonganLain = -100 ,validGolongan = -100 ,validSewaRumah = -100,validTunjanganLain = -100, validPapua= -100, validIstri = -100, validFung = -100, validJabatan = -100, gaji = 0, validAnak = -100, validKerja = -100, validGol = -100 ,validNip = -100, validNama = -100;
		String pSewaRumah, pPapua, papua = "", fungsional = "", jabatan = "", nama, gol, masaKerja, nip, anak = "", pJabatan, pFungsional = "", pAnak = "", pIstri;

		int golTaperum[] = {3000, 5000, 7000, 10000};
		String tLain = "", bLain = "0", pLain;

		String golongan[] = {"1A", "1B", "1C", "1D", "2A", "2B", "2C", "2D", "3A", "3B", "3C", "3D", "4A", "4B", "4C", "4D", "4E"};
		boolean cekk = false;

		String potLain, potLain2 = "", bPotongan = "0";
		do{
			System.out.print("Masukan NIP: ");
			nip = scan.nextLine();

			if (nip.length()<12) {
	        	System.out.println("Masukan Nip Kembali");
	        } else if (nip.matches("[0-9 ]+")) {
	            validNip = 3;
	        } else {
	            System.out.println("Masukan Nip Kembali");
	        }
	        validNip ++;
		}while(validNip < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Masukan Nama: ");
			nama = scan2.nextLine();
			
			if (nama.length()>32) {
	        	System.out.println("Masukan Nama Kembali");
	        } else if (nama.matches("[A-z ,.]+")) {
				validNama = 3;
			} else {
	            System.out.println("Masukan Nama Kembali");				
			}
			validNama++;
		}while(validNama < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Masukan Golongan: ");
			gol = scan.nextLine();
			
			for (int cek = 0; cek < golongan.length; cek++) {
				if (gol.equals(golongan[cek])) {
					validGolongan = 3;
					cekk = true;
					System.out.println("Golongan tersedia");
				}
			}
			if (cekk == false) {
				System.out.println("Golongan tidak tersedia");
				validGolongan++;
			}
		}while(validGolongan < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Masukan Masa Kerja (tahun): ");
			masaKerja = scan.nextLine();
			if (masaKerja.matches("[0-9 ]+")) {
				validKerja = 3;
			} else {
	            System.out.println("Masukan Masa Kerja Kembali");				
			}
			validKerja++;
		}while(validKerja < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Apakah anda punya Istri (y/n): ");
			pIstri = scan.nextLine();
			if (pIstri.equals("y")) {
				validIstri = 3;
			} else if (pIstri.equals("n")) {
				validIstri = 3;				
			} else {
				validIstri++;
			}
		}while(validIstri < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Apakah Anda punya anak: ");
			pAnak = scan.nextLine();
			if (pAnak.equals("y")) {
				System.out.print("Masukan jumlah anak: ");
				anak = scan.nextLine();
				if (anak.matches("[0-9]*")) {
					validAnak = 3;
				} else {
					System.out.println("Masukan Jumlah anak Kembali");
				}
			} else if (pAnak.equals("n")) {
				validAnak = 3;
				anak = "0";
			} else {
	            validAnak++;	
			}
		}while(validAnak < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Apakah anda ditempatkan di papua (y/n): ");
			pPapua = scan.nextLine();
			if (pPapua.equals("y")) {
				System.out.print("Masukan Golongan : ");
				papua = scan.nextLine();
				validPapua = 3;
			} else if (pPapua.equals("n")) {
				validPapua = 3;				
			} else {
				validPapua++;
			}
		}while(validPapua < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Apakah anda Punya jabatan Struktural (y/n): ");
			pJabatan = scan.nextLine();
			if (pJabatan.equals("y")) {
				System.out.print("Masukan Eselon : ");
				jabatan = scan.nextLine();
				boolean s = false;

				for (int check = 0; check < golEselon.length; check++) {
					if (jabatan.equals(golEselon[check])) {
						validJabatan = 3;
						validFung = 3;
						s = true;
					}
				}
				if (s == false) {
					System.out.println("Eselon Tidak tersedia");
					validJabatan++;
				}
			} else if (pJabatan.equals("n")) {
				validJabatan = 3;				
			} else {
				validJabatan++;
			}
		}while(validJabatan < 3);
		System.out.println("-----------------------------");
		if (validFung < 3 ) {
			do{
				System.out.print("Punya jabatan Fungsional (y/n): ");
				pFungsional = scan.nextLine();
				if (pFungsional.equals("y")) {
					boolean e = false;
					System.out.print("Masukan Jenjang : ");
					fungsional = scan.nextLine();

					for (int u = 0; u<golJenjang.length; u++) {
						if (fungsional == golJenjang[u]) {
							System.out.println("Jenjang Tersedia");
							validFung = 3;
							e = true;
						}
					}
					if (e == false) {
						System.out.println("Jenjang Tidak Tersedia");
						validFung++;
					}
				} else if (pFungsional.equals("n")) {
					validFung = 3;				
				} else {
					validFung++;
				}
			}while(validFung < 3);
		}
		System.out.println("-----------------------------");
		do{
			System.out.print("Apakah anda Punya Tunjangan Lain (y/n): ");
			pLain = scan.nextLine();
			if (pLain.equals("y")) {
				System.out.print("Masukan Tunjangan : ");
				tLain = scan.nextLine();

				System.out.print("Besar Tunjangan : ");
				bLain = scan.next();

				validTunjanganLain = 3;
			} else if (pLain.equals("n")) {
				validTunjanganLain = 3;				
			} else {
				validTunjanganLain++;
			}
		}while(validTunjanganLain < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Apakah anda tinggal di Rumah dinas (y/n): ");
			pSewaRumah = scan.nextLine();
			if (pLain.equals("y")) {
				validSewaRumah = 3;
			} else if (pLain.equals("n")) {
				validSewaRumah = 3;				
			} else {
				validSewaRumah++;
			}
		}while(validSewaRumah < 3);
		System.out.println("-----------------------------");
		do{
			System.out.print("Apakah anda Punya Potongan Lain (y/n): ");
			potLain = scan.nextLine();
			if (potLain.equals("y")) {
				System.out.print("Masukan Nama Potongan : ");
				potLain2 = scan.nextLine();

				System.out.print("Besar Potongan : ");
				bPotongan = scan.nextLine();

				validPotonganLain = 3;
			} else if (pLain.equals("n")) {
				validPotonganLain = 3;				
			} else {
				validPotonganLain++;
			}
		}while(validPotonganLain < 3);

		System.out.println("===========================================");
		int kerja = Integer.parseInt(masaKerja);
		boolean cek = false;

		if (gol.equals("1A")) {
			if (kerja==0||kerja==1) {
				System.out.println("Gaji Pokok: Rp. "+gol1A[0]);
				gaji = gol1A[kerja];
			} else {
				kerja= kerja/2;
				for (int g = 0; g < gol1A.length; g++) {
					if (g == kerja) {
						gaji = gol1A[kerja];
						System.out.println("Gaji Pokok\t\t: Rp. "+gaji);
						cek = true;
					}
				}
			}
		} else if (gol.equals("1B")) {
			if (kerja<3) {
				System.out.println("Masa Kerja Kurang");
			} else {
				if (kerja%2==1) {
					kerja/=2;
					kerja-=1;
				} else {
					kerja= kerja/2;
					kerja-=2;
				}
				gaji = gol1B[kerja];
				System.out.println("Gaji Pokok\t\t: Rp. "+gol1B[kerja]);
			}
		} else if (gol.equals("1C")) {
			if (kerja<3) {
				System.out.println("Masa Kerja Kurang");
			} else {
				if (kerja%2==1) {
					kerja/=2;
					kerja-=1;
				} else {
					kerja= kerja/2;
					kerja-=2;
				}
				gaji = gol1C[kerja];
				System.out.println("Gaji Pokok\t\t: Rp. "+gol1C[kerja]);
			}
		} else if (gol.equals("1D")) {
			if (kerja<3) {
				System.out.println("Masa Kerja Kurang");
			} else {
				if (kerja%2==1) {
					kerja/=2;
					kerja-=1;
				} else {
					kerja= kerja/2;
					kerja-=2;
				}
				gaji = gol1D[kerja];
				System.out.println("Gaji Pokok\t\t: Rp. "+gol1D[kerja]);
			}
		} else if (gol.equals("2A")) {
			if (kerja==0) {
				System.out.println("Gaji Pokok: Rp. "+gol2A[kerja]);
				gaji = gol2A[kerja];
			} else {
				if (kerja%2==1) {
					kerja/=2;
					kerja+=1;
				} else {
					kerja= kerja/2;
				}
				gaji = gol2A[kerja];
				System.out.println("Gaji Pokok\t\t: Rp. "+gol2A[kerja]);
			}
		} else if (gol.equals("2B")) {
			if (kerja<3) {
				System.out.println("Masa Kerja Kurang");
			} else {
				if (kerja%2==1) {
					kerja/=2;
					kerja-=1;
				} else {
					kerja= kerja/2;
					kerja-=2;
				}
				gaji = gol2B[kerja];
				System.out.println("Gaji Pokok\t\t: Rp. "+gol2B[kerja]);
			}
		} else if (gol.equals("2C")) {
			if (kerja<3) {
				System.out.println("Masa Kerja Kurang");
			} else {
				if (kerja%2==1) {
					kerja/=2;
					kerja-=1;
				} else {
					kerja= kerja/2;
					kerja-=2;
				}
				gaji = gol2C[kerja];
				System.out.println("Gaji Pokok\t\t: Rp. "+gol2C[kerja]);
			}
		} else if (gol.equals("2D")) {
			if (kerja<3) {
				System.out.println("Masa Kerja Kurang");
			} else {
				if (kerja%2==1) {
					kerja/=2;
					kerja-=1;
				} else {
					kerja= kerja/2;
					kerja-=2;
				}
				gaji = gol2D[kerja];
				System.out.println("Gaji Pokok\t\t: Rp. "+gol2D[kerja]);
			}
		} else if (gol.equals("3A")||gol.equals("3B")||gol.equals("3C")||gol.equals("3D")) {
				if (gol.equals("3A")) {
					kerja/=2;
					gaji = gol3A[kerja];
					System.out.println("Gaji Pokok\t\t: Rp. "+gol3A[kerja]);
				} else if (gol.equals("3B")) {
					kerja/=2;
					gaji = gol3B[kerja];
					System.out.println("Gaji Pokok\t\t\t\t: Rp. "+gol3B[kerja]);
				} else if (gol.equals("3C")) {
					kerja/=2;
					gaji = gol3C[kerja];
					System.out.println("Gaji Pokok\t\t: Rp. "+gol3C[kerja]);
				} else {
					kerja/=2;
					gaji = gol3D[kerja];
					System.out.println("Gaji Pokok\t\t: Rp. "+gol3D[kerja]);
				}
		} else if (gol.equals("4A")||gol.equals("4B")||gol.equals("4C")||gol.equals("4D")||gol.equals("4E")) {
				if (gol.equals("4A")) {
					kerja/=2;
					gaji = gol4A[kerja];
					System.out.println("Gaji Pokok\t\t: Rp. "+gol4A[kerja]);
				} else if (gol.equals("4B")) {
					kerja/=2;
					gaji = gol4B[kerja];
					System.out.println("Gaji Pokok\t\t: Rp. "+gol4B[kerja]);
				} else if (gol.equals("4C")) {
					kerja/=2;
					gaji = gol4C[kerja];
					System.out.println("Gaji Pokok\t\t: Rp. "+gol4C[kerja]);
				} else if (gol.equals("4D")) {
					kerja/=2;
					gaji = gol4D[kerja];
					System.out.println("Gaji Pokok\t\t: Rp. "+gol4D[kerja]);
				} else {
					kerja/=2;
					gaji = gol4E[kerja];
					System.out.println("Gaji Pokok\t\t: Rp. "+gol4E[kerja]);
				}
		} else {
			System.out.println("Golongan Tidak Diketahui Maaf :)");
		}
		System.out.println("===========================================");
		int anak2 = Integer.parseInt(anak);
		int anak3 = Integer.parseInt(anak);
		int istri, jmlhanak = 0, tPapua = 0;
		int tFung = 0, tStruk = 0, tUmum = 0, fungsi = 0;
		String umum = "";
		
		umum = gol.substring(0,1);
		tUmum = Integer.parseInt(umum);
		tUmum -= 1;
		tUmum = golUmum[tUmum];

		if (pJabatan.equals("y")) {
			for (int a = 0; a < golEselon.length; a++) {
				if (jabatan.equals(golEselon[a])) {
					tStruk = golEselonTunjangan[a];
				}
			}
			tUmum = 0;
			tFung = 0;		
		}

		if (pFungsional.equals("y")) {
			for (int b = 0; b < golJenjang.length; b++) {
				if (fungsional.equals(golJenjang[b])) {
					tFung = golJenjangTunjangan[b];
				}
			}
			tStruk = 0;
			tUmum = 0;		
		}		

		if (pPapua.equals("y")) {
			for (int pa = 0; pa < golPapua.length; pa++) {
				if (papua.equals(golPapua[pa])) {
					tPapua = golPapuaTunjangan[pa];
				}
			}	
		}

		int istri2 = 0, beras = 1, sewa = 0;
		if (pIstri.equals("y")){
			istri2 = gaji*10/100;
			beras += 1;
		} else {
			istri2 = 0;
		}

		if (pAnak.equals("y")){
			if (anak2 > 2) {
				anak2 = 2;
			}
			jmlhanak = (gaji*2/100)*anak2;
			beras += anak2;
		}

		if (pSewaRumah.equals("y")) {
			sewa = 450000;
		}
		beras = beras * (10*14000);
		int potonganLain ,iwp, tLain2, taperum, pph = 0, gajiKotor, gajiBersih, bJabatan, gajiBersihSetahun;
		String tap;
		tap = gol.substring(0,1);
		taperum = Integer.parseInt(umum);
		tLain2 = Integer.parseInt(bLain);
		potonganLain = Integer.parseInt(bPotongan);
		taperum = golTaperum[taperum-1];

		int ptkp = 0, pkp = 0;
		if (pIstri.equals("y")&&pAnak.equals("y")) {
			ptkp += 36000000 + 3000000 + (3000000*anak2);
		} else if (pIstri.equals("y")&&pAnak.equals("n")) {
			ptkp += 36000000 + 3000000;
		} else if (pIstri.equals("n")&&pAnak.equals("y")) {
			ptkp += 36000000 + (3000000*anak3);
		} else {
			ptkp += 36000000;
		}

		iwp = (gaji + istri2 + jmlhanak)*10/100;
		gajiKotor = gaji + tLain2 + tUmum + tFung + tStruk+ tPapua + jmlhanak + istri2 + beras;
		gajiBersih = gajiKotor - (iwp + taperum + sewa + potonganLain);
		gajiBersihSetahun = gajiBersih * 12;

		pkp = gajiBersihSetahun - ptkp;
		int pkp2;
		if (ptkp>gajiBersihSetahun) {
			pph = 0;
		} else {
			pkp = gajiBersihSetahun - ptkp;
			if (pkp < 50000000) {
				pph = pkp * 5/100;
				pph = pph/12;
			} else if (pkp > 50000000&&pkp<=250000000) {
				pkp2 = pkp - 50000000;
				pph += 50000000*5/100;
				pph += pkp2*15/100;
				pph = pph/12;
			} else if (pkp > 250000000&&pkp < 50000000) {
				pph += 50000000*5/100;
				pkp2 = pkp - 250000000;
				pph += 25000000*15/100;
				pph += pkp2*25/100;
				pph = pph/12;
			} else {
				pph += 50000000*5/100;
				pph += 250000000*15/100;
				pph += 500000000*25/100;
				pkp2  = pkp - 500000000;
				pph += pkp2*30/100;
				pph = pph/12;
			}
		}

		System.out.println("Tunjangan Istri\t\t: "+istri2);
		System.out.println("Tunjangan Anak\t\t: "+jmlhanak);
		System.out.println("Tunjangan Umum\t\t: "+tUmum);
		System.out.println("Tunjangan Papua\t\t: "+tPapua);
		System.out.println("Tunjangan Struktural\t: "+tStruk);
		System.out.println("Tunjangan Fungsi\t: "+tFung);
		System.out.println("Tunjangan Beras\t\t: "+beras);
		System.out.println("Tunjangan Pajak\t\t: "+pph);
		System.out.println("Tunjangan Lain\t\t ");
		System.out.println(" - "+tLain+"\t\t: "+bLain);
		System.out.println("===========================================");
		System.out.println("Potongan IWP\t\t: "+iwp);
		System.out.println("Potongan Taperum\t: "+taperum);
		System.out.println("Potongan Sewa Rumah\t: "+sewa);
		System.out.println("Potongan Lain\t\t ");
		System.out.println(" - "+potLain2+"\t\t: "+potonganLain);
		System.out.println("Potongan PPH\t\t: "+pph);
		System.out.println("===========================================");
		System.out.println("Gaji Kotor/Bulan\t: "+gajiKotor);
		System.out.println("Gaji Bersih/Bulan\t: "+gajiBersih);
		System.out.println("===========================================");
		System.out.println("Penghasilan Bersih Setahun\t: "+gajiBersihSetahun);

		if (pIstri.equals("y")&&pAnak.equals("y")) {
			System.out.println("PTKP (Kawin "+anak+" Anak)\t\t: "+ptkp);
		} else if (pIstri.equals("y")&&pAnak.equals("n")) {
			System.out.println("PTKP (Kawin)\t\t\t: "+ptkp);
		} else if (pIstri.equals("n")&&pAnak.equals("y")) {
			System.out.println("PTKP ("+anak+" Anak)\t\t\t: "+ptkp);
		} else {
			System.out.println("PTKP\t\t\t\t: "+ptkp);
		}
		if (pkp < 0 ) {
			System.out.println("PTKP lebih besar dari Netto 1 Tahun");
		} else {
			System.out.println("PKP\t\t\t\t: "+pkp);
			System.out.println("PPH Setahun\t\t\t: "+(pkp*12));
			System.out.println("PPH PER BULAN\t\t\t: "+pph);
		}

	}
}
/*
	* Created by:	Alifhar Juliansyah
	* 				23-05-2018	13.07
	* Updated by:
	*
*/
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class GajiPNS{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		NumberFormat money=NumberFormat.getCurrencyInstance(Locale.US);
//		System.out.println(money.format(1000));
		String nama, nip, gol, stat, jab, eselon, pend, lokasi, rumah, lain, waktu, anak;
		int masaKerja, tUmum=0, tStruk=0, tFung=0, tPapua=0, tTerp=0, tLain=0, sewa=0, tBeras, gapok, wpPribadi=36000000, wpKawin=0, wpAnak, jumlahAnak, keluarga=1;
		double tKel=0, tAnak, tPajak, netto, iwp, pph, tarum, potongan, pkp, ptkp, total;
		double[] pkpn={0, 0, 0, 0};
		int[] satuA = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600},
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
		boolean check=false;

		System.out.println("GAJI PEGAWAI NEGERI SIPIL");
		System.out.println("------------------------------------------------");
// Nama
		do{  
			System.out.print("| Nama\t\t\t\t: ");
			nama=scan.nextLine();
			if(nama.matches("[a-z A-Z.,]+") && nama.length()<=32)
				check=true;
			else
				System.out.println("inputan tidak sesuai");
		}while(!check);
		check=false;
// NIP		
		do{
			System.out.print("| NIP\t\t\t\t: ");
			nip=scan.nextLine();
			if(nip.matches("[0-9]+") && nip.length()>=12 && nip.length()<=18)
				check=true;
			else
				System.out.println("inputan tidak sesuai");
		}while(!check);
		check=false;
// Golongan
		do{
			System.out.print("| Golongan\t\t\t: ");
			gol=scan.nextLine();
			if(gol.length()<2)
				System.out.println("NIP berkisar antara 12 sampai 18 karakter");
			else if(gol.substring(0,1).matches("[1-4]") && gol.substring(1,2).matches("[a-eA-E]"))
				check=true;
			else
				System.out.println("inputkan tidak sesuai, contoh 3A");
		}while(!check);
		check=false;
// Masa Kerja
		do{
			System.out.print("| Masa Kerja\t\t\t: ");
			waktu=scan.nextLine();
			if( (gol.substring(1,2).matches("[b-eB-E]") && !waktu.matches("[0-2]")) || (gol.substring(1,2).matches("[aA]") && waktu.matches("[0-9]+")) )
				check=true;
			else
				System.out.println("inputan tidak sesuai");
		}while(!check);
		check=false;
// Status
		do{
			System.out.print("| Status\t\t\t: ");
			stat=scan.nextLine();
			if(stat.equals("single") || stat.equals("menikah"))
				check=true;
			else
				System.out.println("inputan \"single\" atau \"menikah\"");
		}while(!check);
		check=false;
// Jumlah Anak
		do{
			System.out.print("| Jumlah Anak\t\t\t: ");
			anak=scan.nextLine();
			if(anak.matches("[0-9]+"))
				check=true;
			else
				System.out.println("inputan tidak sesuai");
		}while(!check);
		check=false;
//Jabatan
		do{
			System.out.print("| Mempunyai jabatan struktural\t: ");
			jab=scan.nextLine();
			if(jab.equals("ya")){
				check=true;
				jab="struktural";
			}
			else if (jab.equals("tidak")){
				System.out.print("| Mempunyai jabatan Fungsional\t: ");
				jab=scan.nextLine();
				if(jab.equals("ya")){
					check=true;
					jab="fungsional";
				}
				else if (jab.equals("tidak"))
					check=true;
			}
			else
				System.out.println("inputan \"ya\" atau \"tidak\"");
		}while(!check);
		check=false;

		if(jab.equals("struktural"))
			do{
				System.out.print("|\tEselon\t: ");
				eselon=scan.nextLine();
				if( (eselon.substring(0,1).matches("[1-4]") && eselon.substring(1,2).matches("[abAB]")) || (eselon.substring(0,1).matches("[5]") && eselon.substring(1,2).matches("[aA]")) ){
					check=true;
					if(eselon.equals("1A") || eselon.equals("1a"))
						tStruk=5500000;
					else if(eselon.equals("1B") || eselon.equals("1B"))
						tStruk=4375000;
					else if(eselon.equals("2A") || eselon.equals("2a"))
						tStruk=3250000;
					else if(eselon.equals("2B") || eselon.equals("2b"))
						tStruk=2025000;
					else if(eselon.equals("3A") || eselon.equals("3a"))
						tStruk=1260000;
					else if(eselon.equals("3B") || eselon.equals("3b"))
						tStruk=980000;
					else if(eselon.equals("4A") || eselon.equals("4a"))
						tStruk=540000;
					else if(eselon.equals("4B") || eselon.equals("4b"))
						tStruk=490000;
					else if(eselon.equals("5A") || eselon.equals("5a"))
						tStruk=360000;
				}
				else
					System.out.println("inputan tidak sesuai, contoh 2A");
			}while(!check);
		else if(jab.equals("fungsional"))
			do{
				System.out.print("|\tPendidikan terakhir\t: ");
				pend=scan.nextLine();
				if( pend.equals("SMA") || pend.equals("SMK") || pend.equals("D3") ){
					if(gol.equals("3C") || gol.equals("3c") || gol.equals("3D") || gol.equals("3d") ){
						tFung=600000;
						check=true;
					} else if(gol.equals("3A") || gol.equals("3a") || gol.equals("3B") || gol.equals("3b") ){
						tFung=500000;
						check=true;
					} else if(gol.equals("2B") || gol.equals("2b") || gol.equals("2C") || gol.equals("2c") || gol.equals("2D") || gol.equals("2d") ){
						tFung=400000;
						check=true;
					} else if(gol.equals("2A") || gol.equals("2a") ){
						tFung=300000;
						check=true;
					} else
						System.out.println("inputan tidak sesuai");	
				} else if( pend.equals("S1") || pend.equals("S2") || pend.equals("S3") ) {
					if( gol.equals("4D") || gol.equals("4d") || gol.equals("4E") || gol.equals("4e") ){
						tFung=1000000;
						check=true;
					} else if( gol.equals("4A") || gol.equals("4a") || gol.equals("4B") || gol.equals("4b") || gol.equals("4C") || gol.equals("4c") ){
						tFung=900000;
						check=true;
					} else if( gol.equals("3C") || gol.equals("3c") || gol.equals("3D") || gol.equals("3d") ){
						tFung=800000;
						check=true;
					} else if( gol.equals("3A") || gol.equals("3a") || gol.equals("3B") || gol.equals("3b") ){
						tFung=700000;
						check=true;
					} else
						System.out.println("inputan tidak sesuai");
				}
				else
					System.out.println("inputan tidak sesuai, inputan tersedia: SMA/SMK/D3/S1/S2/S3");
			}while(!check);
		else {
			if(gol.substring(0,1).equals("4"))
				tUmum=190000;
			if(gol.substring(0,1).equals("3"))
				tUmum=185000;
			if(gol.substring(0,1).equals("2"))
				tUmum=180000;
			if(gol.substring(0,1).equals("1"))
				tUmum=175000;
		}
		check=false;
// Lokasi
		do{
			System.out.print("| Lokasi Kerja (Provinsi)\t: ");
			lokasi=scan.nextLine();
			if(lokasi.matches("[a-z A-Z]+"))
				check=true;
			else
				System.out.println("inputan tidak sesuai");
		}while(!check);
		check=false;
// Rumah Dinas
		do{
			System.out.print("| Menempati Rumah Dinas\t\t: ");
			rumah=scan.nextLine();
			if(rumah.equals("ya")){
				sewa=450000;
				check=true;
			} else if(rumah.equals("tidak"))
				check=true;
			else
				System.out.println("inputan tidak sesuai");
		}while(!check);
		check=false;

		masaKerja=Integer.parseInt(waktu);
		if(gol.substring(0,1).equals("1") && masaKerja>=satuA.length)
			masaKerja=satuA.length-1;
		else if(gol.substring(0,1).equals("2") && masaKerja>=duaA.length)
			masaKerja=duaA.length-1;
		else if(gol.substring(0,1).equals("3") && masaKerja>=tigaA.length)
			masaKerja=tigaA.length-1;
		else if(gol.substring(0,1).equals("4") && masaKerja>=empatA.length)
			masaKerja=empatA.length-1;

		if(gol.equals("1A") || gol.equals("1a")){
			gapok=satuA[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=200000;
		} else if(gol.equals("1B") || gol.equals("1b")){
			gapok=satuB[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=225000;
		} else if(gol.equals("1C") || gol.equals("1c")){
			gapok=satuC[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=250000;
		} else if(gol.equals("1D") || gol.equals("1d")){
			gapok=satuD[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=275000;
		} else if(gol.equals("2A") || gol.equals("2a")){
			gapok=duaA[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=300000;
		} else if(gol.equals("2B") || gol.equals("2b")){
			gapok=duaB[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=325000;
		} else if(gol.equals("2C") || gol.equals("2c")){
			gapok=duaC[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=350000;
		} else if(gol.equals("2D") || gol.equals("2d")){
			gapok=duaD[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=375000;
		} else if(gol.equals("3A") || gol.equals("3a")){
			gapok=tigaA[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=425000;
		} else if(gol.equals("3B") || gol.equals("3b")){
			gapok=tigaB[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=450000;
		} else if(gol.equals("3C") || gol.equals("3c")){
			gapok=tigaC[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=475000;
		} else if(gol.equals("3D") || gol.equals("3d")){
			gapok=tigaD[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=500000;
		} else if(gol.equals("4A") || gol.equals("4a")){
			gapok=empatA[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=525000;
		} else if(gol.equals("4B") || gol.equals("4b")){
			gapok=empatB[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=550000;
		} else if(gol.equals("4C") || gol.equals("4c")){
			gapok=empatC[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=575000;
		} else if(gol.equals("4D") || gol.equals("4d")){
			gapok=empatD[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=600000;
		} else if(gol.equals("4E") || gol.equals("4e")){
			gapok=empatE[masaKerja];
			if(lokasi.equals("Papua") || lokasi.equals("papua"))
				tPapua=625000;
		} else gapok=0;


		if(stat.equals("menikah")){
			keluarga=2;
			tKel=0.1*gapok;
			wpKawin=3000000;
		}

		jumlahAnak=Integer.parseInt(anak);
		if(jumlahAnak>2){
			tAnak=2*0.02*gapok;
			wpAnak=3000000*2;
		} else{
			tAnak=2*0.02*gapok;
			wpAnak=3000000*jumlahAnak;
		}

		tBeras=14000*10*(keluarga+jumlahAnak);

		netto=gapok+tKel+tAnak+tUmum+tStruk+tFung+tPapua+tTerp+tLain+tBeras;


		iwp=0.1*(gapok+tKel+tAnak);

		ptkp=wpPribadi+wpKawin+wpAnak;
		pkp=netto*12-ptkp;
		if(pkp<50000000){
			pph=0.05*pkp;
		} else {
			if(pkp>50000000){
				pkpn[0]=50000000;
				pkpn[1]=pkp-50000000;
			}
			if(pkp>250000000){
				pkpn[1]=200000000;
				pkpn[2]=pkp-250000000;
			}
			if(pkp>500000000){
				pkpn[2]=250000000;
				pkpn[3]=pkp-500000000;
			}
			pph=0.05*pkpn[0]+0.15*pkpn[1]+0.25*pkpn[2]+0.3*pkpn[3];
		}
		tPajak=pph;

		if(gol.substring(0,1).equals("1"))
			tarum=3000;
		else if(gol.substring(0,1).equals("2"))
			tarum=5000;
		else if(gol.substring(0,1).equals("3"))
			tarum=7000;
		else
			tarum=10000;

		potongan=iwp+sewa+tarum;

		total=netto-potongan;

		System.out.println("==========================================");
		System.out.println("\tGAJI PEGAWAI NEGERI SIPIL");
		System.out.println("==========================================");
		System.out.print("Nama : "+nama+"\n");
		System.out.print("NIP  : "+nip+"\n");

		System.out.println("\n Tunjangan");
		System.out.println(" ==========================================");
		System.out.println("| Gaji Pokok\t\t\t"+gapok);
		System.out.println("| Tunjangan keluarga\t\t"+tKel);
		System.out.println("| Tunjangan Anak\t\t"+tAnak);
		System.out.println("| Tunjangan Umum\t\t"+tUmum);
		System.out.println("| Tunjangan Struktural\t\t"+tStruk);
		System.out.println("| Tunjangan Fungsional\t\t"+tFung);
		System.out.println("| Tunjangan Papua\t\t"+tPapua);
		System.out.println("| Tunjangan Terpencil\t\t"+tTerp);
		System.out.println("| Tunjangan Lain\t\t"+tLain);
		System.out.println("| Tunjangan Beras\t\t"+tBeras);
		System.out.println("| Tunjangan Pajak\t\t"+tPajak);

		System.out.println("\n Potongan");
		System.out.println(" ==========================================");
		System.out.println("| IWP\t\t\t\t"+iwp);
		System.out.println("| Potongan PPH\t\t\t"+pph);
		System.out.println("| Sewa Rumah\t\t\t"+sewa);
		System.out.println("| Taperum\t\t\t"+tarum);

		System.out.println("\n--------------------------------------------");
		System.out.println("| Jumlah Gaji Bersih\t\t"+netto);
		System.out.println("| Jumlah Potongan\t\t"+potongan);
		System.out.println("--------------------------------------------");
		System.out.println("| Gaji Total\t\t\t"+total);

		// System.out.print("|Tunjangan lain (ya/tidak)             : ");
		// System.out.print("|Utang                         : ");
		// System.out.print("|Potongan lain                         : ");
	}
}
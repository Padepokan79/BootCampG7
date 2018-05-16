/* 	Date 		: 15/5/2018    
	Time 		: 08:31:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/
	import java.util.Scanner;

	public class TugasIfMalik1 {
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double jaketMaks=10000, jaketMin=6000, kaosKakiMaks=4000, kaosKakiMin=2000, celanaMaks=8000,
				celanaMin=3200, topiMaks, topiMin, sweaterMaks, sweaterMin, 
				hargaJaket=30000, hargaKaosKaki=10000, hargaCelana=20000,
				hargaTopi=5000, hargaSweater=15000,maks, jaket, kaosKaki, celana,
				topi, sweater, harga, gaji=2000000, naik, untung;

				topiMaks = 0.3*jaketMaks; topiMin=0.7*topiMaks;
				sweaterMaks = 0.25*(jaketMaks+kaosKakiMaks+celanaMaks+topiMaks); sweaterMin=0.8*topiMaks;

				maks =(jaketMaks*hargaJaket) + ((kaosKakiMaks/2)*hargaKaosKaki) + (hargaCelana*celanaMaks) + (topiMaks*hargaTopi) + (sweaterMaks*hargaSweater);

				//System.out.printf("%.0f",maks);

				System.out.println("=====================");
				System.out.println("   PABRIK KONVEKSI");
				System.out.println("=====================");
				System.out.println();
				System.out.println("jumlah produksi jaket \t\t: ");
				jaket = key.nextInt();
				System.out.println("jumlah produksi kaos kaki \t: ");	
				kaosKaki = key.nextInt();
				System.out.println("jumlah produksi celana \t\t: ");
				celana = key.nextInt();
				System.out.println("jumlah produksi topi \t\t: ");
				topi = key.nextInt();
				System.out.println("jumlah produksi sweater \t: ");
				sweater = key.nextInt();
				System.out.println("---------------------");


				if (kaosKaki%2!=0){
				}
				else if (jaket>=jaketMin && jaket<=jaketMaks && kaosKaki>=kaosKakiMin && kaosKaki<=kaosKakiMaks && 
					celana>=celanaMin && celana<=celanaMaks && topi>=topiMin && topi<=topiMaks && 
					sweater>=sweaterMin && sweater<=sweaterMaks){
					harga = (jaket*hargaJaket) + ((kaosKaki/2)*hargaKaosKaki) + (hargaCelana*celana) + (topi*hargaTopi) + (sweater*hargaSweater);
					untung = 0.5*harga;

					if (untung>=294375000) {
						System.out.println("SUKSES");
						naik=0.02*untung;
						System.out.println("gaji karyawan naik sebesar Rp. "+naik);
						gaji+=naik;
						System.out.println("gaji karyawan sebesar Rp. "+gaji);
					}
					else if (untung>0.6*maks) {
						System.out.println("Cukup sukses");
						naik=0*untung;
						System.out.println("gaji karyawan naik sebesar Rp. "+naik);
						gaji+=naik;
						System.out.println("gaji karyawan sebesar Rp. "+gaji);
					}
					else if (untung>0.6*0.5*maks) {
						System.out.println("KURANG SUKSES");
						naik=0.02*untung;
						System.out.println("gaji karyawan turun sebesar Rp. "+naik);
						gaji+=naik;
						System.out.println("gaji karyawan sebesar Rp. "+gaji);
					}
					else {
						System.out.println("Salah bos");
					}

				}
				else {
					System.out.println("error !");
				}

		}
	}
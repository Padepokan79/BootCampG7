package soal4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by : Alifhar Juliansyah
 * Jun 22, 2018
 * 1:54:35 PM
 */
public class Soal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0, totalTahun=5;
		
		// Jenis Credit Card yang ada
		CreditCard visaGold=new VisaGold();
		CreditCard masterTitanium=new MasterTitanium();
		CreditCard visaPlatinum=new VisaPlatinum();
		CreditCard masterWorldmiles=new MasterWorldmiles();
		
		Person org1=new Person("Ayah", masterWorldmiles, visaPlatinum);
		Person org2=new Person("Ibu", visaGold, visaPlatinum);
		Person org3=new Person("Anak", masterTitanium);
		
		ArrayList<Person> keluarga=new ArrayList<Person>(Arrays.asList(org1, org2, org3));
		
		for(int tahun=1; tahun<=totalTahun; tahun++) {
			System.out.println("Tahun ke-"+tahun);
			for(Person orang:keluarga) {
				int temp=0;
				for(CreditCard kartu:orang.card) {
					if(tahun!=3)
						temp+=kartu.hitung();
					else
						temp+=kartu.hitung()*0.9;
				}
				total+=temp;
				System.out.println("Total tagihan "+orang.getNama()+" adalah Rp. "+temp);
			}
			System.out.println();
		}
		
		System.out.println("Jumlah uang yang harus dibayarkan selama 5 tahun "+total);
	}

}

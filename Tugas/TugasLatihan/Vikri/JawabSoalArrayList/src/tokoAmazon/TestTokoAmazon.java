package tokoAmazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestTokoAmazon {
	public static void main(String[] args) {
		int menu, total = 0, itemm = 0, brg1, brg2, brg3, brg4, brg5, disc;
		TokoAmazon fanta = new TokoAmazon("Fanta", 7000, 3, 15, 0, 0, 0, 5, 3);
		TokoAmazon taro = new TokoAmazon("Taro", 3000, 10, 20, 0, 18, 0, 6, 3);
		TokoAmazon shampoo = new TokoAmazon("Shampoo", 12000, 0, 0, 3, 0, 0, 12, 0);
		TokoAmazon tissue = new TokoAmazon("Tissue", 2000, 0, 3, 0, 0, 0, 10, 0);
		TokoAmazon magnum = new TokoAmazon("Ice Magnum", 10000, 0, 12, 0, 2, 0, 15, 2);
		
		ArrayList<TokoAmazon> al = new ArrayList<TokoAmazon>();	
		ArrayList<Integer> temp = new ArrayList<Integer>();	
		ArrayList<Integer> item = new ArrayList<Integer>();	
		al.add(fanta);
		al.add(taro);
		al.add(shampoo);
		al.add(tissue);
		al.add(magnum);
		
		for(TokoAmazon ta : al) {
			total += ta.getHarga()*ta.getHari1();
			total += ta.getHarga()*ta.getHari2();
			total += ta.getHarga()*ta.getHari3();
			total += ta.getHarga()*ta.getHari4();
			total += ta.getHarga()*ta.getHari5();
			total += ta.getHarga()*ta.getHari6();
			
			disc = ta.getHarga()*(ta.getHari7()-1)*20/100;
			total += ta.getHarga()*(ta.getHari7()-1)-disc;
		}
		item.add(itemm);
		temp.add(total);
		total *= 0;
		for(TokoAmazon ta : al) {
			total += ta.getHarga()*(2+ta.getHari1());
			total += ta.getHarga()*(2+ta.getHari2());
			total += ta.getHarga()*(2+ta.getHari3());
			total += ta.getHarga()*(2+ta.getHari4());
			total += ta.getHarga()*(ta.getHari5());
			total += ta.getHarga()*(2+ta.getHari6());
			
			disc = ta.getHarga()*(2+ta.getHari7())*20/100;
			total += ta.getHarga()*(2+ta.getHari7())-disc;
		}
		temp.add(total);
		total *= 0;
		for(TokoAmazon ta : al) {
			total += ta.getHarga()*(ta.getHari1()+1);
			total += ta.getHarga()*(ta.getHari2()+1);
			total += ta.getHarga()*(ta.getHari3()+1);
			total += ta.getHarga()*(ta.getHari4()+1);
			total += ta.getHarga()*(ta.getHari5());
			total += ta.getHarga()*(ta.getHari6()+1);
			
			disc = ta.getHarga()*(ta.getHari7()+1)*20/100;
			total += ta.getHarga()*(ta.getHari7()+1)-disc;
		}
		temp.add(total);
		total *= 0;
		for(TokoAmazon ta : al) {
			
			if(ta.getHari1()<1) {
				ta.setHari1(2);
			} else if(ta.getHari2()<1) {
				ta.setHari2(2);
			} else if(ta.getHari3()<1) {
				ta.setHari3(2);
			} else if(ta.getHari4()<1) {
				ta.setHari4(2);
			} else if(ta.getHari5()<1) {
				ta.setHari5(2);
			} else if(ta.getHari6()<1) {
				ta.setHari6(2);
			} else if(ta.getHari7()<1) {
				ta.setHari7(2);
			} 
			
			total += ta.getHarga()*(ta.getHari1()-2);
			total += ta.getHarga()*(ta.getHari2()-2);
			total += ta.getHarga()*(ta.getHari3()-2);
			total += ta.getHarga()*(ta.getHari4()-2);
			total += ta.getHarga()*(ta.getHari5());
			total += ta.getHarga()*(ta.getHari6()-2);
			
			disc = ta.getHarga()*(ta.getHari7()-2)*20/100;
			total += ta.getHarga()*(ta.getHari7()-2)-disc;
		}
		temp.add(total);
		total *= 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pilih Menu: ");
		menu = scan.nextInt();
		
		if (menu == 1) {
			System.out.println("Penghasilan minggu ke 3 adalah: "+temp.get(2));
		} else if(menu == 2) {
			System.out.println("Penghasilan minggu ke 3 adalah: "+temp.get(2));
			System.out.println("Penghasilan minggu ke 4 adalah: "+temp.get(3));
			System.out.println("Selisih: "+(temp.get(2)-temp.get(3)));
		} else if(menu == 3) {
			brg1 = fanta.getHari1()+fanta.getHari2()+fanta.getHari3()+fanta.getHari4()+fanta.getHari5()+fanta.getHari6()+fanta.getHari7();
			brg2 = taro.getHari1()+taro.getHari2()+taro.getHari3()+taro.getHari4()+taro.getHari5()+taro.getHari6()+taro.getHari7();
			brg3 = shampoo.getHari1()+shampoo.getHari2()+shampoo.getHari3()+shampoo.getHari4()+shampoo.getHari5()+shampoo.getHari6()+shampoo.getHari7();
			brg4 = tissue.getHari1()+tissue.getHari2()+tissue.getHari3()+tissue.getHari4()+tissue.getHari5()+tissue.getHari6()+tissue.getHari7();
			brg5 = magnum.getHari1()+magnum.getHari2()+magnum.getHari3()+magnum.getHari4()+magnum.getHari5()+magnum.getHari6()+magnum.getHari7();
			
			temp.clear();
			temp.add(brg1);
			temp.add(brg2);
			temp.add(brg3);
			temp.add(brg4);
			temp.add(brg5);
			
			int obj = Collections.max(temp);
			for(TokoAmazon cek: al) {
				if(cek.getHari1()+cek.getHari2()+cek.getHari3()+cek.getHari4()+cek.getHari5()+cek.getHari6()+cek.getHari7() == obj) {
					System.out.println("item dengan predikat paling banyak terjual adalah "+cek.getNamaBarang()+" sebanyak "+(cek.week1()+cek.week2()+cek.week3()+cek.week4()));
				}
			}
		}
	}
}

package beautyCare;
import inputValidation.Input;

public class SalonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input inp=new Input();
		String nama, gender, member, date="07 Mei 2018";
		int age, menu;
		double cut=25000, color=40000, toon=40000, shampo=75000, vitamin=100000, product=0, service=0;
		
		System.out.println("Selamat Datang di Beauty Care Yana");
		nama=inp.string1("Nama anda\t: ");
		gender=inp.string("Jenis Kelamin\t: ");
		age=inp.integerAbove("Umur\t\t: ", 1);
		
		Customer data=new Customer(nama, gender, age);
		Customer orang1=new Visit(data, date);
		
		member=inp.string1("Apakah anda member? (y/n) ");
		if(member.equals("y")) {
			data.setMember(true);
			System.out.println("1. Premium");
			System.out.println("2. Gold");
			System.out.println("3. Silver");
			menu=inp.integer("Apa jenis member anda? ",1,3);
			if(menu==1)
				member="Premium";
			else if(menu==2)
				member="Gold";
			else if(menu==3)
				member="Silver";
			data.setMemberType(member);
		}
		
		do {
			System.out.println("\n1. Hair Cut\t\t\tRp. 25.000");
			System.out.println("2. Colouring\t\t\tRp. 40.000");
			System.out.println("3. Tooning\t\t\tRp. 40.000");
			System.out.println("4. Beli Shampo\t\t\tRp. 75.000");
			System.out.println("5. Beli Vitamin Rambut\t\tRp. 100.000");
			System.out.println("6. Total produk yang telah dibeli");
			System.out.println("7. Total jasa yang telah dibeli");
			System.out.println("8. Total seluruh pembelian");
			System.out.println("9. Cek membership");
			System.out.println("0. Selesai Transaksi");
			menu=inp.integer("\nPilihan : ", 0, 9);
			System.out.println("=======================================================================");
			if(menu==1) {
				service+=cut;
				((Visit)orang1).setServiceExpense(service);
				if( data.isMember() )
					System.out.println("Anda mendapatkan potongan member, total yang dibayarkan "+(cut-cut*data.getServiceDiscountRate(orang1.getMember())));
				else
					System.out.println("Total yang dibayarkan "+cut);
			}
			else if(menu==2) {
				service+=color;
				((Visit)orang1).setServiceExpense(service);
				if( data.isMember() )
					System.out.println("Anda mendapatkan potongan member, total yang dibayarkan "+(color-color*data.getServiceDiscountRate(orang1.getMember())));
				else
					System.out.println("Total yang dibayarkan "+color);
			}
			else if(menu==3) {
				service+=toon;
				((Visit)orang1).setServiceExpense(service);
				if( data.isMember() )
					System.out.println("Anda mendapatkan potongan member, total yang dibayarkan "+(toon-toon*data.getServiceDiscountRate(orang1.getMember())));
				else
					System.out.println("Total yang dibayarkan "+toon);
			}
			else if(menu==4) {
				product+=shampo;
				((Visit)orang1).setProductExpense(product);
				if( data.isMember() )
					System.out.println("Anda mendapatkan potongan member, total yang dibayarkan "+(shampo-shampo*data.getProductDiscountRate(orang1.getMember())));
				else
					System.out.println("Total yang dibayarkan "+shampo);
			}
			else if(menu==5) {
				product+=vitamin;
				((Visit)orang1).setProductExpense(product);
				if( data.isMember() )
					System.out.println("Anda mendapatkan potongan member, total yang dibayarkan "+(vitamin-vitamin*data.getProductDiscountRate(orang1.getMember())));
				else
					System.out.println("Total yang dibayarkan "+vitamin);
			}
			else if(menu==6)
				System.out.printf("Total Produk yang telah anda beli adalah Rp. %.0f\n",((Visit)orang1).getProductExpense());
			else if(menu==7)
				System.out.printf("Total Jasa yang telah anda gunakan adalah senilai Rp. %.0f\n",((Visit)orang1).getServiceExpense());
			else if(menu==8)
				System.out.printf("Total uang yang sudah anda keluarkan adalah Rp. %.0f\n",((Visit)orang1).getTotalExpense());
			else if(menu==9)
				if( data.isMember() ) {
					System.out.println("Member      : Ya");
					System.out.println("Tipe member : "+data.getMember());
				}
				else
					System.out.println("Bukan member");
			System.out.println("=======================================================================");
		}while(menu!=0);
		
		System.out.println("Terimakasih telah berkunjung ");
		System.out.println(orang1.toString());
		System.out.println("=======================================================================");
		System.out.println("=======================================================================");
	}

}

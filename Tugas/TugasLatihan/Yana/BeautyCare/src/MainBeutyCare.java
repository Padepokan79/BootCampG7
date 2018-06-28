import java.util.Scanner;
public class MainBeutyCare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner 	input	 = new Scanner(System.in);
		Scanner 	line	 = new Scanner(System.in);
		Customer 	customer = new Customer("Yana Nuryana", "Male", 23);		
		Visit 		visit	 = new Visit(customer, "07 Juni 2018");
		
		System.out.println("\nCUSTOMER");
		customer.setMember(true);
		customer.setMemberType("Gold");
		System.out.println(customer.toString());

		System.out.println("\nVISIT");
		visit.getMemberType();
//		visit.getProductDiscountRate(); // untuk versi 2
//		visit.getServiceDiscountRate();
		visit.setServiceExpense(25000);
		visit.setProductExpense(100000);
		visit.getProductExpense();
		visit.getServiceExpense();
		System.out.println(visit.toString());
		
		/*
		String 	nama, gender, tanggal, member, jenisMember;
		int 	umur;
		double	layanan, produk;
		boolean status;
		System.out.println("\n===========");
		System.out.println("BEAUTY CARE");
		System.out.println("===========");
		System.out.println();
		System.out.print("Nama Anda : ");
		nama 	= line.nextLine();
		System.out.print("Masukkan Jenis Kelamin : (Pria/Wanita) ");
		gender 	= input.next();
		System.out.print("Tanggal : ");
		tanggal	= line.nextLine();
		System.out.print("Usia : ");
		umur 	= input.nextInt();
		System.out.print("Status Member : (Y/T) ");
		member 	= input.next();
		if (member.equals("Y")) {
			status = true;
			System.out.print("Jenis Member : ");
			jenisMember	= input.next();
		}
		else {
			status = false;
			jenisMember = "-";
		}
		System.out.print("Jasa Pelayanan (Rp) : ");
		layanan 	= input.nextDouble();
		System.out.print("Harga Produk (Rp) : ");
		produk 	= input.nextDouble();
		
		Customer 	customer = new Customer(nama, gender, umur);		
		Visit 		visit	 = new Visit(customer, tanggal);
		
		System.out.println("\n===============");
		System.out.println("BEAUTY CARE BILL");
		System.out.println("================");
		
		System.out.println("\nCUSTOMER");
		customer.setMember(status);
		customer.setMemberType(jenisMember);
		System.out.println(customer.toString());

		System.out.println("\nVISIT");
		visit.getMemberType();
//		visit.getProductDiscountRate();
//		visit.getServiceDiscountRate();
		visit.setServiceExpense(layanan);
		visit.setProductExpense(produk);
		visit.getProductExpense();
		visit.getServiceExpense();
		System.out.println(visit.toString()); 
		System.out.println("\n=============");
		System.out.println(" TERIMA KASIH ");
		System.out.println("==============");		*/
	}

}

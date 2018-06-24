import backend.*;
import java.util.Scanner;

public class MainCust {

	public static void main(String[] args) {
		String inputNama, inputUsia, inputIsMember, inputJenisMember = null, inputDate, inputBelanja, inputService;
		double belanja, service, diskonServ, diskonProd, totalBelanja, totalService, total;
		boolean stat = false;
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Customer customer = new Customer();
		Visit visit = new Visit();
		
		belanja = service = diskonServ = diskonProd = totalBelanja = totalService = total = 0;
		
		System.out.print("Nama\t\t : ");
		inputNama = input.nextLine();
		
		System.out.print("Usia\t\t : ");
		inputUsia = input1.nextLine();
		
		System.out.print("Apakah Member\t : ");
		inputIsMember = input.nextLine();

		if(inputIsMember.equals("Ya")) {
			stat = true;
			System.out.print("Jenis Member\t : ");
			inputJenisMember = input1.nextLine();
		}
		else if(inputIsMember.equals("Tidak")) {
			stat = false;
		}
		
		System.out.print("Tanggal\t\t : ");
		inputDate = input2.nextLine();
		
		System.out.print("Biaya Produk\t : ");
		inputBelanja = input1.nextLine();

		System.out.print("Biaya Service\t : ");
		inputService = input2.nextLine();
		
		System.out.println("================================================");
		System.out.println("                Sedang Diproses                 ");
		System.out.println("================================================");
		
		customer.setName(inputNama);
		customer.setMember(stat);
		if(inputIsMember.equals("Ya")) {
			customer.setMemberType(inputJenisMember);	
		}
		visit.setDate(inputDate);
		System.out.println( "Date\t\t : " + visit.getDate());
		System.out.println( "Nama\t\t : " + customer.getName());
		System.out.println( "Status\t\t : " + customer.isMember(stat));
				
		if(inputIsMember.equals("Ya")) {
			System.out.println( "Member\t\t : " + customer.getMemberType());			
			System.out.println( "Diskon Service\t : " + visit.getServiceDiscountRate( customer.getMemberType() ) * 100 + "%" );
			System.out.println( "Diskon Produk\t : " + visit.getProductDiscountRate( customer.getMemberType() ) * 100 + "%" );
			belanja = visit.convertInt(inputBelanja);
			service = visit.convertInt(inputService);
			diskonServ = visit.getServiceDiscountRate(inputJenisMember);
			diskonProd = visit.getProductDiscountRate(inputJenisMember);
			totalBelanja = belanja - (belanja * diskonProd);
			totalService = service - (service * diskonServ);
			System.out.printf( "Total Produk\t : Rp %.2f", totalBelanja);
			System.out.println();
			System.out.printf( "Total Service\t : Rp %.2f", totalService);
			System.out.println();
			total = totalBelanja + totalService;
			System.out.printf( "Summary\t\t : Rp %.2f", total);
		}
		else {
			System.out.printf( "Total Produk\t : Rp %.2f", totalBelanja);
			System.out.println();
			System.out.printf( "Total Service\t : Rp %.2f", totalService);
			System.out.println();
			total = totalBelanja + totalService;
			System.out.printf( "Summary\t\t : Rp %.2f", total);
		}
		
	}
}
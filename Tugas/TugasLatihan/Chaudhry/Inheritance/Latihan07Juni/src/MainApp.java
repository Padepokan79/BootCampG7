import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Customer cs = new Customer();
		Validasi valid = new Validasi();
		
		String inputNama, inputGender, inputType, inputUsia;
		String input = "", nama, gender, memberType;
		int usia;
		boolean cek = false;
		char inputMember;
		double inputBiayaLayanan, inputBiayaProduct;
		
		nama 	= valid.inputValidasiHuruf("Input nama anda                : ", input, key, cek);
		gender 	= valid.inputValidasiHuruf("Input Gender | Pria / Wanita | : ", input, key, cek);
		usia 	= valid.inputValidasiAngka("Input Usia anda                : ", input, key, cek);
		
		System.out.print("Apakah anda member | Y / T |   : ");
		inputMember = key.next().charAt(0);
		
		if (inputMember == 'Y') {
			System.out.print("Jenis member | Premium / Gold / Silver | : ");
			inputType 	= key.next();
			
			cs = new Customer(nama, gender, usia, true, inputType);
		
		}else if(inputMember == 'T') {
			cs = new Customer(nama, gender, usia, false, "-");
		}
		
		System.out.println("");
		cs.tampilData();
		System.out.println("");
		
		Visit visit = new Visit();
		
		System.out.print("Berapa biaya layanan : Rp.");
		inputBiayaLayanan = key.nextDouble();
		visit.setServiceExpense(inputBiayaLayanan);
		
		System.out.print("Berapa biaya Product : Rp.");
		inputBiayaProduct = key.nextDouble();
		visit.setProductExpense(inputBiayaProduct);
		
		System.out.println("");
		visit.serviceDiscount(cs.getMemberType());
		visit.productDiscount(cs.getMemberType());
		visit.tampilData();
		
	}
}

import java.util.*;
public class RunSalon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String input;
		int inputInt;
		Double inputDouble;
		
//		Costumer cust1 = new Costumer("Rio", "male", 22, "gold", true);
//		System.out.println(cust1.toString());
//		
//		Visit visit1 = new Visit("Ria", "Female", 21, "Premium", false, "21-Oct-2018", 10000.0, 20000.0, 30000.0, 0.02);
//		System.out.println(visit1.toString());
//		System.out.print("Diskon produk\t\t: "+visit1.getProDiscRate(visit1.getMemberType()));
//		System.out.print("\nDiskon service\t\t: "+visit1.getServDiscRate(visit1.getMemberType()));
		
		Visit visit2 = new Visit();
		System.out.print("Masukkan Tanggal\t: ");
		input = kb.next();
		visit2.setDate(input);
		System.out.print("Masukkan Nama\t\t: ");
		input = kb.next();
		visit2.setName(input);
		System.out.print("Jenis Kelamin\t\t: ");
		input = kb.next();
		visit2.setGender(input);
		System.out.print("Berapa Usia Anda\t: ");
		inputInt = kb.nextInt();
		visit2.setAge(inputInt);
		System.out.print("Apakah anda member ? (y/t)\t: ");
		input = kb.next();
			if(input.equals("y")) {
				visit2.setIsMember(true);
				System.out.print("Masukan tipe Member (Premium/Gold/Silver)\t: ");
				input = kb.next();
				visit2.setMemberType(input);
			}else {
				visit2.setIsMember(false);
				System.out.print("Anda Tidak dapat diskon servis !!!");
			}
		System.out.print("Apakah anda diservis ? (y/t)\t: ");
		input = kb.next();
			if(input.equals("y")) {
				System.out.print("Masukan harga service\t: ");
				inputDouble = kb.nextDouble();
				visit2.setServiceExpense(inputDouble);
			}
			else {
				inputDouble=0.0;
				visit2.setServiceExpense(inputDouble);
				System.out.println("Anda tidak diservis !!!");
			}
		System.out.print("Apakah anda beli produk ? (y/t)\t: ");
		input = kb.next();
			if(input.equals("y")) {
				System.out.print("Masukan harga produk\t: ");
				inputDouble = kb.nextDouble();
				visit2.setProductExpense(inputDouble);
			}
			else {
				inputDouble=0.0;
				visit2.setProductExpense(inputDouble);
				System.out.print("Anda tidak beli produk !!!");
			}
		
			System.out.println(visit2.triString());
		
	}

}

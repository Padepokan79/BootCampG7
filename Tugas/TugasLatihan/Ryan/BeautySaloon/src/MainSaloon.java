import java.util.Scanner;

public class MainSaloon {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		String memberType="", name, date="", validasi="";
		int usia, pilih1, productExpense, serviceExpense;
		char jk, pilih;
		boolean cek=false;
		
		name = valid(cek,validasi, "Nama Anda : ");
		System.out.print("Tanggal : ");
		date = key.nextLine();
		Costumer cost = new Costumer();
		System.out.print("Jenis kelamin (L/P) : ");
		jk = key.next().charAt(0);
		usia = validas(cek , validasi, "Usia Anda : ");
		cost.setPerson(jk, usia);
		Visit visit = new Visit(name, date);
		System.out.println("------------------------");
		System.out.println(visit.toString());
		productExpense = validas(cek , validasi, "Total Harga Produk : ");
		visit.setProductExpense(productExpense);
		serviceExpense = validas(cek , validasi, "Total Harga Service : ");
		visit.setServiceExpense(serviceExpense);
		System.out.println("------------------------");
		System.out.print("Apakah anda member (y/t) : ");
		pilih = key.next().charAt(0);
		visit.cekMember(pilih);
		System.out.println("------------------------");
		if(pilih == 'y') {
			System.out.print("Type Member : \n1.Premium\n2.Gold\n3.Silver");
			pilih1 = validas(cek , validasi, "Pilih : ");
			visit.pilihMember(pilih1);
		}
		
		System.out.println("---------------\nTotal yang harus dibayar Rp."+visit.getTotalExpense());

	}
	
	public static String valid (boolean cek, String validasi, String kata) {
		Scanner key = new Scanner(System.in);
		do {
			System.out.print(kata);
			validasi = key.next();
			if(validasi.matches("[a-zA-Z]*")) {
				cek = true;
			}
			else {
				System.out.println("Hanya dapat menerima Huruf");
				cek = false;
			}
		}while(cek == false);
		
		return validasi;
	}
	public static int validas (boolean cek, String validasi, String kata) {
		Scanner key = new Scanner(System.in);
		do {
			System.out.print(kata);
			validasi = key.next();
			if(validasi.matches("[0-9]*")) {
				cek = true;
			}
			else {
				System.out.println("Hanya dapat menerima Angka");
				cek = false;
			}
		}while(cek == false);
		
		return Integer.parseInt(validasi);
	}

}

package teamrOOP;
//import inputValidation.Input;
import java.util.Random;

public class CheckPakaian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 	    Input inp=new Input();
		Random rand=new Random();
		double harga=0;
		boolean cek=false;
		
//		System.out.println("Selamat Datang");
//		ukuran=inp.string("Masukkan ukuran\t\t\t: ");
//		warna=inp.string("Masukkan warna\t\t\t: ");
//		merek=inp.string("Masukkan merek\t\t\t: ");
//		jenisBahan=inp.string("Masukkan bahan\t\t\t: ");
//		madeIn=inp.string("Masukkan tempat pembuatan\t: ");
//		harga=inp.real("Masukkan harga\t\t\t: ");
		
		Pakaian pk=new Pakaian("L", "pink", 150000, "adidas", "kulit", "jepang");
		System.out.println();
		pk.cekUkuran();
		do {
			cek=pk.cekMerek();
			if(!cek) {
				System.out.println("\nharga tidak sesuai merk "+pk.getMerek());
				harga=rand.nextInt(40)*10000+100000;
				System.out.println("Harga menjadi "+harga);
				pk.setHarga(harga);
				pk.cekUkuran();
			}
		}while(!cek);
		
		Jaket jk=new Jaket("L", "pink", harga, "adidas", "kulit", "jepang", "tebal", "ada");
		jk.cekUkuran();
		
		System.out.println(pk.toString());
		System.out.println(pk.getJenis()+" "+pk.nilai()+" direkomendasikan untuk "+pk.pemakai());

		System.out.println(jk.toString());
		System.out.println(jk.getJenis()+" "+jk.nilai()+" direkomendasikan untuk "+jk.pemakai());

	}
	
	

}

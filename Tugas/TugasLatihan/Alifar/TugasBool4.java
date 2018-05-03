/*
	* Created by:	Alifhar Juliansyah
	* 				03-05-2018	10.11
	* Updated by:
	*
*/

import java.util.Scanner;

public class TugasBool4{
	public static void main(String[] args){
		int usia;
		double penampilan;
		String kelamin;
		boolean boleh;

		Scanner keyboard=new Scanner(System.in);

		System.out.println("Hari Selasa");
		System.out.print("Jenis kelamin anda (cewe/cowo)?: ");
		kelamin=keyboard.next();
		System.out.print("Berapa usia Anda? ");
		usia=keyboard.nextInt();
		System.out.print("Seberapa cakep anda, skala 0.0 sampai 10.0? ");
		penampilan=keyboard.nextDouble();

		boleh=((kelamin.equals("cewe") && usia>=30 && usia<=45 && penampilan>=8) ||
			   (kelamin.equals("cowo") && usia>=20 && usia<=25 && penampilan<8));
		System.out.println("Dibolehkan untuk masuk: "+boleh);
	}
}
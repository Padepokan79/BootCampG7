/*
created by : Malik Chaudhary
time : 14-05-2018 9:30AM
*/
import java.util.Scanner;
public class Ex18Drill3{
	public static void main(String[] args){
		Scanner keluarga = new Scanner(System.in);
 
		int age, minAgeKake, minAgeIbu, maxAgeIbu, ageCucu, selisih, minSelisih, maxSelisih, minAgeNene, maxAgeNene;
		double penghasilan, penampilan, minPenghasilan, minPenampilan;
		boolean hasil, kake, ibu, ayah, nene;

		ageCucu = 25;
		minAgeKake = 30;
		minAgeIbu = 17;
		maxAgeIbu = 30;
		minSelisih = -5;
		maxSelisih = 5;
		minPenampilan = 8;
		minPenghasilan = 5000000;
		minAgeNene = 25;
		maxAgeNene = 40;



		System.out.print("Berapa umur anda : ");
		age = keluarga.nextInt();

		System.out.print("Berapa penghasilan anda :");
		penghasilan = keluarga.nextDouble();

		System.out.print("Seberapa menarik anda ( scale from 0.0 to 10.0 ) ? ");
		penampilan = keluarga.nextDouble();

		selisih = age - ageCucu;

		if ( age >= minAgeKake && ( penghasilan >= minPenghasilan || penampilan >= minPenampilan || penampilan <= minPenampilan ) ) {
			System.out.println("kake menyetujui");
		}else{
			 System.out.println("kake tidak menyetujui");
		}
		if ( age >= minAgeIbu && age < maxAgeIbu && penghasilan >= minPenghasilan && penampilan >= minPenampilan) {
			System.out.println("Ibu menyetujui");
		}else{
			 System.out.println("ibu tidak menyetujui");
		}if ( ( minSelisih == selisih || maxSelisih == selisih ) && ( penghasilan >= minPenghasilan || penampilan >= minPenampilan ) ) {
			System.out.println("Ayah menyetujui");
		}else{
			 System.out.println("Ayah tidak menyetujui");
		}if ( age > minAgeNene && age < maxAgeNene && ( penghasilan > minPenghasilan || penampilan >= minPenampilan ) ) {
			System.out.println("Nene menyetujui");
		}else{
			 System.out.println("nene tidak menyetujui");
		}

		kake = ( age >= minAgeKake && ( penghasilan >= minPenghasilan || penampilan >= minPenampilan || penampilan <= minPenampilan ) );
		ibu = ( age >= minAgeIbu && age < maxAgeIbu && penghasilan >= minPenghasilan && penampilan >= minPenampilan );
		nene = ( age > minAgeNene && age < maxAgeNene && ( penghasilan > minPenghasilan || penampilan >= minPenampilan ) );
		ayah = ( ( minSelisih == selisih || maxSelisih == selisih ) && ( penghasilan >= minPenghasilan || penampilan >= minPenampilan ) ); 

		if ( ( kake && ( ibu || ayah || nene ) ) || (ibu && ( ayah || nene || kake )) || (ayah && ( nene || kake || ibu )) || (nene && ( kake || ibu || ayah )) ) {
			System.out.println("\nanda disetujui keluarga dapat menikah");
		}else{
			System.out.println("\nanda tidak dsetujui keluarga untuk menikah");
		}

		if ( !kake && !ibu && !nene && !ayah ) {
			System.out.println("\ntidak menyetujui semua");
		}


	}
}
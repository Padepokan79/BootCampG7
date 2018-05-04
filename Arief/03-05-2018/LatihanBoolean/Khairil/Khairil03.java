/*
Date Created	: 03 May 2018
Author			: Arief Pinasti Nugraha
Date Modified	:
Modified By		:
*/
import java.util.Scanner;

public class Khairil03{
	public static void main( String[] args ){
        Scanner inputKey = new Scanner(System.in);
        Scanner inputKey2 = new Scanner(System.in);
        
        String ticketKelas, gender;
        int jlhTerbang, minDTerbang, minTTerbangMale, minTTerbangFemale;
        boolean bussLoungeDFClass, bussLoungeTClassMale, bussLoungeTClassFemale, kelasD, kelasF, kelasT, male, female;

        minDTerbang = 30;
        minTTerbangMale = 20;
        minTTerbangFemale = 15;

        System.out.println("Kelas tiket pesawat yang dimiliki : "); 
        ticketKelas = inputKey.next();
        kelasD = ticketKelas.equals("D");
        kelasF = ticketKelas.equals("F");
        kelasT = ticketKelas.equals("T");

        System.out.print( "Jenis Kelamin ( \"Laki-laki\" / \"Perempuan\" ) : " );
        gender = inputKey.next();
        male = gender.equals("Laki-laki");
        female = gender.equals("Perempuan");

        System.out.println("Berapa jumlah penerbangan anda? ");
        jlhTerbang = inputKey.nextInt();

        bussLoungeDFClass = ((kelasD || kelasF) && (male || female) && (jlhTerbang >= minDTerbang));
        bussLoungeTClassMale = (kelasT && male && jlhTerbang >= minTTerbangMale);
        bussLoungeTClassFemale = (kelasT && female && jlhTerbang >= minTTerbangFemale);
        
        System.out.println();        
        System.out.println("Bolehkah penumpang kelas D atau F masuk? " + bussLoungeDFClass);
        System.out.println("Bolehkah penumpang kelas T Laki-laki masuk? " + bussLoungeTClassMale);
        System.out.println("Bolehkah penumpang kelas T Perempuan masuk? " + bussLoungeTClassFemale);
        
	}
}
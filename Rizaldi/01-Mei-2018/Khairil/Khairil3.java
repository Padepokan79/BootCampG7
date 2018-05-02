/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 21:30 AM     
     * Updated By : 
     * Updated At : 
*/

public class Khairil3{
    public static void main( String[] args){        
        
        double shirt, pants, necktie, sock;

        shirt=120000.0;
        pants=60000.0;
        necktie=40000;
        sock=35000;        
        // variable discount
        double min100k, min250k, min400k;
        min100k=10.0/100.0;
        min250k=15.0/100.0;
        min400k=20.0/100.0;

        // data pembelian
        double sale1, sale2, sale3, disc1, disc2, disc3;
        sale1=shirt;
        sale2=shirt+(2*pants);
        sale3=shirt+pants+necktie+(5*necktie);

        disc1=sale1*min100k;
        disc2=sale2*min250k;
        disc3=sale3*min400k;

        sale1=sale1-disc1;
        sale2=sale2-disc2;
        sale3=sale3-disc3;

        System.out.printf("Sebuah toko pakaian memiliki aplikasi POS sederhana. Item yang dijual adalah pakaian pria.\n"+
        "Setiap pakaian memiliki harga yang bervariasi. Harga untuk sebuah kemeja adalah 120000,\n"+
        "celana panjang 60000, dasi 40000, dan kaos kaki per pasang 35000.\n"+
        "Untuk pembelian minimal 100000 mendapatkan potongan harga sebesar 10 persen\n"+
        "dan pembelian minimal 250000 mendapatkan potongan harga sebesar 15 persen."+
        "Apabila pembelian mencapai 300000 berlaku kelipatan maka pembeli akan mendapatkan bonus 1 buah dasi.\n");
        System.out.printf("\n");
        
        System.out.printf("first transaction  : %.0f  Rupiah\n", sale1);
        System.out.printf("second transaction : %.0f  Rupiah\n", sale2);
        System.out.printf("third transaction  : %.0f  Rupiah plus bonus 1 necktie", sale3);
        
        

    }
}
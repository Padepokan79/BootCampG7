/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 13:39 AM     
     * Updated By : 
     * Updated At : 
*/

public class Yana2{
    public static void main( String[] args){        
        
        float pensil, penghapus, penggaris;
        pensil=8000;
        penghapus=6000;
        penggaris=10000;

        float realPrice, discPrice;
        realPrice=pensil+penghapus+penggaris;
        discPrice=penggaris+10000;

        float profit;
        profit=realPrice-discPrice;
        profit=profit*100/realPrice;

        System.out.printf("keuntungan yang didapat Alifhar dari transaksi belanja adalah : %.2f\n", profit," %");

    }
}
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

        System.out.printf("Alifar pergi ke toko buku untuk membeli 1 buah pensil, 1 buah penghapus\n"+
        "dan 1 buah penggaris. Harga barang yang dibeli Alifhar adalah pensil seharga\n"+
        "Rp. 8.000, penghapus seharga 6.000 dan penggaris Rp. 10.000. Karena Alifhar\n"+
        "membeli pensil dan penghapus dengan merek yang sama, Alifhar berhak membayar\n"+
        "keduanya seharga Rp. 10.000. Berapa persen keuntungan yang didapat Alifhar dari\n"+
        "transaksi belanja tersebut?\n");
        System.out.printf("\n");

        System.out.printf("keuntungan yang didapat Alifhar dari transaksi belanja adalah : %.2f\n", profit," %");

    }
}
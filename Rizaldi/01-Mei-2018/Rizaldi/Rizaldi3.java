/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 21:55 AM     
     * Updated By : 
     * Updated At : 
*/

public class Rizaldi3{
    public static void main( String[] args){        
        
        double monthlySalary, carPrice, roomPrice, foodTransport, security, monthlyBudget, halfYearBudget, yearlyBudget, yearlyMoney, timeSpend;

        monthlySalary=5000000.0;
        carPrice=60000000.0;
        roomPrice=500000.0;
        foodTransport=1000000.0;
        security=100000;

        monthlyBudget=roomPrice+foodTransport;
        halfYearBudget=(monthlyBudget*6)+security;
        yearlyBudget=halfYearBudget*2;

        yearlyMoney=monthlySalary*12;
        yearlyMoney=yearlyMoney-yearlyBudget;

        timeSpend=carPrice/yearlyMoney;

        System.out.printf("boni mendapat gajian perbulan sebesar 5000.000 rupiah, dia hendak membeli sebuah mobil antik seharga\n"+
        "60.000.000 rupiah. setiap bulan boni bisa menyisihkan uang hasil gajian setelah dipakai 500.000 untuk bayar kost,\n"+
        "1000.000 untuk keperluan makan dan transport, serta ada uang keamanan setiap 6 bulan sekali sebesar 100.000 rupah.\n"+
        "berapa tahun boni bisa membeli mobil antik tersebut dengan uang hasil gajian tersebut ?\n");
        System.out.printf("\n");
        
        System.out.printf("waktu yang di butuhkan adalah  : "+timeSpend+" tahun");
        
        

    }
}
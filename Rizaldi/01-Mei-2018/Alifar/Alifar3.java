/*
     * Display a listing of the resource.
     *
     * Programmer : Rizaldi
     * Created By : Rizaldi
     * Created At : 01 Mei 2018 19:40 AM     
     * Updated By : 
     * Updated At : 
*/

public class Alifar3{
    public static void main( String[] args){        
        
        int engTime, breakTime, mathTime, announceTime, totScnd, hour, minute, scnd;

        engTime=6000;
        breakTime=1800;
        mathTime=7200;
        announceTime=1234;
        totScnd=engTime+breakTime+mathTime+announceTime;
                
        hour=totScnd/3600;
        minute=(totScnd-(3600*hour))/60;
        scnd=totScnd%60;

        System.out.printf("Bima akan mengikuti ujian sekolahnya hari ini.\n"+
        "Pada jam pertama, ia mendapatkan waktu 6000 detik untuk mengerjakan soal bahasa inggris.\n"+
        "Setelah itu, diberikan waktu untuk istirahat sebanyak 1800 detik sebelum dilanjutkan untuk mengikuti ujian Matematika.\n"+
        "Waktu yang diberikan untuk mengerjakan Matematika adalah 7200 detik.\n"+
        "Lalu sebelum pulang, seluruh murid diwajibkan baris dilapangan untuk mendengarkan pengumuman oleh kepala sekolah selama 1234 detik.\n"+
        "Berapa waktu yang telah dihabiskan disekolah pada hari itu? Ubahlah format waktunya kedalam jam, menit dan detik.\n");
        System.out.printf("\n");

        System.out.println("waktu yang telah dihabiskan disekolah pada hari itu adalah : "+hour+" jam "+minute+" menit "+scnd+" detik");

    }
}
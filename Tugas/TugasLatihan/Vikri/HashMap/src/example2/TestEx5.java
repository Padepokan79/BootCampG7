package example2;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestEx5 {
public static void main(String[] args) {

        HashMap<String, Ex5> books = new HashMap<String, Ex5>();
        
        Ex5 bukuJava = new Ex5("Tutorial Java", "Petani Kode");
        Ex5 bukuKotlin = new Ex5("Pemrograman Kotlin", "Petani Kode");
        Ex5 bukuAndroid = new Ex5("Pemrograman Android", "Petani Kode");
        
        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put("android", bukuAndroid);
        
        for(Entry<String, Ex5> b: books.entrySet()){
        	Ex5 buku = (Ex5) b.getValue();
            System.out.println(b.getKey() + ": "+ buku.getTitle());
        }
        
    }
}

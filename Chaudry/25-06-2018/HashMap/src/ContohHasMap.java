/*
 * DATE CREATED    : 25 JUNI 2018
 * AUTHOR          : NURDHIAT CHAUDHARY MALIK
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ContohHasMap {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                HashMap<Integer, String> listOrang = new HashMap<>();
                listOrang.put(12, "Chaitanya");
                listOrang.put(2, "Rahul");
                listOrang.put(7, "Singh");
                listOrang.put(49, "Ajeet");
                listOrang.put(3, "Anuj");
                
                Person orang1 = new Person("hendra", "yudiana", "musik", "Male", 28);
                Person orang2 = new Person("anto", "budi", "bola", "Male", 22);
                Person orang3 = new Person("Yuni", "Ana", "Dance", "Female", 20);
                
                System.out.println("=================================================");
                System.out.println("Contoh pengambilan value Sebuah Objek menggunakan Foreach");
                
                for (Map.Entry x : listOrang.entrySet()) {
                        int tamp = (int) x.getKey();
                        if (tamp > 10) {
                                System.out.println("Key : " + x.getKey());
                                System.out.println("Value : " + x.getValue());
                        }
                        
                }
                
                System.out.println("=================================================");
                System.out.println("Contoh pengambilan value Sebuah Objek menggunakan Foreach");
                
                HashMap<String, Person> listPerson = new HashMap<>();
                listPerson.put("orangKe1", orang1);
                listPerson.put("orangKe2", orang2);
                listPerson.put("orangKe3", orang3);
                
                for (Map.Entry entry : listPerson.entrySet()) {
                        Person orang = (Person) entry.getValue();
                        System.out.println("Key : " + entry.getKey());
                        System.out.println("Nama Lengkap : " + orang.firstName + " " + orang.lastName +" ," 
                        + orang.usia + " years old");
                        System.out.println("interest :" + orang.hobi);
                }
                
                for (Map.Entry entry2 : listPerson.entrySet()) {
                        Person person = (Person) entry2.getValue();
                        System.out.println("Nama depan : " + person.firstName);
                        System.out.println("Umur : " + person.usia +" ,years old");
                }
                
                System.out.println("=================================================");
                System.out.println("Contoh pengambilan value menggunakan iterator");
                
                Set newSet = listOrang.entrySet();
                Iterator iterator = newSet.iterator();
                
                while (iterator.hasNext()) {
                        Map.Entry mapEntry = (Entry) iterator.next();
                        System.out.println("key : " + mapEntry.getKey());
                        System.out.println("value : " + mapEntry.getValue());
                }
                
                System.out.println("==============================================");
                System.out.println("Contoh pengambilan value Sebuah Objek menggunakan iterator");
                
                Set setObjek = listPerson.entrySet();
                Iterator iteratorObjek = setObjek.iterator();
                
                while (iteratorObjek.hasNext()) {
                        Map.Entry me = (Entry) iteratorObjek.next();
                        Person orang = (Person) me.getValue();
                        System.out.println("Key : " + me.getKey());
                        System.out.println("Nama Lengkap : " + orang.firstName + " " + orang.lastName +" ," 
                                        + orang.usia + " years old");
                        System.out.println("interest :" + orang.hobi);
                }
                
                System.out.println("==============================================");
                System.out.println("Contoh pengambilan value tertentu dari sebuah key");
                
                for (Map.Entry entry : listPerson.entrySet()) {
                        Person orang = (Person) entry.getValue();
                        if (entry.getKey().equals("orangKe1")) {
                                System.out.println("Key : " + entry.getKey());
                                System.out.println("Nama Lengkap : " + orang.firstName + " " + orang.lastName +" ," 
                                + orang.usia + " years old");
                                System.out.println("interest :" + orang.hobi);
                        }                        
                }
        }

}
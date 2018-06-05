package benda;

public class Benda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop1=new Laptop();
		Laptop laptop2=new Laptop("Asus ROG", "Biru", "Intel Core i7", 2, 16);
		Laptop laptop3=new Laptop();
		Handphone hp1=new Handphone();
		Handphone hp2=new Handphone("Xiaomi", "Hitam", "Android Lollipop", 5.5, 4100);
		Handphone hp3=new Handphone();
		
		laptop1.merk="Toshiba";
		laptop1.warna="Hitam";
		laptop1.processor="Intel Core i3";
		laptop1.berat=2;
		laptop1.ram=2;
		
		hp1.merk="Samsung Galaxy";
		hp1.warna="Putih";
		hp1.os="Android Kitkat";
		hp1.ukuranLayar=4;
		hp1.batere=3300;
		
		System.out.println("\nLaptop 1");
		laptop1.disp();
		
		System.out.println("\nLaptop 2");
		laptop2.disp();
		
		laptop3.init("Samsung", "Putih", "amd a3", 1, 4);
		System.out.println("\nLaptop 3");
		laptop3.disp();
		
		System.out.println("\nHandphone 1");
		hp1.disp();
		
		System.out.println("\nHandphone 2");
		hp2.disp();
			
		hp3.init("Sony", "Silver", "Android Marshmallow", 4.5, 4100);
		System.out.println("\nHandphone 3");
		hp3.disp();
	}

}

package Salon;
import java.util.*;
public class Visit extends Costumer implements DiscountRate {
	
	private double seviceExpense, productExpense, totalExpense, price, svcExpense, prdctExpense, totalAfterDiscount;
	private Costumer customer;
	private Date date;
	
	public Visit(Costumer customer, double svcExpense, double prdctExpense) {
		super (name, jenisKelamin, umur);
		this.customer = customer;
		this.price = price;
		this.prdctExpense = prdctExpense;
		this.svcExpense = svcExpense;

	}
	
	String getName() {
		return name;
	}
	
	double getSeviceExpense() {
		return seviceExpense;
	}

	void setSeviceExpense(double seviceExpense) {
		this.seviceExpense = seviceExpense;
	}

	double getProductExpense() {
		return productExpense;
	}

	void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	
	double getTotalExpense() {
		return totalExpense;
	}

	public double getServiceDiscountRate (String type) {
		double priceService = 0;
		if (type.equals("premium")) {
			priceService = seviceDiscountPremium;
			System.out.println("Diskon service :"+priceService);
		} else if (type.equals("gold")) {
			priceService = seviceDiscountGold;
			System.out.println("Diskon service :"+priceService);
		} else if (type.equals("silver")) {
			priceService = seviceDiscountSilver;
			System.out.println("Diskon service :"+priceService);
		}
		return seviceExpense = svcExpense*priceService;
	}
	
	public double getProductDiscountRate (String type) {
		double priceProduct = 0;
		if (type.equals("premium")) {
			priceProduct = productDiscountPremium;
			System.out.println("Diskon service :"+priceProduct);
		} else if (type.equals("gold")) {
			priceProduct = productDiscountGold;
			System.out.println("Diskon service :"+priceProduct);
		} else if (type.equals("silver")) {
			priceProduct = productDiscountSilver;
			System.out.println("Diskon service :"+priceProduct);
		}
		return productExpense = prdctExpense*priceProduct;
	}
	
	double totalExpense () {
		totalExpense = prdctExpense + svcExpense;
		return totalExpense;
	} 
	
	double totalAfterDiscount() {
		totalAfterDiscount = totalExpense - (seviceExpense + productExpense);
		return totalAfterDiscount;
	}
	
	public String toString() {
		return customer.toString()+"\nHarga service \t\t\t: "+svcExpense+"\nHarga product \t\t\t: "+prdctExpense+
				"\nTotal harga \t\t\t: "+totalExpense+"\nBesar potongan untuk produk \t: "+productExpense+
				"\nBesar potongan untuk service \t: "+seviceExpense+
				"\nTotal harga Setelah potongan \t: "+totalAfterDiscount;
	}


	
	

}
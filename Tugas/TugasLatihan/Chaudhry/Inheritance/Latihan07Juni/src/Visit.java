import java.util.Date;

public class Visit extends Customer implements DiscountRate {
	private Customer customer;
	private Date date;
	private double serviceExpense, productExpense, diskonService = 0, diskonProduct = 0, totalBayarService = 0, totalBayarProduct = 0;
	
	public Visit() {
		
	}
	public Visit(String nama, String jk, int umur, Date date) {
		super(nama, jk, umur);
		this.date 		= date;
	}
	
	Customer getCustomer() {
		return customer;
	}

	void setServiceExpense(double service) {
		serviceExpense = service;
	}
	double getServiceExpense() {
		return serviceExpense;
	}

	void setProductExpense(double product) {
		productExpense = product;
	}
	double getProductExpense() {
		return productExpense;
	}
	
	public double serviceDiscount(String type) {
		if(type.equals("Premium")) {
			diskonService = servicePremium;
		
		}else if(type.equals("Gold")) {
			diskonService = serviceGold;
			
		}else if(type.equals("Silver")) {
			diskonService = serviceSilver;
		}
		return diskonService;
	}
	
	public double productDiscount(String type) {
		if(type.equals("Premium") || type.equals("Gold") || type.equals("Silver")) {
			diskonProduct = productPremium;
		}
		return diskonProduct;
	}
	
	double getTotalExpenseService() {
		totalBayarService = serviceExpense -(serviceExpense*diskonService);
		return totalBayarService;
	}
	double getTotalExpenseProduct() {
		totalBayarProduct = productExpense - (productExpense*diskonProduct);
		return totalBayarProduct;
	}
	
	
	
	public void tampilData() {
		System.out.println("===============================");
		System.out.println("Biaya layanan : "+serviceExpense);
		System.out.println("Biaya Product : "+productExpense);
		System.out.println("-------------------------------");
		System.out.println("Diskon layanan: "+getTotalExpenseService());
		System.out.println("Diskon Product: "+getTotalExpenseProduct());
		System.out.println("Total harga   : "+(getTotalExpenseService() + getTotalExpenseProduct()));
	}
}

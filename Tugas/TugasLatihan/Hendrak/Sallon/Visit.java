import java.util.Date;

public class Visit extends Customer implements Discount{
	private Customer customer;
	private String date;
	private Date tanggal;
	private double serviceExpense, productExpense, diskonService=0.0, diskonProduct=0.0, totalBayar=0.0;
	
	public Visit() {
		
	}
	
	public Visit(Customer customer) {
		this.customer = customer;
	}
	
	public Visit(Customer customer, String date) {
		this.customer = customer;
		this.date = date;
	}
	
	public Visit(String name, String date) {
		super(name);
		this.date = date;
		
	}
	
	public String getName() {
		return customer.getName();
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public void setTanggal(String date) {
		this.date = date; 
	}
	
	public void setServiceExpanse(double ex) {
		serviceExpense = ex;
	}
	
	public double getProductExpanse() {
		return productExpense;
	}
	
	public void setProductExpanse(double ex) {
		productExpense = ex;
	}
	
	public double getServiceDiscountRate(String type) {
		diskonService = 0.0;
		if(type.equals("premium")) {
			
			diskonService = serviceDiscountPremium;
			
		}else if(type.equals("gold")) {
			
			diskonService = serviceDiscountGold;
			
		}else if(type.equals("silver")) {
			
			diskonService = serviceDiscountSilver;
			
		}
		return diskonService;
	}
	
	public double getProductDiscountRate(String type) {
		diskonProduct = 0.0;
		if(type.equals("premium") || type.equals("gold") || type.equals("silver")) {
		diskonProduct = 0.1;
		}
		return diskonProduct;
	}
	
	public double getTotalExpense() {
		totalBayar = (serviceExpense-(serviceExpense*diskonService)) + (productExpense -(productExpense*diskonProduct));
		
		return totalBayar;
	}
	
	public String toString()
	{	getServiceDiscountRate(getMemberType());
		getProductDiscountRate(getMemberType());
		
		return super.toString() +
			   "\nGender         : " + gender +
			   "\nUsia           : " + age +
			   "\nTanggal        : " + date +
			   "\nBiaya Service  :Rp. " + serviceExpense +
			   "\nBiaya Product  :Rp. " + productExpense +
			   "\nDiskon Service :Rp. " + serviceExpense * diskonService +
			   "\nDiskon Product :Rp. " + productExpense * diskonProduct +
			   "\nTotal Biaya    :Rp. " + getTotalExpense();
			   
	}
}

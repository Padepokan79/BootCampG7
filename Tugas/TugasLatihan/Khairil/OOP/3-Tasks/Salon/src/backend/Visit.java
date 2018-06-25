package backend;

public class Visit extends Customer implements DiscountRate {
	Customer customer = new Customer();
	String date;
	double serviceExpense, productExpense;

	public Visit(Customer customer, String date, double serviceExpense, double productExpense) {
		this.customer = customer;
		this.date = date;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}
	
	public Visit() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public Customer customer() {
		return customer;
	}
	
	public String toString() {
		return customer.toString() + "\nDate : " + date + "\nService Expense : " + serviceExpense + "\nProduct Expense : " + productExpense;	
	}
	
	public double convertInt(String harga) {
		return Integer.parseInt(harga);
	}

	@Override
	public double getServiceDiscountRate(String memberType) {
		double getDisc = 0;
		if(memberType.equalsIgnoreCase("Premium")) {
			getDisc = serviceDiscountPremium;
		}
		else if(memberType.equalsIgnoreCase("Gold")) {
			getDisc = serviceDiscountGold;
		}
		else if(memberType.equalsIgnoreCase("Silver")) {
			getDisc = serviceDiscountSilver;
		}
		return getDisc;
	}

	@Override
	public double getProductDiscountRate(String memberType) {
		double getProd = 0;
		getProd = productDiscoutSilver;
		return getProd;
	}
}
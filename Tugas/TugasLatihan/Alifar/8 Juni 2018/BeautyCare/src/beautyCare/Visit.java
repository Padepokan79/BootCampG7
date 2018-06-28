package beautyCare;

public class Visit extends Customer {
	private Customer customer;
	private String date;
	private double serviceExpense, productExpense;
	
	public Visit(Customer customer, String date) {
		this.customer=customer;
		this.date=date;
	}
	
	double getServiceExpense() {
		return serviceExpense;
	}
	
	void setServiceExpense(double ex) {
		double discount=customer.getServiceDiscountRate(customer.getMember());
		serviceExpense=ex-ex*discount;
	}
	
	double getProductExpense() {
		return productExpense;
	}

	void setProductExpense(double ex) {
		double discount=customer.getProductDiscountRate(customer.getMember());
		productExpense=ex-ex*discount;
	}
	
	double getTotalExpense() {
		return serviceExpense+productExpense;
	}

	@Override
	public String toString() {
		return "\n" + date + "\n\n" + customer + "\nserviceExpense = " + serviceExpense
				+ "\nproductExpense = " + productExpense ;
	}
	
}

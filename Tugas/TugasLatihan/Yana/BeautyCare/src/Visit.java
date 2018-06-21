
public class Visit extends Customer /*implements DiscountRate*/{
	private Customer 	customer = new Customer();
	private String 		date;
	private	double		serviceExpense, productExpence;
	
	public Visit() {
	}
	
	public Visit(Customer customer, String date) {
//		super(name);
		this.date 		= date;
		this.customer	= customer;
	}
	
	String getName() {
		return customer.getName();
	}
	
	void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	
	void setProductExpense(double productExpense) {
		this.productExpence = productExpense;
	}
	
	//untuk versi 2
	/*public String getServiceDiscountRate() {
		if (customer.isMember() == true) {
			if (customer.getMemberType().equals("Premium")) {
				serviceExpense = serviceExpense - (serviceExpense * serviceDiscountPremium);
				return ""+serviceExpense;
			}
			else if (customer.getMemberType().equals("Gold")) {
				serviceExpense = serviceExpense - (serviceExpense * serviceDiscountGold);
				return ""+serviceExpense;
			}
			else if (customer.getMemberType().equals("Silver")) {
				serviceExpense = serviceExpense - (serviceExpense * serviceDiscountSilver);
				return ""+serviceExpense;
			}
			else {
				serviceExpense = serviceExpense;
				return ""+serviceExpense;
			}
		}
		else {
			serviceExpense = serviceExpense;
			return ""+serviceExpense;
		}
	}
	
	public String getProductDiscountRate() {
		if (customer.isMember() == true) {
			if (customer.getMemberType().equals("Premium")) {
				productExpence = productExpence - (productExpence * productDiscountPremium);
				return ""+productExpence;
			}
			else if (customer.getMemberType().equals("Gold")) {
				productExpence = productExpence - (productExpence * productDiscountGold);
				return ""+productExpence;
			}
			else if (customer.getMemberType().equals("Silver")) {
				productExpence = productExpence - (productExpence * productDiscountSilver);
				return ""+productExpence;
			}
			else {
				productExpence = productExpence - (productExpence * 0.1);
				return ""+productExpence;
			}
		}
		else {
			productExpence = productExpence;
			return ""+productExpence;
		}
	}*/
	
	double getProductExpense() {
//		getProductDiscountRate();
		customer.getProductDiscountRate(customer.getMemberType());
		productExpence = productExpence - (productExpence*customer.getProductDiscountRate(customer.getMemberType()));
		return productExpence;
	}
		
	double getServiceExpense() {
//		getServiceDiscountRate();
		serviceExpense = serviceExpense - (serviceExpense*customer.getServiceDiscountRate(customer.getMemberType()));
		return serviceExpense;
	}
	
	double getTotalExpense() {
		return serviceExpense + productExpence;
	}
	
	public String toString() {
		return "Customer ["+customer.toString()+"]\nVisit [Date : "+date+", Servive Expanse : "+serviceExpense+", Product Expanse : "+productExpence+", Total Expanse : "+getTotalExpense()+"]";
	}
}

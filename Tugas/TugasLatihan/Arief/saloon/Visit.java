package saloon;

public class Visit extends Customer implements DiscountRate{

	private Customer cst = new Customer();
	private double serviceExpense, productExpense, totalExpense, servPrice, prodPrice, totPrice;
	private String memberType;
	
	public Visit() {
		// TODO Auto-generated constructor stub
	}
	
	public Visit(Customer cst, double servPrice, double prodPrice) {
		 this.cst = cst;
		 this.servPrice = servPrice;
		 this.prodPrice = prodPrice;
	}
	
	String getName() {
		return name;
	}
	
	double getServiceExpense() {
		return serviceExpense;
	}
	
	void setServiceExpense(double ex) {
		serviceExpense = ex;
	}

	double getProductExpense() {
		return serviceExpense;
	}
	
	void setProductExpense(double ex) {
		productExpense = ex;
	}
	
	double getTotalExpense(){
		return totalExpense;
	}

	public double getServiceDiscountRate(String memberType) {
		double discServ = 0;
		if (memberType.equals("Premium")) {
			discServ = serviceDiscountPremium;
		}else if (memberType.equals("Gold")) {
			discServ = serviceDiscountGold;
		}else if (memberType.equals("Silver")) {
			discServ = serviceDiscountSilver;
		}
		System.out.println("Service Discount\t: " + discServ*100 + " %");
		return serviceExpense = servPrice * discServ;
	}
	
	public double getProductDiscountRate(String memberType) {
		double discProd = 0;
		if (memberType.equals("Premium")) {
			discProd = productDiscountPremium;			
		}else if (memberType.equals("Gold")) {
			discProd = productDiscountGold;
		}else if (memberType.equals("Silver")) {
			discProd = productDiscountSilver;
		}
		System.out.println("Product Discount\t: " + discProd*100 + " %");
		return productExpense = prodPrice * discProd;
	}
	
	double total() {
		totPrice = servPrice + prodPrice;
		return totPrice;
	}
	
	double totExp() {
		totalExpense = serviceExpense + productExpense;
		System.out.print("Grand Total\t\t: Rp.");
		return totPrice -= totalExpense;
	}
	
	void printGrandTotal() {
		System.out.println("Grand Total\t\t: Rp." + total());		
	}
	
	String AbstractPerson() {
		return 	"Service\t\t\t: Rp." + (servPrice-serviceExpense) +
				"\nProduct\t\t\t: Rp." + (prodPrice-productExpense);
				
	}
}

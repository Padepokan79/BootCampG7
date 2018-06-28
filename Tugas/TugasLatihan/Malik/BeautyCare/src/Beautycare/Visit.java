package Beautycare;

import java.util.Date;

public class Visit extends Customer{
	// reference variable Visit
	private Customer custom = new Customer();
	private Date date;
	private double serviceExpense, productExpense;
	
	Visit(){}
	// Contructor visit
	Visit(Customer custom, Date date){
		this.custom = custom;
		this.date = date;
	}
	// getter untuk Service expense
	double getServiceExpense() {
		return serviceExpense;
	}
	// setter untuk Service expense
	void setServiceExpense(double ex) {
		serviceExpense = ex-(custom.getServiceDiscountRate(custom.getMemberType())*ex);
	}
	// getter untuk Product expense
	double getProductExpense() {
		return serviceExpense;
	}
	// setter untuk Product expense
	void setProductExpense(double ex) {
		productExpense = ex-(custom.getProductDiscountRate(custom.getMemberType())*ex);
	}
	// getter untuk total expense
	double getTotalExpanse() {
		return serviceExpense+productExpense;
	}
	// toString untuk beauty
	public String toBeautyView() {
		return custom.toBeautyView()+"\nService\t\t: "+serviceExpense+"\nProduct\t\t: "+productExpense+"\nTotal Expanse\t: "+getTotalExpanse()+"\n\nDate\t\t"+date;
	}
	

	
}

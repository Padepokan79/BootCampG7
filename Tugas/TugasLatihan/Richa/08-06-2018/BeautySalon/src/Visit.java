/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 09.05 AM
Updated by			:
Updated Date/hour	:
*/

import java.util.Date;

public class Visit extends Customer implements DiscountRate  {
	
	Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit () {
		
	}
	
	public Visit (String nama, Date date) {
		super (nama);
		this.date = date;
	}
	
	String getName () {
		return super.getName();
	}
	double getServiceExpense() {
		return serviceExpense;
	}

	void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	
    public String toString() {
    	return super.toString() + " Service expanse: " + serviceExpense + " Product expanse: " + productExpense;
    }
    
    String besarDiskon () {
    	if (isMember() == true) {
    		if (getMemberType().equals("premium") || getMemberType().equals("Premium")) {
    			serviceExpense = serviceExpense - (serviceExpense*serviceDiscountPremium);
    			productExpense = productExpense - (productExpense*productDiscountPremium); 
    		}
    		else if (getMemberType().equals("gold") || getMemberType().equals("Gold")) {
    			serviceExpense = serviceExpense - (serviceExpense*serviceDiscountGold);
    			productExpense = productExpense - (productExpense*productDiscountGold); 
    		}
    		else if (getMemberType().equals("silver") || getMemberType().equals("Silver")) {
    			serviceExpense = serviceExpense - (serviceExpense*serviceDiscountSilver);
    			productExpense = productExpense - (productExpense*productDiscountSilver); 
    		}
    		
    	}
    	return getMemberType();
    }
	

	
}

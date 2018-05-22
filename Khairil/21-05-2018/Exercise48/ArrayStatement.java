/*
	 Program     : Exercise 48 - Array
     Creator     : Khairil
     Created At  : 21 Mei 2018 13:21 PM     
     Updated By  : 
     Update Date : 
*/
class ArrayStatement {
	public static void main( String[] args ) {
		int indexCountry;
		String countries[] = {"Indonesia","Japan","Canada","South Korea","Russia","Uni Arab Emirates","Malaysia","Brunei Darussalam"};

		for ( String country : countries ) {
			System.out.println(country + "\t");
		}

		System.out.println("========================================================================");

		for ( indexCountry = 0; indexCountry < countries.length; indexCountry++ ) {
			String country = countries[indexCountry]; 
			System.out.println(country + "\t" + country.toUpperCase());
		}
	}
}
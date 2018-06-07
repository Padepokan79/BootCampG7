/* 
Created by  		: Richa Fitria
Date/hour			: 05 Juni 2018/ 03.26 PM
Updated by			:
Updated Date/hour	:
*/


public class mainAuthorBook {

	public static void main(String[] args) {
		
		Author author1 = new Author ("JK Rowling", "jk@gmail.com", 'f');
		
		System.out.println(author1.toString());
		
		Author author2 = new Author();
		
		author2.getName();
		author2.getEmail();
		author2.getGender();
		author2.setEmail("pdbaiqbangetss@gmail.com");
		
		System.out.println(author2.toString());
		
		
		Book book1 = new Book (author1.getName(), author1.getEmail(), author1.getGender(),"Harry Potter", 150000, 1);
		
		System.out.println (book1.toString());
		
		Book book2 = new Book();
		
		book2.au.getName();
		book2.au.getEmail();
		book2.au.getGender();
		book2.getName();
		book2.getPrice();
		book2.getQty();
	
		book2.setEmail("pd@yahoo.com");
		book2.setPrice(80000);
		book2.setQty(3);
		System.out.println (book2.toString());
		
		
	}

}

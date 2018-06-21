package pedagangBuah;

import inputValidation.Input;
import java.util.ArrayList;
import java.util.Arrays;

public class Pedagang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input inp=new Input();
		String day, day1, day2;
		int max=20, temp, choice, dayPerweek=7, weekPermonth=4, minIncome, maxIncome, daymin=-1, daymax=-1;
		double profit=0.2;
		boolean check=false;
		ArrayList<Integer> dailyIncome=new ArrayList<Integer>();
		ArrayList<String> nameoftheDay=new ArrayList<String>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

		// Objek Buah
		Buah buah1=new Buah("Semangka", 18000, 12, 15, 11, 8, max, 10, 14);
		Buah buah2=new Buah("Pisang", 15000, 10, 14, 15, 7, max, 13, 16);
		Buah buah3=new Buah("Mangga", 10000, 13, 12, 9, 15, max, 9, 13);
		
		// Objek dimasukkan ke dalam array list
		ArrayList<Buah> listBuah=new ArrayList<Buah>();
		listBuah.add(buah1);
		listBuah.add(buah2);
		listBuah.add(buah3);
		
		// mengisi array list dailyIncome
		for(int hari=0; hari<dayPerweek; hari++) {
			temp=0;
			for(Buah income:listBuah)
				temp+=income.daily(hari);
			dailyIncome.add(temp);
		}
		
//		for(int i:dailyIncome)
//			System.out.println(i);
		
		// Mencari pendapatan terkecil dan terbesar
		maxIncome=dailyIncome.get(0);
		minIncome=dailyIncome.get(0);
		int index=1;
		while(index<dailyIncome.size()){
			if(dailyIncome.get(index)>maxIncome){
				maxIncome=dailyIncome.get(index);
				daymax=index;
			}
			if(dailyIncome.get(index)<minIncome){
				minIncome=dailyIncome.get(index);
				daymin=index;
			}
			index++;
		}
		
		System.out.println("SALES OF FRUIT");
		System.out.println("==================");
		System.out.println("1.Daily Income");
		System.out.println("2.Weekly Income");
		System.out.println("3.Monthly Income");
		System.out.println("4.Largest Income");
		System.out.println("5.Lowest Income");
		System.out.println("6.Income Comparison");
		System.out.println("7.Fruit with weekly Largest Sales");
		System.out.println("8.Fruit with weekly Largest Income");
		System.out.println("9.Fruit with weekly Largest Income");
		System.out.println("10.Profit from the sales of fruit");
		System.out.println("0.Exit");
		
		do{			
			temp=0;
			System.out.println("=========================");
			choice=inp.integer("Select the number : ", 0, 10);
			System.out.println("=========================");
			
			if(choice==1) {
				day=inp.string("Select the day : ");
				for(String d:nameoftheDay) {
					if(day.equalsIgnoreCase(d))
						System.out.println("Your income in "+day+" is Rp. "+dailyIncome.get(nameoftheDay.indexOf(d)));
				}
			}
			else if(choice==2) {
				for(Buah income:listBuah)
					temp+=income.weekly();
				System.out.println("Your weekly income is Rp. "+temp);
			}
			else if(choice==3) {
				for(Buah income:listBuah)
					temp+=income.weekly();
				temp*=weekPermonth;
				System.out.println("Your monthly income is Rp. "+temp);
			}
			else if(choice==4) {
				System.out.println("The largest income is Rp."+maxIncome+" in "+nameoftheDay.get(daymax));
			}
			else if(choice==5) {
				System.out.println("The lowest income is Rp."+minIncome+" in "+nameoftheDay.get(daymin));				
			}
			else if(choice==6) {
				int price1=0, price2=0;
				day1=inp.string("Select the day (1) : ");
				for(String d:nameoftheDay) {
					if(day1.equalsIgnoreCase(d))
						price1=dailyIncome.get(nameoftheDay.indexOf(d));
				}
				day2=inp.string("Select the day (2) : ");
				for(String d:nameoftheDay) {
					if(day2.equalsIgnoreCase(d))
						price2=dailyIncome.get(nameoftheDay.indexOf(d));
				}
				if(price1>price2) {
					System.out.println("The difference of income between "+day1+" and "+day2+" is Rp. "+(price1-price2));
				}
				else if(price1<price2) {
					System.out.println("The difference of income between "+day1+" and "+day2+" is Rp. "+(price2-price1));
				}
			}
			else if(choice==7) {
				String fruitName;
				temp=listBuah.get(0).getTotalFruit();
				fruitName=listBuah.get(0).getFruitName();
				for(int i=1; i<listBuah.size(); i++)
					if(listBuah.get(i).getTotalFruit()>temp) {
						temp=listBuah.get(i).getTotalFruit();
						fruitName=listBuah.get(i).getFruitName();
					}
				System.out.println("The fruit which has the largest salest is "+fruitName+", total "+temp);
			}
			else if(choice==8) {
				String fruitName;
				temp=listBuah.get(0).weekly();
				fruitName=listBuah.get(0).getFruitName();
				for(int i=1; i<listBuah.size(); i++)
					if(listBuah.get(i).weekly()>temp) {
						temp=listBuah.get(i).weekly();
						fruitName=listBuah.get(i).getFruitName();
					}
				System.out.println("The fruit which has the largest income is "+fruitName+", total "+temp);
			}
			else if(choice==9) {
				String fruitName;
				temp=listBuah.get(0).weekly();
				fruitName=listBuah.get(0).getFruitName();
				for(int i=1; i<listBuah.size(); i++)
					if(listBuah.get(i).weekly()<temp) {
						temp=listBuah.get(i).weekly();
						fruitName=listBuah.get(i).getFruitName();
					}
				System.out.println("The fruit which has the lowest income is "+fruitName+", total "+temp);				
			}
			else if(choice==10) {
				for(Buah income:listBuah)
					temp+=income.weekly();
				temp*=weekPermonth*profit;
				System.out.println("Profit from the monthly sales of fruit is Rp. "+temp);
			}
			else if(choice==0) {
				check=true;
			}
			
		}while(!check);

	}

}

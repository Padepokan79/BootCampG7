/* 	Date 		: 14/5/2018    
	Time 		: 13:20:39
	Create by 	: Muhamad Rifan Andrian
	Edited by 	: 
				
	*/

	public class Ex48Drills1 {
		public static void main(String[] args) {
			String[] buahBuahan = {"pisang","mangga","duren","jeruk",
							"pepaya","manggis"};

			for (String buah : buahBuahan) {
				System.out.println( buah +"\t"+buah.toUpperCase() );
			}
			System.out.println();
			for (int index=0; index < buahBuahan.length; index++  ) {
				String buah = buahBuahan[index];
				System.out.println( buah +"\t"+buah.toUpperCase() );
			}
			System.out.println();
			for (int index=0; index < buahBuahan.length; index++  ) {
				System.out.println( buahBuahan[index] +"\t"+buahBuahan[index].toUpperCase() );
			}
		}
	}
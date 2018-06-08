/* 
Created by  		: Richa Fitria
Date/hour			: 06 Juni 2018/ 3.36 PM
Updated by			:
Updated Date/hour	:
*/

package MalikYanaAlifhar;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Carnivora", "berlari");
		Animal animal2 = new Animal("Herbivora", "berjalan");
		Carnivora car = new Carnivora(animal1.getJenisHewan(), animal1.getCaragerak(), "Singa", "Menerkam");
		Herbivora her = new Herbivora(animal2.getJenisHewan(), animal2.getCaragerak(), "Kambing", "Makan cantik");
		
		System.out.println("Hewan ke-1");
		System.out.println(animal1.printAnimal());
		System.out.println(car.printAnimal());
		
		System.out.println("Hewan ke-2");
		System.out.println(animal2.printAnimal());
		System.out.println(her.printAnimal());
		
		

	}

}
package chapter4.chainageDeConstructeur;

public class Animal extends Carnivore{
	
	int age;
	String espece;
	public Animal() {
		//super();
	    this("Chien");
		System.out.println("Constructeur par défaut");
	}
	public Animal(String espece) {
		
		this.espece = espece;
		System.out.println("Constructeur avec param espece");
	}
	public Animal(int age, String espece) {
		
		this.age = age;
		this.espece = espece;
		System.out.println("Constructeur avec deux parametres");
	}

}

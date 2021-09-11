package chapter4.LesMofificateursDeVisibilite;

public class Animal {
	
	private int age;
	String espece;
	protected double poids;
	public double taille;
	
	public void infoAnimal()
	{
		System.out.println("Age : "+ this.age + "Espece : "+this.espece);
		System.out.println("Poids : "+ this.poids + "Taille : "+this.taille);
	}

}

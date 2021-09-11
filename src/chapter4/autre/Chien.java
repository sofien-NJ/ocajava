package chapter4.autre;

import chapter4.LesMofificateursDeVisibilite.Animal;

public class Chien extends Animal {
	public void info() {
		System.out.println(this.poids +" "+this.taille);
	}
	
	public static void main(String[] args) {
	Animal a = new Animal();
	System.out.println(a.taille);
	
	Chien c = new Chien();
	System.out.println(c.poids + " "+ c.taille);
	}
}

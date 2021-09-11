package chapter4.autre;

import chapter4.LesMofificateursDeVisibilite.Animal;

public class Main {
	public static void main(String[] args) {
		Animal a = new Animal();
		
		//a.age; // KO
		//a.espece = "Oiseau Canari";  //default : KO
		//a.poids = 0.2;  // protected : KO
		a.taille = 6; //OK : public

	}
}

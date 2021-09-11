package chapter1;

public class Etudiant {
	
	// attributs d'instance
	int age;
	String nom;
	
	//attributs de classe
	
	public static int AGE_MAX_ETUDIANT;
	
	public void infosEtudiant()
	{
		System.out.println("Nom : "+ nom + " Age = "+age);
		System.out.println(AGE_MAX_ETUDIANT);
	}
	
	public Etudiant()  // constructeur par défaut explicite
	{
		System.out.println("new student");
	}
	
	public Etudiant(int age, String nom)  // constructeur avec paramètres
	{
		this.age = age;
		this.nom = nom;
		System.out.println("new student avec const param");
	}
	
	public static void GetMaxAge()  // méthode statique
	{
		//this.age = 20;
		System.out.println(AGE_MAX_ETUDIANT);
	}

}

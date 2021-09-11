package chapter3.LesCollections;

public class Etudiant {
	private int age;
	private String nom;

	public Etudiant(int age, String nom) {

		this.age = age;
		this.nom = nom;
	}
	
	public Etudiant() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Etudiant [age=" + age + ", nom=" + nom + "]";
	}
}

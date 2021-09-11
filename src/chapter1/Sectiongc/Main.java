package chapter1.Sectiongc;

public class Main {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		a1=null;
		
		a2=null;
		
		//System.out.println(a1.toString());
		//System.gc();
		for(int i=0; i<1000;i++)
		{System.out.println(i);}
		System.out.println("Fin du programme");

	}

}

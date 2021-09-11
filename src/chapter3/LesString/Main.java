package chapter3.LesString;

public class Main {

	public static void main(String[] args) {
		
		int x = 10;
		Animal a = new Animal();
		System.out.println("Adresse de a : "+a.toString());
		
		double moy = 12.5;
		
		//StringBuilder sb = new StringBuilder();
		
		String ch1 = "OCA";
		
		String ch2 = "OCA";
		
		String ch3 = new String("OCA");
		
		//System.out.println(ch1 == ch2); //true
		
		//System.out.println(ch1 == ch3); //false
		
		
		//String ch = "abc";
		//System.out.println(ch.concat("ef"));
		//ch = ch.concat("ef");
		//System.out.println(ch);
		
		
		//System.out.println("***********");
		
		
		//StringBuilder sb = new StringBuilder("abc");
		//System.out.println(sb.append("ef"));
		//System.out.println(sb);
		
		//System.out.println(ch1.equals(ch2)); //true
		
		System.out.println(ch1.equals(ch3)); //true

	}

}

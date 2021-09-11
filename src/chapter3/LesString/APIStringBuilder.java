package chapter3.LesString;

public class APIStringBuilder {

	public static void main(String[] args) {
		String ch = "oca";
		/*StringBuilder sb1 = new StringBuilder();
		sb1.append("abcdabcdabcdabcdaabcdabcdabcdabcdaacv");*/
		//System.out.println(sb1.length());
		//System.out.println(sb1.capacity());
		
		
		StringBuilder sb2 = new StringBuilder(9);
		sb2.append("abcdabcdaz");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuilder sb3 = new StringBuilder(ch);
		System.out.println(sb3);
		System.out.println(sb3.toString());
		Animal a = new Animal();
		System.out.println(a);
		System.out.println(a.toString());
		String formation="OCP";
		System.out.println(formation);

	}

}

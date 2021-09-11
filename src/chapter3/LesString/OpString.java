package chapter3.LesString;

public class OpString {

	public static void main(String[] args) {
		String ch = "Formation";
		StringBuilder sb = new StringBuilder(ch);
		ch = sb.append(" FullStack").toString();
		System.out.println(ch);
		
		String ch1 = "OCA";
		
		String ch2 = "OCA";
		
		String ch3 = "OCA";
		System.out.println(ch1==ch2);
		System.out.println(ch1==ch3);
		String ch4 = new String("OCA"); // heap
		System.out.println(ch1==ch4);
		
		

	}

}

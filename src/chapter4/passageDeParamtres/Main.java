package chapter4.passageDeParamtres;

public class Main {
	
	public static void permut(int a, int b)
	{
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		int temp;
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	
	
	public static void modifSB(StringBuilder sb)
	{
		sb.append("-java");
	}
	
	public static void modifString(String s)
	{
		s = s.concat("-java");
	}
	

	public static void main(String[] args) {
		/*
		int x = 1;
		int y = 2;
		permut(x,y);
		System.out.println("x= "+x);
		System.out.println("y= "+y);*/
		
		//StringBuilder c = new StringBuilder("oca");
		//modifSB(c);
		//System.out.println(c);
		String c = new String("oca");
		modifString(c);
		System.out.println(c);

	}

}

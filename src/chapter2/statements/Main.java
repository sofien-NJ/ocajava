package chapter2.statements;

public class Main {

	public static void main(String[] args) {
		/*
		String frameworks[] = {"Struct","JSF","Hibernate","Spring","Spring Boot"};
		// classic loop
		for(int i=0; i<frameworks.length;i++)
		{
			System.out.println(frameworks[i]);
		}
		
		System.out.println("***************");
		
		//enhanced loop
		
		for(String s : frameworks)
		{
			System.out.println(s);
		}
		*/
		//Exercice
		/*
		int tab[][] = { { 10, 11, 4 },{3,8,21},{1,6}, {50,61,48,9}};
		
		for( int t[] : tab)
		{
			for( int k : t)
				{System.out.print(k +"\t");}
			System.out.println();
		}*/
		
	 out : for (int i = 0; i<10;i++)
		{
			for (int j = 0; j<10; j++)
			{
				if(j==5) continue out;
			   System.out.println(i+","+j);
			}
		}
		System.out.println("Suite du programme...");

	}

}

package chapter2.operators;

public class OpBinaires {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//int z = x + (y * (x + 2)*y);
		
		//System.out.println(z);
		
		if((x<100) || (++y<30))
		{
			System.out.println("OK");
		}
		
		System.out.println("y = "+y);

	}

}

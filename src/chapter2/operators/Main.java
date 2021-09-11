package chapter2.operators;

public class Main {

	public static void main(String[] args) {
		int x= 2;
		int y = 4;
		
		int z = 2*++x - --y + 4*y+2 - --x;
		
		System.out.println("x = "+x);  //x=2
		System.out.println("y = "+y);  //y=3
		System.out.println("z = "+z);  //20, 21, 17, 15,16

	}

}

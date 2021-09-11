package chapter4.expressionLambda;

@FunctionalInterface
public interface Calculateur {
	
	public int operation(int x, int y);
	
	public default void info() {
		System.out.println("info de l'interface");
	}
	
	public static void info2() {
		
		System.out.println("info de l'interface");
	}

}

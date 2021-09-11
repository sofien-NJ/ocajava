package chapter4.expressionLambda;

import java.io.Serializable;

public class MainExpressionLambda implements Serializable{

	public static void main(String[] args) {
           // Méthode 1 : implémentation classique par classe
		
		    //ImpPrediction p = new  ImpPrediction();
            //p.test("oca");
		
		     //Méthode 2 : implémentation moderne via l'expression lambda
		
		Prediction p = s-> s.contains("oc");
		
		System.out.println(p.test("ocp"));
		System.out.println(p.test("ocp"));
		
		Calculateur c1 = (int x, int y)->{return x+y;};
		Calculateur c2 = (int x, int y)->{return x*y;};
		
		Calculateur c3 = (x,y)->x*y;
		
		
		System.out.println(c1.operation(10, 20));
		System.out.println(c2.operation(10, 20));
		
	}
}

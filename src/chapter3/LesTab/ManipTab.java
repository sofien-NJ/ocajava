package chapter3.LesTab;

import java.util.Arrays;

public class ManipTab {
	
	public static void main(String[] args) {
		
		/*int tab [] = {10,3,45,8,9};
		Arrays.sort(tab);
		for(int a : tab)
		{
			System.out.print(a+"\t");
		}*/
		
		int tab[][]=new int[3][];
		tab[0]=new int[6];
		tab[1]=new int[2];
		tab[2]=new int[3];
		System.out.println(tab[0][0]);
		System.out.println(tab[2][2]);
	}

}

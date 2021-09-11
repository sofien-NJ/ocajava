package chapter3.LesCollections;

import java.util.*;


public class MainCollection {
	
	public static void infoList(List l)
	{}

	public static void main(String[] args) {
		
		
		// Avant Java 5(sans generics)
		/*
		List l = new ArrayList();
		l.add("amine");
		l.add("ali");
		l.add(true);
		l.add(10);
		for(Object o : l)
		{
			String s = (String)o;
			System.out.println(s.toUpperCase());
		}
		System.out.println(l);
		
		// Après Java 5(avec generics)
		 * 
		*/
		/*List<String> l = new ArrayList<>();
		l.add("amine");
		l.add("ali");
		l.add("true");
		l.add("10");
		for(Object o : l)
		{
			String s = (String)o;
			System.out.println(s.toUpperCase());
		}
		System.out.println(l);*/
		
		/*
		List <String> ls = new ArrayList<>();
		
		List <Integer> li = new ArrayList<>();*/
		/*
		List<Etudiant> le = new ArrayList<>();
		le.add(new Etudiant(22,"Amine"));
		le.add(new Etudiant(21,"Guermazi"));
		le.add(new Etudiant(23,"Marouen"));
		System.out.println(le);
		 */
		
		//List <String> ls1 = new ArrayList<>();
		/*
		ArrayList <String> ls2 = new ArrayList<>();
		LinkedList <String> ls3 = new LinkedList <>();
		ls1 = ls2;
		ls1 = ls3;
		
		infoList(ls2);
		infoList(ls3);
		infoList(ls1);*/
		//System.out.println(ls1.isEmpty());
		//System.out.println(ls1.size());
		/*ls1.add("OCA");
		ls1.add("OCP");
		ls1.add("SPRING");*/
		//System.out.println(ls1);
		//System.out.println(ls1.isEmpty());
		///System.out.println(ls1.size());
		//ls1.remove("SPRING1");
		//ls1.remove(1);
		//System.out.println(ls1);
		//System.out.println(ls1.contains("OCA2"));
		
		/*
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(0);
		li.add(2);
		System.out.println(li);
		li.remove(new Integer(0)); // 0 : indice de la liste
		System.out.println(li);*/
		
		
		//La classe utilitaire Collections
		/*
		System.out.println("ArrayList **********");
		List<Integer>l = new ArrayList<>();
		l.add(14);
		l.add(14);
		l.add(3);
		l.add(10);
		l.add(1);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,4));*/
		/*
		System.out.println("TreeSet **********");
		Set<Integer>ts = new TreeSet<>();
		ts.add(14);
		ts.add(3);
		ts.add(10);
		ts.add(14);
		ts.add(1);
		System.out.println(ts);
		System.out.println("HasetSet **********");
		Set<String>hs = new HashSet<>();
		hs.add("oca");
		hs.add("oca");
		hs.add("ocp");
		hs.add("java");
		hs.add("boot");
		System.out.println(hs);
	    */
		
		
		//passage d'une liste vers un tableau et vis versa
		
		List<String>l = new ArrayList<>();
		l.add("oca");
		l.add("ocp");
		l.add("spring");
		Object [] tab = l.toArray();
		System.out.println(tab[1]);
		
		l.remove(0);
		System.out.println(l);
		System.out.println(tab[0]);
		
		/*
		String[] tab = new String[] {"oca","ocp","spring"};
		List<String>l = Arrays.asList(tab);
		System.out.println(l);
		l.set(0, "Programmer I");
		System.out.println(tab[0]);
		l.remove(1);*/
	}

}

package java8Features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "Test");
		hash.put(2, "This");
		hash.put(3, "One");
		hash.put(4, "Plz");
		
		hash.forEach((i, j)->System.out.println(i+"-"+j));		
		System.out.println("++++++++++");
		
		List <Integer> tList = new ArrayList<Integer>();
		tList.add(1);
		tList.add(2);
		tList.add(3);
		tList.add(4);
		
		tList.forEach(i->System.out.println(i));
		System.out.println("++++++++++");
		
		List<String> names = new ArrayList<String>();
	      names.add("Maggie"); 
	      names.add("Michonne");
	      names.add("Rick");
	      names.add("Merle");
	      names.add("Governor");
	      
	      System.out.println("Not in ordered--->");
	      names.stream().filter(f->f.startsWith("M")).parallel().forEach(i->System.out.println(i));
	      System.out.println("++++++++++");
	      System.out.println("In Ordered--->");
	      names.stream().filter(f->f.startsWith("M")).parallel().forEachOrdered(i->System.out.println(i));
	      
	}

}

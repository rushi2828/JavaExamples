package SampleCodes;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.Size2DSyntax;

public class SampleHashSet {
	
	
	public static void main(final String[] args) {
		
		
		
		final Set<String> set = new HashSet<String>();
		set.add("elephant");
		set.add("tiger");
		set.add("goat");
		set.add("dog");
		set.add("cat");
		set.add("bagira");
		
		//System.out.println(set);
		
		
		final Set <String> duplicate = new HashSet<String>();
		
			
		System.out.println("set size is: "+ set.size());
		
		System.out.println(set.contains("bagira"));
		//set.clear();
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.remove("bagira");
		System.out.println(set);
		
		
		
		 
		
		
		
	}

}

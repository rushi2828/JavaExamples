package newlyAddedPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Test");
		list.add("this");
		list.add("one");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("++++++++++++++++");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
				
	}

	


}

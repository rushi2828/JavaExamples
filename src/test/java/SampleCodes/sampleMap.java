package SampleCodes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class sampleMap {
	
	 public static void main(String[] args) {
		 
		Map<Integer, String> mapLong= new HashMap<Integer, String>();
		 
		mapLong.put(1, "rushi");
		mapLong.put(2, "akshay"); 
		mapLong.put(3, "test");
		
		
		
		System.out.println(mapLong.entrySet());
		System.out.println("===============");
		Set set = mapLong.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		 
		System.out.println("===============");
		System.out.println(mapLong.get(3));
		System.out.println("===============");
		
		for(int i=1; i<=3;i++) {
			
			System.out.println(mapLong.get(i));
				
		}
		System.out.println("===============");
		for(Map.Entry ent:mapLong.entrySet()) {
			System.out.println(ent.getKey()+"-"+ent.getValue());
		}
		
	 }

}


package basic_Java;
import java.util.HashMap;
public class hashMap {
	public static void main (String[]args) {
		HashMap<String,Integer> map=new HashMap<>();
        
		map.put("Prem", 75);
		map.put("Subho", 85);
		map.put("Sayan", 95);
		
		System.out.println(map);
		
		System.out.println(map.get("Prem"));
		System.out.println(map.get("Prem6"));
		
		System.out.println(map.containsKey("Prem"));
		System.out.println(map.containsValue(77));
		
		map.replace("Souvik", 89); // if "Souvik" exit update else do nothing
		System.out.println(map);
		map.put("Prem", 87); 
		System.out.println(map); //if prem exit then update else add it a new key value pair
		map.put("Souvik", 89);
		System.out.println(map);
		
		map.putIfAbsent("Prem", 87); //put only if prem is not exist
		System.out.println(map);
		map.putIfAbsent("Atanu", 87);
		System.out.println(map);
		
		map.remove("Atanu");
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.keySet());
		
		System.out.println(map.getOrDefault("Sohon",0)); //if s0hon dose not exit then return default 0. 
		
		
		for (String i: map.keySet()) {

            System.out.println(i);
        }
		
		map.clear();
		System.out.println(map);
	}
}

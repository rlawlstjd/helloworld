package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe {
	public static void main(String[] args) {
		// 키 : 값 => 엔트리 
		
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		map.put("홍길동", 90); 
		map.put("김민수", 80); 
		map.put("박은수", 85); 
		map.put("김민수", 77); 
		
		// 키 => 값 반환. 
		Integer val = map.get("홍길동"); 
		
		// 키 -> set 반환. 
		Set<String> keys = map.keySet(); 
		for (String key : keys)	{
			System.out.println("키: " + key + ", 값: "  + map.get(key)); 
		}
		
		// 키 : 값 (엔트리) 엔트리 반환. 
		Set<Entry<String,Integer>> entry = map.entrySet(); 
		for(Entry<String, Integer> ent : entry) {
			System.out.println("키: " + ent.getKey() + ", 벨류: " + ent.getValue()); 
		}
	}
}

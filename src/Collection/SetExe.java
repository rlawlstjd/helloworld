package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); 
			
		set.add("홍길동");
		set.add("반갑습니다."); 
		// set.add(1000); 	정수타입 불가 . 
		set.add(String.valueOf(true)); 
		set.add("홍길동"); 
		
		Iterator<String> it = set.iterator(); // 반복자 
		while(it.hasNext()) { // 컬렉션 요소 있는지 확인  있으면 true 
 			String result = it.next(); // 
 			System.out.println(result); 
		}
		
		for (String str : set) { // 향상된 for 구문. 
			System.out.println(str); 
		}
		
	}
}

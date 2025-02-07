package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<>();
		
		strList.add(null); 
		strList.add("Hong"); 
		strList.add(new String("kildong")); 
		strList.add(new String(new byte[] {77,108,108,111,96})); 
		
		System.out.println(strList); 
		
		strList.remove(0); 
		System.out.println(strList); 
		System.out.println(strList.size()); 
		
		strList.add(0, "hello");  // 특정 위치에 추가 . 
		System.out.println(strList); 
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i)); 
		}
		
		System.out.println(strList.contains("Hong"));  // 갖고 있는지 확인해 주는 메소드 contains ... 
		
		
		
		
	}
}

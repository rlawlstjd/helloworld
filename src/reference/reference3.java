package reference;

import java.util.Scanner;

public class reference3 {
	public static void main(String[] args) {
		exe(); 
		
		
		
	}
	public static void exe() {
		Scanner s = new Scanner(System.in); 
		System.out.println("hello"); 
		//이름, 연락처, 성별  => 100개 공간 . 
		String[][] friends = new String[100][3];
		friends[0][0] = "홍길동"; 
		friends[0][1] = "000-0000-0000"; 
		friends[0][2] = "남"; 
		
		friends[1] = new String[] {"김민수", "000-0000-0000", "여"};
		
		System.out.println("이름을 입력"); 
		String name = s.nextLine(); 
		System.out.println("연락처를 입력"); 
		String phone = s.nextLine(); 
		System.out.println("성별을 입력"); 
		String gender = s.nextLine(); 
		
		friends[2] = new String[] {name, phone, gender}; 
		
		for (int i=0; i<friends.length; i++) {
			if (friends[i] != null && friends[i][0] != null) {
				System.out.println("이름은" + friends[i][0] + "연락처는" + friends[i][1]); 
				
			}
		}
	}
}
